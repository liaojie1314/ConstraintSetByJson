package com.example.constraintsetbyjson

val musiclayoutjson="""
    {
        logo: {
            width: '70%',
            height: '1:1',
            top: ['parent','top',10],
            start: ['parent','start'],
            end: ['parent','end']
        },
        song: {
            top: ['logo','bottom',10],
            start: ['parent','start'],
            end: ['parent','end']
        },
        words: {
            top: ['song','bottom',10],
            start: ['parent','start'],
            end: ['parent','end']
        },
        maike: {
            top: ['words','bottom',26],
            start: ['parent','start',20]
        },
        starttime:{
            top: ['maike','bottom'],
            bottom: ['itemleft','top'],
            start: ['parent','start',12]
        },
        endtime:{
            top: ['maike','bottom'],
            bottom: ['itemleft','top'],
            end: ['parent','end',12]
        },
        progressbar: {
            top: ['maike','bottom'],
            bottom: ['itemleft','top'],
            start: ['starttime','end',4],
            end: ['endtime','start',4]
        },
        itemleft: {
            bottom: ['parent','bottom',46]
        },
        itemup: {
            bottom: ['parent','bottom',46]
        },
        itemstart: {
            bottom: ['parent','bottom',46]
        },
        itemnext: {
            bottom: ['parent','bottom',46]
        },
        itemright: {
            bottom: ['parent','bottom',46]
        },
        Helpers: [
            [
                'hChain',['itemleft','itemup','itemstart','itemnext','itemright'],{
                    style: 'packed'
                }
            ]
        ]
    }
""".trimIndent()