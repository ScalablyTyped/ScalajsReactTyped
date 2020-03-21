package typingsJapgolly.firebaseDatabase

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseDatabase.queryMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofTESTACCESS extends js.Object {
  def forceRestClient(forceRestClient: Boolean): Unit
  def hijackHash(newHash: js.Function0[String]): js.Function0[Unit]
  def queryIdentifier(query: Query): String
}

object TypeofTESTACCESS {
  @scala.inline
  def apply(
    forceRestClient: Boolean => Callback,
    hijackHash: js.Function0[String] => CallbackTo[js.Function0[Unit]],
    queryIdentifier: Query => CallbackTo[String]
  ): TypeofTESTACCESS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forceRestClient")(js.Any.fromFunction1((t0: scala.Boolean) => forceRestClient(t0).runNow()))
    __obj.updateDynamic("hijackHash")(js.Any.fromFunction1((t0: js.Function0[java.lang.String]) => hijackHash(t0).runNow()))
    __obj.updateDynamic("queryIdentifier")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseDatabase.queryMod.Query) => queryIdentifier(t0).runNow()))
    __obj.asInstanceOf[TypeofTESTACCESS]
  }
}

