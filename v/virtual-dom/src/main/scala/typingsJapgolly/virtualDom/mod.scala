package typingsJapgolly.virtualDom

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Text
import typingsJapgolly.virtualDom.VirtualDOM.Thunk
import typingsJapgolly.virtualDom.VirtualDOM.VChild
import typingsJapgolly.virtualDom.VirtualDOM.VNode
import typingsJapgolly.virtualDom.VirtualDOM.VPatch
import typingsJapgolly.virtualDom.VirtualDOM.VPatchOptions
import typingsJapgolly.virtualDom.VirtualDOM.VText
import typingsJapgolly.virtualDom.VirtualDOM.VTree
import typingsJapgolly.virtualDom.VirtualDOM.Widget
import typingsJapgolly.virtualDom.VirtualDOM.createProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("virtual-dom", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def create(vnode: Thunk): Element = js.native
  def create(vnode: Thunk, opts: AnonDocument): Element = js.native
  def create(vnode: VNode): Element = js.native
  def create(vnode: VNode, opts: AnonDocument): Element = js.native
  /**
    create() calls either document.createElement() or document.createElementNS(),
    for which the common denominator is Element (not HTMLElement).
    */
  def create(vnode: VText): Text = js.native
  def create(vnode: VText, opts: AnonDocument): Text = js.native
  def create(vnode: Widget): Element = js.native
  def create(vnode: Widget, opts: AnonDocument): Element = js.native
  def diff(left: VTree, right: VTree): js.Array[VPatch] = js.native
  def h(tagName: String, children: String): VNode = js.native
  def h(tagName: String, children: js.Array[VChild]): VNode = js.native
  def h(tagName: String, properties: createProperties, children: String): VNode = js.native
  def h(tagName: String, properties: createProperties, children: js.Array[VChild]): VNode = js.native
  def isThunk(vTree: VTree): /* is virtual-dom.VirtualDOM.Thunk */ Boolean = js.native
  def isVNode(vTree: VTree): /* is virtual-dom.VirtualDOM.VNode */ Boolean = js.native
  def isVText(vTree: VTree): /* is virtual-dom.VirtualDOM.VText */ Boolean = js.native
  def isWidget(vTree: VTree): /* is virtual-dom.VirtualDOM.Widget */ Boolean = js.native
  /**
    patch() usually just returns rootNode after doing stuff to it, so we want
    to preserve that type (though it will usually be just Element).
    */
  def patch[T /* <: Element */](rootNode: T, patches: js.Array[VPatch]): T = js.native
  def patch[T /* <: Element */](rootNode: T, patches: js.Array[VPatch], renderOptions: VPatchOptions[T]): T = js.native
}

