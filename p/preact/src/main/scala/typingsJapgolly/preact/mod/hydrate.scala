package typingsJapgolly.preact.mod

import typingsJapgolly.std.DocumentFragment
import typingsJapgolly.std.Document_
import typingsJapgolly.std.Element
import typingsJapgolly.std.ShadowRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact", "hydrate")
@js.native
object hydrate extends js.Object {
  def apply(vnode: ComponentChild, parent: DocumentFragment): Unit = js.native
  def apply(vnode: ComponentChild, parent: Document_): Unit = js.native
  def apply(vnode: ComponentChild, parent: Element): Unit = js.native
  def apply(vnode: ComponentChild, parent: ShadowRoot): Unit = js.native
}

