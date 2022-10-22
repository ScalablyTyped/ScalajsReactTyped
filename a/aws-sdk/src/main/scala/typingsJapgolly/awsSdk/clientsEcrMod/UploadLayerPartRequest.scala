package typingsJapgolly.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadLayerPartRequest extends StObject {
  
  /**
    * The base64-encoded layer part payload.
    */
  var layerPartBlob: LayerPartBlob
  
  /**
    * The position of the first byte of the layer part witin the overall image layer.
    */
  var partFirstByte: PartSize
  
  /**
    * The position of the last byte of the layer part within the overall image layer.
    */
  var partLastByte: PartSize
  
  /**
    * The Amazon Web Services account ID associated with the registry to which you are uploading layer parts. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The name of the repository to which you are uploading layer parts.
    */
  var repositoryName: RepositoryName
  
  /**
    * The upload ID from a previous InitiateLayerUpload operation to associate with the layer part upload.
    */
  var uploadId: UploadId
}
object UploadLayerPartRequest {
  
  inline def apply(
    layerPartBlob: LayerPartBlob,
    partFirstByte: PartSize,
    partLastByte: PartSize,
    repositoryName: RepositoryName,
    uploadId: UploadId
  ): UploadLayerPartRequest = {
    val __obj = js.Dynamic.literal(layerPartBlob = layerPartBlob.asInstanceOf[js.Any], partFirstByte = partFirstByte.asInstanceOf[js.Any], partLastByte = partLastByte.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadLayerPartRequest]
  }
  
  extension [Self <: UploadLayerPartRequest](x: Self) {
    
    inline def setLayerPartBlob(value: LayerPartBlob): Self = StObject.set(x, "layerPartBlob", value.asInstanceOf[js.Any])
    
    inline def setPartFirstByte(value: PartSize): Self = StObject.set(x, "partFirstByte", value.asInstanceOf[js.Any])
    
    inline def setPartLastByte(value: PartSize): Self = StObject.set(x, "partLastByte", value.asInstanceOf[js.Any])
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setUploadId(value: UploadId): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
  }
}
