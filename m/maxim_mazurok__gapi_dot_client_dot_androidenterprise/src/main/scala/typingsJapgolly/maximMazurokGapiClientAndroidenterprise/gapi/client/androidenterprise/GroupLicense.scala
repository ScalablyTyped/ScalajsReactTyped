package typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupLicense extends StObject {
  
  /**
    * How this group license was acquired. "bulkPurchase" means that this Grouplicenses resource was created because the enterprise purchased licenses for this product; otherwise, the
    * value is "free" (for free products).
    */
  var acquisitionKind: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the product to which this group license relates is currently approved by the enterprise. Products are approved when a group license is first created, but this approval may
    * be revoked by an enterprise admin via Google Play. Unapproved products will not be visible to end users in collections, and new entitlements to them should not normally be created.
    */
  var approval: js.UndefOr[String] = js.undefined
  
  /** The total number of provisioned licenses for this product. Returned by read operations, but ignored in write operations. */
  var numProvisioned: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of purchased licenses (possibly in multiple purchases). If this field is omitted, then there is no limit on the number of licenses that can be provisioned (for example,
    * if the acquisition kind is "free").
    */
  var numPurchased: js.UndefOr[Double] = js.undefined
  
  /**
    * The permission approval status of the product. This field is only set if the product is approved. Possible states are: - "currentApproved", the current set of permissions is
    * approved, but additional permissions will require the administrator to reapprove the product (If the product was approved without specifying the approved permissions setting, then
    * this is the default behavior.), - "needsReapproval", the product has unapproved permissions. No additional product licenses can be assigned until the product is reapproved, -
    * "allCurrentAndFutureApproved", the current permissions are approved and any future permission updates will be automatically approved without administrator review.
    */
  var permissions: js.UndefOr[String] = js.undefined
  
  /** The ID of the product that the license is for. For example, "app:com.google.android.gm". */
  var productId: js.UndefOr[String] = js.undefined
}
object GroupLicense {
  
  inline def apply(): GroupLicense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupLicense]
  }
  
  extension [Self <: GroupLicense](x: Self) {
    
    inline def setAcquisitionKind(value: String): Self = StObject.set(x, "acquisitionKind", value.asInstanceOf[js.Any])
    
    inline def setAcquisitionKindUndefined: Self = StObject.set(x, "acquisitionKind", js.undefined)
    
    inline def setApproval(value: String): Self = StObject.set(x, "approval", value.asInstanceOf[js.Any])
    
    inline def setApprovalUndefined: Self = StObject.set(x, "approval", js.undefined)
    
    inline def setNumProvisioned(value: Double): Self = StObject.set(x, "numProvisioned", value.asInstanceOf[js.Any])
    
    inline def setNumProvisionedUndefined: Self = StObject.set(x, "numProvisioned", js.undefined)
    
    inline def setNumPurchased(value: Double): Self = StObject.set(x, "numPurchased", value.asInstanceOf[js.Any])
    
    inline def setNumPurchasedUndefined: Self = StObject.set(x, "numPurchased", js.undefined)
    
    inline def setPermissions(value: String): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
