package typingsJapgolly.jsreportCore.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentStore extends StObject {
  
  def collection(name: String): Collection
  
  def init(): js.Promise[Any]
  
  def internalCollection(name: String): Any
  
  def registerEntitySet(name: String, options: StringDictionary[Any]): Unit
  
  def registerEntityType(name: String, options: StringDictionary[Any]): Unit
}
object DocumentStore {
  
  inline def apply(
    collection: String => Collection,
    init: CallbackTo[js.Promise[Any]],
    internalCollection: String => Any,
    registerEntitySet: (String, StringDictionary[Any]) => Callback,
    registerEntityType: (String, StringDictionary[Any]) => Callback
  ): DocumentStore = {
    val __obj = js.Dynamic.literal(collection = js.Any.fromFunction1(collection), init = init.toJsFn, internalCollection = js.Any.fromFunction1(internalCollection), registerEntitySet = js.Any.fromFunction2((t0: String, t1: StringDictionary[Any]) => (registerEntitySet(t0, t1)).runNow()), registerEntityType = js.Any.fromFunction2((t0: String, t1: StringDictionary[Any]) => (registerEntityType(t0, t1)).runNow()))
    __obj.asInstanceOf[DocumentStore]
  }
  
  extension [Self <: DocumentStore](x: Self) {
    
    inline def setCollection(value: String => Collection): Self = StObject.set(x, "collection", js.Any.fromFunction1(value))
    
    inline def setInit(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setInternalCollection(value: String => Any): Self = StObject.set(x, "internalCollection", js.Any.fromFunction1(value))
    
    inline def setRegisterEntitySet(value: (String, StringDictionary[Any]) => Callback): Self = StObject.set(x, "registerEntitySet", js.Any.fromFunction2((t0: String, t1: StringDictionary[Any]) => (value(t0, t1)).runNow()))
    
    inline def setRegisterEntityType(value: (String, StringDictionary[Any]) => Callback): Self = StObject.set(x, "registerEntityType", js.Any.fromFunction2((t0: String, t1: StringDictionary[Any]) => (value(t0, t1)).runNow()))
  }
}
