package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoThemeColorSchemeIndex
import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexOffice.Office.ThemeColor
import typingsJapgolly.activexOffice.Office.ThemeColorScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.CustomLayout")
@js.native
class CustomLayout protected () extends js.Object {
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  val Background: ShapeRange = js.native
  val CustomerData: typingsJapgolly.activexPowerpoint.PowerPoint.CustomerData = js.native
  val Design: typingsJapgolly.activexPowerpoint.PowerPoint.Design = js.native
  var DisplayMasterShapes: MsoTriState = js.native
  var FollowMasterBackground: MsoTriState = js.native
  val HeadersFooters: typingsJapgolly.activexPowerpoint.PowerPoint.HeadersFooters = js.native
  val Height: Double = js.native
  val Hyperlinks: typingsJapgolly.activexPowerpoint.PowerPoint.Hyperlinks = js.native
  val Index: Double = js.native
  var MatchingName: String = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.CustomLayout_typekey")
  var PowerPointDotCustomLayout_typekey: CustomLayout = js.native
  var Preserved: MsoTriState = js.native
  val Shapes: typingsJapgolly.activexPowerpoint.PowerPoint.Shapes = js.native
  val SlideShowTransition: typingsJapgolly.activexPowerpoint.PowerPoint.SlideShowTransition = js.native
  @JSName("ThemeColorScheme")
  val ThemeColorScheme_Original: ThemeColorScheme = js.native
  val TimeLine: typingsJapgolly.activexPowerpoint.PowerPoint.TimeLine = js.native
  val Width: Double = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def Duplicate(): CustomLayout = js.native
  def MoveTo(toPos: Double): Unit = js.native
  def Select(): Unit = js.native
  def ThemeColorScheme(Index: MsoThemeColorSchemeIndex): ThemeColor = js.native
}

