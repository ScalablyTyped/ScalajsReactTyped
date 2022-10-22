package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.Active
import typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.PassThrough
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTracingConfigMod {
  
  trait TracingConfig extends StObject {
    
    /**
      * <p>The tracing mode.</p>
      */
    var Mode: js.UndefOr[Active | PassThrough | String] = js.undefined
  }
  object TracingConfig {
    
    inline def apply(): TracingConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TracingConfig]
    }
    
    extension [Self <: TracingConfig](x: Self) {
      
      inline def setMode(value: Active | PassThrough | String): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    }
  }
  
  type UnmarshalledTracingConfig = TracingConfig
}
