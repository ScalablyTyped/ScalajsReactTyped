package typingsJapgolly.baidumapWebSdk.BMap

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.baidumapWebSdk.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroundOverlay
  extends StObject
     with Overlay {
  
  def getBounds(): Bounds
  
  def getDispalyOnMaxLevel(): Double
  
  def getDisplayOnMinLevel(): Double
  
  def getImageURL(): String
  
  def getOpacity(): Double
  
  def onclick(event: Target): Unit
  
  def ondblclick(event: Target): Unit
  
  def setBounds(bounds: Bounds): Unit
  
  def setDispalyOnMaxLevel(level: Double): Unit
  
  def setDisplayOnMinLevel(level: Double): Unit
  
  def setImageURL(url: String): Unit
  
  def setOpacity(opcity: Double): Unit
}
object GroundOverlay {
  
  inline def apply(
    getBounds: CallbackTo[Bounds],
    getDispalyOnMaxLevel: CallbackTo[Double],
    getDisplayOnMinLevel: CallbackTo[Double],
    getImageURL: CallbackTo[String],
    getOpacity: CallbackTo[Double],
    onclick: Target => japgolly.scalajs.react.Callback,
    ondblclick: Target => japgolly.scalajs.react.Callback,
    setBounds: Bounds => japgolly.scalajs.react.Callback,
    setDispalyOnMaxLevel: Double => japgolly.scalajs.react.Callback,
    setDisplayOnMinLevel: Double => japgolly.scalajs.react.Callback,
    setImageURL: String => japgolly.scalajs.react.Callback,
    setOpacity: Double => japgolly.scalajs.react.Callback
  ): GroundOverlay = {
    val __obj = js.Dynamic.literal(getBounds = getBounds.toJsFn, getDispalyOnMaxLevel = getDispalyOnMaxLevel.toJsFn, getDisplayOnMinLevel = getDisplayOnMinLevel.toJsFn, getImageURL = getImageURL.toJsFn, getOpacity = getOpacity.toJsFn, onclick = js.Any.fromFunction1((t0: Target) => onclick(t0).runNow()), ondblclick = js.Any.fromFunction1((t0: Target) => ondblclick(t0).runNow()), setBounds = js.Any.fromFunction1((t0: Bounds) => setBounds(t0).runNow()), setDispalyOnMaxLevel = js.Any.fromFunction1((t0: Double) => setDispalyOnMaxLevel(t0).runNow()), setDisplayOnMinLevel = js.Any.fromFunction1((t0: Double) => setDisplayOnMinLevel(t0).runNow()), setImageURL = js.Any.fromFunction1((t0: String) => setImageURL(t0).runNow()), setOpacity = js.Any.fromFunction1((t0: Double) => setOpacity(t0).runNow()))
    __obj.asInstanceOf[GroundOverlay]
  }
  
  extension [Self <: GroundOverlay](x: Self) {
    
    inline def setGetBounds(value: CallbackTo[Bounds]): Self = StObject.set(x, "getBounds", value.toJsFn)
    
    inline def setGetDispalyOnMaxLevel(value: CallbackTo[Double]): Self = StObject.set(x, "getDispalyOnMaxLevel", value.toJsFn)
    
    inline def setGetDisplayOnMinLevel(value: CallbackTo[Double]): Self = StObject.set(x, "getDisplayOnMinLevel", value.toJsFn)
    
    inline def setGetImageURL(value: CallbackTo[String]): Self = StObject.set(x, "getImageURL", value.toJsFn)
    
    inline def setGetOpacity(value: CallbackTo[Double]): Self = StObject.set(x, "getOpacity", value.toJsFn)
    
    inline def setOnclick(value: Target => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onclick", js.Any.fromFunction1((t0: Target) => value(t0).runNow()))
    
    inline def setOndblclick(value: Target => japgolly.scalajs.react.Callback): Self = StObject.set(x, "ondblclick", js.Any.fromFunction1((t0: Target) => value(t0).runNow()))
    
    inline def setSetBounds(value: Bounds => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setBounds", js.Any.fromFunction1((t0: Bounds) => value(t0).runNow()))
    
    inline def setSetDispalyOnMaxLevel(value: Double => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setDispalyOnMaxLevel", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetDisplayOnMinLevel(value: Double => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setDisplayOnMinLevel", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetImageURL(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setImageURL", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetOpacity(value: Double => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setOpacity", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
