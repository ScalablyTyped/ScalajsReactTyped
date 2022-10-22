package typingsJapgolly.firebaseFirestore

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.IDBFactory
import org.scalajs.dom.Storage
import typingsJapgolly.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcUtilTypesMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/util/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/util/types", "BATCHID_UNKNOWN")
  @js.native
  val BATCHID_UNKNOWN: /* -1 */ Double = js.native
  
  inline def isNegativeZero(value: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNegativeZero")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNullOrUndefined(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullOrUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSafeInteger(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSafeInteger")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait DocumentLike extends StObject {
    
    def addEventListener(`type`: String, listener: EventListener): Unit
    
    def removeEventListener(`type`: String, listener: EventListener): Unit
    
    val visibilityState: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VisibilityState */ Any
  }
  object DocumentLike {
    
    inline def apply(
      addEventListener: (String, EventListener) => Callback,
      removeEventListener: (String, EventListener) => Callback,
      visibilityState: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VisibilityState */ Any
    ): DocumentLike = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2((t0: String, t1: EventListener) => (addEventListener(t0, t1)).runNow()), removeEventListener = js.Any.fromFunction2((t0: String, t1: EventListener) => (removeEventListener(t0, t1)).runNow()), visibilityState = visibilityState.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentLike]
    }
    
    extension [Self <: DocumentLike](x: Self) {
      
      inline def setAddEventListener(value: (String, EventListener) => Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: String, t1: EventListener) => (value(t0, t1)).runNow()))
      
      inline def setRemoveEventListener(value: (String, EventListener) => Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: String, t1: EventListener) => (value(t0, t1)).runNow()))
      
      inline def setVisibilityState(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VisibilityState */ Any
      ): Self = StObject.set(x, "visibilityState", value.asInstanceOf[js.Any])
    }
  }
  
  type StringMap = StringDictionary[String]
  
  trait WindowLike extends StObject {
    
    def addEventListener(`type`: String, listener: EventListener): Unit
    
    val indexedDB: IDBFactory | Null
    
    val localStorage: Storage
    
    def removeEventListener(`type`: String, listener: EventListener): Unit
  }
  object WindowLike {
    
    inline def apply(
      addEventListener: (String, EventListener) => Callback,
      localStorage: Storage,
      removeEventListener: (String, EventListener) => Callback
    ): WindowLike = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2((t0: String, t1: EventListener) => (addEventListener(t0, t1)).runNow()), localStorage = localStorage.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2((t0: String, t1: EventListener) => (removeEventListener(t0, t1)).runNow()), indexedDB = null)
      __obj.asInstanceOf[WindowLike]
    }
    
    extension [Self <: WindowLike](x: Self) {
      
      inline def setAddEventListener(value: (String, EventListener) => Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: String, t1: EventListener) => (value(t0, t1)).runNow()))
      
      inline def setIndexedDB(value: IDBFactory): Self = StObject.set(x, "indexedDB", value.asInstanceOf[js.Any])
      
      inline def setIndexedDBNull: Self = StObject.set(x, "indexedDB", null)
      
      inline def setLocalStorage(value: Storage): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
      
      inline def setRemoveEventListener(value: (String, EventListener) => Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: String, t1: EventListener) => (value(t0, t1)).runNow()))
    }
  }
}
