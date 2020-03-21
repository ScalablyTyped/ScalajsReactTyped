package typingsJapgolly.testingLibraryVue.mod

import typingsJapgolly.prettyFormat.mod.OptionsReceived
import typingsJapgolly.std.Element
import typingsJapgolly.std.HTMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/vue", "logDOM")
@js.native
object logDOM extends js.Object {
  def apply(): Unit = js.native
  def apply(dom: Element): Unit = js.native
  def apply(dom: Element, maxLength: Double): Unit = js.native
  def apply(dom: Element, maxLength: Double, options: OptionsReceived): Unit = js.native
  def apply(dom: HTMLDocument): Unit = js.native
  def apply(dom: HTMLDocument, maxLength: Double): Unit = js.native
  def apply(dom: HTMLDocument, maxLength: Double, options: OptionsReceived): Unit = js.native
}

