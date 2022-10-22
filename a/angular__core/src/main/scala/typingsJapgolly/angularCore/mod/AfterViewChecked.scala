package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterViewChecked extends StObject {
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has completed one change-check cycle
    * for a component's view.
    */
  def ngAfterViewChecked(): Unit
}
object AfterViewChecked {
  
  inline def apply(ngAfterViewChecked: Callback): AfterViewChecked = {
    val __obj = js.Dynamic.literal(ngAfterViewChecked = ngAfterViewChecked.toJsFn)
    __obj.asInstanceOf[AfterViewChecked]
  }
  
  extension [Self <: AfterViewChecked](x: Self) {
    
    inline def setNgAfterViewChecked(value: Callback): Self = StObject.set(x, "ngAfterViewChecked", value.toJsFn)
  }
}
