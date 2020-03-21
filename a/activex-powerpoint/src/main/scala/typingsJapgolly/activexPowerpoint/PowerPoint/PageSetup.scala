package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.PageSetup")
@js.native
class PageSetup protected () extends js.Object {
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  var FirstSlideNumber: Double = js.native
  var NotesOrientation: MsoOrientation = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.PageSetup_typekey")
  var PowerPointDotPageSetup_typekey: PageSetup = js.native
  var SlideHeight: Double = js.native
  var SlideOrientation: MsoOrientation = js.native
  var SlideSize: PpSlideSizeType = js.native
  var SlideWidth: Double = js.native
}

