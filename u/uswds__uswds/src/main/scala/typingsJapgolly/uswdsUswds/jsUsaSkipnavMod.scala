package typingsJapgolly.uswdsUswds

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsUsaSkipnavMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-skipnav", JSImport.Default)
  @js.native
  val default: Skipnav = js.native
  
  trait Skipnav extends StObject {
    
    def off(el: HTMLElement): Unit
    
    def on(el: HTMLElement): Unit
  }
  object Skipnav {
    
    inline def apply(off: HTMLElement => Callback, on: HTMLElement => Callback): Skipnav = {
      val __obj = js.Dynamic.literal(off = js.Any.fromFunction1((t0: HTMLElement) => off(t0).runNow()), on = js.Any.fromFunction1((t0: HTMLElement) => on(t0).runNow()))
      __obj.asInstanceOf[Skipnav]
    }
    
    extension [Self <: Skipnav](x: Self) {
      
      inline def setOff(value: HTMLElement => Callback): Self = StObject.set(x, "off", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
      
      inline def setOn(value: HTMLElement => Callback): Self = StObject.set(x, "on", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
    }
  }
  
  type _To = Skipnav
  
  /* This means you don't have to write `default`, but can instead just say `jsUsaSkipnavMod.foo` */
  override def _to: Skipnav = default
}
