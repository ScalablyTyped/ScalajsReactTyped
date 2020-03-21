package typingsJapgolly.firebaseFirestore.indexNodeMod.firebaseAppTypesAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseFirestoreTypes.mod.FirebaseFirestore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  var firestore: js.UndefOr[js.Function0[FirebaseFirestore]] = js.undefined
}

object FirebaseApp {
  @scala.inline
  def apply(firestore: js.UndefOr[CallbackTo[FirebaseFirestore]] = js.undefined): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    firestore.foreach(p => __obj.updateDynamic("firestore")(p.toJsFn))
    __obj.asInstanceOf[FirebaseApp]
  }
}

