package typingsJapgolly.oracleOraclejet.ojrouterMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.AnonHasChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterState_ extends js.Object {
  var canEnter: js.Function0[Boolean | js.Promise[Boolean]]
  var canExit: js.Function0[Boolean | js.Promise[Boolean]]
  var enter: js.Function0[js.Promise[Unit] | Unit]
  var exit: js.Function0[js.Promise[Unit] | Unit]
  val id: String
  var label: js.UndefOr[String] = js.undefined
  var parameters: js.Object
  var title: String | js.Function0[js.UndefOr[String]]
  var value: js.Any
  // constructor(id: string, options?: RouterState.ConfigOptions, router?: Router);
  def go(): js.Promise[AnonHasChanged]
  def isCurrent(): Boolean
}

object RouterState_ {
  @scala.inline
  def apply(
    canEnter: CallbackTo[Boolean | js.Promise[Boolean]],
    canExit: CallbackTo[Boolean | js.Promise[Boolean]],
    enter: CallbackTo[js.Promise[Unit] | Unit],
    exit: CallbackTo[js.Promise[Unit] | Unit],
    go: CallbackTo[js.Promise[AnonHasChanged]],
    id: String,
    isCurrent: CallbackTo[Boolean],
    parameters: js.Object,
    title: String | js.Function0[js.UndefOr[String]],
    value: js.Any,
    label: String = null
  ): RouterState_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("canEnter")(canEnter.toJsFn)
    __obj.updateDynamic("canExit")(canExit.toJsFn)
    __obj.updateDynamic("enter")(enter.toJsFn)
    __obj.updateDynamic("exit")(exit.toJsFn)
    __obj.updateDynamic("go")(go.toJsFn)
    __obj.updateDynamic("isCurrent")(isCurrent.toJsFn)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterState_]
  }
}

