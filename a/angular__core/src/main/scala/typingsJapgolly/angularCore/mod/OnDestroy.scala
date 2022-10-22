package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDestroy extends StObject {
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  def ngOnDestroy(): Unit
}
object OnDestroy {
  
  inline def apply(ngOnDestroy: Callback): OnDestroy = {
    val __obj = js.Dynamic.literal(ngOnDestroy = ngOnDestroy.toJsFn)
    __obj.asInstanceOf[OnDestroy]
  }
  
  extension [Self <: OnDestroy](x: Self) {
    
    inline def setNgOnDestroy(value: Callback): Self = StObject.set(x, "ngOnDestroy", value.toJsFn)
  }
}
