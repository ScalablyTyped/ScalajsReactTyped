package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Access to product group builders via the ProductGroup.newChild() method. */
trait ProductGroupBuilderSpace extends StObject {
  
  /** Returns a product brand builder. */
  def brandBuilder(): ProductBrandBuilder
  
  /** Returns a product category builder. */
  def categoryBuilder(): ProductCategoryBuilder
  
  /** Returns a product channel builder. */
  def channelBuilder(): ProductChannelBuilder
  
  /** Returns a product channel exclusivity builder. */
  def channelExclusivityBuilder(): ProductChannelExclusivityBuilder
  
  /** Returns a product condition builder. */
  def conditionBuilder(): ProductConditionBuilder
  
  /** Returns a product custom label builder. */
  def customLabelBuilder(): ProductCustomLabelBuilder
  
  /** Returns a product item ID builder. */
  def itemIdBuilder(): ProductItemIdBuilder
  
  /** Returns a product type builder. */
  def productTypeBuilder(): ProductTypeBuilder
}
object ProductGroupBuilderSpace {
  
  inline def apply(
    brandBuilder: CallbackTo[ProductBrandBuilder],
    categoryBuilder: CallbackTo[ProductCategoryBuilder],
    channelBuilder: CallbackTo[ProductChannelBuilder],
    channelExclusivityBuilder: CallbackTo[ProductChannelExclusivityBuilder],
    conditionBuilder: CallbackTo[ProductConditionBuilder],
    customLabelBuilder: CallbackTo[ProductCustomLabelBuilder],
    itemIdBuilder: CallbackTo[ProductItemIdBuilder],
    productTypeBuilder: CallbackTo[ProductTypeBuilder]
  ): ProductGroupBuilderSpace = {
    val __obj = js.Dynamic.literal(brandBuilder = brandBuilder.toJsFn, categoryBuilder = categoryBuilder.toJsFn, channelBuilder = channelBuilder.toJsFn, channelExclusivityBuilder = channelExclusivityBuilder.toJsFn, conditionBuilder = conditionBuilder.toJsFn, customLabelBuilder = customLabelBuilder.toJsFn, itemIdBuilder = itemIdBuilder.toJsFn, productTypeBuilder = productTypeBuilder.toJsFn)
    __obj.asInstanceOf[ProductGroupBuilderSpace]
  }
  
  extension [Self <: ProductGroupBuilderSpace](x: Self) {
    
    inline def setBrandBuilder(value: CallbackTo[ProductBrandBuilder]): Self = StObject.set(x, "brandBuilder", value.toJsFn)
    
    inline def setCategoryBuilder(value: CallbackTo[ProductCategoryBuilder]): Self = StObject.set(x, "categoryBuilder", value.toJsFn)
    
    inline def setChannelBuilder(value: CallbackTo[ProductChannelBuilder]): Self = StObject.set(x, "channelBuilder", value.toJsFn)
    
    inline def setChannelExclusivityBuilder(value: CallbackTo[ProductChannelExclusivityBuilder]): Self = StObject.set(x, "channelExclusivityBuilder", value.toJsFn)
    
    inline def setConditionBuilder(value: CallbackTo[ProductConditionBuilder]): Self = StObject.set(x, "conditionBuilder", value.toJsFn)
    
    inline def setCustomLabelBuilder(value: CallbackTo[ProductCustomLabelBuilder]): Self = StObject.set(x, "customLabelBuilder", value.toJsFn)
    
    inline def setItemIdBuilder(value: CallbackTo[ProductItemIdBuilder]): Self = StObject.set(x, "itemIdBuilder", value.toJsFn)
    
    inline def setProductTypeBuilder(value: CallbackTo[ProductTypeBuilder]): Self = StObject.set(x, "productTypeBuilder", value.toJsFn)
  }
}
