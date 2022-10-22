package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlEvent extends StObject {
  
  /**
    * Indicates whether or not an event is a bubbling event.
    */
  def getBubbles(): Boolean
  
  /**
    * Indicates whether the event can be cancelled.
    *
    * Note: Currently, cancelable has no effect.
    */
  def getCancelable(): Boolean
  
  /**
    * The target whose event listeners are currently being processed.
    */
  var getCurrentTarget: GEEventEmitter
  
  /**
    * The current stage of the flow of events.
    */
  def getEventPhase(): GEEventPhaseEnum
  
  /**
    * The object to which the KMLEvent was originally dispatched.
    */
  def getTarget(): GEEventEmitter
  
  /**
    * Cancels the default action of the event.
    * For example, calling this method in a placemark click handler prevents the placemark's default balloon from popping up.
    */
  def preventDefault(): Unit
  
  /**
    * Prevents event propagation.
    * For example, if click event handlers are set up on both the GEGlobe and GEWindow objects,
    * and stopPropagation is called in the GEGlobe click event handler, the GEWindow event handler will not be triggered when the globe is clicked.
    */
  def stopPropagation(): Unit
}
object KmlEvent {
  
  inline def apply(
    getBubbles: CallbackTo[Boolean],
    getCancelable: CallbackTo[Boolean],
    getCurrentTarget: GEEventEmitter,
    getEventPhase: CallbackTo[GEEventPhaseEnum],
    getTarget: CallbackTo[GEEventEmitter],
    preventDefault: Callback,
    stopPropagation: Callback
  ): KmlEvent = {
    val __obj = js.Dynamic.literal(getBubbles = getBubbles.toJsFn, getCancelable = getCancelable.toJsFn, getCurrentTarget = getCurrentTarget.asInstanceOf[js.Any], getEventPhase = getEventPhase.toJsFn, getTarget = getTarget.toJsFn, preventDefault = preventDefault.toJsFn, stopPropagation = stopPropagation.toJsFn)
    __obj.asInstanceOf[KmlEvent]
  }
  
  extension [Self <: KmlEvent](x: Self) {
    
    inline def setGetBubbles(value: CallbackTo[Boolean]): Self = StObject.set(x, "getBubbles", value.toJsFn)
    
    inline def setGetCancelable(value: CallbackTo[Boolean]): Self = StObject.set(x, "getCancelable", value.toJsFn)
    
    inline def setGetCurrentTarget(value: GEEventEmitter): Self = StObject.set(x, "getCurrentTarget", value.asInstanceOf[js.Any])
    
    inline def setGetEventPhase(value: CallbackTo[GEEventPhaseEnum]): Self = StObject.set(x, "getEventPhase", value.toJsFn)
    
    inline def setGetTarget(value: CallbackTo[GEEventEmitter]): Self = StObject.set(x, "getTarget", value.toJsFn)
    
    inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
    
    inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
  }
}
