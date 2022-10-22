package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to a shopping audience's bidding fields. */
trait ShoppingAudienceBidding extends StObject {
  
  /** Clears the bid modifier value. */
  def clearBidModifier(): Unit
  
  /** Returns the current bid modifier value. */
  def getBidModifier(): Double
  
  /** Sets the bid modifier value for this audience to the specified value. */
  def setBidModifier(modifier: String): Unit
}
object ShoppingAudienceBidding {
  
  inline def apply(clearBidModifier: Callback, getBidModifier: CallbackTo[Double], setBidModifier: String => Callback): ShoppingAudienceBidding = {
    val __obj = js.Dynamic.literal(clearBidModifier = clearBidModifier.toJsFn, getBidModifier = getBidModifier.toJsFn, setBidModifier = js.Any.fromFunction1((t0: String) => setBidModifier(t0).runNow()))
    __obj.asInstanceOf[ShoppingAudienceBidding]
  }
  
  extension [Self <: ShoppingAudienceBidding](x: Self) {
    
    inline def setClearBidModifier(value: Callback): Self = StObject.set(x, "clearBidModifier", value.toJsFn)
    
    inline def setGetBidModifier(value: CallbackTo[Double]): Self = StObject.set(x, "getBidModifier", value.toJsFn)
    
    inline def setSetBidModifier(value: String => Callback): Self = StObject.set(x, "setBidModifier", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
