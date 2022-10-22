package typingsJapgolly.datatablesNetKeytable

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.datatablesNetKeytable.DataTables.Api
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Disable extends StObject {
    
    /*
      * Disable KeyTable's interactions (mouse and keyboard)
      */
    def disable(): Api
    
    /*
      * Enable or disable KeyTable's interactions (mouse and keyboard)
      */
    def enable(): Api
  }
  object Disable {
    
    inline def apply(disable: CallbackTo[Api], enable: CallbackTo[Api]): Disable = {
      val __obj = js.Dynamic.literal(disable = disable.toJsFn, enable = enable.toJsFn)
      __obj.asInstanceOf[Disable]
    }
    
    extension [Self <: Disable](x: Self) {
      
      inline def setDisable(value: CallbackTo[Api]): Self = StObject.set(x, "disable", value.toJsFn)
      
      inline def setEnable(value: CallbackTo[Api]): Self = StObject.set(x, "enable", value.toJsFn)
    }
  }
}
