package typingsJapgolly.angular.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnchorScrollProvider
  extends StObject
     with IServiceProvider {
  
  def disableAutoScrolling(): Unit
}
object IAnchorScrollProvider {
  
  inline def apply($get: Any, disableAutoScrolling: Callback): IAnchorScrollProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], disableAutoScrolling = disableAutoScrolling.toJsFn)
    __obj.asInstanceOf[IAnchorScrollProvider]
  }
  
  extension [Self <: IAnchorScrollProvider](x: Self) {
    
    inline def setDisableAutoScrolling(value: Callback): Self = StObject.set(x, "disableAutoScrolling", value.toJsFn)
  }
}
