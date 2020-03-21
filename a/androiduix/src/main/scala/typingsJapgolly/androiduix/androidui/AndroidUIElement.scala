package typingsJapgolly.androiduix.androidui

import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.Element
import typingsJapgolly.std.HTMLDivElement
import typingsJapgolly.std.HTMLSlotElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.AndroidUIElement")
@js.native
class AndroidUIElement () extends HTMLDivElement {
  var AndroidUI: typingsJapgolly.androiduix.androidui.AndroidUI = js.native
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  /* CompleteClass */
  override var contentEditable: String = js.native
  /* CompleteClass */
  override var innerHTML: String = js.native
  /* CompleteClass */
  override var inputMode: String = js.native
  /* CompleteClass */
  override val isContentEditable: Boolean = js.native
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | Null = js.native
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | Null = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  def attachedCallback(): Unit = js.native
  def attributeChangedCallback(attributeName: String, oldVal: String, newVal: String): Unit = js.native
  def createdCallback(): Unit = js.native
  def detachedCallback(): Unit = js.native
}

