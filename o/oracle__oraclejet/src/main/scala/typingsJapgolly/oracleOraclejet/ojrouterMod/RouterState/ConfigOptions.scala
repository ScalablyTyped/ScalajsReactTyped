package typingsJapgolly.oracleOraclejet.ojrouterMod.RouterState

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ConfigOptions extends js.Object {
  var canEnter: js.UndefOr[js.Function0[Boolean | js.Promise[Boolean]]] = js.undefined
  var canExit: js.UndefOr[js.Function0[Boolean | js.Promise[Boolean]]] = js.undefined
  var enter: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
  var exit: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
  var isDefault: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    canEnter: js.UndefOr[CallbackTo[Boolean | js.Promise[Boolean]]] = js.undefined,
    canExit: js.UndefOr[CallbackTo[Boolean | js.Promise[Boolean]]] = js.undefined,
    enter: js.UndefOr[CallbackTo[js.Promise[Unit] | Unit]] = js.undefined,
    exit: js.UndefOr[CallbackTo[js.Promise[Unit] | Unit]] = js.undefined,
    isDefault: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    value: js.Any = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    canEnter.foreach(p => __obj.updateDynamic("canEnter")(p.toJsFn))
    canExit.foreach(p => __obj.updateDynamic("canExit")(p.toJsFn))
    enter.foreach(p => __obj.updateDynamic("enter")(p.toJsFn))
    exit.foreach(p => __obj.updateDynamic("exit")(p.toJsFn))
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

