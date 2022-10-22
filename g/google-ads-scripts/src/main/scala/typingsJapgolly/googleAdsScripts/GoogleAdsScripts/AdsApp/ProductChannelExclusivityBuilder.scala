package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Builder for ProductChannelExclusivity objects. */
trait ProductChannelExclusivityBuilder
  extends StObject
     with Builder[ProductChannelExclusivityOperation] {
  
  /** Specifies the bid of the product channel exclusivity. */
  def withBid(bid: Double): this.type
  
  /** Specifies the channel exclusivity of the new product channel exclusivity. */
  def withChannelExclusivity(channelExclusivity: String): this.type
  
  /** Specifies the value of the product channel exclusivity. */
  def withValue(value: String): this.type
}
object ProductChannelExclusivityBuilder {
  
  inline def apply(
    build: CallbackTo[ProductChannelExclusivityOperation],
    withBid: Double => ProductChannelExclusivityBuilder,
    withChannelExclusivity: String => ProductChannelExclusivityBuilder,
    withValue: String => ProductChannelExclusivityBuilder
  ): ProductChannelExclusivityBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, withBid = js.Any.fromFunction1(withBid), withChannelExclusivity = js.Any.fromFunction1(withChannelExclusivity), withValue = js.Any.fromFunction1(withValue))
    __obj.asInstanceOf[ProductChannelExclusivityBuilder]
  }
  
  extension [Self <: ProductChannelExclusivityBuilder](x: Self) {
    
    inline def setWithBid(value: Double => ProductChannelExclusivityBuilder): Self = StObject.set(x, "withBid", js.Any.fromFunction1(value))
    
    inline def setWithChannelExclusivity(value: String => ProductChannelExclusivityBuilder): Self = StObject.set(x, "withChannelExclusivity", js.Any.fromFunction1(value))
    
    inline def setWithValue(value: String => ProductChannelExclusivityBuilder): Self = StObject.set(x, "withValue", js.Any.fromFunction1(value))
  }
}
