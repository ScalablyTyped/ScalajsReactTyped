package typingsJapgolly.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutePatchJobRequest extends StObject {
  
  /** Description of the patch job. Length of the description is limited to 1024 characters. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Display name for this patch job. This does not have to be unique. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** If this patch is a dry-run only, instances are contacted but will do nothing. */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  
  /** Duration of the patch job. After the duration ends, the patch job times out. */
  var duration: js.UndefOr[String] = js.undefined
  
  /** Required. Instances to patch, either explicitly or filtered by some criteria such as zone or labels. */
  var instanceFilter: js.UndefOr[PatchInstanceFilter] = js.undefined
  
  /** Patch configuration being applied. If omitted, instances are patched using the default configurations. */
  var patchConfig: js.UndefOr[PatchConfig] = js.undefined
  
  /** Rollout strategy of the patch job. */
  var rollout: js.UndefOr[PatchRollout] = js.undefined
}
object ExecutePatchJobRequest {
  
  inline def apply(): ExecutePatchJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutePatchJobRequest]
  }
  
  extension [Self <: ExecutePatchJobRequest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setInstanceFilter(value: PatchInstanceFilter): Self = StObject.set(x, "instanceFilter", value.asInstanceOf[js.Any])
    
    inline def setInstanceFilterUndefined: Self = StObject.set(x, "instanceFilter", js.undefined)
    
    inline def setPatchConfig(value: PatchConfig): Self = StObject.set(x, "patchConfig", value.asInstanceOf[js.Any])
    
    inline def setPatchConfigUndefined: Self = StObject.set(x, "patchConfig", js.undefined)
    
    inline def setRollout(value: PatchRollout): Self = StObject.set(x, "rollout", value.asInstanceOf[js.Any])
    
    inline def setRolloutUndefined: Self = StObject.set(x, "rollout", js.undefined)
  }
}
