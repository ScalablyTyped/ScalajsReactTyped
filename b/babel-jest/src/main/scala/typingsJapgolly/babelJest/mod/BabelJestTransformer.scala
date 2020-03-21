package typingsJapgolly.babelJest.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.babelJest.babelJestBooleans.`true`
import typingsJapgolly.std.TransformStreamDefaultController
import typingsJapgolly.std.Transformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BabelJestTransformer
  extends Transformer[js.Any, js.Any] {
  var canInstrument: `true`
}

object BabelJestTransformer {
  @scala.inline
  def apply(
    canInstrument: `true`,
    flush: /* controller */ TransformStreamDefaultController[js.Any] => CallbackTo[Unit | js.Thenable[Unit]] = null,
    readableType: js.UndefOr[scala.Nothing] = js.undefined,
    start: /* controller */ TransformStreamDefaultController[js.Any] => CallbackTo[Unit | js.Thenable[Unit]] = null,
    transform: (js.Any, /* controller */ TransformStreamDefaultController[js.Any]) => CallbackTo[Unit | js.Thenable[Unit]] = null,
    writableType: js.UndefOr[scala.Nothing] = js.undefined
  ): BabelJestTransformer = {
    val __obj = js.Dynamic.literal(canInstrument = canInstrument.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(js.Any.fromFunction1((t0: /* controller */ typingsJapgolly.std.TransformStreamDefaultController[js.Any]) => flush(t0).runNow()))
    if (!js.isUndefined(readableType)) __obj.updateDynamic("readableType")(readableType.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1((t0: /* controller */ typingsJapgolly.std.TransformStreamDefaultController[js.Any]) => start(t0).runNow()))
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction2((t0: js.Any, t1: /* controller */ typingsJapgolly.std.TransformStreamDefaultController[js.Any]) => transform(t0, t1).runNow()))
    if (!js.isUndefined(writableType)) __obj.updateDynamic("writableType")(writableType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BabelJestTransformer]
  }
}

