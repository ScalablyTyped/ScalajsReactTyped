package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlMouseEvent
  extends StObject
     with KmlEvent {
  
  /**
    * Indicates whether the ALT key was held down when an event occurred.
    */
  def getAltKey(): Boolean
  
  /**
    * The altitude at which the event occurred, in meters.
    */
  def getAltitude(): Double
  
  /**
    * The button on the mouse was pressed.
    * Possible values include 0, 1, 2, where 0 is left, 1 is middle, and 2 is right mouse key.
    */
  def getButton(): Double
  
  /**
    * The x coordinate at which the event occurred, measured in pixels from the left edge of the plug-in window.
    */
  def getClientX(): Double
  
  /**
    * The y coordinate at which the event occurred, measured in pixels from the top edge of the plug-in window.
    */
  def getClientY(): Double
  
  /**
    * Indicates whether the CTRL key was held down when an event occurred.
    */
  def getCtrlKey(): Boolean
  
  /**
    * Indicates whether a mouse action occurred while on the Google Earth globe.
    */
  def getDidHitGlobe(): Boolean
  
  /**
    * The latitude at which the event occurred, in decimal degrees.
    */
  def getLatitude(): Double
  
  /**
    * The longitude at which the event occurred, in decimal degrees.
    */
  def getLongitude(): Double
  
  /**
    * Used with the mouseover and mouseout events to specify a secondary target.
    * For mouseover, it specifies the object that the mouse was over.
    * For mouseout, it specifies the new object that the mouse is over.
    */
  def getRelatedTarget(): GEEventEmitter
  
  /**
    * The x coordinate at which the event occurred, measured in pixels from the left edge of the computer screen.
    */
  def getScreenX(): Double
  
  /**
    * The y coordinate at which the event occurred, measured in pixels from the top edge of the computer screen.
    */
  def getScreenY(): Double
  
  /**
    * Indicates whether the SHIFT key was held down when an event occurred.
    */
  def getShiftKey(): Boolean
  
  /**
    * Returns the timestamp of the event, in Unix time.
    */
  def getTimeStamp(): Double
}
object KmlMouseEvent {
  
  inline def apply(
    getAltKey: CallbackTo[Boolean],
    getAltitude: CallbackTo[Double],
    getBubbles: CallbackTo[Boolean],
    getButton: CallbackTo[Double],
    getCancelable: CallbackTo[Boolean],
    getClientX: CallbackTo[Double],
    getClientY: CallbackTo[Double],
    getCtrlKey: CallbackTo[Boolean],
    getCurrentTarget: GEEventEmitter,
    getDidHitGlobe: CallbackTo[Boolean],
    getEventPhase: CallbackTo[GEEventPhaseEnum],
    getLatitude: CallbackTo[Double],
    getLongitude: CallbackTo[Double],
    getRelatedTarget: CallbackTo[GEEventEmitter],
    getScreenX: CallbackTo[Double],
    getScreenY: CallbackTo[Double],
    getShiftKey: CallbackTo[Boolean],
    getTarget: CallbackTo[GEEventEmitter],
    getTimeStamp: CallbackTo[Double],
    preventDefault: Callback,
    stopPropagation: Callback
  ): KmlMouseEvent = {
    val __obj = js.Dynamic.literal(getAltKey = getAltKey.toJsFn, getAltitude = getAltitude.toJsFn, getBubbles = getBubbles.toJsFn, getButton = getButton.toJsFn, getCancelable = getCancelable.toJsFn, getClientX = getClientX.toJsFn, getClientY = getClientY.toJsFn, getCtrlKey = getCtrlKey.toJsFn, getCurrentTarget = getCurrentTarget.asInstanceOf[js.Any], getDidHitGlobe = getDidHitGlobe.toJsFn, getEventPhase = getEventPhase.toJsFn, getLatitude = getLatitude.toJsFn, getLongitude = getLongitude.toJsFn, getRelatedTarget = getRelatedTarget.toJsFn, getScreenX = getScreenX.toJsFn, getScreenY = getScreenY.toJsFn, getShiftKey = getShiftKey.toJsFn, getTarget = getTarget.toJsFn, getTimeStamp = getTimeStamp.toJsFn, preventDefault = preventDefault.toJsFn, stopPropagation = stopPropagation.toJsFn)
    __obj.asInstanceOf[KmlMouseEvent]
  }
  
  extension [Self <: KmlMouseEvent](x: Self) {
    
    inline def setGetAltKey(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAltKey", value.toJsFn)
    
    inline def setGetAltitude(value: CallbackTo[Double]): Self = StObject.set(x, "getAltitude", value.toJsFn)
    
    inline def setGetButton(value: CallbackTo[Double]): Self = StObject.set(x, "getButton", value.toJsFn)
    
    inline def setGetClientX(value: CallbackTo[Double]): Self = StObject.set(x, "getClientX", value.toJsFn)
    
    inline def setGetClientY(value: CallbackTo[Double]): Self = StObject.set(x, "getClientY", value.toJsFn)
    
    inline def setGetCtrlKey(value: CallbackTo[Boolean]): Self = StObject.set(x, "getCtrlKey", value.toJsFn)
    
    inline def setGetDidHitGlobe(value: CallbackTo[Boolean]): Self = StObject.set(x, "getDidHitGlobe", value.toJsFn)
    
    inline def setGetLatitude(value: CallbackTo[Double]): Self = StObject.set(x, "getLatitude", value.toJsFn)
    
    inline def setGetLongitude(value: CallbackTo[Double]): Self = StObject.set(x, "getLongitude", value.toJsFn)
    
    inline def setGetRelatedTarget(value: CallbackTo[GEEventEmitter]): Self = StObject.set(x, "getRelatedTarget", value.toJsFn)
    
    inline def setGetScreenX(value: CallbackTo[Double]): Self = StObject.set(x, "getScreenX", value.toJsFn)
    
    inline def setGetScreenY(value: CallbackTo[Double]): Self = StObject.set(x, "getScreenY", value.toJsFn)
    
    inline def setGetShiftKey(value: CallbackTo[Boolean]): Self = StObject.set(x, "getShiftKey", value.toJsFn)
    
    inline def setGetTimeStamp(value: CallbackTo[Double]): Self = StObject.set(x, "getTimeStamp", value.toJsFn)
  }
}
