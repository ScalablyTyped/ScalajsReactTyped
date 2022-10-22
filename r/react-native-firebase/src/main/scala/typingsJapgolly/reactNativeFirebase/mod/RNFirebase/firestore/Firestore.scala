package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNativeFirebase.mod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Firestore extends StObject {
  
  val app: App
  
  def batch(): WriteBatch
  
  def collection(collectionPath: String): CollectionReference
  
  def disableNetwork(): js.Promise[Unit]
  
  def doc(documentPath: String): DocumentReference
  
  def enableNetwork(): js.Promise[Unit]
  
  def enablePersistence(enabled: Boolean): js.Promise[Unit]
  
  def runTransaction(updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[Any]]): js.Promise[Any]
  
  def settings(settings: Settings): js.Promise[Unit]
}
object Firestore {
  
  inline def apply(
    app: App,
    batch: CallbackTo[WriteBatch],
    collection: String => CollectionReference,
    disableNetwork: CallbackTo[js.Promise[Unit]],
    doc: String => DocumentReference,
    enableNetwork: CallbackTo[js.Promise[Unit]],
    enablePersistence: Boolean => js.Promise[Unit],
    runTransaction: js.Function1[/* transaction */ Transaction, js.Promise[Any]] => js.Promise[Any],
    settings: Settings => js.Promise[Unit]
  ): Firestore = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], batch = batch.toJsFn, collection = js.Any.fromFunction1(collection), disableNetwork = disableNetwork.toJsFn, doc = js.Any.fromFunction1(doc), enableNetwork = enableNetwork.toJsFn, enablePersistence = js.Any.fromFunction1(enablePersistence), runTransaction = js.Any.fromFunction1(runTransaction), settings = js.Any.fromFunction1(settings))
    __obj.asInstanceOf[Firestore]
  }
  
  extension [Self <: Firestore](x: Self) {
    
    inline def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setBatch(value: CallbackTo[WriteBatch]): Self = StObject.set(x, "batch", value.toJsFn)
    
    inline def setCollection(value: String => CollectionReference): Self = StObject.set(x, "collection", js.Any.fromFunction1(value))
    
    inline def setDisableNetwork(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "disableNetwork", value.toJsFn)
    
    inline def setDoc(value: String => DocumentReference): Self = StObject.set(x, "doc", js.Any.fromFunction1(value))
    
    inline def setEnableNetwork(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "enableNetwork", value.toJsFn)
    
    inline def setEnablePersistence(value: Boolean => js.Promise[Unit]): Self = StObject.set(x, "enablePersistence", js.Any.fromFunction1(value))
    
    inline def setRunTransaction(value: js.Function1[/* transaction */ Transaction, js.Promise[Any]] => js.Promise[Any]): Self = StObject.set(x, "runTransaction", js.Any.fromFunction1(value))
    
    inline def setSettings(value: Settings => js.Promise[Unit]): Self = StObject.set(x, "settings", js.Any.fromFunction1(value))
  }
}
