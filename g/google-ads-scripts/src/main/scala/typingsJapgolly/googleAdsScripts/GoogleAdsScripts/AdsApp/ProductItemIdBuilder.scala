package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builder for ProductItemId objects. */
trait ProductItemIdBuilder
  extends StObject
     with Builder[ProductItemIdOperation] {
  
  /** Specifies the bid of the product item id. */
  def withBid(bid: Double): this.type
  
  /** Specifies the value of the product item id. */
  def withValue(value: String): this.type
}
object ProductItemIdBuilder {
  
  inline def apply(
    build: CallbackTo[ProductItemIdOperation],
    withBid: Double => ProductItemIdBuilder,
    withValue: String => ProductItemIdBuilder
  ): ProductItemIdBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, withBid = js.Any.fromFunction1(withBid), withValue = js.Any.fromFunction1(withValue))
    __obj.asInstanceOf[ProductItemIdBuilder]
  }
  
  extension [Self <: ProductItemIdBuilder](x: Self) {
    
    inline def setWithBid(value: Double => ProductItemIdBuilder): Self = StObject.set(x, "withBid", js.Any.fromFunction1(value))
    
    inline def setWithValue(value: String => ProductItemIdBuilder): Self = StObject.set(x, "withValue", js.Any.fromFunction1(value))
  }
}
