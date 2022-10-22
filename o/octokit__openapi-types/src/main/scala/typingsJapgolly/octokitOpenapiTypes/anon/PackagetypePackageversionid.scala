package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.container
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.docker
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.maven
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.npm
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.nuget
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.rubygems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackagetypePackageversionid extends StObject {
  
  /** The name of the package. */
  var package_name: String
  
  /** The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. */
  var package_type: npm | maven | rubygems | docker | nuget | container
  
  /** Unique identifier of the package version. */
  var package_version_id: Double
}
object PackagetypePackageversionid {
  
  inline def apply(
    package_name: String,
    package_type: npm | maven | rubygems | docker | nuget | container,
    package_version_id: Double
  ): PackagetypePackageversionid = {
    val __obj = js.Dynamic.literal(package_name = package_name.asInstanceOf[js.Any], package_type = package_type.asInstanceOf[js.Any], package_version_id = package_version_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackagetypePackageversionid]
  }
  
  extension [Self <: PackagetypePackageversionid](x: Self) {
    
    inline def setPackage_name(value: String): Self = StObject.set(x, "package_name", value.asInstanceOf[js.Any])
    
    inline def setPackage_type(value: npm | maven | rubygems | docker | nuget | container): Self = StObject.set(x, "package_type", value.asInstanceOf[js.Any])
    
    inline def setPackage_version_id(value: Double): Self = StObject.set(x, "package_version_id", value.asInstanceOf[js.Any])
  }
}
