package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterViewInit extends StObject {
  
  /**
    * A callback method that is invoked immediately after
    * Angular has completed initialization of a component's view.
    * It is invoked only once when the view is instantiated.
    *
    */
  def ngAfterViewInit(): Unit
}
object AfterViewInit {
  
  inline def apply(ngAfterViewInit: Callback): AfterViewInit = {
    val __obj = js.Dynamic.literal(ngAfterViewInit = ngAfterViewInit.toJsFn)
    __obj.asInstanceOf[AfterViewInit]
  }
  
  extension [Self <: AfterViewInit](x: Self) {
    
    inline def setNgAfterViewInit(value: Callback): Self = StObject.set(x, "ngAfterViewInit", value.toJsFn)
  }
}
