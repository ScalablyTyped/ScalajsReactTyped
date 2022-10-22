package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GEAbstractBalloon extends StObject {
  
  /**
    * When true, the balloon frame is displayed with a button that the user
    * can click to close the balloon. When false, the balloon frame is just 
    * a plain frame.  
    *
    * Default is true.
    */
  def getCloseButtonEnabled(): Boolean
  
  /**
    * Determines what the balloon is attached to.
    */
  def getFeature(): KmlFeature
  
  /**
    * The ID of the balloon.
    */
  def getId(): String
  
  /**
    * Maximum height of the balloon.
    */
  def getMaxHeight(): Double
  
  /**
    * Maximum width of the balloon.
    */
  def getMaxWidth(): Double
  
  /**
    * Minimum height of the balloon.
    */
  def getMinHeight(): Double
  
  /**
    * Minimum width of the balloon.
    */
  def getMinWidth(): Double
  
  /**
    * When true, the balloon frame is displayed with a button that the user
    * can click to close the balloon. When false, the balloon frame is just 
    * a plain frame.  
    *
    * Default is true.
    */
  def setCloseButtonEnabled(closeButtonEnabled: Boolean): Unit
  
  /**
    * Determines what the balloon is attached to.
    */
  def setFeature(feature: KmlFeature): Unit
  
  /**
    * The ID of the balloon.
    */
  def setId(id: String): Unit
  
  /**
    * Maximum height of the balloon.
    */
  def setMaxHeight(maxHeight: Double): Unit
  
  /**
    * Maximum width of the balloon.
    */
  def setMaxWidth(maxWidth: Double): Unit
  
  /**
    * Minimum height of the balloon.
    */
  def setMinHeight(minHeight: Double): Unit
  
  /**
    * Minimum width of the balloon.
    */
  def setMinWidth(minWidth: Double): Unit
}
object GEAbstractBalloon {
  
  inline def apply(
    getCloseButtonEnabled: CallbackTo[Boolean],
    getFeature: CallbackTo[KmlFeature],
    getId: CallbackTo[String],
    getMaxHeight: CallbackTo[Double],
    getMaxWidth: CallbackTo[Double],
    getMinHeight: CallbackTo[Double],
    getMinWidth: CallbackTo[Double],
    setCloseButtonEnabled: Boolean => Callback,
    setFeature: KmlFeature => Callback,
    setId: String => Callback,
    setMaxHeight: Double => Callback,
    setMaxWidth: Double => Callback,
    setMinHeight: Double => Callback,
    setMinWidth: Double => Callback
  ): GEAbstractBalloon = {
    val __obj = js.Dynamic.literal(getCloseButtonEnabled = getCloseButtonEnabled.toJsFn, getFeature = getFeature.toJsFn, getId = getId.toJsFn, getMaxHeight = getMaxHeight.toJsFn, getMaxWidth = getMaxWidth.toJsFn, getMinHeight = getMinHeight.toJsFn, getMinWidth = getMinWidth.toJsFn, setCloseButtonEnabled = js.Any.fromFunction1((t0: Boolean) => setCloseButtonEnabled(t0).runNow()), setFeature = js.Any.fromFunction1((t0: KmlFeature) => setFeature(t0).runNow()), setId = js.Any.fromFunction1((t0: String) => setId(t0).runNow()), setMaxHeight = js.Any.fromFunction1((t0: Double) => setMaxHeight(t0).runNow()), setMaxWidth = js.Any.fromFunction1((t0: Double) => setMaxWidth(t0).runNow()), setMinHeight = js.Any.fromFunction1((t0: Double) => setMinHeight(t0).runNow()), setMinWidth = js.Any.fromFunction1((t0: Double) => setMinWidth(t0).runNow()))
    __obj.asInstanceOf[GEAbstractBalloon]
  }
  
  extension [Self <: GEAbstractBalloon](x: Self) {
    
    inline def setGetCloseButtonEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "getCloseButtonEnabled", value.toJsFn)
    
    inline def setGetFeature(value: CallbackTo[KmlFeature]): Self = StObject.set(x, "getFeature", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetMaxHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxHeight", value.toJsFn)
    
    inline def setGetMaxWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxWidth", value.toJsFn)
    
    inline def setGetMinHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getMinHeight", value.toJsFn)
    
    inline def setGetMinWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getMinWidth", value.toJsFn)
    
    inline def setSetCloseButtonEnabled(value: Boolean => Callback): Self = StObject.set(x, "setCloseButtonEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetFeature(value: KmlFeature => Callback): Self = StObject.set(x, "setFeature", js.Any.fromFunction1((t0: KmlFeature) => value(t0).runNow()))
    
    inline def setSetId(value: String => Callback): Self = StObject.set(x, "setId", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetMaxHeight(value: Double => Callback): Self = StObject.set(x, "setMaxHeight", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMaxWidth(value: Double => Callback): Self = StObject.set(x, "setMaxWidth", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMinHeight(value: Double => Callback): Self = StObject.set(x, "setMinHeight", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMinWidth(value: Double => Callback): Self = StObject.set(x, "setMinWidth", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
