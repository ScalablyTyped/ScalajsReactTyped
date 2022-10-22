package typingsJapgolly.jpm

import org.scalajs.dom.DOMException
import org.scalajs.dom.IDBFactory
import org.scalajs.dom.IDBKeyRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sdkIndexedDbMod {
  
  // these interfaces are already provided by TypeScript
  trait IndexedImpl extends StObject {
    
    var DOMException: org.scalajs.dom.DOMException
    
    var IDBKeyRange: org.scalajs.dom.IDBKeyRange
    
    var indexedDB: IDBFactory
  }
  object IndexedImpl {
    
    inline def apply(DOMException: DOMException, IDBKeyRange: IDBKeyRange, indexedDB: IDBFactory): IndexedImpl = {
      val __obj = js.Dynamic.literal(DOMException = DOMException.asInstanceOf[js.Any], IDBKeyRange = IDBKeyRange.asInstanceOf[js.Any], indexedDB = indexedDB.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexedImpl]
    }
    
    extension [Self <: IndexedImpl](x: Self) {
      
      inline def setDOMException(value: DOMException): Self = StObject.set(x, "DOMException", value.asInstanceOf[js.Any])
      
      inline def setIDBKeyRange(value: IDBKeyRange): Self = StObject.set(x, "IDBKeyRange", value.asInstanceOf[js.Any])
      
      inline def setIndexedDB(value: IDBFactory): Self = StObject.set(x, "indexedDB", value.asInstanceOf[js.Any])
    }
  }
}
