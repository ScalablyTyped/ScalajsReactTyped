package typingsJapgolly.testingLibraryVue.mod

import typingsJapgolly.prettyFormat.mod.OptionsReceived
import typingsJapgolly.std.Element
import typingsJapgolly.std.HTMLDocument
import typingsJapgolly.testingLibraryVue.testingLibraryVueBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/vue", "prettyDOM")
@js.native
object prettyDOM extends js.Object {
  def apply(): String | `false` = js.native
  def apply(dom: Element): String | `false` = js.native
  def apply(dom: Element, maxLength: Double): String | `false` = js.native
  def apply(dom: Element, maxLength: Double, options: OptionsReceived): String | `false` = js.native
  def apply(dom: HTMLDocument): String | `false` = js.native
  def apply(dom: HTMLDocument, maxLength: Double): String | `false` = js.native
  def apply(dom: HTMLDocument, maxLength: Double, options: OptionsReceived): String | `false` = js.native
}

