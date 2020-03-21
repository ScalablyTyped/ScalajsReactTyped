package typingsJapgolly.preact.mod

import typingsJapgolly.std.DocumentFragment
import typingsJapgolly.std.Document_
import typingsJapgolly.std.Element
import typingsJapgolly.std.ShadowRoot
import typingsJapgolly.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact", "render")
@js.native
object render extends js.Object {
  def apply(vnode: ComponentChild, parent: DocumentFragment): Unit = js.native
  def apply(vnode: ComponentChild, parent: DocumentFragment, replaceNode: Element): Unit = js.native
  def apply(vnode: ComponentChild, parent: DocumentFragment, replaceNode: Text): Unit = js.native
  def apply(vnode: ComponentChild, parent: Document_): Unit = js.native
  def apply(vnode: ComponentChild, parent: Document_, replaceNode: Element): Unit = js.native
  def apply(vnode: ComponentChild, parent: Document_, replaceNode: Text): Unit = js.native
  //
  // Preact render
  // -----------------------------------
  def apply(vnode: ComponentChild, parent: Element): Unit = js.native
  def apply(vnode: ComponentChild, parent: Element, replaceNode: Element): Unit = js.native
  def apply(vnode: ComponentChild, parent: Element, replaceNode: Text): Unit = js.native
  def apply(vnode: ComponentChild, parent: ShadowRoot): Unit = js.native
  def apply(vnode: ComponentChild, parent: ShadowRoot, replaceNode: Element): Unit = js.native
  def apply(vnode: ComponentChild, parent: ShadowRoot, replaceNode: Text): Unit = js.native
}

