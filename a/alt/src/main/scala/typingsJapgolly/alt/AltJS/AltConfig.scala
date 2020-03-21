package typingsJapgolly.alt.AltJS

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AltConfig extends js.Object {
  var batchingFunction: js.UndefOr[js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], Unit]] = js.undefined
  var deserialize: js.UndefOr[
    js.Function1[/* deserializeFn */ js.Function1[/* serialData */ String, js.Object], Unit]
  ] = js.undefined
  var dispatcher: js.UndefOr[js.Any] = js.undefined
  var serialize: js.UndefOr[js.Function1[/* serializeFn */ js.Function1[/* data */ js.Object, String], Unit]] = js.undefined
  var storeTransforms: js.UndefOr[js.Array[StateTransform]] = js.undefined
}

object AltConfig {
  @scala.inline
  def apply(
    batchingFunction: /* callback */ js.Function1[/* repeated */ js.Any, js.Any] => Callback = null,
    deserialize: /* deserializeFn */ js.Function1[/* serialData */ String, js.Object] => Callback = null,
    dispatcher: js.Any = null,
    serialize: /* serializeFn */ js.Function1[/* data */ js.Object, String] => Callback = null,
    storeTransforms: js.Array[StateTransform] = null
  ): AltConfig = {
    val __obj = js.Dynamic.literal()
    if (batchingFunction != null) __obj.updateDynamic("batchingFunction")(js.Any.fromFunction1((t0: /* callback */ js.Function1[/* repeated */ js.Any, js.Any]) => batchingFunction(t0).runNow()))
    if (deserialize != null) __obj.updateDynamic("deserialize")(js.Any.fromFunction1((t0: /* deserializeFn */ js.Function1[/* serialData */ java.lang.String, js.Object]) => deserialize(t0).runNow()))
    if (dispatcher != null) __obj.updateDynamic("dispatcher")(dispatcher.asInstanceOf[js.Any])
    if (serialize != null) __obj.updateDynamic("serialize")(js.Any.fromFunction1((t0: /* serializeFn */ js.Function1[/* data */ js.Object, java.lang.String]) => serialize(t0).runNow()))
    if (storeTransforms != null) __obj.updateDynamic("storeTransforms")(storeTransforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AltConfig]
  }
}

