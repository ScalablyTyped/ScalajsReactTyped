package typingsJapgolly.webfontloader.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /** This event is triggered when the fonts have rendered. */
  var active: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Setting this to false will disable html classes (defaults to true) */
  var classes: js.UndefOr[Boolean] = js.undefined
  /** Child window or iframes to manage fonts for */
  var context: js.UndefOr[js.Array[String]] = js.undefined
  var custom: js.UndefOr[Custom] = js.undefined
  /** Settings this to false will disable callbacks/events (defaults to true) */
  var events: js.UndefOr[Boolean] = js.undefined
  /** This event is triggered once for each font that renders. */
  var fontactive: js.UndefOr[js.Function2[/* familyName */ String, /* fvd */ String, Unit]] = js.undefined
  var fontdeck: js.UndefOr[Fontdeck] = js.undefined
  /** This event is triggered if the font can't be loaded. */
  var fontinactive: js.UndefOr[js.Function2[/* familyName */ String, /* fvd */ String, Unit]] = js.undefined
  /** This event is triggered once for each font that's loaded. */
  var fontloading: js.UndefOr[js.Function2[/* familyName */ String, /* fvd */ String, Unit]] = js.undefined
  var google: js.UndefOr[Google] = js.undefined
  /** This event is triggered when the browser does not support linked fonts or if none of the fonts could be loaded. */
  var inactive: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** This event is triggered when all fonts have been requested. */
  var loading: js.UndefOr[js.Function0[Unit]] = js.undefined
  var monotype: js.UndefOr[Monotype] = js.undefined
  /** Time (in ms) until the fontinactive callback will be triggered (defaults to 5000) */
  var timeout: js.UndefOr[Double] = js.undefined
  var typekit: js.UndefOr[Typekit] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    active: js.UndefOr[Callback] = js.undefined,
    classes: js.UndefOr[Boolean] = js.undefined,
    context: js.Array[String] = null,
    custom: Custom = null,
    events: js.UndefOr[Boolean] = js.undefined,
    fontactive: (/* familyName */ String, /* fvd */ String) => Callback = null,
    fontdeck: Fontdeck = null,
    fontinactive: (/* familyName */ String, /* fvd */ String) => Callback = null,
    fontloading: (/* familyName */ String, /* fvd */ String) => Callback = null,
    google: Google = null,
    inactive: js.UndefOr[Callback] = js.undefined,
    loading: js.UndefOr[Callback] = js.undefined,
    monotype: Monotype = null,
    timeout: Int | Double = null,
    typekit: Typekit = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    active.foreach(p => __obj.updateDynamic("active")(p.toJsFn))
    if (!js.isUndefined(classes)) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (!js.isUndefined(events)) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (fontactive != null) __obj.updateDynamic("fontactive")(js.Any.fromFunction2((t0: /* familyName */ java.lang.String, t1: /* fvd */ java.lang.String) => fontactive(t0, t1).runNow()))
    if (fontdeck != null) __obj.updateDynamic("fontdeck")(fontdeck.asInstanceOf[js.Any])
    if (fontinactive != null) __obj.updateDynamic("fontinactive")(js.Any.fromFunction2((t0: /* familyName */ java.lang.String, t1: /* fvd */ java.lang.String) => fontinactive(t0, t1).runNow()))
    if (fontloading != null) __obj.updateDynamic("fontloading")(js.Any.fromFunction2((t0: /* familyName */ java.lang.String, t1: /* fvd */ java.lang.String) => fontloading(t0, t1).runNow()))
    if (google != null) __obj.updateDynamic("google")(google.asInstanceOf[js.Any])
    inactive.foreach(p => __obj.updateDynamic("inactive")(p.toJsFn))
    loading.foreach(p => __obj.updateDynamic("loading")(p.toJsFn))
    if (monotype != null) __obj.updateDynamic("monotype")(monotype.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (typekit != null) __obj.updateDynamic("typekit")(typekit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

