package typingsJapgolly.vue.vueMod

import typingsJapgolly.vue.optionsMod.AsyncComponent
import typingsJapgolly.vue.optionsMod.Component
import typingsJapgolly.vue.optionsMod.DefaultComputed
import typingsJapgolly.vue.optionsMod.DefaultData
import typingsJapgolly.vue.optionsMod.DefaultMethods
import typingsJapgolly.vue.optionsMod.DefaultProps
import typingsJapgolly.vue.vnodeMod.VNode
import typingsJapgolly.vue.vnodeMod.VNodeChildren
import typingsJapgolly.vue.vnodeMod.VNodeData
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

