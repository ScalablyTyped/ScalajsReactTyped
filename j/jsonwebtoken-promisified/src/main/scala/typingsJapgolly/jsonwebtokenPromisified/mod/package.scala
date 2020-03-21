package typingsJapgolly.jsonwebtokenPromisified

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Secret = java.lang.String | typingsJapgolly.node.Buffer | typingsJapgolly.jsonwebtokenPromisified.AnonKey
  type SignCallback = js.Function2[/* err */ js.Error, /* encoded */ java.lang.String, scala.Unit]
  type VerifyCallback = js.Function2[
    /* err */ typingsJapgolly.jsonwebtokenPromisified.mod.JsonWebTokenError | typingsJapgolly.jsonwebtokenPromisified.mod.NotBeforeError | typingsJapgolly.jsonwebtokenPromisified.mod.TokenExpiredError, 
    /* decoded */ js.Object | java.lang.String, 
    scala.Unit
  ]
}
