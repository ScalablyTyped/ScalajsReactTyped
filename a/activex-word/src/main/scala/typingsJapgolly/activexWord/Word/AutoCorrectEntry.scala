package typingsJapgolly.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.AutoCorrectEntry")
@js.native
class AutoCorrectEntry protected () extends js.Object {
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Index: Double = js.native
  var Name: String = js.native
  val Parent: js.Any = js.native
  val RichText: Boolean = js.native
  var Value: String = js.native
  @JSName("Word.AutoCorrectEntry_typekey")
  var WordDotAutoCorrectEntry_typekey: AutoCorrectEntry = js.native
  def Apply(Range: Range): Unit = js.native
  def Delete(): Unit = js.native
}

