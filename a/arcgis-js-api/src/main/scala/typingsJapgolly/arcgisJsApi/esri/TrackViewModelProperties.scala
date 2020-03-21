package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackViewModelProperties
  extends GeolocationPositioningProperties
     with GoToProperties

object TrackViewModelProperties {
  @scala.inline
  def apply(
    geolocationOptions: js.Any = null,
    goToLocationEnabled: js.UndefOr[Boolean] = js.undefined,
    goToOverride: (/* view */ MapView | SceneView, /* goToParameters */ js.Any) => Callback = null,
    graphic: GraphicProperties = null,
    scale: Int | Double = null,
    view: MapViewProperties | SceneViewProperties = null
  ): TrackViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (geolocationOptions != null) __obj.updateDynamic("geolocationOptions")(geolocationOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(goToLocationEnabled)) __obj.updateDynamic("goToLocationEnabled")(goToLocationEnabled.asInstanceOf[js.Any])
    if (goToOverride != null) __obj.updateDynamic("goToOverride")(js.Any.fromFunction2((t0: /* view */ typingsJapgolly.arcgisJsApi.esri.MapView | typingsJapgolly.arcgisJsApi.esri.SceneView, t1: /* goToParameters */ js.Any) => goToOverride(t0, t1).runNow()))
    if (graphic != null) __obj.updateDynamic("graphic")(graphic.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackViewModelProperties]
  }
}

