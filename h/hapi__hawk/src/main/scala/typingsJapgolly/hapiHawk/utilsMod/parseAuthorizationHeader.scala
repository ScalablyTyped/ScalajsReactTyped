package typingsJapgolly.hapiHawk.utilsMod

import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/utils", "parseAuthorizationHeader")
@js.native
object parseAuthorizationHeader extends js.Object {
  def apply(header: String): Record[String, String] = js.native
  def apply(header: String, keys: js.Array[String]): Record[String, String] = js.native
}

