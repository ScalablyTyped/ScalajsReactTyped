package typingsJapgolly.scroller

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EasyScroller extends StObject {
  
  def bindEvents(): Unit
  
  def reflow(): Unit
  
  def render(): Unit
}
object EasyScroller {
  
  inline def apply(bindEvents: Callback, reflow: Callback, render: Callback): EasyScroller = {
    val __obj = js.Dynamic.literal(bindEvents = bindEvents.toJsFn, reflow = reflow.toJsFn, render = render.toJsFn)
    __obj.asInstanceOf[EasyScroller]
  }
  
  extension [Self <: EasyScroller](x: Self) {
    
    inline def setBindEvents(value: Callback): Self = StObject.set(x, "bindEvents", value.toJsFn)
    
    inline def setReflow(value: Callback): Self = StObject.set(x, "reflow", value.toJsFn)
    
    inline def setRender(value: Callback): Self = StObject.set(x, "render", value.toJsFn)
  }
}
