package typingsJapgolly.webix.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoTooltip extends StObject {
  
  @JSName("$tooltipIn")
  def $tooltipIn(node: HTMLElement): HTMLElement
  
  @JSName("$tooltipMove")
  def $tooltipMove(t: HTMLElement, e: Event, text: String): Unit
  
  @JSName("$tooltipOut")
  var $tooltipOut: Unit
}
object AutoTooltip {
  
  @JSImport("webix", "AutoTooltip")
  @js.native
  val ^ : AutoTooltip = js.native
  
  extension [Self <: AutoTooltip](x: Self) {
    
    inline def set$tooltipIn(value: HTMLElement => HTMLElement): Self = StObject.set(x, "$tooltipIn", js.Any.fromFunction1(value))
    
    inline def set$tooltipMove(value: (HTMLElement, Event, String) => Callback): Self = StObject.set(x, "$tooltipMove", js.Any.fromFunction3((t0: HTMLElement, t1: Event, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def set$tooltipOut(value: Unit): Self = StObject.set(x, "$tooltipOut", value.asInstanceOf[js.Any])
  }
}
