package typingsJapgolly.styletronReact.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FC
import typingsJapgolly.styletronStandard.mod.StandardEngine
import typingsJapgolly.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStyledOptions extends js.Object {
  var driver: StyletronDriver
  var getInitialStyle: StyletronGetInitialStyle
  var wrapper: StyletronWrapper
}

object CreateStyledOptions {
  @scala.inline
  def apply(
    driver: (/* style */ StyleObject, /* styletron */ StandardEngine) => CallbackTo[String],
    getInitialStyle: CallbackTo[StyleObject],
    wrapper: /* fc */ FC[js.Any] => CallbackTo[ComponentType[js.Any]]
  ): CreateStyledOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("driver")(js.Any.fromFunction2((t0: /* style */ typingsJapgolly.styletronStandard.mod.StyleObject, t1: /* styletron */ typingsJapgolly.styletronStandard.mod.StandardEngine) => driver(t0, t1).runNow()))
    __obj.updateDynamic("getInitialStyle")(getInitialStyle.toJsFn)
    __obj.updateDynamic("wrapper")(js.Any.fromFunction1((t0: /* fc */ typingsJapgolly.react.mod.FC[js.Any]) => wrapper(t0).runNow()))
    __obj.asInstanceOf[CreateStyledOptions]
  }
}

