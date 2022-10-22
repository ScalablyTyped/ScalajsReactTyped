package typingsJapgolly.baidumapWebSdk.BMap

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.baidumapWebSdk.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanoramaLabel extends StObject {
  
  def addEventListener(event: String, handler: Callback): Unit
  
  def getAltitude(): Double
  
  def getContent(): String
  
  def getPosition(): Point
  
  def getPov(): PanoramaPov
  
  def hide(): Unit
  
  def onclick(event: Target): Unit
  
  def onmouseout(event: Target): Unit
  
  def onmouseover(event: Target): Unit
  
  def onremove(event: Target): Unit
  
  def removeEventListener(event: String, handler: Callback): Unit
  
  def setAltitude(altitude: Double): Unit
  
  def setContent(content: String): Unit
  
  def setPosition(position: Point): Unit
  
  def show(): Unit
}
object PanoramaLabel {
  
  inline def apply(
    addEventListener: (String, Callback) => japgolly.scalajs.react.Callback,
    getAltitude: CallbackTo[Double],
    getContent: CallbackTo[String],
    getPosition: CallbackTo[Point],
    getPov: CallbackTo[PanoramaPov],
    hide: japgolly.scalajs.react.Callback,
    onclick: Target => japgolly.scalajs.react.Callback,
    onmouseout: Target => japgolly.scalajs.react.Callback,
    onmouseover: Target => japgolly.scalajs.react.Callback,
    onremove: Target => japgolly.scalajs.react.Callback,
    removeEventListener: (String, Callback) => japgolly.scalajs.react.Callback,
    setAltitude: Double => japgolly.scalajs.react.Callback,
    setContent: String => japgolly.scalajs.react.Callback,
    setPosition: Point => japgolly.scalajs.react.Callback,
    show: japgolly.scalajs.react.Callback
  ): PanoramaLabel = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2((t0: String, t1: Callback) => (addEventListener(t0, t1)).runNow()), getAltitude = getAltitude.toJsFn, getContent = getContent.toJsFn, getPosition = getPosition.toJsFn, getPov = getPov.toJsFn, hide = hide.toJsFn, onclick = js.Any.fromFunction1((t0: Target) => onclick(t0).runNow()), onmouseout = js.Any.fromFunction1((t0: Target) => onmouseout(t0).runNow()), onmouseover = js.Any.fromFunction1((t0: Target) => onmouseover(t0).runNow()), onremove = js.Any.fromFunction1((t0: Target) => onremove(t0).runNow()), removeEventListener = js.Any.fromFunction2((t0: String, t1: Callback) => (removeEventListener(t0, t1)).runNow()), setAltitude = js.Any.fromFunction1((t0: Double) => setAltitude(t0).runNow()), setContent = js.Any.fromFunction1((t0: String) => setContent(t0).runNow()), setPosition = js.Any.fromFunction1((t0: Point) => setPosition(t0).runNow()), show = show.toJsFn)
    __obj.asInstanceOf[PanoramaLabel]
  }
  
  extension [Self <: PanoramaLabel](x: Self) {
    
    inline def setAddEventListener(value: (String, Callback) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: String, t1: Callback) => (value(t0, t1)).runNow()))
    
    inline def setGetAltitude(value: CallbackTo[Double]): Self = StObject.set(x, "getAltitude", value.toJsFn)
    
    inline def setGetContent(value: CallbackTo[String]): Self = StObject.set(x, "getContent", value.toJsFn)
    
    inline def setGetPosition(value: CallbackTo[Point]): Self = StObject.set(x, "getPosition", value.toJsFn)
    
    inline def setGetPov(value: CallbackTo[PanoramaPov]): Self = StObject.set(x, "getPov", value.toJsFn)
    
    inline def setHide(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setOnclick(value: Target => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onclick", js.Any.fromFunction1((t0: Target) => value(t0).runNow()))
    
    inline def setOnmouseout(value: Target => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onmouseout", js.Any.fromFunction1((t0: Target) => value(t0).runNow()))
    
    inline def setOnmouseover(value: Target => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onmouseover", js.Any.fromFunction1((t0: Target) => value(t0).runNow()))
    
    inline def setOnremove(value: Target => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onremove", js.Any.fromFunction1((t0: Target) => value(t0).runNow()))
    
    inline def setRemoveEventListener(value: (String, Callback) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: String, t1: Callback) => (value(t0, t1)).runNow()))
    
    inline def setSetAltitude(value: Double => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setAltitude", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetContent(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setContent", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetPosition(value: Point => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setPosition", js.Any.fromFunction1((t0: Point) => value(t0).runNow()))
    
    inline def setShow(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "show", value.toJsFn)
  }
}
