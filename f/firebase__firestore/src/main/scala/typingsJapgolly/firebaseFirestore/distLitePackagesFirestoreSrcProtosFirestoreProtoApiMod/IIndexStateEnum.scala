package typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIndexStateEnum extends StObject {
  
  var CREATING: IndexState
  
  var ERROR: IndexState
  
  var READY: IndexState
  
  var STATE_UNSPECIFIED: IndexState
  
  def values(): js.Array[IndexState]
}
object IIndexStateEnum {
  
  inline def apply(
    CREATING: IndexState,
    ERROR: IndexState,
    READY: IndexState,
    STATE_UNSPECIFIED: IndexState,
    values: CallbackTo[js.Array[IndexState]]
  ): IIndexStateEnum = {
    val __obj = js.Dynamic.literal(CREATING = CREATING.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], READY = READY.asInstanceOf[js.Any], STATE_UNSPECIFIED = STATE_UNSPECIFIED.asInstanceOf[js.Any], values = values.toJsFn)
    __obj.asInstanceOf[IIndexStateEnum]
  }
  
  extension [Self <: IIndexStateEnum](x: Self) {
    
    inline def setCREATING(value: IndexState): Self = StObject.set(x, "CREATING", value.asInstanceOf[js.Any])
    
    inline def setERROR(value: IndexState): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    inline def setREADY(value: IndexState): Self = StObject.set(x, "READY", value.asInstanceOf[js.Any])
    
    inline def setSTATE_UNSPECIFIED(value: IndexState): Self = StObject.set(x, "STATE_UNSPECIFIED", value.asInstanceOf[js.Any])
    
    inline def setValues(value: CallbackTo[js.Array[IndexState]]): Self = StObject.set(x, "values", value.toJsFn)
  }
}
