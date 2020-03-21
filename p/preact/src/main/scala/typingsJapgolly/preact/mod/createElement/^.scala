package typingsJapgolly.preact.mod.createElement

import typingsJapgolly.preact.jsxMod.JSXInternal.HTMLAttributes
import typingsJapgolly.preact.jsxMod.JSXInternal.SVGAttributes
import typingsJapgolly.preact.mod.Attributes
import typingsJapgolly.preact.mod.ComponentChildren
import typingsJapgolly.preact.mod.ComponentType
import typingsJapgolly.preact.mod.VNode
import typingsJapgolly.std.EventTarget
import typingsJapgolly.std.Record
import typingsJapgolly.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact", "createElement")
@js.native
object ^ extends js.Object {
  def apply(`type`: String, children: ComponentChildren*): VNode[_] = js.native
  //
  // Preact createElement
  // -----------------------------------
  def apply(
    `type`: String,
    props: HTMLAttributes[EventTarget] with SVGAttributes[SVGElement] with (Record[String, _]),
    children: ComponentChildren*
  ): VNode[_] = js.native
  def apply[P](`type`: ComponentType[P], children: ComponentChildren*): VNode[_] = js.native
  def apply[P](`type`: ComponentType[P], props: Attributes with P, children: ComponentChildren*): VNode[_] = js.native
}

