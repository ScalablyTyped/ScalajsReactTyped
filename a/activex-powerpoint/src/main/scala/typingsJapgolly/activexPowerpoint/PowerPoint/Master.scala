package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoBackgroundStyleIndex
import typingsJapgolly.activexOffice.Office.OfficeTheme
import typingsJapgolly.activexOffice.Office.Script
import typingsJapgolly.activexOffice.Office.Scripts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Master")
@js.native
class Master protected () extends js.Object {
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  val Background: ShapeRange = js.native
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  var ColorScheme: typingsJapgolly.activexPowerpoint.PowerPoint.ColorScheme = js.native
  val CustomLayouts: typingsJapgolly.activexPowerpoint.PowerPoint.CustomLayouts = js.native
  val CustomerData: typingsJapgolly.activexPowerpoint.PowerPoint.CustomerData = js.native
  val Design: typingsJapgolly.activexPowerpoint.PowerPoint.Design = js.native
  val HeadersFooters: typingsJapgolly.activexPowerpoint.PowerPoint.HeadersFooters = js.native
  val Height: Double = js.native
  val Hyperlinks: typingsJapgolly.activexPowerpoint.PowerPoint.Hyperlinks = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Master_typekey")
  var PowerPointDotMaster_typekey: Master = js.native
  @JSName("Scripts")
  val Scripts_Original: Scripts = js.native
  val Shapes: typingsJapgolly.activexPowerpoint.PowerPoint.Shapes = js.native
  val SlideShowTransition: typingsJapgolly.activexPowerpoint.PowerPoint.SlideShowTransition = js.native
  val TextStyles: typingsJapgolly.activexPowerpoint.PowerPoint.TextStyles = js.native
  val Theme: OfficeTheme = js.native
  val TimeLine: typingsJapgolly.activexPowerpoint.PowerPoint.TimeLine = js.native
  val Width: Double = js.native
  def ApplyTheme(themeName: String): Unit = js.native
  def Delete(): Unit = js.native
  def Scripts(Index: js.Any): Script = js.native
}

