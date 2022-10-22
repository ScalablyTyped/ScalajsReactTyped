package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjVer extends StObject {
  
  def Clone(): IObjVer
  
  def CloneFrom(ObjVer: IObjVer): Unit
  
  var ID: Double
  
  var ObjID: IObjID
  
  def Serialize(): js.Array[Double]
  
  def SetIDs(ObjType: Double, ID: Double, Version: Double): Unit
  
  def SetObjIDAndVersion(ObjID: IObjID, Version: Double): Unit
  
  def ToJSON(): String
  
  var Type: Double
  
  def Unserialize(Bytes: js.Array[Double]): Unit
  
  var Version: Double
}
object IObjVer {
  
  inline def apply(
    Clone: CallbackTo[IObjVer],
    CloneFrom: IObjVer => Callback,
    ID: Double,
    ObjID: IObjID,
    Serialize: CallbackTo[js.Array[Double]],
    SetIDs: (Double, Double, Double) => Callback,
    SetObjIDAndVersion: (IObjID, Double) => Callback,
    ToJSON: CallbackTo[String],
    Type: Double,
    Unserialize: js.Array[Double] => Callback,
    Version: Double
  ): IObjVer = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, CloneFrom = js.Any.fromFunction1((t0: IObjVer) => CloneFrom(t0).runNow()), ID = ID.asInstanceOf[js.Any], ObjID = ObjID.asInstanceOf[js.Any], Serialize = Serialize.toJsFn, SetIDs = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (SetIDs(t0, t1, t2)).runNow()), SetObjIDAndVersion = js.Any.fromFunction2((t0: IObjID, t1: Double) => (SetObjIDAndVersion(t0, t1)).runNow()), ToJSON = ToJSON.toJsFn, Type = Type.asInstanceOf[js.Any], Unserialize = js.Any.fromFunction1((t0: js.Array[Double]) => Unserialize(t0).runNow()), Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjVer]
  }
  
  extension [Self <: IObjVer](x: Self) {
    
    inline def setClone(value: CallbackTo[IObjVer]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCloneFrom(value: IObjVer => Callback): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1((t0: IObjVer) => value(t0).runNow()))
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setObjID(value: IObjID): Self = StObject.set(x, "ObjID", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "Serialize", value.toJsFn)
    
    inline def setSetIDs(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "SetIDs", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetObjIDAndVersion(value: (IObjID, Double) => Callback): Self = StObject.set(x, "SetObjIDAndVersion", js.Any.fromFunction2((t0: IObjID, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setToJSON(value: CallbackTo[String]): Self = StObject.set(x, "ToJSON", value.toJsFn)
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setUnserialize(value: js.Array[Double] => Callback): Self = StObject.set(x, "Unserialize", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
