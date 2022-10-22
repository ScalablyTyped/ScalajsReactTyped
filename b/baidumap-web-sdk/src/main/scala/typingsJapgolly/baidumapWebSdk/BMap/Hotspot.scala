package typingsJapgolly.baidumapWebSdk.BMap

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hotspot
  extends StObject
     with Overlay {
  
  def getPosition(): Point
  
  def getText(): String
  
  def getUserData(): Any
  
  def setPosition(position: Point): Unit
  
  def setText(text: String): Unit
  
  def setUserData(data: Any): Unit
}
object Hotspot {
  
  inline def apply(
    getPosition: CallbackTo[Point],
    getText: CallbackTo[String],
    getUserData: CallbackTo[Any],
    setPosition: Point => japgolly.scalajs.react.Callback,
    setText: String => japgolly.scalajs.react.Callback,
    setUserData: Any => japgolly.scalajs.react.Callback
  ): Hotspot = {
    val __obj = js.Dynamic.literal(getPosition = getPosition.toJsFn, getText = getText.toJsFn, getUserData = getUserData.toJsFn, setPosition = js.Any.fromFunction1((t0: Point) => setPosition(t0).runNow()), setText = js.Any.fromFunction1((t0: String) => setText(t0).runNow()), setUserData = js.Any.fromFunction1((t0: Any) => setUserData(t0).runNow()))
    __obj.asInstanceOf[Hotspot]
  }
  
  extension [Self <: Hotspot](x: Self) {
    
    inline def setGetPosition(value: CallbackTo[Point]): Self = StObject.set(x, "getPosition", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setGetUserData(value: CallbackTo[Any]): Self = StObject.set(x, "getUserData", value.toJsFn)
    
    inline def setSetPosition(value: Point => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setPosition", js.Any.fromFunction1((t0: Point) => value(t0).runNow()))
    
    inline def setSetText(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetUserData(value: Any => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setUserData", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
