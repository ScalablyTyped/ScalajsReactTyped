package typingsJapgolly.pulumiPulumi.automationStackMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.automationConfigMod.ConfigMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSummary extends StObject {
  
  var Deployment: js.UndefOr[RawJSON] = js.undefined
  
  var config: ConfigMap
  
  var endTime: js.Date
  
  var environment: StringDictionary[String]
  
  var kind: UpdateKind
  
  var message: String
  
  var resourceChanges: js.UndefOr[OpMap] = js.undefined
  
  var result: UpdateResult
  
  var startTime: js.Date
  
  var version: Double
}
object UpdateSummary {
  
  inline def apply(
    config: ConfigMap,
    endTime: js.Date,
    environment: StringDictionary[String],
    kind: UpdateKind,
    message: String,
    result: UpdateResult,
    startTime: js.Date,
    version: Double
  ): UpdateSummary = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSummary]
  }
  
  extension [Self <: UpdateSummary](x: Self) {
    
    inline def setConfig(value: ConfigMap): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDeployment(value: RawJSON): Self = StObject.set(x, "Deployment", value.asInstanceOf[js.Any])
    
    inline def setDeploymentUndefined: Self = StObject.set(x, "Deployment", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEnvironment(value: StringDictionary[String]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setKind(value: UpdateKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setResourceChanges(value: OpMap): Self = StObject.set(x, "resourceChanges", value.asInstanceOf[js.Any])
    
    inline def setResourceChangesUndefined: Self = StObject.set(x, "resourceChanges", js.undefined)
    
    inline def setResult(value: UpdateResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
