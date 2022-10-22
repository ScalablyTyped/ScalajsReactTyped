package typingsJapgolly.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetImageRequest extends StObject {
  
  /**
    * The accepted media types for the request. Valid values: application/vnd.docker.distribution.manifest.v1+json | application/vnd.docker.distribution.manifest.v2+json | application/vnd.oci.image.manifest.v1+json 
    */
  var acceptedMediaTypes: js.UndefOr[MediaTypeList] = js.undefined
  
  /**
    * A list of image ID references that correspond to images to describe. The format of the imageIds reference is imageTag=tag or imageDigest=digest.
    */
  var imageIds: ImageIdentifierList
  
  /**
    * The Amazon Web Services account ID associated with the registry that contains the images to describe. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The repository that contains the images to describe.
    */
  var repositoryName: RepositoryName
}
object BatchGetImageRequest {
  
  inline def apply(imageIds: ImageIdentifierList, repositoryName: RepositoryName): BatchGetImageRequest = {
    val __obj = js.Dynamic.literal(imageIds = imageIds.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetImageRequest]
  }
  
  extension [Self <: BatchGetImageRequest](x: Self) {
    
    inline def setAcceptedMediaTypes(value: MediaTypeList): Self = StObject.set(x, "acceptedMediaTypes", value.asInstanceOf[js.Any])
    
    inline def setAcceptedMediaTypesUndefined: Self = StObject.set(x, "acceptedMediaTypes", js.undefined)
    
    inline def setAcceptedMediaTypesVarargs(value: MediaType*): Self = StObject.set(x, "acceptedMediaTypes", js.Array(value*))
    
    inline def setImageIds(value: ImageIdentifierList): Self = StObject.set(x, "imageIds", value.asInstanceOf[js.Any])
    
    inline def setImageIdsVarargs(value: ImageIdentifier*): Self = StObject.set(x, "imageIds", js.Array(value*))
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
