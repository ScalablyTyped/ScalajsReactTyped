package typingsJapgolly.ajvPack

import typingsJapgolly.ajv.mod.Ajv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(schema: js.Array[js.Object]): Ajv = js.native
  def apply(schema: js.Array[js.Object], key: String): Ajv = js.native
  def apply(schema: js.Object): Ajv = js.native
  def apply(schema: js.Object, key: String): Ajv = js.native
}

