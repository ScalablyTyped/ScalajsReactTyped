package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builder for ProductType objects. */
trait ProductTypeBuilder
  extends StObject
     with Builder[ProductTypeOperation] {
  
  /** Specifies the bid of the product type. */
  def withBid(bid: Double): this.type
  
  /** Specifies the value of the product type. */
  def withValue(value: String): this.type
}
object ProductTypeBuilder {
  
  inline def apply(
    build: CallbackTo[ProductTypeOperation],
    withBid: Double => ProductTypeBuilder,
    withValue: String => ProductTypeBuilder
  ): ProductTypeBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, withBid = js.Any.fromFunction1(withBid), withValue = js.Any.fromFunction1(withValue))
    __obj.asInstanceOf[ProductTypeBuilder]
  }
  
  extension [Self <: ProductTypeBuilder](x: Self) {
    
    inline def setWithBid(value: Double => ProductTypeBuilder): Self = StObject.set(x, "withBid", js.Any.fromFunction1(value))
    
    inline def setWithValue(value: String => ProductTypeBuilder): Self = StObject.set(x, "withValue", js.Any.fromFunction1(value))
  }
}
