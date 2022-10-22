package typingsJapgolly.atlaskitAnalyticsNextStableReactContext

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsTypesMod {
  
  trait AnalyticsReactContextInterface extends StObject {
    
    def getAtlaskitAnalyticsContext(): js.Array[Any]
    
    def getAtlaskitAnalyticsEventHandlers(): js.Array[Any]
  }
  object AnalyticsReactContextInterface {
    
    inline def apply(
      getAtlaskitAnalyticsContext: CallbackTo[js.Array[Any]],
      getAtlaskitAnalyticsEventHandlers: CallbackTo[js.Array[Any]]
    ): AnalyticsReactContextInterface = {
      val __obj = js.Dynamic.literal(getAtlaskitAnalyticsContext = getAtlaskitAnalyticsContext.toJsFn, getAtlaskitAnalyticsEventHandlers = getAtlaskitAnalyticsEventHandlers.toJsFn)
      __obj.asInstanceOf[AnalyticsReactContextInterface]
    }
    
    extension [Self <: AnalyticsReactContextInterface](x: Self) {
      
      inline def setGetAtlaskitAnalyticsContext(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getAtlaskitAnalyticsContext", value.toJsFn)
      
      inline def setGetAtlaskitAnalyticsEventHandlers(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getAtlaskitAnalyticsEventHandlers", value.toJsFn)
    }
  }
}
