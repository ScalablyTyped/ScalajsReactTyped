package typingsJapgolly.morgan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("morgan", "token")
@js.native
object token extends js.Object {
  /**
    * Define a custom token which can be used in custom morgan logging formats.
    */
  def apply(name: String, callback: TokenCallbackFn): Morgan = js.native
}

