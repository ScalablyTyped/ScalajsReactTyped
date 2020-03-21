package typingsJapgolly.firebaseDatabase.indexNodeMod.firebaseAppTypesAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseDatabaseTypes.mod.FirebaseDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  var database: js.UndefOr[js.Function0[FirebaseDatabase]] = js.undefined
}

object FirebaseApp {
  @scala.inline
  def apply(database: js.UndefOr[CallbackTo[FirebaseDatabase]] = js.undefined): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    database.foreach(p => __obj.updateDynamic("database")(p.toJsFn))
    __obj.asInstanceOf[FirebaseApp]
  }
}

