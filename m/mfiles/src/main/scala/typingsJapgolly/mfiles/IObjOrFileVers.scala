package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjOrFileVers extends StObject {
  
  def Add(Index: Double, ObjOrFileVer: IObjOrFileVer): Unit
  
  def Clone(): IObjOrFileVers
  
  val Count: Double
  
  def Item(Index: Double): IObjOrFileVer
  
  def Remove(Index: Double): Unit
}
object IObjOrFileVers {
  
  inline def apply(
    Add: (Double, IObjOrFileVer) => Callback,
    Clone: CallbackTo[IObjOrFileVers],
    Count: Double,
    Item: Double => IObjOrFileVer,
    Remove: Double => Callback
  ): IObjOrFileVers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IObjOrFileVer) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IObjOrFileVers]
  }
  
  extension [Self <: IObjOrFileVers](x: Self) {
    
    inline def setAdd(value: (Double, IObjOrFileVer) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IObjOrFileVer) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[IObjOrFileVers]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IObjOrFileVer): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
