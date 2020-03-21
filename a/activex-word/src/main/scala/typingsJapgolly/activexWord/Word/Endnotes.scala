package typingsJapgolly.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Endnotes")
@js.native
class Endnotes protected () extends js.Object {
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  val ContinuationNotice: Range = js.native
  val ContinuationSeparator: Range = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  var Location: WdEndnoteLocation = js.native
  var NumberStyle: WdNoteNumberStyle = js.native
  var NumberingRule: WdNumberingRule = js.native
  val Parent: js.Any = js.native
  val Separator: Range = js.native
  var StartingNumber: Double = js.native
  @JSName("Word.Endnotes_typekey")
  var WordDotEndnotes_typekey: Endnotes = js.native
  def Add(Range: Range): Endnote = js.native
  def Add(Range: Range, Reference: js.Any): Endnote = js.native
  def Add(Range: Range, Reference: js.Any, Text: js.Any): Endnote = js.native
  def Convert(): Unit = js.native
  def Item(Index: Double): Endnote = js.native
  def ResetContinuationNotice(): Unit = js.native
  def ResetContinuationSeparator(): Unit = js.native
  def ResetSeparator(): Unit = js.native
  def SwapWithFootnotes(): Unit = js.native
}

