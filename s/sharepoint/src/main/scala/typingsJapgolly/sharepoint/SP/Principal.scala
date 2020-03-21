package typingsJapgolly.sharepoint.SP

import typingsJapgolly.sharepoint.SP.Utilities.PrincipalType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Principal")
@js.native
class Principal () extends ClientObject {
  def get_id(): Double = js.native
  def get_isHiddenInUI(): Boolean = js.native
  def get_loginName(): String = js.native
  def get_principalType(): PrincipalType = js.native
  def get_title(): String = js.native
  def set_title(value: String): Unit = js.native
}

