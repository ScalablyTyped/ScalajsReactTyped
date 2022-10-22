package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ElementFinder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcCommonBaseDriverDotprotractorMod {
  
  trait BaseDriver extends StObject {
    
    /** Get root element of the component */
    def element(): ElementFinder
  }
  object BaseDriver {
    
    inline def apply(element: CallbackTo[ElementFinder]): BaseDriver = {
      val __obj = js.Dynamic.literal(element = element.toJsFn)
      __obj.asInstanceOf[BaseDriver]
    }
    
    extension [Self <: BaseDriver](x: Self) {
      
      inline def setElement(value: CallbackTo[ElementFinder]): Self = StObject.set(x, "element", value.toJsFn)
    }
  }
  
  type DriverFactory[T /* <: BaseDriver */] = js.Function1[/* element */ ElementFinder, T]
}
