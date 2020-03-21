package typingsJapgolly.webix.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.webix.webix.ui.baseview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdSpace extends js.Object {
  @JSName("$$")
  var DollarDollar: js.Any = js.native
  def innerId(id: String): Double | String = js.native
  def innerId(id: Double): Double | String = js.native
  def ui(view: js.Any): baseview = js.native
}

@JSImport("webix", "IdSpace")
@js.native
object IdSpace extends TopLevel[IdSpace]

