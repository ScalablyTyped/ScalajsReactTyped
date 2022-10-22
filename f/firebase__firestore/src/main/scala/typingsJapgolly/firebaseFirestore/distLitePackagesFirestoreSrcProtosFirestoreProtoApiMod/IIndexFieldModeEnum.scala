package typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIndexFieldModeEnum extends StObject {
  
  var ASCENDING: IndexFieldMode
  
  var DESCENDING: IndexFieldMode
  
  var MODE_UNSPECIFIED: IndexFieldMode
  
  def values(): js.Array[IndexFieldMode]
}
object IIndexFieldModeEnum {
  
  inline def apply(
    ASCENDING: IndexFieldMode,
    DESCENDING: IndexFieldMode,
    MODE_UNSPECIFIED: IndexFieldMode,
    values: CallbackTo[js.Array[IndexFieldMode]]
  ): IIndexFieldModeEnum = {
    val __obj = js.Dynamic.literal(ASCENDING = ASCENDING.asInstanceOf[js.Any], DESCENDING = DESCENDING.asInstanceOf[js.Any], MODE_UNSPECIFIED = MODE_UNSPECIFIED.asInstanceOf[js.Any], values = values.toJsFn)
    __obj.asInstanceOf[IIndexFieldModeEnum]
  }
  
  extension [Self <: IIndexFieldModeEnum](x: Self) {
    
    inline def setASCENDING(value: IndexFieldMode): Self = StObject.set(x, "ASCENDING", value.asInstanceOf[js.Any])
    
    inline def setDESCENDING(value: IndexFieldMode): Self = StObject.set(x, "DESCENDING", value.asInstanceOf[js.Any])
    
    inline def setMODE_UNSPECIFIED(value: IndexFieldMode): Self = StObject.set(x, "MODE_UNSPECIFIED", value.asInstanceOf[js.Any])
    
    inline def setValues(value: CallbackTo[js.Array[IndexFieldMode]]): Self = StObject.set(x, "values", value.toJsFn)
  }
}
