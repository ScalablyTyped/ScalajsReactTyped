package typingsJapgolly.idb.buildEntryMod

import org.scalajs.dom.IDBRequest
import typingsJapgolly.std.IDBCursorDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined idb.idb/build/entry.Omit<std.IDBCursor, 'key' | 'primaryKey' | 'source' | 'advance' | 'continue' | 'continuePrimaryKey' | 'delete' | 'update'> */
trait IDBPCursorExtends extends StObject {
  
  var direction: IDBCursorDirection
  
  var request: IDBRequest[Any, Any]
}
object IDBPCursorExtends {
  
  inline def apply(direction: IDBCursorDirection, request: IDBRequest[Any, Any]): IDBPCursorExtends = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBPCursorExtends]
  }
  
  extension [Self <: IDBPCursorExtends](x: Self) {
    
    inline def setDirection(value: IDBCursorDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IDBRequest[Any, Any]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
