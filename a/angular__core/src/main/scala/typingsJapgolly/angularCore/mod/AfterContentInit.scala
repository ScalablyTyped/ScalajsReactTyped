package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterContentInit extends StObject {
  
  /**
    * A callback method that is invoked immediately after
    * Angular has completed initialization of all of the directive's
    * content.
    * It is invoked only once when the directive is instantiated.
    */
  def ngAfterContentInit(): Unit
}
object AfterContentInit {
  
  inline def apply(ngAfterContentInit: Callback): AfterContentInit = {
    val __obj = js.Dynamic.literal(ngAfterContentInit = ngAfterContentInit.toJsFn)
    __obj.asInstanceOf[AfterContentInit]
  }
  
  extension [Self <: AfterContentInit](x: Self) {
    
    inline def setNgAfterContentInit(value: Callback): Self = StObject.set(x, "ngAfterContentInit", value.toJsFn)
  }
}
