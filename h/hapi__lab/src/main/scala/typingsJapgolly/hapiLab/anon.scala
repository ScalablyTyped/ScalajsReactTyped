package typingsJapgolly.hapiLab

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<@hapi/lab.@hapi/lab.script.TestOptions, 'plan'> */
  trait OmitTestOptionsplan extends StObject {
    
    var only: js.UndefOr[Boolean] = js.undefined
    
    var retry: js.UndefOr[Double | Boolean] = js.undefined
    
    var skip: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object OmitTestOptionsplan {
    
    inline def apply(): OmitTestOptionsplan = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OmitTestOptionsplan]
    }
    
    extension [Self <: OmitTestOptionsplan](x: Self) {
      
      inline def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      inline def setRetry(value: Double | Boolean): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
