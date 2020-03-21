package typingsJapgolly.maquette

import typingsJapgolly.maquette.interfacesMod.VNode
import typingsJapgolly.maquette.interfacesMod.VNodeChild
import typingsJapgolly.maquette.interfacesMod.VNodeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maquette/dist/h", JSImport.Namespace)
@js.native
object hMod extends js.Object {
  def h(selector: String): VNode = js.native
  def h(selector: String, children: js.Array[VNodeChild]): VNode = js.native
  def h(selector: String, properties: VNodeProperties): VNode = js.native
  def h(selector: String, properties: VNodeProperties, children: js.Array[VNodeChild]): VNode = js.native
}

