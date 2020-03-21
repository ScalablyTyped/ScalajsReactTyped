package typingsJapgolly.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.FieldMultiChoice")
@js.native
class FieldMultiChoice () extends Field {
  def get_choices(): js.Array[String] = js.native
  def get_fillInChoice(): Boolean = js.native
  def get_mappings(): String = js.native
  def set_choices(value: js.Array[String]): Unit = js.native
  def set_fillInChoice(value: Boolean): Unit = js.native
}

