package typingsJapgolly.maximMazurokGapiClientComposer.gapi.client.composer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageVersion extends StObject {
  
  /** Whether it is impossible to create an environment with the image version. */
  var creationDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** The string identifier of the ImageVersion, in the form: "composer-x.y.z-airflow-a.b.c" */
  var imageVersionId: js.UndefOr[String] = js.undefined
  
  /** Whether this is the default ImageVersion used by Composer during environment creation if no input ImageVersion is specified. */
  var isDefault: js.UndefOr[Boolean] = js.undefined
  
  /** The date of the version release. */
  var releaseDate: js.UndefOr[Date] = js.undefined
  
  /** supported python versions */
  var supportedPythonVersions: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Whether it is impossible to upgrade an environment running with the image version. */
  var upgradeDisabled: js.UndefOr[Boolean] = js.undefined
}
object ImageVersion {
  
  inline def apply(): ImageVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageVersion]
  }
  
  extension [Self <: ImageVersion](x: Self) {
    
    inline def setCreationDisabled(value: Boolean): Self = StObject.set(x, "creationDisabled", value.asInstanceOf[js.Any])
    
    inline def setCreationDisabledUndefined: Self = StObject.set(x, "creationDisabled", js.undefined)
    
    inline def setImageVersionId(value: String): Self = StObject.set(x, "imageVersionId", value.asInstanceOf[js.Any])
    
    inline def setImageVersionIdUndefined: Self = StObject.set(x, "imageVersionId", js.undefined)
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setReleaseDate(value: Date): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
    
    inline def setReleaseDateUndefined: Self = StObject.set(x, "releaseDate", js.undefined)
    
    inline def setSupportedPythonVersions(value: js.Array[String]): Self = StObject.set(x, "supportedPythonVersions", value.asInstanceOf[js.Any])
    
    inline def setSupportedPythonVersionsUndefined: Self = StObject.set(x, "supportedPythonVersions", js.undefined)
    
    inline def setSupportedPythonVersionsVarargs(value: String*): Self = StObject.set(x, "supportedPythonVersions", js.Array(value*))
    
    inline def setUpgradeDisabled(value: Boolean): Self = StObject.set(x, "upgradeDisabled", value.asInstanceOf[js.Any])
    
    inline def setUpgradeDisabledUndefined: Self = StObject.set(x, "upgradeDisabled", js.undefined)
  }
}
