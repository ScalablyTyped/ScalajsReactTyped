package typingsJapgolly.vueDevtoolsApi.anon

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootElements extends StObject {
  
  var componentInstance: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance
  
  var rootElements: js.Array[HTMLElement | Any]
}
object RootElements {
  
  inline def apply(
    componentInstance: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance,
    rootElements: js.Array[HTMLElement | Any]
  ): RootElements = {
    val __obj = js.Dynamic.literal(componentInstance = componentInstance.asInstanceOf[js.Any], rootElements = rootElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootElements]
  }
  
  extension [Self <: RootElements](x: Self) {
    
    inline def setComponentInstance(value: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance): Self = StObject.set(x, "componentInstance", value.asInstanceOf[js.Any])
    
    inline def setRootElements(value: js.Array[HTMLElement | Any]): Self = StObject.set(x, "rootElements", value.asInstanceOf[js.Any])
    
    inline def setRootElementsVarargs(value: (HTMLElement | Any)*): Self = StObject.set(x, "rootElements", js.Array(value*))
  }
}
