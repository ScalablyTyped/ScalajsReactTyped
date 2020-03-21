package typingsJapgolly.jsonwebtoken

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GetPublicKeyOrSecret = js.Function2[
    /* header */ typingsJapgolly.jsonwebtoken.mod.JwtHeader, 
    /* callback */ typingsJapgolly.jsonwebtoken.mod.SigningKeyCallback, 
    scala.Unit
  ]
  type Secret = java.lang.String | typingsJapgolly.node.Buffer | typingsJapgolly.jsonwebtoken.AnonKey
  type SignCallback = js.Function2[/* err */ js.Error, /* encoded */ java.lang.String, scala.Unit]
  type SigningKeyCallback = js.Function2[
    /* err */ js.Any, 
    /* signingKey */ js.UndefOr[typingsJapgolly.jsonwebtoken.mod.Secret], 
    scala.Unit
  ]
  type VerifyCallback = js.Function2[
    /* err */ typingsJapgolly.jsonwebtoken.mod.VerifyErrors, 
    /* decoded */ js.Object, 
    scala.Unit
  ]
}
