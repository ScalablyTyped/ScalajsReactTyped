package typingsJapgolly.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2DeidentifyContentRequest extends StObject {
  
  /** Configuration for the de-identification of the content item. Items specified here will override the template referenced by the deidentify_template_name argument. */
  var deidentifyConfig: js.UndefOr[GooglePrivacyDlpV2DeidentifyConfig] = js.undefined
  
  /**
    * Template to use. Any configuration directly specified in deidentify_config will override those set in the template. Singular fields that are set in this request will replace their
    * corresponding fields in the template. Repeated fields are appended. Singular sub-messages and groups are recursively merged.
    */
  var deidentifyTemplateName: js.UndefOr[String] = js.undefined
  
  /** Configuration for the inspector. Items specified here will override the template referenced by the inspect_template_name argument. */
  var inspectConfig: js.UndefOr[GooglePrivacyDlpV2InspectConfig] = js.undefined
  
  /**
    * Template to use. Any configuration directly specified in inspect_config will override those set in the template. Singular fields that are set in this request will replace their
    * corresponding fields in the template. Repeated fields are appended. Singular sub-messages and groups are recursively merged.
    */
  var inspectTemplateName: js.UndefOr[String] = js.undefined
  
  /** The item to de-identify. Will be treated as text. */
  var item: js.UndefOr[GooglePrivacyDlpV2ContentItem] = js.undefined
  
  /** Deprecated. This field has no effect. */
  var locationId: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2DeidentifyContentRequest {
  
  inline def apply(): GooglePrivacyDlpV2DeidentifyContentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DeidentifyContentRequest]
  }
  
  extension [Self <: GooglePrivacyDlpV2DeidentifyContentRequest](x: Self) {
    
    inline def setDeidentifyConfig(value: GooglePrivacyDlpV2DeidentifyConfig): Self = StObject.set(x, "deidentifyConfig", value.asInstanceOf[js.Any])
    
    inline def setDeidentifyConfigUndefined: Self = StObject.set(x, "deidentifyConfig", js.undefined)
    
    inline def setDeidentifyTemplateName(value: String): Self = StObject.set(x, "deidentifyTemplateName", value.asInstanceOf[js.Any])
    
    inline def setDeidentifyTemplateNameUndefined: Self = StObject.set(x, "deidentifyTemplateName", js.undefined)
    
    inline def setInspectConfig(value: GooglePrivacyDlpV2InspectConfig): Self = StObject.set(x, "inspectConfig", value.asInstanceOf[js.Any])
    
    inline def setInspectConfigUndefined: Self = StObject.set(x, "inspectConfig", js.undefined)
    
    inline def setInspectTemplateName(value: String): Self = StObject.set(x, "inspectTemplateName", value.asInstanceOf[js.Any])
    
    inline def setInspectTemplateNameUndefined: Self = StObject.set(x, "inspectTemplateName", js.undefined)
    
    inline def setItem(value: GooglePrivacyDlpV2ContentItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
  }
}
