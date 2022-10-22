package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterContentChecked extends StObject {
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has completed checking all of the directive's
    * content.
    */
  def ngAfterContentChecked(): Unit
}
object AfterContentChecked {
  
  inline def apply(ngAfterContentChecked: Callback): AfterContentChecked = {
    val __obj = js.Dynamic.literal(ngAfterContentChecked = ngAfterContentChecked.toJsFn)
    __obj.asInstanceOf[AfterContentChecked]
  }
  
  extension [Self <: AfterContentChecked](x: Self) {
    
    inline def setNgAfterContentChecked(value: Callback): Self = StObject.set(x, "ngAfterContentChecked", value.toJsFn)
  }
}
