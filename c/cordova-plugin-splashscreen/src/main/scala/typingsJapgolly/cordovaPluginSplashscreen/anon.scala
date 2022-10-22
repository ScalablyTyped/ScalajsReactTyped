package typingsJapgolly.cordovaPluginSplashscreen

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Hide extends StObject {
    
    /** Dismiss the splash screen. */
    def hide(): Unit
    
    /** Displays the splash screen. */
    def show(): Unit
  }
  object Hide {
    
    inline def apply(hide: Callback, show: Callback): Hide = {
      val __obj = js.Dynamic.literal(hide = hide.toJsFn, show = show.toJsFn)
      __obj.asInstanceOf[Hide]
    }
    
    extension [Self <: Hide](x: Self) {
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
}
