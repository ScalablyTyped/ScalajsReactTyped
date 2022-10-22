package typingsJapgolly.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveResult[T /* <: js.Object */]
  extends StObject
     with DocumentMetadata {
  
  var old: js.UndefOr[Document[T]] = js.undefined
}
object RemoveResult {
  
  inline def apply[T /* <: js.Object */](_id: String, _key: String, _rev: String): RemoveResult[T] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _key = _key.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveResult[T]]
  }
  
  extension [Self <: RemoveResult[?], T /* <: js.Object */](x: Self & RemoveResult[T]) {
    
    inline def setOld(value: Document[T]): Self = StObject.set(x, "old", value.asInstanceOf[js.Any])
    
    inline def setOldUndefined: Self = StObject.set(x, "old", js.undefined)
  }
}
