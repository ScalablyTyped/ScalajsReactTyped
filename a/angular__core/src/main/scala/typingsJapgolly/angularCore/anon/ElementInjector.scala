package typingsJapgolly.angularCore.anon

import org.scalajs.dom.Element
import org.scalajs.dom.Node
import typingsJapgolly.angularCore.mod.Injector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementInjector extends StObject {
  
  var elementInjector: js.UndefOr[Injector] = js.undefined
  
  var environmentInjector: typingsJapgolly.angularCore.mod.EnvironmentInjector
  
  var hostElement: js.UndefOr[Element] = js.undefined
  
  var projectableNodes: js.UndefOr[js.Array[js.Array[Node]]] = js.undefined
}
object ElementInjector {
  
  inline def apply(environmentInjector: typingsJapgolly.angularCore.mod.EnvironmentInjector): ElementInjector = {
    val __obj = js.Dynamic.literal(environmentInjector = environmentInjector.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementInjector]
  }
  
  extension [Self <: ElementInjector](x: Self) {
    
    inline def setElementInjector(value: Injector): Self = StObject.set(x, "elementInjector", value.asInstanceOf[js.Any])
    
    inline def setElementInjectorUndefined: Self = StObject.set(x, "elementInjector", js.undefined)
    
    inline def setEnvironmentInjector(value: typingsJapgolly.angularCore.mod.EnvironmentInjector): Self = StObject.set(x, "environmentInjector", value.asInstanceOf[js.Any])
    
    inline def setHostElement(value: Element): Self = StObject.set(x, "hostElement", value.asInstanceOf[js.Any])
    
    inline def setHostElementUndefined: Self = StObject.set(x, "hostElement", js.undefined)
    
    inline def setProjectableNodes(value: js.Array[js.Array[Node]]): Self = StObject.set(x, "projectableNodes", value.asInstanceOf[js.Any])
    
    inline def setProjectableNodesUndefined: Self = StObject.set(x, "projectableNodes", js.undefined)
    
    inline def setProjectableNodesVarargs(value: js.Array[Node]*): Self = StObject.set(x, "projectableNodes", js.Array(value*))
  }
}
