package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjID extends StObject {
  
  def Clone(): IObjID
  
  def CloneFrom(ObjID: IObjID): Unit
  
  var ID: Double
  
  def Serialize(): js.Array[Double]
  
  def SetIDs(ObjType: Double, ID: Double): Unit
  
  def ToJSON(): String
  
  var Type: Double
  
  def Unserialize(Bytes: js.Array[Double]): Unit
}
object IObjID {
  
  inline def apply(
    Clone: CallbackTo[IObjID],
    CloneFrom: IObjID => Callback,
    ID: Double,
    Serialize: CallbackTo[js.Array[Double]],
    SetIDs: (Double, Double) => Callback,
    ToJSON: CallbackTo[String],
    Type: Double,
    Unserialize: js.Array[Double] => Callback
  ): IObjID = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, CloneFrom = js.Any.fromFunction1((t0: IObjID) => CloneFrom(t0).runNow()), ID = ID.asInstanceOf[js.Any], Serialize = Serialize.toJsFn, SetIDs = js.Any.fromFunction2((t0: Double, t1: Double) => (SetIDs(t0, t1)).runNow()), ToJSON = ToJSON.toJsFn, Type = Type.asInstanceOf[js.Any], Unserialize = js.Any.fromFunction1((t0: js.Array[Double]) => Unserialize(t0).runNow()))
    __obj.asInstanceOf[IObjID]
  }
  
  extension [Self <: IObjID](x: Self) {
    
    inline def setClone(value: CallbackTo[IObjID]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCloneFrom(value: IObjID => Callback): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1((t0: IObjID) => value(t0).runNow()))
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "Serialize", value.toJsFn)
    
    inline def setSetIDs(value: (Double, Double) => Callback): Self = StObject.set(x, "SetIDs", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setToJSON(value: CallbackTo[String]): Self = StObject.set(x, "ToJSON", value.toJsFn)
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setUnserialize(value: js.Array[Double] => Callback): Self = StObject.set(x, "Unserialize", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
  }
}
