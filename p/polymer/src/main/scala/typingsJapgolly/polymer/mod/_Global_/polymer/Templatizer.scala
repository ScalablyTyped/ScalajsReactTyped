package typingsJapgolly.polymer.mod._Global_.polymer

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.HTMLTemplateElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Templatizer extends js.Object {
  def modelForElement(elem: HTMLElement): Base = js.native
  def stamp(model: js.Object): Base = js.native
  def templatize(template: HTMLTemplateElement): Unit = js.native
  def templatize(template: HTMLTemplateElement, mutableData: Boolean): Unit = js.native
}

