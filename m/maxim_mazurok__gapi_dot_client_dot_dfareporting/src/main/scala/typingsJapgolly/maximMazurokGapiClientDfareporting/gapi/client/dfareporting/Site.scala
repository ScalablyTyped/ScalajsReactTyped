package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Site extends StObject {
  
  /** Account ID of this site. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** Whether this site is approved. */
  var approved: js.UndefOr[Boolean] = js.undefined
  
  /** Directory site associated with this site. This is a required field that is read-only after insertion. */
  var directorySiteId: js.UndefOr[String] = js.undefined
  
  /** Dimension value for the ID of the directory site. This is a read-only, auto-generated field. */
  var directorySiteIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  
  /** ID of this site. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Dimension value for the ID of this site. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  
  /** Key name of this site. This is a read-only, auto-generated field. */
  var keyName: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#site". */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this site.This is a required field. Must be less than 128 characters long. If this site is under a subaccount, the name must be unique among sites of the same subaccount.
    * Otherwise, this site is a top-level site, and the name must be unique among top-level sites of the same account.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Site contacts. */
  var siteContacts: js.UndefOr[js.Array[SiteContact]] = js.undefined
  
  /** Site-wide settings. */
  var siteSettings: js.UndefOr[SiteSettings] = js.undefined
  
  /** Subaccount ID of this site. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[String] = js.undefined
  
  /**
    * Default video settings for new placements created under this site. This value will be used to populate the placements.videoSettings field, when no value is specified for the new
    * placement.
    */
  var videoSettings: js.UndefOr[SiteVideoSettings] = js.undefined
}
object Site {
  
  inline def apply(): Site = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Site]
  }
  
  extension [Self <: Site](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setApproved(value: Boolean): Self = StObject.set(x, "approved", value.asInstanceOf[js.Any])
    
    inline def setApprovedUndefined: Self = StObject.set(x, "approved", js.undefined)
    
    inline def setDirectorySiteId(value: String): Self = StObject.set(x, "directorySiteId", value.asInstanceOf[js.Any])
    
    inline def setDirectorySiteIdDimensionValue(value: DimensionValue): Self = StObject.set(x, "directorySiteIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setDirectorySiteIdDimensionValueUndefined: Self = StObject.set(x, "directorySiteIdDimensionValue", js.undefined)
    
    inline def setDirectorySiteIdUndefined: Self = StObject.set(x, "directorySiteId", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValue(value: DimensionValue): Self = StObject.set(x, "idDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setIdDimensionValueUndefined: Self = StObject.set(x, "idDimensionValue", js.undefined)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKeyName(value: String): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    inline def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSiteContacts(value: js.Array[SiteContact]): Self = StObject.set(x, "siteContacts", value.asInstanceOf[js.Any])
    
    inline def setSiteContactsUndefined: Self = StObject.set(x, "siteContacts", js.undefined)
    
    inline def setSiteContactsVarargs(value: SiteContact*): Self = StObject.set(x, "siteContacts", js.Array(value*))
    
    inline def setSiteSettings(value: SiteSettings): Self = StObject.set(x, "siteSettings", value.asInstanceOf[js.Any])
    
    inline def setSiteSettingsUndefined: Self = StObject.set(x, "siteSettings", js.undefined)
    
    inline def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    inline def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    inline def setVideoSettings(value: SiteVideoSettings): Self = StObject.set(x, "videoSettings", value.asInstanceOf[js.Any])
    
    inline def setVideoSettingsUndefined: Self = StObject.set(x, "videoSettings", js.undefined)
  }
}
