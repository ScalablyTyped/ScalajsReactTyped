package typingsJapgolly.dbJs.DbJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.IDBDatabase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseServer extends StObject {
  
  def close(): Unit
  
  def getIndexedDB(): IDBDatabase
}
object BaseServer {
  
  inline def apply(close: Callback, getIndexedDB: CallbackTo[IDBDatabase]): BaseServer = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, getIndexedDB = getIndexedDB.toJsFn)
    __obj.asInstanceOf[BaseServer]
  }
  
  extension [Self <: BaseServer](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setGetIndexedDB(value: CallbackTo[IDBDatabase]): Self = StObject.set(x, "getIndexedDB", value.toJsFn)
  }
}
