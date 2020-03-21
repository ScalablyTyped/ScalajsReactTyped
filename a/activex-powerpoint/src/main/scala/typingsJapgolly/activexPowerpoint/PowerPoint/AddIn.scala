package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.AddIn")
@js.native
class AddIn protected () extends js.Object {
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  var AutoLoad: MsoTriState = js.native
  var DisplayAlerts: MsoTriState = js.native
  val FullName: String = js.native
  var Loaded: MsoTriState = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Path: String = js.native
  @JSName("PowerPoint.AddIn_typekey")
  var PowerPointDotAddIn_typekey: AddIn = js.native
  var Registered: MsoTriState = js.native
  val RegisteredInHKLM: MsoTriState = js.native
}

