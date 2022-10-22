package typingsJapgolly.viewporter

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewporter extends StObject {
  
  var ACTIVE: Boolean
  
  var READY: Boolean
  
  def change(callback: EventListener): Unit
  
  var forceDetection: Boolean
  
  def isLandscape(): Boolean
  
  var preventPageScroll: Boolean
  
  def ready(callback: EventListener): Unit
  
  def refresh(): Unit
}
object Viewporter {
  
  inline def apply(
    ACTIVE: Boolean,
    READY: Boolean,
    change: EventListener => Callback,
    forceDetection: Boolean,
    isLandscape: CallbackTo[Boolean],
    preventPageScroll: Boolean,
    ready: EventListener => Callback,
    refresh: Callback
  ): Viewporter = {
    val __obj = js.Dynamic.literal(ACTIVE = ACTIVE.asInstanceOf[js.Any], READY = READY.asInstanceOf[js.Any], change = js.Any.fromFunction1((t0: EventListener) => change(t0).runNow()), forceDetection = forceDetection.asInstanceOf[js.Any], isLandscape = isLandscape.toJsFn, preventPageScroll = preventPageScroll.asInstanceOf[js.Any], ready = js.Any.fromFunction1((t0: EventListener) => ready(t0).runNow()), refresh = refresh.toJsFn)
    __obj.asInstanceOf[Viewporter]
  }
  
  extension [Self <: Viewporter](x: Self) {
    
    inline def setACTIVE(value: Boolean): Self = StObject.set(x, "ACTIVE", value.asInstanceOf[js.Any])
    
    inline def setChange(value: EventListener => Callback): Self = StObject.set(x, "change", js.Any.fromFunction1((t0: EventListener) => value(t0).runNow()))
    
    inline def setForceDetection(value: Boolean): Self = StObject.set(x, "forceDetection", value.asInstanceOf[js.Any])
    
    inline def setIsLandscape(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLandscape", value.toJsFn)
    
    inline def setPreventPageScroll(value: Boolean): Self = StObject.set(x, "preventPageScroll", value.asInstanceOf[js.Any])
    
    inline def setREADY(value: Boolean): Self = StObject.set(x, "READY", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
  }
}
