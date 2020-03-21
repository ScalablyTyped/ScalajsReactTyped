package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompassViewModelProperties extends GoToProperties {
  /**
    * The orientation axes (x, y, z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass-CompassViewModel.html#orientation)
    *
    * @default { x: 0, y: 0, z: 0 }
    */
  var orientation: js.UndefOr[js.Any] = js.undefined
  /**
    * The view in which the Compass obtains and indicates camera [heading](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading), using a (SceneView) or rotation (MapView).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass-CompassViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}

object CompassViewModelProperties {
  @scala.inline
  def apply(
    goToOverride: (/* view */ MapView | SceneView, /* goToParameters */ js.Any) => Callback = null,
    orientation: js.Any = null,
    view: MapViewProperties | SceneViewProperties = null
  ): CompassViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (goToOverride != null) __obj.updateDynamic("goToOverride")(js.Any.fromFunction2((t0: /* view */ typingsJapgolly.arcgisJsApi.esri.MapView | typingsJapgolly.arcgisJsApi.esri.SceneView, t1: /* goToParameters */ js.Any) => goToOverride(t0, t1).runNow()))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassViewModelProperties]
  }
}

