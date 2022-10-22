package typingsJapgolly.pulumiPulumi.automationStackMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pulumiPulumi.automationEventsMod.EngineEvent
import typingsJapgolly.pulumiPulumi.automationWorkspaceMod.PulumiFn
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpOptions
  extends StObject
     with GlobalOpts {
  
  var diff: js.UndefOr[Boolean] = js.undefined
  
  var expectNoChanges: js.UndefOr[Boolean] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var onEvent: js.UndefOr[js.Function1[/* event */ EngineEvent, Unit]] = js.undefined
  
  var onOutput: js.UndefOr[js.Function1[/* out */ String, Unit]] = js.undefined
  
  var parallel: js.UndefOr[Double] = js.undefined
  
  /**
    * Plan specifies the path to an update plan to use for the update.
    */
  var plan: js.UndefOr[String] = js.undefined
  
  var policyPackConfigs: js.UndefOr[js.Array[String]] = js.undefined
  
  var policyPacks: js.UndefOr[js.Array[String]] = js.undefined
  
  var program: js.UndefOr[PulumiFn] = js.undefined
  
  var replace: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Include secrets in the UpSummary.
    */
  var showSecrets: js.UndefOr[Boolean] = js.undefined
  
  var target: js.UndefOr[js.Array[String]] = js.undefined
  
  var targetDependents: js.UndefOr[Boolean] = js.undefined
  
  var userAgent: js.UndefOr[String] = js.undefined
}
object UpOptions {
  
  inline def apply(): UpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpOptions]
  }
  
  extension [Self <: UpOptions](x: Self) {
    
    inline def setDiff(value: Boolean): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
    
    inline def setDiffUndefined: Self = StObject.set(x, "diff", js.undefined)
    
    inline def setExpectNoChanges(value: Boolean): Self = StObject.set(x, "expectNoChanges", value.asInstanceOf[js.Any])
    
    inline def setExpectNoChangesUndefined: Self = StObject.set(x, "expectNoChanges", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setOnEvent(value: /* event */ EngineEvent => Callback): Self = StObject.set(x, "onEvent", js.Any.fromFunction1((t0: /* event */ EngineEvent) => value(t0).runNow()))
    
    inline def setOnEventUndefined: Self = StObject.set(x, "onEvent", js.undefined)
    
    inline def setOnOutput(value: /* out */ String => Callback): Self = StObject.set(x, "onOutput", js.Any.fromFunction1((t0: /* out */ String) => value(t0).runNow()))
    
    inline def setOnOutputUndefined: Self = StObject.set(x, "onOutput", js.undefined)
    
    inline def setParallel(value: Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
    
    inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
    
    inline def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
    
    inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
    
    inline def setPolicyPackConfigs(value: js.Array[String]): Self = StObject.set(x, "policyPackConfigs", value.asInstanceOf[js.Any])
    
    inline def setPolicyPackConfigsUndefined: Self = StObject.set(x, "policyPackConfigs", js.undefined)
    
    inline def setPolicyPackConfigsVarargs(value: String*): Self = StObject.set(x, "policyPackConfigs", js.Array(value*))
    
    inline def setPolicyPacks(value: js.Array[String]): Self = StObject.set(x, "policyPacks", value.asInstanceOf[js.Any])
    
    inline def setPolicyPacksUndefined: Self = StObject.set(x, "policyPacks", js.undefined)
    
    inline def setPolicyPacksVarargs(value: String*): Self = StObject.set(x, "policyPacks", js.Array(value*))
    
    inline def setProgram(value: CallbackTo[js.Promise[(Record[String, Any]) | Unit]]): Self = StObject.set(x, "program", value.toJsFn)
    
    inline def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
    
    inline def setReplace(value: js.Array[String]): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setReplaceVarargs(value: String*): Self = StObject.set(x, "replace", js.Array(value*))
    
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
