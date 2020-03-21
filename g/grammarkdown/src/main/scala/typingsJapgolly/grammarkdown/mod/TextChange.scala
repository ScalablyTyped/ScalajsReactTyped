package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.AnonRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "TextChange")
@js.native
object TextChange extends js.Object {
  def applyChange(originalText: String, change: typingsJapgolly.grammarkdown.parserMod.TextChange): String = js.native
  def clone(change: typingsJapgolly.grammarkdown.parserMod.TextChange): AnonRange = js.native
  def create(text: String, range: typingsJapgolly.grammarkdown.coreMod.Range): AnonRange = js.native
  def isUnchanged(change: typingsJapgolly.grammarkdown.parserMod.TextChange): Boolean = js.native
}

