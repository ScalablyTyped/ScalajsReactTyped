package typingsJapgolly.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreativeGroup extends StObject {
  
  /** Account ID of this creative group. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** Advertiser ID of this creative group. This is a required field on insertion. */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /** Dimension value for the ID of the advertiser. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  
  /**
    * Subgroup of the creative group. Assign your creative groups to a subgroup in order to filter or manage them more easily. This field is required on insertion and is read-only after
    * insertion. Acceptable values are 1 to 2, inclusive.
    */
  var groupNumber: js.UndefOr[Double] = js.undefined
  
  /** ID of this creative group. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#creativeGroup". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Name of this creative group. This is a required field and must be less than 256 characters long and unique among creative groups of the same advertiser. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Subaccount ID of this creative group. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[String] = js.undefined
}
object CreativeGroup {
  
  inline def apply(): CreativeGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeGroup]
  }
  
  extension [Self <: CreativeGroup](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdDimensionValue(value: DimensionValue): Self = StObject.set(x, "advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdDimensionValueUndefined: Self = StObject.set(x, "advertiserIdDimensionValue", js.undefined)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setGroupNumber(value: Double): Self = StObject.set(x, "groupNumber", value.asInstanceOf[js.Any])
    
    inline def setGroupNumberUndefined: Self = StObject.set(x, "groupNumber", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    inline def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
  }
}
