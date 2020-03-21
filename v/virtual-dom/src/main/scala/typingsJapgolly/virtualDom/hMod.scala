package typingsJapgolly.virtualDom

import typingsJapgolly.virtualDom.VirtualDOM.VChild
import typingsJapgolly.virtualDom.VirtualDOM.VNode
import typingsJapgolly.virtualDom.VirtualDOM.createProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("virtual-dom/h", JSImport.Namespace)
@js.native
object hMod extends js.Object {
  def apply(tagName: String, children: String): VNode = js.native
  def apply(tagName: String, children: js.Array[VChild]): VNode = js.native
  def apply(tagName: String, properties: createProperties, children: String): VNode = js.native
  def apply(tagName: String, properties: createProperties, children: js.Array[VChild]): VNode = js.native
}

