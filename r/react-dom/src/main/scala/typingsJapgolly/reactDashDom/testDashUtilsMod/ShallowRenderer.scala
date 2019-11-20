package typingsJapgolly.reactDashDom.testDashUtilsMod

import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShallowRenderer extends js.Object {
  /**
    * After `shallowRenderer.render()` has been called, returns shallowly rendered output.
    */
  def getRenderOutput[E /* <: Element */](): E = js.native
  /**
    * Similar to `ReactDOM.render` but it doesn't require DOM and only renders a single level deep.
    */
  def render(element: Element): Unit = js.native
  def render(element: Element, context: js.Any): Unit = js.native
  def unmount(): Unit = js.native
}

