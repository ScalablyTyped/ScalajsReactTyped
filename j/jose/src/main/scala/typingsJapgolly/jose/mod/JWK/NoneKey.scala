package typingsJapgolly.jose.mod.JWK

import typingsJapgolly.jose.joseStrings.none
import typingsJapgolly.jose.joseStrings.unsecured
import typingsJapgolly.jose.mod.keyOperation
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoneKey extends js.Object {
  var alg: none = js.native
  var `type`: unsecured = js.native
  def algorithms(): Set[String] = js.native
  def algorithms(operation: keyOperation): Set[String] = js.native
}

