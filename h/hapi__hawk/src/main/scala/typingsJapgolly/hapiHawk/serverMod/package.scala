package typingsJapgolly.hapiHawk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object serverMod {
  type CredentialsFunc = js.Function1[
    /* id */ java.lang.String, 
    js.Promise[typingsJapgolly.hapiHawk.serverMod.Credentials] | typingsJapgolly.hapiHawk.serverMod.Credentials
  ]
  type NonceFunc = js.Function3[
    /* key */ java.lang.String, 
    /* nonce */ java.lang.String, 
    /* ts */ java.lang.String, 
    js.Promise[scala.Unit] | scala.Unit
  ]
}
