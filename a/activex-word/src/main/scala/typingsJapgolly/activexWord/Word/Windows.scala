package typingsJapgolly.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Windows")
@js.native
class Windows protected () extends js.Object {
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  var SyncScrollingSideBySide: Boolean = js.native
  @JSName("Word.Windows_typekey")
  var WordDotWindows_typekey: Windows = js.native
  def Add(): Window = js.native
  def Add(Window: js.Any): Window = js.native
  def Arrange(): Unit = js.native
  def Arrange(ArrangeStyle: js.Any): Unit = js.native
  def BreakSideBySide(): Boolean = js.native
  def CompareSideBySideWith(Document: js.Any): Boolean = js.native
  def Item(Index: js.Any): Window = js.native
  def ResetPositionsSideBySide(): Unit = js.native
}

