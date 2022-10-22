package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIDRange extends StObject {
  
  def Clone(): IIDRange
  
  var MaxID: Double
  
  var MaxID_32bit: String
  
  var MinID: Double
  
  var MinID_32bit: String
  
  def SetIDs(MinID: Double, MaxID: Double): Unit
  
  def SetIDs_32bit(MinID: String, MaxID: String): Unit
}
object IIDRange {
  
  inline def apply(
    Clone: CallbackTo[IIDRange],
    MaxID: Double,
    MaxID_32bit: String,
    MinID: Double,
    MinID_32bit: String,
    SetIDs: (Double, Double) => Callback,
    SetIDs_32bit: (String, String) => Callback
  ): IIDRange = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, MaxID = MaxID.asInstanceOf[js.Any], MaxID_32bit = MaxID_32bit.asInstanceOf[js.Any], MinID = MinID.asInstanceOf[js.Any], MinID_32bit = MinID_32bit.asInstanceOf[js.Any], SetIDs = js.Any.fromFunction2((t0: Double, t1: Double) => (SetIDs(t0, t1)).runNow()), SetIDs_32bit = js.Any.fromFunction2((t0: String, t1: String) => (SetIDs_32bit(t0, t1)).runNow()))
    __obj.asInstanceOf[IIDRange]
  }
  
  extension [Self <: IIDRange](x: Self) {
    
    inline def setClone(value: CallbackTo[IIDRange]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setMaxID(value: Double): Self = StObject.set(x, "MaxID", value.asInstanceOf[js.Any])
    
    inline def setMaxID_32bit(value: String): Self = StObject.set(x, "MaxID_32bit", value.asInstanceOf[js.Any])
    
    inline def setMinID(value: Double): Self = StObject.set(x, "MinID", value.asInstanceOf[js.Any])
    
    inline def setMinID_32bit(value: String): Self = StObject.set(x, "MinID_32bit", value.asInstanceOf[js.Any])
    
    inline def setSetIDs(value: (Double, Double) => Callback): Self = StObject.set(x, "SetIDs", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetIDs_32bit(value: (String, String) => Callback): Self = StObject.set(x, "SetIDs_32bit", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
