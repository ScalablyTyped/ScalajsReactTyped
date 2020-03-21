package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoToProperties extends js.Object {
  /**
    * This function provides the ability to override either the [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) methods.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GoTo.html#goToOverride)
    */
  var goToOverride: js.UndefOr[GoToOverride] = js.undefined
}

object GoToProperties {
  @scala.inline
  def apply(goToOverride: (/* view */ MapView | SceneView, /* goToParameters */ js.Any) => Callback = null): GoToProperties = {
    val __obj = js.Dynamic.literal()
    if (goToOverride != null) __obj.updateDynamic("goToOverride")(js.Any.fromFunction2((t0: /* view */ typingsJapgolly.arcgisJsApi.esri.MapView | typingsJapgolly.arcgisJsApi.esri.SceneView, t1: /* goToParameters */ js.Any) => goToOverride(t0, t1).runNow()))
    __obj.asInstanceOf[GoToProperties]
  }
}

