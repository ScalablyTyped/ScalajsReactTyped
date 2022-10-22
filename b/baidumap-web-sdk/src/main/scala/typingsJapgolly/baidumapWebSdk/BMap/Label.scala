package typingsJapgolly.baidumapWebSdk.BMap

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baidumapWebSdk.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label
  extends StObject
     with Overlay {
  
  def addEventListener(event: String, handler: Callback): Unit
  
  def disableMassClear(): Unit
  
  def enableMassClear(): Unit
  
  def getMap(): Map
  
  def getOffset(): Size
  
  def getPosition(): Point
  
  def getTitle(): String
  
  def onclick(event: Target): Unit
  
  def ondblclick(event: Target): Unit
  
  def onmousedown(event: Target): Unit
  
  def onmouseout(event: Target): Unit
  
  def onmouseover(event: Target): Unit
  
  def onmouseup(event: Target): Unit
  
  def onremove(event: Target): Unit
  
  def onrightclick(event: Target): Unit
  
  def removeEventListener(event: String, handler: Callback): Unit
  
  def setContent(content: String): Unit
  
  def setOffset(offset: Size): Unit
  
  def setPosition(position: Point): Unit
  
  def setStyle(styles: StringDictionary[String | Double]): Unit
  
  def setTitle(title: String): Unit
  
  def setZIndex(zIndex: Double): Unit
}
object Label {
  
  inline def apply(
    addEventListener: (String, Callback) => japgolly.scalajs.react.Callback,
    disableMassClear: japgolly.scalajs.react.Callback,
    enableMassClear: japgolly.scalajs.react.Callback,
    getMap: CallbackTo[Map],
    getOffset: CallbackTo[Size],
    getPosition: CallbackTo[Point],
    getTitle: CallbackTo[String],
    onclick: Target => japgolly.scalajs.react.Callback,
    ondblclick: Target => japgolly.scalajs.react.Callback,
    onmousedown: Target => japgolly.scalajs.react.Callback,
    onmouseout: Target => japgolly.scalajs.react.Callback,
    onmouseover: Target => japgolly.scalajs.react.Callback,
    onmouseup: Target => japgolly.scalajs.react.Callback,
    onremove: Target => japgolly.scalajs.react.Callback,
    onrightclick: Target => japgolly.scalajs.react.Callback,
    removeEventListener: (String, Callback) => japgolly.scalajs.react.Callback,
    setContent: String => japgolly.scalajs.react.Callback,
    setOffset: Size => japgolly.scalajs.react.Callback,
    setPosition: Point => japgolly.scalajs.react.Callback,
    setStyle: StringDictionary[String | Double] => japgolly.scalajs.react.Callback,
    setTitle: String => japgolly.scalajs.react.Callback,
    setZIndex: Double => japgolly.scalajs.react.Callback
  ): Label = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2((t0: String, t1: Callback) => (addEventListener(t0, t1)).runNow()), disableMassClear = disableMassClear.toJsFn, enableMassClear = enableMassClear.toJsFn, getMap = getMap.toJsFn, getOffset = getOffset.toJsFn, getPosition = getPosition.toJsFn, getTitle = getTitle.toJsFn, onclick = js.Any.fromFunction1((t0: Target) => onclick(t0).runNow()), ondblclick = js.Any.fromFunction1((t0: Target) => ondblclick(t0).runNow()), onmousedown = js.Any.fromFunction1((t0: Target) => onmousedown(t0).runNow()), onmouseout = js.Any.fromFunction1((t0: Target) => onmouseout(t0).runNow()), onmouseover = js.Any.fromFunction1((t0: Target) => onmouseover(t0).runNow()), onmouseup = js.Any.fromFunction1((t0: Target) => onmouseup(t0).runNow()), onremove = js.Any.fromFunction1((t0: Target) => onremove(t0).runNow()), onrightclick = js.Any.fromFunction1((t0: Target) => onrightclick(t0).runNow()), removeEventListener = js.Any.fromFunction2((t0: String, t1: Callback) => (removeEventListener(t0, t1)).runNow()), setContent = js.Any.fromFunction1((t0: String) => setContent(t0).runNow()), setOffset = js.Any.fromFunction1((t0: Size) => setOffset(t0).runNow()), setPosition = js.Any.fromFunction1((t0: Point) => setPosition(t0).runNow()), setStyle = js.Any.fromFunction1((t0: StringDictionary[String | Double]) => setStyle(t0).runNow()), setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()), setZIndex = js.Any.fromFunction1((t0: Double) => setZIndex(t0).runNow()))
    __obj.asInstanceOf[Label]
  }
  
  extension [Self <: Label](x: Self) {
    
    inline def setAddEventListener(value: (String, Callback) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: String, t1: Callback) => (value(t0, t1)).runNow()))
    
    inline def setDisableMassClear(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "disableMassClear", value.toJsFn)
    
    inline def setEnableMassClear(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "enableMassClear", value.toJsFn)
    
    inline def setGetMap(value: CallbackTo[Map]): Self = StObject.set(x, "getMap", value.toJsFn)
    
    inline def setGetOffset(value: CallbackTo[Size]): Self = StObject.set(x, "getOffset", value.toJsFn)
    
    inline def setGetPosition(value: CallbackTo[Point]): Self = StObject.set(x, "getPosition", value.toJsFn)
    
    inline def setGetTitle(value: CallbackTo[String]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setOnclick(value: Target => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onclick", js.Any.fromFunction1((t0: Target) => value(t0).runNow()))
    
    inline def setOndblclick(value: Target => japgolly.scalajs.react.Callback): Self = StObject.set(x, "ondblclick", js.Any.fromFunction1((t0: Target) => value(t0).runNow()))
    
    inline def setOnmousedown(value: Target => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onmousedown", js.Any.fromFunction1((t0: Target) => value(t0).runNow()))
    
    inline def setOnmouseout(value: Target => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onmouseout", js.Any.fromFunction1((t0: Target) => value(t0).runNow()))
    
    inline def setOnmouseover(value: Target => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onmouseover", js.Any.fromFunction1((t0: Target) => value(t0).runNow()))
    
    inline def setOnmouseup(value: Target => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onmouseup", js.Any.fromFunction1((t0: Target) => value(t0).runNow()))
    
    inline def setOnremove(value: Target => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onremove", js.Any.fromFunction1((t0: Target) => value(t0).runNow()))
    
    inline def setOnrightclick(value: Target => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onrightclick", js.Any.fromFunction1((t0: Target) => value(t0).runNow()))
    
    inline def setRemoveEventListener(value: (String, Callback) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: String, t1: Callback) => (value(t0, t1)).runNow()))
    
    inline def setSetContent(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setContent", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetOffset(value: Size => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setOffset", js.Any.fromFunction1((t0: Size) => value(t0).runNow()))
    
    inline def setSetPosition(value: Point => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setPosition", js.Any.fromFunction1((t0: Point) => value(t0).runNow()))
    
    inline def setSetStyle(value: StringDictionary[String | Double] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setStyle", js.Any.fromFunction1((t0: StringDictionary[String | Double]) => value(t0).runNow()))
    
    inline def setSetTitle(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setTitle", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetZIndex(value: Double => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setZIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
