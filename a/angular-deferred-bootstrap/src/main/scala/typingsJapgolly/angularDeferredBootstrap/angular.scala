package typingsJapgolly.angularDeferredBootstrap

import org.scalajs.dom.Node
import typingsJapgolly.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angular {
  
  trait IConfigParam extends StObject {
    
    var element: js.UndefOr[Node] = js.undefined
    
    var module: js.UndefOr[String] = js.undefined
    
    var resolve: Any
  }
  object IConfigParam {
    
    inline def apply(resolve: Any): IConfigParam = {
      val __obj = js.Dynamic.literal(resolve = resolve.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConfigParam]
    }
    
    extension [Self <: IConfigParam](x: Self) {
      
      inline def setElement(value: Node): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setResolve(value: Any): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDeferredBootstrapperStatic extends StObject {
    
    def bootstrap(configParam: IConfigParam): IPromise[Boolean]
  }
  object IDeferredBootstrapperStatic {
    
    inline def apply(bootstrap: IConfigParam => IPromise[Boolean]): IDeferredBootstrapperStatic = {
      val __obj = js.Dynamic.literal(bootstrap = js.Any.fromFunction1(bootstrap))
      __obj.asInstanceOf[IDeferredBootstrapperStatic]
    }
    
    extension [Self <: IDeferredBootstrapperStatic](x: Self) {
      
      inline def setBootstrap(value: IConfigParam => IPromise[Boolean]): Self = StObject.set(x, "bootstrap", js.Any.fromFunction1(value))
    }
  }
}
