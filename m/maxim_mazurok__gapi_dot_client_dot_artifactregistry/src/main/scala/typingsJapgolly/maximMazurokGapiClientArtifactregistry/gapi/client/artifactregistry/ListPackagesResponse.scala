package typingsJapgolly.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPackagesResponse extends StObject {
  
  /** The token to retrieve the next page of packages, or empty if there are no more packages to return. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The packages returned. */
  var packages: js.UndefOr[js.Array[Package]] = js.undefined
}
object ListPackagesResponse {
  
  inline def apply(): ListPackagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPackagesResponse]
  }
  
  extension [Self <: ListPackagesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPackages(value: js.Array[Package]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    inline def setPackagesVarargs(value: Package*): Self = StObject.set(x, "packages", js.Array(value*))
  }
}
