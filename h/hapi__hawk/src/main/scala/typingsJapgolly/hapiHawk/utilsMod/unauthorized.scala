package typingsJapgolly.hapiHawk.utilsMod

import typingsJapgolly.hapiBoom.mod.Boom
import typingsJapgolly.hapiBoom.mod.unauthorized.Attributes
import typingsJapgolly.hapiBoom.mod.unauthorized.MissingAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/utils", "unauthorized")
@js.native
object unauthorized extends js.Object {
  def apply(): Boom[_] with MissingAuth = js.native
  def apply(message: String): Boom[_] with MissingAuth = js.native
  def apply(message: String, attributes: String): Boom[_] with MissingAuth = js.native
  def apply(message: String, attributes: Attributes): Boom[_] with MissingAuth = js.native
}

