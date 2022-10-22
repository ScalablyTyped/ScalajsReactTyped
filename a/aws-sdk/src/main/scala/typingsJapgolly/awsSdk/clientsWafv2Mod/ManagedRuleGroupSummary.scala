package typingsJapgolly.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedRuleGroupSummary extends StObject {
  
  /**
    * The description of the managed rule group, provided by Amazon Web Services Managed Rules or the Amazon Web Services Marketplace seller who manages it.
    */
  var Description: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The name of the managed rule group. You use this, along with the vendor name, to identify the rule group.
    */
  var Name: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The name of the managed rule group vendor. You use this, along with the rule group name, to identify the rule group.
    */
  var VendorName: js.UndefOr[typingsJapgolly.awsSdk.clientsWafv2Mod.VendorName] = js.undefined
  
  /**
    * Indicates whether the managed rule group is versioned. If it is, you can retrieve the versions list by calling ListAvailableManagedRuleGroupVersions. 
    */
  var VersioningSupported: js.UndefOr[Boolean] = js.undefined
}
object ManagedRuleGroupSummary {
  
  inline def apply(): ManagedRuleGroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedRuleGroupSummary]
  }
  
  extension [Self <: ManagedRuleGroupSummary](x: Self) {
    
    inline def setDescription(value: EntityDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setVendorName(value: VendorName): Self = StObject.set(x, "VendorName", value.asInstanceOf[js.Any])
    
    inline def setVendorNameUndefined: Self = StObject.set(x, "VendorName", js.undefined)
    
    inline def setVersioningSupported(value: Boolean): Self = StObject.set(x, "VersioningSupported", value.asInstanceOf[js.Any])
    
    inline def setVersioningSupportedUndefined: Self = StObject.set(x, "VersioningSupported", js.undefined)
  }
}
