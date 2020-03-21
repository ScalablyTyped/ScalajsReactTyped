package typingsJapgolly.firebaseDatabase.mod.firebaseAppTypesAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseDatabaseTypes.mod.FirebaseDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  var database: js.UndefOr[js.Function1[/* databaseURL */ js.UndefOr[String], FirebaseDatabase]] = js.undefined
}

object FirebaseApp {
  @scala.inline
  def apply(database: /* databaseURL */ js.UndefOr[String] => CallbackTo[FirebaseDatabase] = null): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(js.Any.fromFunction1((t0: /* databaseURL */ js.UndefOr[java.lang.String]) => database(t0).runNow()))
    __obj.asInstanceOf[FirebaseApp]
  }
}

