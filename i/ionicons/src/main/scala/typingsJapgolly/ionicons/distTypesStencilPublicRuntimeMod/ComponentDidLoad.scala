package typingsJapgolly.ionicons.distTypesStencilPublicRuntimeMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentDidLoad extends StObject {
  
  /**
    * The component has loaded and has already rendered.
    *
    * Updating data in this method will cause the
    * component to re-render.
    *
    * componentDidLoad will only be called once.
    */
  def componentDidLoad(): Unit
}
object ComponentDidLoad {
  
  inline def apply(componentDidLoad: Callback): ComponentDidLoad = {
    val __obj = js.Dynamic.literal(componentDidLoad = componentDidLoad.toJsFn)
    __obj.asInstanceOf[ComponentDidLoad]
  }
  
  extension [Self <: ComponentDidLoad](x: Self) {
    
    inline def setComponentDidLoad(value: Callback): Self = StObject.set(x, "componentDidLoad", value.toJsFn)
  }
}
