package typingsJapgolly.roads

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.roads.typesCoreRoadMod.Middleware
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMiddlewareStoreValsMod {
  
  @JSImport("roads/types/middleware/storeVals", "middleware")
  @js.native
  val middleware: Middleware[StoreValsContext] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait StoreValsContext extends StObject {
    
    /**
      * Retrieves all values
      */
    def getAllVals(): Record[String, Any]
    
    /**
      * Retrieves a value
      * @param field string
      */
    def getVal(field: String): Any
    
    /**
      * Stores a value
      * @param field string
      * @param val unknown
      */
    def storeVal(field: String, `val`: Any): Unit
  }
  object StoreValsContext {
    
    inline def apply(
      getAllVals: CallbackTo[Record[String, Any]],
      getVal: String => Any,
      storeVal: (String, Any) => Callback
    ): StoreValsContext = {
      val __obj = js.Dynamic.literal(getAllVals = getAllVals.toJsFn, getVal = js.Any.fromFunction1(getVal), storeVal = js.Any.fromFunction2((t0: String, t1: Any) => (storeVal(t0, t1)).runNow()))
      __obj.asInstanceOf[StoreValsContext]
    }
    
    extension [Self <: StoreValsContext](x: Self) {
      
      inline def setGetAllVals(value: CallbackTo[Record[String, Any]]): Self = StObject.set(x, "getAllVals", value.toJsFn)
      
      inline def setGetVal(value: String => Any): Self = StObject.set(x, "getVal", js.Any.fromFunction1(value))
      
      inline def setStoreVal(value: (String, Any) => Callback): Self = StObject.set(x, "storeVal", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    }
  }
}
