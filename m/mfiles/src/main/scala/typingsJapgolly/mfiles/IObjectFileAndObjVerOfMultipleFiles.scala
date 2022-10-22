package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectFileAndObjVerOfMultipleFiles extends StObject {
  
  def Add(Index: Double, ObjectFileAndObjVer: IObjectFileAndObjVer): Unit
  
  def Clone(): IObjectFileAndObjVerOfMultipleFiles
  
  val Count: Double
  
  def Item(Index: Double): IObjectFileAndObjVer
  
  def Remove(Index: Double): Unit
}
object IObjectFileAndObjVerOfMultipleFiles {
  
  inline def apply(
    Add: (Double, IObjectFileAndObjVer) => Callback,
    Clone: CallbackTo[IObjectFileAndObjVerOfMultipleFiles],
    Count: Double,
    Item: Double => IObjectFileAndObjVer,
    Remove: Double => Callback
  ): IObjectFileAndObjVerOfMultipleFiles = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IObjectFileAndObjVer) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IObjectFileAndObjVerOfMultipleFiles]
  }
  
  extension [Self <: IObjectFileAndObjVerOfMultipleFiles](x: Self) {
    
    inline def setAdd(value: (Double, IObjectFileAndObjVer) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IObjectFileAndObjVer) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[IObjectFileAndObjVerOfMultipleFiles]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IObjectFileAndObjVer): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
