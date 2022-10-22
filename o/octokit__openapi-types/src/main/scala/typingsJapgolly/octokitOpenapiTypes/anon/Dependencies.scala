package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.development
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.direct
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.indirect
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.runtime
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dependencies extends StObject {
  
  /**
    * @description Array of package-url (PURLs) of direct child dependencies.
    * @example @actions/http-client
    */
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  var metadata: js.UndefOr[StringDictionary[Partial[String] & Partial[Double] & Partial[Boolean]]] = js.undefined
  
  /**
    * @description Package-url (PURL) of dependency. See https://github.com/package-url/purl-spec for more details.
    * @example pkg:/npm/%40actions/http-client@1.0.11
    */
  var package_url: js.UndefOr[String] = js.undefined
  
  /**
    * @description A notation of whether a dependency is requested directly by this manifest or is a dependency of another dependency.
    * @example direct
    * @enum {string}
    */
  var relationship: js.UndefOr[direct | indirect] = js.undefined
  
  /**
    * @description A notation of whether the dependency is required for the primary build artifact (runtime) or is only used for development. Future versions of this specification may allow for more granular scopes.
    * @example runtime
    * @enum {string}
    */
  var scope: js.UndefOr[runtime | development] = js.undefined
}
object Dependencies {
  
  inline def apply(): Dependencies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dependencies]
  }
  
  extension [Self <: Dependencies](x: Self) {
    
    inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setMetadata(value: StringDictionary[Partial[String] & Partial[Double] & Partial[Boolean]]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setPackage_url(value: String): Self = StObject.set(x, "package_url", value.asInstanceOf[js.Any])
    
    inline def setPackage_urlUndefined: Self = StObject.set(x, "package_url", js.undefined)
    
    inline def setRelationship(value: direct | indirect): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
    
    inline def setScope(value: runtime | development): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
