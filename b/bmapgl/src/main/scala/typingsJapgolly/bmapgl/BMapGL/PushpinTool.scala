package typingsJapgolly.bmapgl.BMapGL

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushpinTool extends StObject {
  
  def close(): Boolean
  
  def getCursor(): String
  
  def getIcon(): Icon
  
  def onmarkend(event: typingsJapgolly.bmapgl.anon.Marker): Unit
  
  def open(): Boolean
  
  def setCursor(cursor: String): String
  
  def setIcon(icon: Icon): Icon
}
object PushpinTool {
  
  inline def apply(
    close: CallbackTo[Boolean],
    getCursor: CallbackTo[String],
    getIcon: CallbackTo[Icon],
    onmarkend: typingsJapgolly.bmapgl.anon.Marker => japgolly.scalajs.react.Callback,
    open: CallbackTo[Boolean],
    setCursor: String => String,
    setIcon: Icon => Icon
  ): PushpinTool = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, getCursor = getCursor.toJsFn, getIcon = getIcon.toJsFn, onmarkend = js.Any.fromFunction1((t0: typingsJapgolly.bmapgl.anon.Marker) => onmarkend(t0).runNow()), open = open.toJsFn, setCursor = js.Any.fromFunction1(setCursor), setIcon = js.Any.fromFunction1(setIcon))
    __obj.asInstanceOf[PushpinTool]
  }
  
  extension [Self <: PushpinTool](x: Self) {
    
    inline def setClose(value: CallbackTo[Boolean]): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setGetCursor(value: CallbackTo[String]): Self = StObject.set(x, "getCursor", value.toJsFn)
    
    inline def setGetIcon(value: CallbackTo[Icon]): Self = StObject.set(x, "getIcon", value.toJsFn)
    
    inline def setOnmarkend(value: typingsJapgolly.bmapgl.anon.Marker => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onmarkend", js.Any.fromFunction1((t0: typingsJapgolly.bmapgl.anon.Marker) => value(t0).runNow()))
    
    inline def setOpen(value: CallbackTo[Boolean]): Self = StObject.set(x, "open", value.toJsFn)
    
    inline def setSetCursor(value: String => String): Self = StObject.set(x, "setCursor", js.Any.fromFunction1(value))
    
    inline def setSetIcon(value: Icon => Icon): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
  }
}
