package typingsJapgolly.baidumapWebSdk.BMap

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.baidumapWebSdk.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Polyline
  extends StObject
     with Overlay {
  
  def addEventListener(event: String, handler: Callback): Unit
  
  def disableEditing(): Unit
  
  def disableMassClear(): Unit
  
  def enableEditing(): Unit
  
  def enableMassClear(): Unit
  
  def getBounds(): Bounds
  
  def getFillColor(): String
  
  def getFillOpacity(): Double
  
  def getMap(): Map
  
  def getPath(): js.Array[Point]
  
  def getStrokeColor(): String
  
  def getStrokeOpacity(): Double
  
  def getStrokeStyle(): String
  
  def getStrokeWeight(): Double
  
  def onclick(event: Target): Unit
  
  def ondblclick(event: typingsJapgolly.baidumapWebSdk.anon.Pixel): Unit
  
  def onlineupdate(event: Target): Unit
  
  def onmousedown(event: typingsJapgolly.baidumapWebSdk.anon.Pixel): Unit
  
  def onmouseout(event: typingsJapgolly.baidumapWebSdk.anon.Pixel): Unit
  
  def onmouseover(event: typingsJapgolly.baidumapWebSdk.anon.Pixel): Unit
  
  def onmouseup(event: typingsJapgolly.baidumapWebSdk.anon.Pixel): Unit
  
  def onremove(event: Target): Unit
  
  def removeEventListener(event: String, handler: Callback): Unit
  
  def setFillColor(color: String): Unit
  
  def setFillOpacity(opacity: Double): Unit
  
  def setPath(path: js.Array[Point]): Unit
  
  def setPointAt(index: Double, point: Point): Unit
  
  def setPositionAt(index: Double, point: Point): Unit
  
  def setStrokeColor(color: String): Unit
  
  def setStrokeOpacity(opacity: Double): Unit
  
  def setStrokeStyle(style: String): Unit
  
  def setStrokeWeight(weight: Double): Unit
}
object Polyline {
  
