package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjVers extends StObject {
  
  def Add(Index: Double, ObjVer: IObjVer): Unit
  
  def Clone(): IObjVers
  
  val Count: Double
  
  def GetAllDistinctObjIDs(): IObjIDs
  
  def Item(Index: Double): IObjVer
  
  def Remove(Index: Double): Unit
  
  def ToJSON(): String
}
object IObjVers {
  
  inline def apply(
    Add: (Double, IObjVer) => Callback,
    Clone: CallbackTo[IObjVers],
    Count: Double,
    GetAllDistinctObjIDs: CallbackTo[IObjIDs],
    Item: Double => IObjVer,
    Remove: Double => Callback,
    ToJSON: CallbackTo[String]
  ): IObjVers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IObjVer) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], GetAllDistinctObjIDs = GetAllDistinctObjIDs.toJsFn, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()), ToJSON = ToJSON.toJsFn)
    __obj.asInstanceOf[IObjVers]
  }
  
  extension [Self <: IObjVers](x: Self) {
    
    inline def setAdd(value: (Double, IObjVer) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IObjVer) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[IObjVers]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setGetAllDistinctObjIDs(value: CallbackTo[IObjIDs]): Self = StObject.set(x, "GetAllDistinctObjIDs", value.toJsFn)
    
    inline def setItem(value: Double => IObjVer): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setToJSON(value: CallbackTo[String]): Self = StObject.set(x, "ToJSON", value.toJsFn)
  }
}
