package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.`private`
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.container
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.docker
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.internal
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.maven
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.npm
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.nuget
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.public
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.rubygems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Packagetype extends StObject {
  
  /** The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. */
  var package_type: npm | maven | rubygems | docker | nuget | container
  
  /** The selected visibility of the packages. Only `container` package_types currently support `internal` visibility properly. For other ecosystems `internal` is synonymous with `private`. This parameter is optional and only filters an existing result set. */
  var visibility: js.UndefOr[public | `private` | internal] = js.undefined
}
object Packagetype {
  
  inline def apply(package_type: npm | maven | rubygems | docker | nuget | container): Packagetype = {
    val __obj = js.Dynamic.literal(package_type = package_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packagetype]
  }
  
  extension [Self <: Packagetype](x: Self) {
    
    inline def setPackage_type(value: npm | maven | rubygems | docker | nuget | container): Self = StObject.set(x, "package_type", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: public | `private` | internal): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
