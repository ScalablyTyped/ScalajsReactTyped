package typingsJapgolly.reReselect.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reReselect.AnonKeySelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametricOptions[S, P, C, D] extends js.Object {
  var cacheObject: js.UndefOr[ICacheObject] = js.undefined
  var keySelector: js.UndefOr[ParametricKeySelector[S, P]] = js.undefined
  var keySelectorCreator: js.UndefOr[ParametricKeySelectorCreator[S, P, C, D]] = js.undefined
  var selectorCreator: js.UndefOr[CreateSelectorInstance] = js.undefined
}

object ParametricOptions {
  @scala.inline
  def apply[S, P, C, D](
    cacheObject: ICacheObject = null,
    keySelector: (S, P, /* repeated */ js.Any) => CallbackTo[js.Any] = null,
    keySelectorCreator: /* selectorInputs */ AnonKeySelector[D, C, S, P] => CallbackTo[ParametricKeySelector[S, P]] = null,
    selectorCreator: CreateSelectorInstance = null
  ): ParametricOptions[S, P, C, D] = {
    val __obj = js.Dynamic.literal()
    if (cacheObject != null) __obj.updateDynamic("cacheObject")(cacheObject.asInstanceOf[js.Any])
    if (keySelector != null) __obj.updateDynamic("keySelector")(js.Any.fromFunction3((t0: S, t1: P, t2: /* repeated */ js.Any) => keySelector(t0, t1, t2).runNow()))
    if (keySelectorCreator != null) __obj.updateDynamic("keySelectorCreator")(js.Any.fromFunction1((t0: /* selectorInputs */ typingsJapgolly.reReselect.AnonKeySelector[D, C, S, P]) => keySelectorCreator(t0).runNow()))
    if (selectorCreator != null) __obj.updateDynamic("selectorCreator")(selectorCreator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametricOptions[S, P, C, D]]
  }
}