  inline def apply(
    addEventListener: (String, Callback) => japgolly.scalajs.react.Callback,
    disableEditing: japgolly.scalajs.react.Callback,
    disableMassClear: japgolly.scalajs.react.Callback,
    enableEditing: japgolly.scalajs.react.Callback,
    enableMassClear: japgolly.scalajs.react.Callback,
    getBounds: CallbackTo[Bounds],
    getFillColor: CallbackTo[String],
    getFillOpacity: CallbackTo[Double],
    getMap: CallbackTo[Map],
    getPath: CallbackTo[js.Array[Point]],
    getStrokeColor: CallbackTo[String],
    getStrokeOpacity: CallbackTo[Double],
    getStrokeStyle: CallbackTo[String],
    getStrokeWeight: CallbackTo[Double],
    onclick: Target => japgolly.scalajs.react.Callback,
    ondblclick: typingsJapgolly.baidumapWebSdk.anon.Pixel => japgolly.scalajs.react.Callback,
    onlineupdate: Target => japgolly.scalajs.react.Callback,
    onmousedown: typingsJapgolly.baidumapWebSdk.anon.Pixel => japgolly.scalajs.react.Callback,
    onmouseout: typingsJapgolly.baidumapWebSdk.anon.Pixel => japgolly.scalajs.react.Callback,
    onmouseover: typingsJapgolly.baidumapWebSdk.anon.Pixel => japgolly.scalajs.react.Callback,
    onmouseup: typingsJapgolly.baidumapWebSdk.anon.Pixel => japgolly.scalajs.react.Callback,
    onremove: Target => japgolly.scalajs.react.Callback,
    removeEventListener: (String, Callback) => japgolly.scalajs.react.Callback,
    setFillColor: String => japgolly.scalajs.react.Callback,
    setFillOpacity: Double => japgolly.scalajs.react.Callback,
    setPath: js.Array[Point] => japgolly.scalajs.react.Callback,
    setPointAt: (Double, Point) => japgolly.scalajs.react.Callback,
    setPositionAt: (Double, Point) => japgolly.scalajs.react.Callback,
    setStrokeColor: String => japgolly.scalajs.react.Callback,
    setStrokeOpacity: Double => japgolly.scalajs.react.Callback,
    setStrokeStyle: String => japgolly.scalajs.react.Callback,
    setStrokeWeight: Double => japgolly.scalajs.react.Callback
  ): Polyline = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2((t0: String, t1: Callback) => (addEventListener(t0, t1)).runNow()), disableEditing = disableEditing.toJsFn, disableMassClear = disableMassClear.toJsFn, enableEditing = enableEditing.toJsFn, enableMassClear = enableMassClear.toJsFn, getBounds = getBounds.toJsFn, getFillColor = getFillColor.toJsFn, getFillOpacity = getFillOpacity.toJsFn, getMap = getMap.toJsFn, getPath = getPath.toJsFn, getStrokeColor = getStrokeColor.toJsFn, getStrokeOpacity = getStrokeOpacity.toJsFn, getStrokeStyle = getStrokeStyle.toJsFn, getStrokeWeight = getStrokeWeight.toJsFn, onclick = js.Any.fromFunction1((t0: Target) => onclick(t0).runNow()), ondblclick = js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.anon.Pixel) => ondblclick(t0).runNow()), onlineupdate = js.Any.fromFunction1((t0: Target) => onlineupdate(t0).runNow()), onmousedown = js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.anon.Pixel) => onmousedown(t0).runNow()), onmouseout = js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.anon.Pixel) => onmouseout(t0).runNow()), onmouseover = js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.anon.Pixel) => onmouseover(t0).runNow()), onmouseup = js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.anon.Pixel) => onmouseup(t0).runNow()), onremove = js.Any.fromFunction1((t0: Target) => onremove(t0).runNow()), removeEventListener = js.Any.fromFunction2((t0: String, t1: Callback) => (removeEventListener(t0, t1)).runNow()), setFillColor = js.Any.fromFunction1((t0: String) => setFillColor(t0).runNow()), setFillOpacity = js.Any.fromFunction1((t0: Double) => setFillOpacity(t0).runNow()), setPath = js.Any.fromFunction1((t0: js.Array[Point]) => setPath(t0).runNow()), setPointAt = js.Any.fromFunction2((t0: Double, t1: Point) => (setPointAt(t0, t1)).runNow()), setPositionAt = js.Any.fromFunction2((t0: Double, t1: Point) => (setPositionAt(t0, t1)).runNow()), setStrokeColor = js.Any.fromFunction1((t0: String) => setStrokeColor(t0).runNow()), setStrokeOpacity = js.Any.fromFunction1((t0: Double) => setStrokeOpacity(t0).runNow()), setStrokeStyle = js.Any.fromFunction1((t0: String) => setStrokeStyle(t0).runNow()), setStrokeWeight = js.Any.fromFunction1((t0: Double) => setStrokeWeight(t0).runNow()))
    __obj.asInstanceOf[Polyline]
  }
  
  extension [Self <: Polyline](x: Self) {
    
    inline def setAddEventListener(value: (String, Callback) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: String, t1: Callback) => (value(t0, t1)).runNow()))
    
    inline def setDisableEditing(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "disableEditing", value.toJsFn)
    
    inline def setDisableMassClear(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "disableMassClear", value.toJsFn)
    
    inline def setEnableEditing(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "enableEditing", value.toJsFn)
    
    inline def setEnableMassClear(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "enableMassClear", value.toJsFn)
    
    inline def setGetBounds(value: CallbackTo[Bounds]): Self = StObject.set(x, "getBounds", value.toJsFn)
    
    inline def setGetFillColor(value: CallbackTo[String]): Self = StObject.set(x, "getFillColor", value.toJsFn)
    
    inline def setGetFillOpacity(value: CallbackTo[Double]): Self = StObject.set(x, "getFillOpacity", value.toJsFn)
    
    inline def setGetMap(value: CallbackTo[Map]): Self = StObject.set(x, "getMap", value.toJsFn)
    
    inline def setGetPath(value: CallbackTo[js.Array[Point]]): Self = StObject.set(x, "getPath", value.toJsFn)
    
    inline def setGetStrokeColor(value: CallbackTo[String]): Self = StObject.set(x, "getStrokeColor", value.toJsFn)
    
    inline def setGetStrokeOpacity(value: CallbackTo[Double]): Self = StObject.set(x, "getStrokeOpacity", value.toJsFn)
    
    inline def setGetStrokeStyle(value: CallbackTo[String]): Self = StObject.set(x, "getStrokeStyle", value.toJsFn)
    
    inline def setGetStrokeWeight(value: CallbackTo[Double]): Self = StObject.set(x, "getStrokeWeight", value.toJsFn)
    
    inline def setOnclick(value: Target => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onclick", js.Any.fromFunction1((t0: Target) => value(t0).runNow()))
    
    inline def setOndblclick(value: typingsJapgolly.baidumapWebSdk.anon.Pixel => japgolly.scalajs.react.Callback): Self = StObject.set(x, "ondblclick", js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.anon.Pixel) => value(t0).runNow()))
    
    inline def setOnlineupdate(value: Target => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onlineupdate", js.Any.fromFunction1((t0: Target) => value(t0).runNow()))
    
    inline def setOnmousedown(value: typingsJapgolly.baidumapWebSdk.anon.Pixel => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onmousedown", js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.anon.Pixel) => value(t0).runNow()))
    
    inline def setOnmouseout(value: typingsJapgolly.baidumapWebSdk.anon.Pixel => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onmouseout", js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.anon.Pixel) => value(t0).runNow()))
    
    inline def setOnmouseover(value: typingsJapgolly.baidumapWebSdk.anon.Pixel => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onmouseover", js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.anon.Pixel) => value(t0).runNow()))
    
    inline def setOnmouseup(value: typingsJapgolly.baidumapWebSdk.anon.Pixel => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onmouseup", js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.anon.Pixel) => value(t0).runNow()))
    
    inline def setOnremove(value: Target => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onremove", js.Any.fromFunction1((t0: Target) => value(t0).runNow()))
    
    inline def setRemoveEventListener(value: (String, Callback) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: String, t1: Callback) => (value(t0, t1)).runNow()))
    
    inline def setSetFillColor(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setFillColor", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetFillOpacity(value: Double => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setFillOpacity", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetPath(value: js.Array[Point] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setPath", js.Any.fromFunction1((t0: js.Array[Point]) => value(t0).runNow()))
    
    inline def setSetPointAt(value: (Double, Point) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setPointAt", js.Any.fromFunction2((t0: Double, t1: Point) => (value(t0, t1)).runNow()))
    
    inline def setSetPositionAt(value: (Double, Point) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setPositionAt", js.Any.fromFunction2((t0: Double, t1: Point) => (value(t0, t1)).runNow()))
    
    inline def setSetStrokeColor(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setStrokeColor", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetStrokeOpacity(value: Double => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setStrokeOpacity", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetStrokeStyle(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setStrokeStyle", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetStrokeWeight(value: Double => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setStrokeWeight", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
