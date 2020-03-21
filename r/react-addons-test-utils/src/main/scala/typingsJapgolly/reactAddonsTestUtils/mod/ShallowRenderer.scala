package typingsJapgolly.reactAddonsTestUtils.mod

import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShallowRenderer extends js.Object {
  def getRenderOutput[E /* <: Element */](): E = js.native
  def render(element: Element): Unit = js.native
  def render(element: Element, context: js.Any): Unit = js.native
  def unmount(): Unit = js.native
}

