package typingsJapgolly.reactCssThemr.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactCssThemr.AnonTheme
import typingsJapgolly.reactCssThemr.reactCssThemrBooleans.`false`
import typingsJapgolly.reactCssThemr.reactCssThemrStrings.deeply
import typingsJapgolly.reactCssThemr.reactCssThemrStrings.softly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemrOptions extends js.Object {
  /** @default "deeply" */
  var composeTheme: js.UndefOr[deeply | softly | `false`] = js.undefined
  //currently there's no way to lift decorated component's generic type argument (P) to upper decorator
  //that's why just {}
  var mapThemrProps: js.UndefOr[TMapThemrProps[js.Object]] = js.undefined
}

object IThemrOptions {
  @scala.inline
  def apply(
    composeTheme: deeply | softly | `false` = null,
    mapThemrProps: (js.Object, /* theme */ TReactCSSThemrTheme) => CallbackTo[js.Object with AnonTheme] = null
  ): IThemrOptions = {
    val __obj = js.Dynamic.literal()
    if (composeTheme != null) __obj.updateDynamic("composeTheme")(composeTheme.asInstanceOf[js.Any])
    if (mapThemrProps != null) __obj.updateDynamic("mapThemrProps")(js.Any.fromFunction2((t0: js.Object, t1: /* theme */ typingsJapgolly.reactCssThemr.mod.TReactCSSThemrTheme) => mapThemrProps(t0, t1).runNow()))
    __obj.asInstanceOf[IThemrOptions]
  }
}

