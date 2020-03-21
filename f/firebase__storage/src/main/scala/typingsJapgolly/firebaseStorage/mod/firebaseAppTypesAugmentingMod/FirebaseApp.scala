package typingsJapgolly.firebaseStorage.mod.firebaseAppTypesAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseStorageTypes.mod.FirebaseStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  var storage: js.UndefOr[js.Function1[/* storageBucket */ js.UndefOr[String], FirebaseStorage]] = js.undefined
}

object FirebaseApp {
  @scala.inline
  def apply(storage: /* storageBucket */ js.UndefOr[String] => CallbackTo[FirebaseStorage] = null): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    if (storage != null) __obj.updateDynamic("storage")(js.Any.fromFunction1((t0: /* storageBucket */ js.UndefOr[java.lang.String]) => storage(t0).runNow()))
    __obj.asInstanceOf[FirebaseApp]
  }
}

