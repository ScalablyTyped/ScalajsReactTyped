package typingsJapgolly.phonegap

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Splashscreen extends StObject {
  
  def hide(): Unit
  
  def show(): Unit
}
object Splashscreen {
  
  inline def apply(hide: Callback, show: Callback): Splashscreen = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, show = show.toJsFn)
    __obj.asInstanceOf[Splashscreen]
  }
  
  extension [Self <: Splashscreen](x: Self) {
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
  }
}
