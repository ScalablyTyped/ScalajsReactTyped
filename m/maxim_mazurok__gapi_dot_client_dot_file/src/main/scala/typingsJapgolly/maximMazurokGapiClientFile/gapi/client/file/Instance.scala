package typingsJapgolly.maximMazurokGapiClientFile.gapi.client.file

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance extends StObject {
  
  /** Output only. The time when the instance was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The description of the instance (2048 characters or less). */
  var description: js.UndefOr[String] = js.undefined
  
  /** Server-specified ETag for the instance resource to prevent simultaneous updates from overwriting each other. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** File system shares on the instance. For this version, only a single file share is supported. */
  var fileShares: js.UndefOr[js.Array[FileShareConfig]] = js.undefined
  
  /** KMS key name used for data encryption. */
  var kmsKeyName: js.UndefOr[String] = js.undefined
  
  /** Resource labels to represent user provided metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Output only. The resource name of the instance, in the format `projects/{project}/locations/{location}/instances/{instance}`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** VPC networks to which the instance is connected. For this version, only a single network is supported. */
  var networks: js.UndefOr[js.Array[NetworkConfig]] = js.undefined
  
  /** Output only. Reserved for future use. */
  var satisfiesPzs: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. The instance state. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. Additional information about the instance state, if available. */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /** Output only. Field indicates all the reasons the instance is in "SUSPENDED" state. */
  var suspensionReasons: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The service tier of the instance. */
  var tier: js.UndefOr[String] = js.undefined
}
object Instance {
  
  inline def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  extension [Self <: Instance](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setFileShares(value: js.Array[FileShareConfig]): Self = StObject.set(x, "fileShares", value.asInstanceOf[js.Any])
    
    inline def setFileSharesUndefined: Self = StObject.set(x, "fileShares", js.undefined)
    
    inline def setFileSharesVarargs(value: FileShareConfig*): Self = StObject.set(x, "fileShares", js.Array(value*))
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworks(value: js.Array[NetworkConfig]): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
    
    inline def setNetworksUndefined: Self = StObject.set(x, "networks", js.undefined)
    
    inline def setNetworksVarargs(value: NetworkConfig*): Self = StObject.set(x, "networks", js.Array(value*))
    
    inline def setSatisfiesPzs(value: Boolean): Self = StObject.set(x, "satisfiesPzs", value.asInstanceOf[js.Any])
    
    inline def setSatisfiesPzsUndefined: Self = StObject.set(x, "satisfiesPzs", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setSuspensionReasons(value: js.Array[String]): Self = StObject.set(x, "suspensionReasons", value.asInstanceOf[js.Any])
    
    inline def setSuspensionReasonsUndefined: Self = StObject.set(x, "suspensionReasons", js.undefined)
    
    inline def setSuspensionReasonsVarargs(value: String*): Self = StObject.set(x, "suspensionReasons", js.Array(value*))
    
    inline def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
  }
}
