package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAudienceBidding
  extends StObject
     with canSetBidModifier {
  
  def clearBidModifier(): Unit
}
object SearchAudienceBidding {
  
  inline def apply(clearBidModifier: Callback, getBidModifier: CallbackTo[Double], setBidModifier: Double => Callback): SearchAudienceBidding = {
    val __obj = js.Dynamic.literal(clearBidModifier = clearBidModifier.toJsFn, getBidModifier = getBidModifier.toJsFn, setBidModifier = js.Any.fromFunction1((t0: Double) => setBidModifier(t0).runNow()))
    __obj.asInstanceOf[SearchAudienceBidding]
  }
  
  extension [Self <: SearchAudienceBidding](x: Self) {
    
    inline def setClearBidModifier(value: Callback): Self = StObject.set(x, "clearBidModifier", value.toJsFn)
  }
}
