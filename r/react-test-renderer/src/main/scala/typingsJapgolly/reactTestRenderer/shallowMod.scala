package typingsJapgolly.reactTestRenderer

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.ReactInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shallowMod {
  
  @JSImport("react-test-renderer/shallow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRenderer(): ShallowRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("createRenderer")().asInstanceOf[ShallowRenderer]
  
  @js.native
  trait ShallowRenderer extends StObject {
    
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
    def render(element: Element, context: Any): Unit = js.native
    
    def unmount(): Unit = js.native
  }
}
