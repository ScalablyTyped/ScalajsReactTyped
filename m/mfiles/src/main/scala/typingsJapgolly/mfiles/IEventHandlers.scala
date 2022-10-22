package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEventHandlers extends StObject {
  
  def Add(Index: Double, EventHandler: IEventHandler): Unit
  
  def Clone(): IEventHandlers
  
  val Count: Double
  
  def GetIndexByGUID(EventHandlerGUID: String): Double
  
  def Item(Index: Double): IEventHandler
  
  def Remove(Index: Double): Unit
}
object IEventHandlers {
  
  inline def apply(
    Add: (Double, IEventHandler) => Callback,
    Clone: CallbackTo[IEventHandlers],
    Count: Double,
    GetIndexByGUID: String => Double,
    Item: Double => IEventHandler,
    Remove: Double => Callback
  ): IEventHandlers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IEventHandler) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], GetIndexByGUID = js.Any.fromFunction1(GetIndexByGUID), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IEventHandlers]
  }
  
  extension [Self <: IEventHandlers](x: Self) {
    
    inline def setAdd(value: (Double, IEventHandler) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IEventHandler) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[IEventHandlers]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setGetIndexByGUID(value: String => Double): Self = StObject.set(x, "GetIndexByGUID", js.Any.fromFunction1(value))
    
    inline def setItem(value: Double => IEventHandler): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
