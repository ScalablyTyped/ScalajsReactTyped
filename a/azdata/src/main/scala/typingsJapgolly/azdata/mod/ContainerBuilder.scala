package typingsJapgolly.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerBuilder[T /* <: Component */, TLayout, TItemLayout] extends ComponentBuilder[T] {
  def withItems(components: js.Array[Component]): ContainerBuilder[T, TLayout, TItemLayout] = js.native
  def withItems(components: js.Array[Component], itemLayout: TItemLayout): ContainerBuilder[T, TLayout, TItemLayout] = js.native
  def withLayout(layout: TLayout): ContainerBuilder[T, TLayout, TItemLayout] = js.native
}

