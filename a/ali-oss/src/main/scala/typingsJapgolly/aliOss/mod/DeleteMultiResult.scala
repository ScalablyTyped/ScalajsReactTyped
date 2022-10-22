package typingsJapgolly.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMultiResult extends StObject {
  
  /** deleted object names list */
  var deleted: js.UndefOr[js.Array[String]] = js.undefined
  
  var res: NormalSuccessResponse
}
object DeleteMultiResult {
  
  inline def apply(res: NormalSuccessResponse): DeleteMultiResult = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMultiResult]
  }
  
  extension [Self <: DeleteMultiResult](x: Self) {
    
    inline def setDeleted(value: js.Array[String]): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDeletedVarargs(value: String*): Self = StObject.set(x, "deleted", js.Array(value*))
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
