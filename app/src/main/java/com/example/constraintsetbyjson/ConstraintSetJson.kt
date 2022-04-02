package com.example.constraintsetbyjson

val constraintJson="""
    {
        image: {
            width: 80,
            height: 80,
            top: ['parent','top',20],
            centerHorizontally: 'parent'
        },
        texttitle: {
            top: ['image','bottom',10],
            centerHorizontally: 'parent'
        }
    }
""".trimIndent()