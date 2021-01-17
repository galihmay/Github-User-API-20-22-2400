package com.galihmayangga.uas.data

object UserDummy {
    val list: ArrayList<User>
    get() {
        val list = arrayListOf<User>()

        list.add(User(
            "iptodays",
            "avatar_url",
            "https://github.com/iptodays",
            "https://api.github.com/users/iptodays/followers",
              10,
            "https://api.github.com/users/iptodays/following{/other_user}",
             15,
            "https://api.github.com/users/iptodays/repos",
            10
        ))


        list.add(User(
            "iptodays2",
            "avatar_url",
            "https://github.com/iptodays",
            "https://api.github.com/users/iptodays/followers",
            10,
            "https://api.github.com/users/iptodays/following{/other_user}",
            15,
            "https://api.github.com/users/iptodays/repos",
            10
        ))

        list.add(User(
            "iptodays3",
            "avatar_url",
            "https://github.com/iptodays",
            "https://api.github.com/users/iptodays/followers",
            10,
            "https://api.github.com/users/iptodays/following{/other_user}",
            15,
            "https://api.github.com/users/iptodays/repos",
            10
        ))

        list.add(User(
            "iptodays4",
            "avatar_url",
            "https://github.com/iptodays",
            "https://api.github.com/users/iptodays/followers",
            10,
            "https://api.github.com/users/iptodays/following{/other_user}",
            15,
            "https://api.github.com/users/iptodays/repos",
            10
        ))

        list.add(User(
            "iptodays5",
            "avatar_url",
            "https://github.com/iptodays",
            "https://api.github.com/users/iptodays/followers",
            10,
            "https://api.github.com/users/iptodays/following{/other_user}",
            15,
            "https://api.github.com/users/iptodays/repos",
            10
        ))


        return list
    }
}