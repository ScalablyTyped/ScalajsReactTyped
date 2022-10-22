package typingsJapgolly.jeeJsf

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsf {
  
  object ajax {
    
    trait RequestData extends StObject {
      
      var description: String
      
      var status: String
    }
    object RequestData {
      
      inline def apply(description: String, status: String): RequestData = {
        val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[RequestData]
      }
      
      extension [Self <: RequestData](x: Self) {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    trait RequestOptions extends StObject {
      
      /**
        * space seperated list of client identifiers
        */
      var execute: js.UndefOr[String] = js.undefined
      
      /**
        * client behavior event name from the request parameter
        */
      @JSName("javax.faces.behavior.event")
      var javaxDotfacesDotbehaviorDotevent: js.UndefOr[Any] = js.undefined
      
      /**
        * function to callback for error
        * @param callback the callback function
        */
      var onerror: js.UndefOr[js.Function1[/* callback */ js.Function1[/* data */ RequestData, Unit], Unit]] = js.undefined
      
      /**
        * function to callback for event
        * @param callback the callback function
        */
      var onevent: js.UndefOr[js.Function1[/* callback */ js.Function1[/* data */ RequestData, Unit], Unit]] = js.undefined
      
      /**
        * object containing parameters to include in the request
        */
      var params: js.UndefOr[Any] = js.undefined
      
      /**
        * space seperated list of client identifiers
        */
      var render: js.UndefOr[String] = js.undefined
    }
    object RequestOptions {
      
      inline def apply(): RequestOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RequestOptions]
      }
      
      extension [Self <: RequestOptions](x: Self) {
        
        inline def setExecute(value: String): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
        
        inline def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
        
        inline def setJavaxDotfacesDotbehaviorDotevent(value: Any): Self = StObject.set(x, "javax.faces.behavior.event", value.asInstanceOf[js.Any])
        
        inline def setJavaxDotfacesDotbehaviorDoteventUndefined: Self = StObject.set(x, "javax.faces.behavior.event", js.undefined)
        
        inline def setOnerror(value: /* callback */ js.Function1[/* data */ RequestData, Unit] => Callback): Self = StObject.set(x, "onerror", js.Any.fromFunction1((t0: /* callback */ js.Function1[/* data */ RequestData, Unit]) => value(t0).runNow()))
        
        inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
        
        inline def setOnevent(value: /* callback */ js.Function1[/* data */ RequestData, Unit] => Callback): Self = StObject.set(x, "onevent", js.Any.fromFunction1((t0: /* callback */ js.Function1[/* data */ RequestData, Unit]) => value(t0).runNow()))
        
        inline def setOneventUndefined: Self = StObject.set(x, "onevent", js.undefined)
        
        inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        inline def setRender(value: String): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
        
        inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      }
    }
  }
}
