package typingsJapgolly.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomTemplate extends StObject {
  
  /** GTM Account ID. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** GTM Container ID. */
  var containerId: js.UndefOr[String] = js.undefined
  
  /** The fingerprint of the GTM Custom Template as computed at storage time. This value is recomputed whenever the template is modified. */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /** A reference to the Community Template Gallery entry. */
  var galleryReference: js.UndefOr[GalleryReference] = js.undefined
  
  /** Custom Template display name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** GTM Custom Template's API relative path. */
  var path: js.UndefOr[String] = js.undefined
  
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  
  /** The custom template in text format. */
  var templateData: js.UndefOr[String] = js.undefined
  
  /** The Custom Template ID uniquely identifies the GTM custom template. */
  var templateId: js.UndefOr[String] = js.undefined
  
  /** GTM Workspace ID. */
  var workspaceId: js.UndefOr[String] = js.undefined
}
object CustomTemplate {
  
  inline def apply(): CustomTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomTemplate]
  }
  
  extension [Self <: CustomTemplate](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setGalleryReference(value: GalleryReference): Self = StObject.set(x, "galleryReference", value.asInstanceOf[js.Any])
    
    inline def setGalleryReferenceUndefined: Self = StObject.set(x, "galleryReference", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
    
    inline def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
    
    inline def setTemplateData(value: String): Self = StObject.set(x, "templateData", value.asInstanceOf[js.Any])
    
    inline def setTemplateDataUndefined: Self = StObject.set(x, "templateData", js.undefined)
    
    inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    
    inline def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
  }
}
