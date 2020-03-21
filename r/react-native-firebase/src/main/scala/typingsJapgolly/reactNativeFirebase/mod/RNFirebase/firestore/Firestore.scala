package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNativeFirebase.mod.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Firestore extends js.Object {
  val app: App
  def batch(): WriteBatch
  def collection(collectionPath: String): CollectionReference
  def disableNetwork(): js.Promise[Unit]
  def doc(documentPath: String): DocumentReference
  def enableNetwork(): js.Promise[Unit]
  def enablePersistence(enabled: Boolean): js.Promise[Unit]
  def runTransaction(updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[_]]): js.Promise[_]
  def settings(settings: Settings): js.Promise[Unit]
}

object Firestore {
  @scala.inline
  def apply(
    app: App,
    batch: CallbackTo[WriteBatch],
    collection: String => CallbackTo[CollectionReference],
    disableNetwork: CallbackTo[js.Promise[Unit]],
    doc: String => CallbackTo[DocumentReference],
    enableNetwork: CallbackTo[js.Promise[Unit]],
    enablePersistence: Boolean => CallbackTo[js.Promise[Unit]],
    runTransaction: js.Function1[/* transaction */ Transaction, js.Promise[js.Any]] => CallbackTo[js.Promise[js.Any]],
    settings: Settings => CallbackTo[js.Promise[Unit]]
  ): Firestore = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.updateDynamic("batch")(batch.toJsFn)
    __obj.updateDynamic("collection")(js.Any.fromFunction1((t0: java.lang.String) => collection(t0).runNow()))
    __obj.updateDynamic("disableNetwork")(disableNetwork.toJsFn)
    __obj.updateDynamic("doc")(js.Any.fromFunction1((t0: java.lang.String) => doc(t0).runNow()))
    __obj.updateDynamic("enableNetwork")(enableNetwork.toJsFn)
    __obj.updateDynamic("enablePersistence")(js.Any.fromFunction1((t0: scala.Boolean) => enablePersistence(t0).runNow()))
    __obj.updateDynamic("runTransaction")(js.Any.fromFunction1((t0: js.Function1[
  /* transaction */ typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Transaction, 
  js.Promise[js.Any]]) => runTransaction(t0).runNow()))
    __obj.updateDynamic("settings")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Settings) => settings(t0).runNow()))
    __obj.asInstanceOf[Firestore]
  }
}

