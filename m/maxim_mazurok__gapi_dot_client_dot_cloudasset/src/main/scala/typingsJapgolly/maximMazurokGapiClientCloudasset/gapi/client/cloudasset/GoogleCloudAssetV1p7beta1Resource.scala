package typingsJapgolly.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssetV1p7beta1Resource extends StObject {
  
  /** The content of the resource, in which some sensitive fields are removed and may not be present. */
  var data: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /**
    * The URL of the discovery document containing the resource's JSON schema. Example: `https://www.googleapis.com/discovery/v1/apis/compute/v1/rest` This value is unspecified for
    * resources that do not have an API based on a discovery document, such as Cloud Bigtable.
    */
  var discoveryDocumentUri: js.UndefOr[String] = js.undefined
  
  /**
    * The JSON schema name listed in the discovery document. Example: `Project` This value is unspecified for resources that do not have an API based on a discovery document, such as
    * Cloud Bigtable.
    */
  var discoveryName: js.UndefOr[String] = js.undefined
  
  /** The location of the resource in Google Cloud, such as its zone and region. For more information, see https://cloud.google.com/about/locations/. */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The full name of the immediate parent of this resource. See [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more information. For Google
    * Cloud assets, this value is the parent resource defined in the [Cloud IAM policy hierarchy](https://cloud.google.com/iam/docs/overview#policy_hierarchy). Example:
    * `//cloudresourcemanager.googleapis.com/projects/my_project_123` For third-party assets, this field may be set differently.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * The REST URL for accessing the resource. An HTTP `GET` request using this URL returns the resource itself. Example:
    * `https://cloudresourcemanager.googleapis.com/v1/projects/my-project-123` This value is unspecified for resources without a REST API.
    */
  var resourceUrl: js.UndefOr[String] = js.undefined
  
  /** The API version. Example: `v1` */
  var version: js.UndefOr[String] = js.undefined
}
object GoogleCloudAssetV1p7beta1Resource {
  
  inline def apply(): GoogleCloudAssetV1p7beta1Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssetV1p7beta1Resource]
  }
  
  extension [Self <: GoogleCloudAssetV1p7beta1Resource](x: Self) {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDiscoveryDocumentUri(value: String): Self = StObject.set(x, "discoveryDocumentUri", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryDocumentUriUndefined: Self = StObject.set(x, "discoveryDocumentUri", js.undefined)
    
    inline def setDiscoveryName(value: String): Self = StObject.set(x, "discoveryName", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryNameUndefined: Self = StObject.set(x, "discoveryName", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setResourceUrl(value: String): Self = StObject.set(x, "resourceUrl", value.asInstanceOf[js.Any])
    
    inline def setResourceUrlUndefined: Self = StObject.set(x, "resourceUrl", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
