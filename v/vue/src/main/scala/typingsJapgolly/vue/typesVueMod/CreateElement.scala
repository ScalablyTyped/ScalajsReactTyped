package typingsJapgolly.vue.typesVueMod

import typingsJapgolly.vue.typesOptionsMod.AsyncComponent
import typingsJapgolly.vue.typesOptionsMod.Component
import typingsJapgolly.vue.typesOptionsMod.DefaultComputed
import typingsJapgolly.vue.typesOptionsMod.DefaultData
import typingsJapgolly.vue.typesOptionsMod.DefaultMethods
import typingsJapgolly.vue.typesOptionsMod.DefaultProps
import typingsJapgolly.vue.typesVnodeMod.VNode
import typingsJapgolly.vue.typesVnodeMod.VNodeChildren
import typingsJapgolly.vue.typesVnodeMod.VNodeData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateElement extends js.Object {
  def apply(): VNode = js.native
  def apply(tag: (AsyncComponent[_, _, _, _]) | (Component[_, _, _, _])): VNode = js.native
  def apply(tag: (AsyncComponent[_, _, _, _]) | (Component[_, _, _, _]), children: VNodeChildren): VNode = js.native
  def apply(tag: (AsyncComponent[_, _, _, _]) | (Component[_, _, _, _]), data: VNodeData): VNode = js.native
  def apply(
    tag: (AsyncComponent[_, _, _, _]) | (Component[_, _, _, _]),
    data: VNodeData,
    children: VNodeChildren
  ): VNode = js.native
  def apply(tag: String): VNode = js.native
  def apply(tag: String, children: VNodeChildren): VNode = js.native
  def apply(tag: String, data: VNodeData): VNode = js.native
  def apply(tag: String, data: VNodeData, children: VNodeChildren): VNode = js.native
  def apply(
    tag: js.Function0[
      Component[
        DefaultData[scala.Nothing], 
        DefaultMethods[scala.Nothing], 
        DefaultComputed, 
        DefaultProps
      ]
    ]
  ): VNode = js.native
  def apply(
    tag: js.Function0[
      Component[
        DefaultData[scala.Nothing], 
        DefaultMethods[scala.Nothing], 
        DefaultComputed, 
        DefaultProps
      ]
    ],
    children: VNodeChildren
  ): VNode = js.native
  def apply(
    tag: js.Function0[
      Component[
        DefaultData[scala.Nothing], 
        DefaultMethods[scala.Nothing], 
        DefaultComputed, 
        DefaultProps
      ]
    ],
    data: VNodeData
  ): VNode = js.native
  def apply(
    tag: js.Function0[
      Component[
        DefaultData[scala.Nothing], 
        DefaultMethods[scala.Nothing], 
        DefaultComputed, 
        DefaultProps
      ]
    ],
    data: VNodeData,
    children: VNodeChildren
  ): VNode = js.native
}

