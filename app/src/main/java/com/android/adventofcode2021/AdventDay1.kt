package com.android.adventofcode2021

class AdventDay1 {

    fun part1(list: List<Int>){
        val count= list.getIncrementalNoCount()
        println("count1 = $count")
        list.part2()
    }

    private fun List<Int>.part2(){
        val i = this.windowed(3,1)
            .map { Triple(it[0], it[1], it[2]) }
            .map { it.first+it.second+it.third}
            .getIncrementalNoCount()
        println("count2 = $i")
    }

    private fun List<Int>.getIncrementalNoCount()= this.windowed(2,1)
        .map { Pair(it[0], it[1]) }
        .count { it.second - it.first > 0 }

}