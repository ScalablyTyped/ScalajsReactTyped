package typingsJapgolly.reactTouch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwipeConfig extends StObject {
  
  /** @default 100 */
  var swipeDistance: js.UndefOr[Double] = js.undefined
}
object SwipeConfig {
  
  inline def apply(): SwipeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeConfig]
  }
  
  extension [Self <: SwipeConfig](x: Self) {
    
    inline def setSwipeDistance(value: Double): Self = StObject.set(x, "swipeDistance", value.asInstanceOf[js.Any])
    
    inline def setSwipeDistanceUndefined: Self = StObject.set(x, "swipeDistance", js.undefined)
  }
}
