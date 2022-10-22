package typingsJapgolly.pulumiPulumi.automationStackMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.pulumiPulumi.automationEventsMod.EngineEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestroyOptions
  extends StObject
     with GlobalOpts {
  
  var message: js.UndefOr[String] = js.undefined
  
  var onEvent: js.UndefOr[js.Function1[/* event */ EngineEvent, Unit]] = js.undefined
  
  var onOutput: js.UndefOr[js.Function1[/* out */ String, Unit]] = js.undefined
  
  var parallel: js.UndefOr[Double] = js.undefined
  
  var showSecrets: js.UndefOr[Boolean] = js.undefined
  
  var target: js.UndefOr[js.Array[String]] = js.undefined
  
  var targetDependents: js.UndefOr[Boolean] = js.undefined
  
  var userAgent: js.UndefOr[String] = js.undefined
}
object DestroyOptions {
  
  inline def apply(): DestroyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestroyOptions]
  }
  
  extension [Self <: DestroyOptions](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setOnEvent(value: /* event */ EngineEvent => Callback): Self = StObject.set(x, "onEvent", js.Any.fromFunction1((t0: /* event */ EngineEvent) => value(t0).runNow()))
    
    inline def setOnEventUndefined: Self = StObject.set(x, "onEvent", js.undefined)
    
    inline def setOnOutput(value: /* out */ String => Callback): Self = StObject.set(x, "onOutput", js.Any.fromFunction1((t0: /* out */ String) => value(t0).runNow()))
    
    inline def setOnOutputUndefined: Self = StObject.set(x, "onOutput", js.undefined)
    
    inline def setParallel(value: Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
    
    inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
    
    inline def setShowSecrets(value: Boolean): Self = StObject.set(x, "showSecrets", value.asInstanceOf[js.Any])
    
    inline def setShowSecretsUndefined: Self = StObject.set(x, "showSecrets", js.undefined)
    
    inline def setTarget(value: js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetDependents(value: Boolean): Self = StObject.set(x, "targetDependents", value.asInstanceOf[js.Any])
    
    inline def setTargetDependentsUndefined: Self = StObject.set(x, "targetDependents", js.undefined)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
  }
}
