package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileVers extends StObject {
  
  def Add(Index: Double, FileVer: IFileVer): Unit
  
  def Clone(): IFileVers
  
  val Count: Double
  
  def Item(Index: Double): IFileVer
  
  def Remove(Index: Double): Unit
}
object IFileVers {
  
  inline def apply(
    Add: (Double, IFileVer) => Callback,
    Clone: CallbackTo[IFileVers],
    Count: Double,
    Item: Double => IFileVer,
    Remove: Double => Callback
  ): IFileVers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IFileVer) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IFileVers]
  }
  
  extension [Self <: IFileVers](x: Self) {
    
    inline def setAdd(value: (Double, IFileVer) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IFileVer) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[IFileVers]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IFileVer): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
