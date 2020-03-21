package typingsJapgolly.skatejs.typesMod

import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.Element
import typingsJapgolly.std.EventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.Node
import typingsJapgolly.std.ShadowRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.std.EventTarget because Already inherited
- typingsJapgolly.std.Node because Already inherited
- typingsJapgolly.std.Slotable because Already inherited
- typingsJapgolly.std.ParentNode because Already inherited
- typingsJapgolly.std.NonDocumentTypeChildNode because Already inherited
- typingsJapgolly.std.InnerHTML because Already inherited
- typingsJapgolly.std.Animatable because Already inherited
- typingsJapgolly.std.ChildNode because Already inherited
- typingsJapgolly.std.HTMLOrSVGElement because Already inherited
- typingsJapgolly.std.GlobalEventHandlers because Already inherited
- typingsJapgolly.std.ElementContentEditable because Already inherited
- typingsJapgolly.std.ElementCSSInlineStyle because Already inherited
- typingsJapgolly.std.DocumentAndElementEventHandlers because Already inherited
- typingsJapgolly.std.Element because Already inherited
- typingsJapgolly.std.HTMLElement because Already inherited
- typingsJapgolly.skatejs.typesMod.WithContext because Inheritance from two classes. Inlined context
- typingsJapgolly.skatejs.typesMod.WithUpdate because Inheritance from two classes. Inlined props, state, updating, updating, updating, shouldUpdate, shouldUpdate, shouldUpdate, triggerUpdate
- typingsJapgolly.skatejs.typesMod.WithRenderer because Inheritance from two classes. Inlined renderRoot, updated, updated, updated, rendering, render, render, render, renderer, renderer, renderer, rendered
- typingsJapgolly.skatejs.typesMod.WithLifecycle because Inheritance from two classes. Inlined connecting, connected, disconnecting, disconnected
- typingsJapgolly.skatejs.typesMod.WithChildren because Inheritance from two classes. Inlined childrenUpdated */ @JSImport("skatejs/types", "WithComponent")
@js.native
class WithComponent[P, S, C] ()
  extends CustomElement
     with Renderer[Mixed | Null] {
  var context: C = js.native
  // Special hack for own components type checking.
  // It works in combination with ElementAttributesProperty. It placed in jsx.d.ts.
  // more detail, see: https://www.typescriptlang.org/docs/handbook/jsx.html
  //               and https://github.com/skatejs/skatejs/pull/952#issuecomment-264500153
  val props: P = js.native
  // getter for turning of ShadowDOM
  val renderRoot: js.UndefOr[this.type | Mixed] = js.native
  // called after render
  var rendered: js.UndefOr[js.Function0[Unit]] = js.native
  // called before render
  var rendering: js.UndefOr[js.Function0[Unit]] = js.native
  var state: S = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  def childrenUpdated(): Unit = js.native
  def connected(): Unit = js.native
  def connecting(): Unit = js.native
  def disconnected(): Unit = js.native
  def disconnecting(): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  def render(): Mixed | Null = js.native
  def render(props: Mixed): Mixed | Null = js.native
  def render(props: Mixed, state: Mixed): Mixed | Null = js.native
  // Default renderer, returns string returned from render and adds it to root via innerHTML
  // -> override to get own renderer
  def renderer(root: Element, html: js.Function1[/* props */ js.UndefOr[Mixed], Mixed | Null]): Unit = js.native
  def renderer(root: Node, html: js.Function1[/* props */ js.UndefOr[Mixed], Mixed | Null]): Unit = js.native
  def renderer(root: ShadowRoot, html: js.Function1[/* props */ js.UndefOr[Mixed], Mixed | Null]): Unit = js.native
  // Called to check whether or not the component should call updated(), much like React's shouldComponentUpdate().
  def shouldUpdate(): Boolean = js.native
  def shouldUpdate(props: P): Boolean = js.native
  def shouldUpdate(props: P, state: S): Boolean = js.native
  // manually force update
  def triggerUpdate(): Unit = js.native
  def updated(): Unit = js.native
  def updated(props: Mixed): Unit = js.native
  def updated(props: Mixed, state: Mixed): Unit = js.native
  // Called when props have been set regardless of if they've changed. much like React's componentWillReceiveProps().
  def updating(): Unit = js.native
  def updating(props: P): Unit = js.native
  def updating(props: P, state: S): Unit = js.native
}

/* static members */
@JSImport("skatejs/types", "WithComponent")
@js.native
object WithComponent extends js.Object {
  val observedAttributes: js.Array[String] = js.native
}

