package typingsJapgolly.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BounceEffect extends StObject {
  
  var distance: js.UndefOr[Double] = js.undefined
  
  var times: js.UndefOr[Double] = js.undefined
}
object BounceEffect {
  
  inline def apply(): BounceEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BounceEffect]
  }
  
  extension [Self <: BounceEffect](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setTimes(value: Double): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    
    inline def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
  }
}
