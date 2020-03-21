package typingsJapgolly.firebaseFunctions.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseFunctionsTypes.mod.FirebaseFunctions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  var functions: js.UndefOr[js.Function1[/* region */ js.UndefOr[String], FirebaseFunctions]] = js.undefined
}

object FirebaseApp {
  @scala.inline
  def apply(functions: /* region */ js.UndefOr[String] => CallbackTo[FirebaseFunctions] = null): FirebaseApp = {
    val __obj = js.Dynamic.literal()
    if (functions != null) __obj.updateDynamic("functions")(js.Any.fromFunction1((t0: /* region */ js.UndefOr[java.lang.String]) => functions(t0).runNow()))
    __obj.asInstanceOf[FirebaseApp]
  }
}

