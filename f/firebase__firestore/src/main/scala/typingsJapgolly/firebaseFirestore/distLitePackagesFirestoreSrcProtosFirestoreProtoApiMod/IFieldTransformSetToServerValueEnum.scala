package typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFieldTransformSetToServerValueEnum extends StObject {
  
  var REQUEST_TIME: FieldTransformSetToServerValue
  
  var SERVER_VALUE_UNSPECIFIED: FieldTransformSetToServerValue
  
  def values(): js.Array[FieldTransformSetToServerValue]
}
object IFieldTransformSetToServerValueEnum {
  
  inline def apply(
    REQUEST_TIME: FieldTransformSetToServerValue,
    SERVER_VALUE_UNSPECIFIED: FieldTransformSetToServerValue,
    values: CallbackTo[js.Array[FieldTransformSetToServerValue]]
  ): IFieldTransformSetToServerValueEnum = {
    val __obj = js.Dynamic.literal(REQUEST_TIME = REQUEST_TIME.asInstanceOf[js.Any], SERVER_VALUE_UNSPECIFIED = SERVER_VALUE_UNSPECIFIED.asInstanceOf[js.Any], values = values.toJsFn)
    __obj.asInstanceOf[IFieldTransformSetToServerValueEnum]
  }
  
  extension [Self <: IFieldTransformSetToServerValueEnum](x: Self) {
    
    inline def setREQUEST_TIME(value: FieldTransformSetToServerValue): Self = StObject.set(x, "REQUEST_TIME", value.asInstanceOf[js.Any])
    
    inline def setSERVER_VALUE_UNSPECIFIED(value: FieldTransformSetToServerValue): Self = StObject.set(x, "SERVER_VALUE_UNSPECIFIED", value.asInstanceOf[js.Any])
    
    inline def setValues(value: CallbackTo[js.Array[FieldTransformSetToServerValue]]): Self = StObject.set(x, "values", value.toJsFn)
  }
}
