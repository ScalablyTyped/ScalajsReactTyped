package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoCheck extends StObject {
  
  /**
    * A callback method that performs change-detection, invoked
    * after the default change-detector runs.
    * See `KeyValueDiffers` and `IterableDiffers` for implementing
    * custom change checking for collections.
    *
    */
  def ngDoCheck(): Unit
}
object DoCheck {
  
  inline def apply(ngDoCheck: Callback): DoCheck = {
    val __obj = js.Dynamic.literal(ngDoCheck = ngDoCheck.toJsFn)
    __obj.asInstanceOf[DoCheck]
  }
  
  extension [Self <: DoCheck](x: Self) {
    
    inline def setNgDoCheck(value: Callback): Self = StObject.set(x, "ngDoCheck", value.toJsFn)
  }
}
