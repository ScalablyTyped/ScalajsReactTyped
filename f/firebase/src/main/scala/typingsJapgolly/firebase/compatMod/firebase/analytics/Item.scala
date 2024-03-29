package typingsJapgolly.firebase.compatMod.firebase.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var affiliation: js.UndefOr[String] = js.undefined
  
  /** @deprecated Use item_brand instead. */
  var brand: js.UndefOr[String] = js.undefined
  
  /** @deprecated Use item_category instead. */
  var category: js.UndefOr[String] = js.undefined
  
  var coupon: js.UndefOr[String] = js.undefined
  
  var creative_name: js.UndefOr[String] = js.undefined
  
  var creative_slot: js.UndefOr[String] = js.undefined
  
  var discount: js.UndefOr[Currency] = js.undefined
  
  /** @deprecated Use item_id instead. */
  var id: js.UndefOr[String] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var item_brand: js.UndefOr[String] = js.undefined
  
  var item_category: js.UndefOr[String] = js.undefined
  
  var item_category2: js.UndefOr[String] = js.undefined
  
  var item_category3: js.UndefOr[String] = js.undefined
  
  var item_category4: js.UndefOr[String] = js.undefined
  
  var item_category5: js.UndefOr[String] = js.undefined
  
  var item_id: js.UndefOr[String] = js.undefined
  
  var item_list_id: js.UndefOr[String] = js.undefined
  
  var item_list_name: js.UndefOr[String] = js.undefined
  
  var item_name: js.UndefOr[String] = js.undefined
  
  var item_variant: js.UndefOr[String] = js.undefined
  
  var location_id: js.UndefOr[String] = js.undefined
  
  /** @deprecated Use item_name instead. */
  var name: js.UndefOr[String] = js.undefined
  
  var price: js.UndefOr[Currency] = js.undefined
  
  var promotion_id: js.UndefOr[String] = js.undefined
  
  var promotion_name: js.UndefOr[String] = js.undefined
  
  var quantity: js.UndefOr[Double] = js.undefined
}
object Item {
  
  inline def apply(): Item = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setAffiliation(value: String): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
    
    inline def setAffiliationUndefined: Self = StObject.set(x, "affiliation", js.undefined)
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
    
    inline def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
    
    inline def setCreative_name(value: String): Self = StObject.set(x, "creative_name", value.asInstanceOf[js.Any])
    
    inline def setCreative_nameUndefined: Self = StObject.set(x, "creative_name", js.undefined)
    
    inline def setCreative_slot(value: String): Self = StObject.set(x, "creative_slot", value.asInstanceOf[js.Any])
    
    inline def setCreative_slotUndefined: Self = StObject.set(x, "creative_slot", js.undefined)
    
    inline def setDiscount(value: Currency): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    inline def setDiscountUndefined: Self = StObject.set(x, "discount", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setItem_brand(value: String): Self = StObject.set(x, "item_brand", value.asInstanceOf[js.Any])
    
    inline def setItem_brandUndefined: Self = StObject.set(x, "item_brand", js.undefined)
    
    inline def setItem_category(value: String): Self = StObject.set(x, "item_category", value.asInstanceOf[js.Any])
    
    inline def setItem_category2(value: String): Self = StObject.set(x, "item_category2", value.asInstanceOf[js.Any])
    
    inline def setItem_category2Undefined: Self = StObject.set(x, "item_category2", js.undefined)
    
    inline def setItem_category3(value: String): Self = StObject.set(x, "item_category3", value.asInstanceOf[js.Any])
    
    inline def setItem_category3Undefined: Self = StObject.set(x, "item_category3", js.undefined)
    
    inline def setItem_category4(value: String): Self = StObject.set(x, "item_category4", value.asInstanceOf[js.Any])
    
    inline def setItem_category4Undefined: Self = StObject.set(x, "item_category4", js.undefined)
    
    inline def setItem_category5(value: String): Self = StObject.set(x, "item_category5", value.asInstanceOf[js.Any])
    
    inline def setItem_category5Undefined: Self = StObject.set(x, "item_category5", js.undefined)
    
    inline def setItem_categoryUndefined: Self = StObject.set(x, "item_category", js.undefined)
    
    inline def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
    
    inline def setItem_idUndefined: Self = StObject.set(x, "item_id", js.undefined)
    
    inline def setItem_list_id(value: String): Self = StObject.set(x, "item_list_id", value.asInstanceOf[js.Any])
    
    inline def setItem_list_idUndefined: Self = StObject.set(x, "item_list_id", js.undefined)
    
    inline def setItem_list_name(value: String): Self = StObject.set(x, "item_list_name", value.asInstanceOf[js.Any])
    
    inline def setItem_list_nameUndefined: Self = StObject.set(x, "item_list_name", js.undefined)
    
    inline def setItem_name(value: String): Self = StObject.set(x, "item_name", value.asInstanceOf[js.Any])
    
    inline def setItem_nameUndefined: Self = StObject.set(x, "item_name", js.undefined)
    
    inline def setItem_variant(value: String): Self = StObject.set(x, "item_variant", value.asInstanceOf[js.Any])
    
    inline def setItem_variantUndefined: Self = StObject.set(x, "item_variant", js.undefined)
    
    inline def setLocation_id(value: String): Self = StObject.set(x, "location_id", value.asInstanceOf[js.Any])
    
    inline def setLocation_idUndefined: Self = StObject.set(x, "location_id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrice(value: Currency): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setPromotion_id(value: String): Self = StObject.set(x, "promotion_id", value.asInstanceOf[js.Any])
    
    inline def setPromotion_idUndefined: Self = StObject.set(x, "promotion_id", js.undefined)
    
    inline def setPromotion_name(value: String): Self = StObject.set(x, "promotion_name", value.asInstanceOf[js.Any])
    
    inline def setPromotion_nameUndefined: Self = StObject.set(x, "promotion_name", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
