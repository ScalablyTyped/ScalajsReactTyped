package typingsJapgolly.reactTestRenderer

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-test-renderer/shallow", JSImport.Namespace)
@js.native
object shallowMod extends js.Object {
  @js.native
  trait ShallowRenderer extends js.Object {
    /**
      * After `shallowRenderer.render()` has been called, returns mounted instance.
      */
    def getMountedInstance(): ReactInstance = js.native
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
  
  def createRenderer(): ShallowRenderer = js.native
}

