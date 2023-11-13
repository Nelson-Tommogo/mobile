package com.example.e_commerce.data

import java.security.cert.CertPath

data class User(
    val firstname : String,
    val lastname : String,
    val  email : String,
    val password : String,
    val imagePath : String = ""
){
    constructor() : this("firstname","lastname","email","password","imagPath")
}
