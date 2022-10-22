package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builder for ProductCustomLabel objects. */
trait ProductCustomLabelBuilder
  extends StObject
     with Builder[ProductCustomLabelOperation] {
  
  /** Specifies the bid of the product custom label. */
  def withBid(bid: Double): this.type
  
  /** Specifies the type of custom label and return the product custom label builder. */
  def withType(`type`: String): this.type
  
  /** Specifies the value of the product custom label. */
  def withValue(value: String): this.type
}
object ProductCustomLabelBuilder {
  
  inline def apply(
    build: CallbackTo[ProductCustomLabelOperation],
    withBid: Double => ProductCustomLabelBuilder,
    withType: String => ProductCustomLabelBuilder,
    withValue: String => ProductCustomLabelBuilder
  ): ProductCustomLabelBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, withBid = js.Any.fromFunction1(withBid), withType = js.Any.fromFunction1(withType), withValue = js.Any.fromFunction1(withValue))
    __obj.asInstanceOf[ProductCustomLabelBuilder]
  }
  
  extension [Self <: ProductCustomLabelBuilder](x: Self) {
    
    inline def setWithBid(value: Double => ProductCustomLabelBuilder): Self = StObject.set(x, "withBid", js.Any.fromFunction1(value))
    
    inline def setWithType(value: String => ProductCustomLabelBuilder): Self = StObject.set(x, "withType", js.Any.fromFunction1(value))
    
    inline def setWithValue(value: String => ProductCustomLabelBuilder): Self = StObject.set(x, "withValue", js.Any.fromFunction1(value))
  }
}
