package typingsJapgolly.vueDevtoolsApi.anon

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var componentInstance: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance
  
  var element: HTMLElement | Any
}
object Element {
  
  inline def apply(
    componentInstance: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance,
    element: HTMLElement | Any
  ): Element = {
    val __obj = js.Dynamic.literal(componentInstance = componentInstance.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setComponentInstance(value: typingsJapgolly.vueDevtoolsApi.libEsmApiComponentMod.ComponentInstance): Self = StObject.set(x, "componentInstance", value.asInstanceOf[js.Any])
    
    inline def setElement(value: HTMLElement | Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
