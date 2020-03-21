package typingsJapgolly.skatejs.typesMod

import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.Element
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLElement
import typingsJapgolly.std.HTMLSlotElement
import typingsJapgolly.std.Node
import typingsJapgolly.std.ShadowRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("skatejs/types", "WithRenderer")
@js.native
class WithRenderer[O] ()
  extends HTMLElement
     with Renderer[O] {
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
  // getter for turning of ShadowDOM
  val renderRoot: js.UndefOr[this.type | Mixed] = js.native
  // called after render
  var rendered: js.UndefOr[js.Function0[Unit]] = js.native
  // called before render
  var rendering: js.UndefOr[js.Function0[Unit]] = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  def render(): O = js.native
  def render(props: Mixed): O = js.native
  def render(props: Mixed, state: Mixed): O = js.native
  // Default renderer, returns string returned from render and adds it to root via innerHTML
  // -> override to get own renderer
  def renderer(root: typingsJapgolly.std.Element, html: js.Function1[/* props */ js.UndefOr[Mixed], O]): Unit = js.native
  def renderer(root: Node, html: js.Function1[/* props */ js.UndefOr[Mixed], O]): Unit = js.native
  def renderer(root: ShadowRoot, html: js.Function1[/* props */ js.UndefOr[Mixed], O]): Unit = js.native
  def updated(): Unit = js.native
  def updated(props: Mixed): Unit = js.native
  def updated(props: Mixed, state: Mixed): Unit = js.native
}

