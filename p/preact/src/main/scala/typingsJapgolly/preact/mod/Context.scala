package typingsJapgolly.preact.mod

import typingsJapgolly.preact.Anon0
import typingsJapgolly.preact.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context[T] extends js.Object {
  @JSName("Consumer")
  var Consumer_Original: Consumer[T] = js.native
  @JSName("Provider")
  var Provider_Original: Provider[T] = js.native
  def Consumer(props: RenderableProps[Anon0[T], _]): VNode[_] | Null = js.native
  def Consumer(props: RenderableProps[Anon0[T], _], context: js.Any): VNode[_] | Null = js.native
  def Provider(props: RenderableProps[AnonValue[T], _]): VNode[_] | Null = js.native
  def Provider(props: RenderableProps[AnonValue[T], _], context: js.Any): VNode[_] | Null = js.native
}

