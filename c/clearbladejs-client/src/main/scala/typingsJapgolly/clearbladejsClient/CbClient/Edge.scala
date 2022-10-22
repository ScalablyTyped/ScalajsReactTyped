package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Edge extends StObject {
  
  var URI: String
  
  def columns(callback: CbCallback): Unit
  
  def count(query: Query, callback: CbCallback): Unit
  
  def create(newEdge: js.Object, name: String, callback: CbCallback): Unit
  
  def deleteEdgeByName(name: String, callback: CbCallback): Unit
  
  var systemKey: String
  
  var systemSecret: String
  
  def updateEdgeByName(name: String, `object`: js.Object, callback: CbCallback): Unit
  
  var user: APIUser
}
object Edge {
  
  inline def apply(
    URI: String,
    columns: CbCallback => Callback,
    count: (Query, CbCallback) => Callback,
    create: (js.Object, String, CbCallback) => Callback,
    deleteEdgeByName: (String, CbCallback) => Callback,
    systemKey: String,
    systemSecret: String,
    updateEdgeByName: (String, js.Object, CbCallback) => Callback,
    user: APIUser
  ): Edge = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], columns = js.Any.fromFunction1((t0: CbCallback) => columns(t0).runNow()), count = js.Any.fromFunction2((t0: Query, t1: CbCallback) => (count(t0, t1)).runNow()), create = js.Any.fromFunction3((t0: js.Object, t1: String, t2: CbCallback) => (create(t0, t1, t2)).runNow()), deleteEdgeByName = js.Any.fromFunction2((t0: String, t1: CbCallback) => (deleteEdgeByName(t0, t1)).runNow()), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], updateEdgeByName = js.Any.fromFunction3((t0: String, t1: js.Object, t2: CbCallback) => (updateEdgeByName(t0, t1, t2)).runNow()), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
  
  extension [Self <: Edge](x: Self) {
    
    inline def setColumns(value: CbCallback => Callback): Self = StObject.set(x, "columns", js.Any.fromFunction1((t0: CbCallback) => value(t0).runNow()))
    
    inline def setCount(value: (Query, CbCallback) => Callback): Self = StObject.set(x, "count", js.Any.fromFunction2((t0: Query, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setCreate(value: (js.Object, String, CbCallback) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction3((t0: js.Object, t1: String, t2: CbCallback) => (value(t0, t1, t2)).runNow()))
    
    inline def setDeleteEdgeByName(value: (String, CbCallback) => Callback): Self = StObject.set(x, "deleteEdgeByName", js.Any.fromFunction2((t0: String, t1: CbCallback) => (value(t0, t1)).runNow()))
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemSecret(value: String): Self = StObject.set(x, "systemSecret", value.asInstanceOf[js.Any])
    
    inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setUpdateEdgeByName(value: (String, js.Object, CbCallback) => Callback): Self = StObject.set(x, "updateEdgeByName", js.Any.fromFunction3((t0: String, t1: js.Object, t2: CbCallback) => (value(t0, t1, t2)).runNow()))
    
    inline def setUser(value: APIUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
