package typingsJapgolly.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.ShadowFormat")
@js.native
class ShadowFormat protected () extends js.Object {
  val Application: js.Any = js.native
  var Blur: Double = js.native
  val Creator: Double = js.native
  var ForeColor: ColorFormat = js.native
  var Obscured: MsoTriState = js.native
  @JSName("Office.ShadowFormat_typekey")
  var OfficeDotShadowFormat_typekey: ShadowFormat = js.native
  var OffsetX: Double = js.native
  var OffsetY: Double = js.native
  val Parent: js.Any = js.native
  var RotateWithShape: MsoTriState = js.native
  var Size: Double = js.native
  var Style: MsoShadowStyle = js.native
  var Transparency: Double = js.native
  var Type: MsoShadowType = js.native
  var Visible: MsoTriState = js.native
  def IncrementOffsetX(Increment: Double): Unit = js.native
  def IncrementOffsetY(Increment: Double): Unit = js.native
}

