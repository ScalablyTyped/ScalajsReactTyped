package typingsJapgolly.uswdsUswds

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsUsaBannerMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-banner", JSImport.Default)
  @js.native
  val default: Banner = js.native
  
  trait Banner extends StObject {
    
    def off(el: HTMLElement): Unit
    
    def on(el: HTMLElement): Unit
  }
  object Banner {
    
    inline def apply(off: HTMLElement => Callback, on: HTMLElement => Callback): Banner = {
      val __obj = js.Dynamic.literal(off = js.Any.fromFunction1((t0: HTMLElement) => off(t0).runNow()), on = js.Any.fromFunction1((t0: HTMLElement) => on(t0).runNow()))
      __obj.asInstanceOf[Banner]
    }
    
    extension [Self <: Banner](x: Self) {
      
      inline def setOff(value: HTMLElement => Callback): Self = StObject.set(x, "off", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
      
      inline def setOn(value: HTMLElement => Callback): Self = StObject.set(x, "on", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
    }
  }
  
  type _To = Banner
  
  /* This means you don't have to write `default`, but can instead just say `jsUsaBannerMod.foo` */
  override def _to: Banner = default
}
