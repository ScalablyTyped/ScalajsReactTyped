package typingsJapgolly.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Dictionary")
@js.native
class Dictionary protected () extends js.Object {
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var LanguageID: WdLanguageID = js.native
  var LanguageSpecific: Boolean = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Path: String = js.native
  val ReadOnly: Boolean = js.native
  val Type: WdDictionaryType = js.native
  @JSName("Word.Dictionary_typekey")
  var WordDotDictionary_typekey: Dictionary = js.native
  def Delete(): Unit = js.native
}

