package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import typingsJapgolly.foundationSites.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/accordion.html#javascript-reference
trait Accordion extends StObject {
  
  def down(target: JQuery, firstTime: Boolean): Unit
  
  def toggle(target: JQuery): Unit
  
  def up(target: JQuery): Unit
}
object Accordion {
  
  inline def apply(down: (JQuery, Boolean) => Callback, toggle: JQuery => Callback, up: JQuery => Callback): Accordion = {
    val __obj = js.Dynamic.literal(down = js.Any.fromFunction2((t0: JQuery, t1: Boolean) => (down(t0, t1)).runNow()), toggle = js.Any.fromFunction1((t0: JQuery) => toggle(t0).runNow()), up = js.Any.fromFunction1((t0: JQuery) => up(t0).runNow()))
    __obj.asInstanceOf[Accordion]
  }
  
  extension [Self <: Accordion](x: Self) {
    
    inline def setDown(value: (JQuery, Boolean) => Callback): Self = StObject.set(x, "down", js.Any.fromFunction2((t0: JQuery, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setToggle(value: JQuery => Callback): Self = StObject.set(x, "toggle", js.Any.fromFunction1((t0: JQuery) => value(t0).runNow()))
    
    inline def setUp(value: JQuery => Callback): Self = StObject.set(x, "up", js.Any.fromFunction1((t0: JQuery) => value(t0).runNow()))
  }
}
