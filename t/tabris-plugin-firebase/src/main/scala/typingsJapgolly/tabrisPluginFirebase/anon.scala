package typingsJapgolly.tabrisPluginFirebase

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClearAll extends StObject {
    
    def clearAll(): Unit
    
    def getAll(): js.Array[js.Object]
  }
  object ClearAll {
    
    inline def apply(clearAll: Callback, getAll: CallbackTo[js.Array[js.Object]]): ClearAll = {
      val __obj = js.Dynamic.literal(clearAll = clearAll.toJsFn, getAll = getAll.toJsFn)
      __obj.asInstanceOf[ClearAll]
    }
    
    extension [Self <: ClearAll](x: Self) {
      
      inline def setClearAll(value: Callback): Self = StObject.set(x, "clearAll", value.toJsFn)
      
      inline def setGetAll(value: CallbackTo[js.Array[js.Object]]): Self = StObject.set(x, "getAll", value.toJsFn)
    }
  }
}
