package typingsJapgolly.styletronReact.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FC
import typingsJapgolly.styletronReact.AnonStackIndex
import typingsJapgolly.styletronStandard.mod.StandardEngine
import typingsJapgolly.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Styletron extends js.Object {
  var base: StyletronBase
  var debug: js.UndefOr[AnonStackIndex] = js.undefined
  var driver: StyletronDriver
  var getInitialStyle: StyletronGetInitialStyle
  var reducers: js.Array[ReducerContainer]
  var wrapper: StyletronWrapper
}

object Styletron {
  @scala.inline
  def apply(
    base: StyletronBase,
    driver: (/* style */ StyleObject, /* styletron */ StandardEngine) => CallbackTo[String],
    getInitialStyle: CallbackTo[StyleObject],
    reducers: js.Array[ReducerContainer],
    wrapper: /* fc */ FC[js.Any] => CallbackTo[ComponentType[js.Any]],
    debug: AnonStackIndex = null
  ): Styletron = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], reducers = reducers.asInstanceOf[js.Any])
    __obj.updateDynamic("driver")(js.Any.fromFunction2((t0: /* style */ typingsJapgolly.styletronStandard.mod.StyleObject, t1: /* styletron */ typingsJapgolly.styletronStandard.mod.StandardEngine) => driver(t0, t1).runNow()))
    __obj.updateDynamic("getInitialStyle")(getInitialStyle.toJsFn)
    __obj.updateDynamic("wrapper")(js.Any.fromFunction1((t0: /* fc */ typingsJapgolly.react.mod.FC[js.Any]) => wrapper(t0).runNow()))
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    __obj.asInstanceOf[Styletron]
  }
}

