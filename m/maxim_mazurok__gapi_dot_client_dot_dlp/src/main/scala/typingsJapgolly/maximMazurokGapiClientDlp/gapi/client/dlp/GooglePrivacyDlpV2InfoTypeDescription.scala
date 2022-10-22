package typingsJapgolly.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2InfoTypeDescription extends StObject {
  
  /** The category of the infoType. */
  var categories: js.UndefOr[js.Array[GooglePrivacyDlpV2InfoTypeCategory]] = js.undefined
  
  /** Description of the infotype. Translated when language is provided in the request. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Human readable form of the infoType name. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Internal name of the infoType. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Which parts of the API supports this InfoType. */
  var supportedBy: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A list of available versions for the infotype. */
  var versions: js.UndefOr[js.Array[GooglePrivacyDlpV2VersionDescription]] = js.undefined
}
object GooglePrivacyDlpV2InfoTypeDescription {
  
  inline def apply(): GooglePrivacyDlpV2InfoTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InfoTypeDescription]
  }
  
  extension [Self <: GooglePrivacyDlpV2InfoTypeDescription](x: Self) {
    
    inline def setCategories(value: js.Array[GooglePrivacyDlpV2InfoTypeCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: GooglePrivacyDlpV2InfoTypeCategory*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSupportedBy(value: js.Array[String]): Self = StObject.set(x, "supportedBy", value.asInstanceOf[js.Any])
    
    inline def setSupportedByUndefined: Self = StObject.set(x, "supportedBy", js.undefined)
    
    inline def setSupportedByVarargs(value: String*): Self = StObject.set(x, "supportedBy", js.Array(value*))
    
    inline def setVersions(value: js.Array[GooglePrivacyDlpV2VersionDescription]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: GooglePrivacyDlpV2VersionDescription*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
