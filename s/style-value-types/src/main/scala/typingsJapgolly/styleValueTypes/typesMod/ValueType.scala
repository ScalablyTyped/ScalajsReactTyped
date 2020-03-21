package typingsJapgolly.styleValueTypes.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueType extends js.Object {
  var createTransformer: js.UndefOr[js.Function1[/* template */ String, Transformer]] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var getAnimatableNone: js.UndefOr[js.Function1[/* v */ js.Any, _]] = js.undefined
  var transform: js.UndefOr[Transformer] = js.undefined
  def parse(v: js.Any): js.Any
  def test(v: js.Any): Boolean
}

object ValueType {
  @scala.inline
  def apply(
    parse: js.Any => CallbackTo[js.Any],
    test: js.Any => CallbackTo[Boolean],
    createTransformer: /* template */ String => CallbackTo[Transformer] = null,
    default: js.Any = null,
    getAnimatableNone: /* v */ js.Any => CallbackTo[js.Any] = null,
    transform: /* v */ js.Any => CallbackTo[js.Any] = null
  ): ValueType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: js.Any) => parse(t0).runNow()))
    __obj.updateDynamic("test")(js.Any.fromFunction1((t0: js.Any) => test(t0).runNow()))
    if (createTransformer != null) __obj.updateDynamic("createTransformer")(js.Any.fromFunction1((t0: /* template */ java.lang.String) => createTransformer(t0).runNow()))
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (getAnimatableNone != null) __obj.updateDynamic("getAnimatableNone")(js.Any.fromFunction1((t0: /* v */ js.Any) => getAnimatableNone(t0).runNow()))
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1((t0: /* v */ js.Any) => transform(t0).runNow()))
    __obj.asInstanceOf[ValueType]
  }
}

