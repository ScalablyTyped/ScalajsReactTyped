package typingsJapgolly.scrollreveal.scrollReveal

import typingsJapgolly.std.Element
import typingsJapgolly.std.HTMLElement
import typingsJapgolly.std.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollRevealObject extends js.Object {
  def apply(): ScrollRevealObject = js.native
  def apply(options: ScrollRevealObjectOptions): ScrollRevealObject = js.native
  def reveal(selector: String): ScrollRevealObject = js.native
  def reveal(selector: String, interval: Double): ScrollRevealObject = js.native
  def reveal(selector: String, options: ScrollRevealObjectOptions): ScrollRevealObject = js.native
  def reveal(selector: String, options: ScrollRevealObjectOptions, interval: Double): ScrollRevealObject = js.native
  def reveal(selector: HTMLElement): ScrollRevealObject = js.native
  def reveal(selector: HTMLElement, interval: Double): ScrollRevealObject = js.native
  def reveal(selector: HTMLElement, options: ScrollRevealObjectOptions): ScrollRevealObject = js.native
  def reveal(selector: HTMLElement, options: ScrollRevealObjectOptions, interval: Double): ScrollRevealObject = js.native
  def reveal(selector: NodeListOf[Element]): ScrollRevealObject = js.native
  def reveal(selector: NodeListOf[Element], interval: Double): ScrollRevealObject = js.native
  def reveal(selector: NodeListOf[Element], options: ScrollRevealObjectOptions): ScrollRevealObject = js.native
  def reveal(selector: NodeListOf[Element], options: ScrollRevealObjectOptions, interval: Double): ScrollRevealObject = js.native
  def sync(): Unit = js.native
}

