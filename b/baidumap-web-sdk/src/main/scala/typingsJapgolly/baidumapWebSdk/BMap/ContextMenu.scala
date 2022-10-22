package typingsJapgolly.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextMenu extends StObject {
  
  def addItem(item: MenuItem): Unit
  
  def addSeparator(): Unit
  
  def getItem(index: Double): MenuItem
  
  def onclose(event: typingsJapgolly.baidumapWebSdk.anon.Pixel): Unit
  
  def onopen(event: typingsJapgolly.baidumapWebSdk.anon.Pixel): Unit
  
  def removeItem(item: MenuItem): Unit
  
  def removeSeparator(index: Double): Unit
}
object ContextMenu {
  
  inline def apply(
    addItem: MenuItem => japgolly.scalajs.react.Callback,
    addSeparator: japgolly.scalajs.react.Callback,
    getItem: Double => MenuItem,
    onclose: typingsJapgolly.baidumapWebSdk.anon.Pixel => japgolly.scalajs.react.Callback,
    onopen: typingsJapgolly.baidumapWebSdk.anon.Pixel => japgolly.scalajs.react.Callback,
    removeItem: MenuItem => japgolly.scalajs.react.Callback,
    removeSeparator: Double => japgolly.scalajs.react.Callback
  ): ContextMenu = {
    val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction1((t0: MenuItem) => addItem(t0).runNow()), addSeparator = addSeparator.toJsFn, getItem = js.Any.fromFunction1(getItem), onclose = js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.anon.Pixel) => onclose(t0).runNow()), onopen = js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.anon.Pixel) => onopen(t0).runNow()), removeItem = js.Any.fromFunction1((t0: MenuItem) => removeItem(t0).runNow()), removeSeparator = js.Any.fromFunction1((t0: Double) => removeSeparator(t0).runNow()))
    __obj.asInstanceOf[ContextMenu]
  }
  
  extension [Self <: ContextMenu](x: Self) {
    
    inline def setAddItem(value: MenuItem => japgolly.scalajs.react.Callback): Self = StObject.set(x, "addItem", js.Any.fromFunction1((t0: MenuItem) => value(t0).runNow()))
    
    inline def setAddSeparator(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "addSeparator", value.toJsFn)
    
    inline def setGetItem(value: Double => MenuItem): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setOnclose(value: typingsJapgolly.baidumapWebSdk.anon.Pixel => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onclose", js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.anon.Pixel) => value(t0).runNow()))
    
    inline def setOnopen(value: typingsJapgolly.baidumapWebSdk.anon.Pixel => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onopen", js.Any.fromFunction1((t0: typingsJapgolly.baidumapWebSdk.anon.Pixel) => value(t0).runNow()))
    
    inline def setRemoveItem(value: MenuItem => japgolly.scalajs.react.Callback): Self = StObject.set(x, "removeItem", js.Any.fromFunction1((t0: MenuItem) => value(t0).runNow()))
    
    inline def setRemoveSeparator(value: Double => japgolly.scalajs.react.Callback): Self = StObject.set(x, "removeSeparator", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
