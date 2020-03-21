package typingsJapgolly.angular.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// SCEDelegateService
// see http://docs.angularjs.org/api/ng.$sceDelegate
///////////////////////////////////////////////////////////////////////////
trait ISCEDelegateService extends js.Object {
  def getTrusted(`type`: String, mayBeTrusted: js.Any): js.Any
  def trustAs(`type`: String, value: js.Any): js.Any
  def valueOf(value: js.Any): js.Any
}

object ISCEDelegateService {
  @scala.inline
  def apply(
    getTrusted: (String, js.Any) => CallbackTo[js.Any],
    trustAs: (String, js.Any) => CallbackTo[js.Any],
    valueOf: js.Any => CallbackTo[js.Any]
  ): ISCEDelegateService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getTrusted")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => getTrusted(t0, t1).runNow()))
    __obj.updateDynamic("trustAs")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => trustAs(t0, t1).runNow()))
    __obj.updateDynamic("valueOf")(js.Any.fromFunction1((t0: js.Any) => valueOf(t0).runNow()))
    __obj.asInstanceOf[ISCEDelegateService]
  }
}

