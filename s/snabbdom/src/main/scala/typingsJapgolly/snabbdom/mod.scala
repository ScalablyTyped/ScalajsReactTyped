package typingsJapgolly.snabbdom

import typingsJapgolly.snabbdom.attributesMod._Global_.Element
import typingsJapgolly.snabbdom.hMod.VNodeChildren
import typingsJapgolly.snabbdom.htmldomapiMod.DOMAPI
import typingsJapgolly.snabbdom.thunkMod.ThunkFn
import typingsJapgolly.snabbdom.vnodeMod.VNodeData
import typingsJapgolly.snabbdom.vnodeMod.VNode_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snabbdom", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val thunk: ThunkFn = js.native
  def h(sel: String): VNode_ = js.native
  def h(sel: String, children: VNodeChildren): VNode_ = js.native
  def h(sel: String, data: VNodeData): VNode_ = js.native
  def h(sel: String, data: VNodeData, children: VNodeChildren): VNode_ = js.native
  def init(modules: js.Array[PartialModule]): js.Function2[/* oldVnode */ Element | VNode_, /* vnode */ VNode_, VNode_] = js.native
  def init(modules: js.Array[PartialModule], domApi: DOMAPI): js.Function2[/* oldVnode */ Element | VNode_, /* vnode */ VNode_, VNode_] = js.native
}

