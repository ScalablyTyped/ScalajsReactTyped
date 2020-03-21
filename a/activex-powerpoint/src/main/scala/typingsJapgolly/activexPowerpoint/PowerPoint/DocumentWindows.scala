package typingsJapgolly.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.DocumentWindows")
@js.native
class DocumentWindows protected () extends js.Object {
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.DocumentWindows_typekey")
  var PowerPointDotDocumentWindows_typekey: DocumentWindows = js.native
  /** @param PowerPoint.PpArrangeStyle [arrangeStyle=1] */
  def Arrange(): Unit = js.native
  def Arrange(arrangeStyle: PpArrangeStyle): Unit = js.native
  def Item(Index: Double): DocumentWindow = js.native
}

