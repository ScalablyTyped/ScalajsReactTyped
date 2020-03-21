package typingsJapgolly.mapbox.mod._Global_.L.mapbox

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerOptions extends js.Object {
  var filter: js.UndefOr[FilterFunction] = js.undefined
  var sanitizer: js.UndefOr[js.Function1[/* template */ String, String]] = js.undefined
}

object FeatureLayerOptions {
  @scala.inline
  def apply(
    filter: /* feature */ js.Any => CallbackTo[Boolean] = null,
    sanitizer: /* template */ String => CallbackTo[String] = null
  ): FeatureLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* feature */ js.Any) => filter(t0).runNow()))
    if (sanitizer != null) __obj.updateDynamic("sanitizer")(js.Any.fromFunction1((t0: /* template */ java.lang.String) => sanitizer(t0).runNow()))
    __obj.asInstanceOf[FeatureLayerOptions]
  }
}

