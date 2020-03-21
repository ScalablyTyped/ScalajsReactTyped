package typingsJapgolly.reactCssThemr

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactCssThemr.mod.TMapThemrProps
import typingsJapgolly.reactCssThemr.mod.TReactCSSThemrTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMapThemrProps[P] extends js.Object {
  var mapThemrProps: js.UndefOr[TMapThemrProps[P]] = js.undefined
}

object AnonMapThemrProps {
  @scala.inline
  def apply[P](mapThemrProps: (P, /* theme */ TReactCSSThemrTheme) => CallbackTo[P with AnonTheme] = null): AnonMapThemrProps[P] = {
    val __obj = js.Dynamic.literal()
    if (mapThemrProps != null) __obj.updateDynamic("mapThemrProps")(js.Any.fromFunction2((t0: P, t1: /* theme */ typingsJapgolly.reactCssThemr.mod.TReactCSSThemrTheme) => mapThemrProps(t0, t1).runNow()))
    __obj.asInstanceOf[AnonMapThemrProps[P]]
  }
}

