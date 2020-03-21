package typingsJapgolly.cesium

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cesium.mod.DataSource
import typingsJapgolly.cesium.mod.DataSourceCollection
import typingsJapgolly.cesium.mod.DataSourceDisplay.VisualizersCallback
import typingsJapgolly.cesium.mod.Scene
import typingsJapgolly.cesium.mod.Visualizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataSourceCollection extends js.Object {
  var dataSourceCollection: DataSourceCollection
  var scene: Scene
  var visualizersCallback: js.UndefOr[VisualizersCallback] = js.undefined
}

object AnonDataSourceCollection {
  @scala.inline
  def apply(
    dataSourceCollection: DataSourceCollection,
    scene: Scene,
    visualizersCallback: (/* scene */ Scene, /* dataSource */ DataSource) => CallbackTo[js.Array[Visualizer]] = null
  ): AnonDataSourceCollection = {
    val __obj = js.Dynamic.literal(dataSourceCollection = dataSourceCollection.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    if (visualizersCallback != null) __obj.updateDynamic("visualizersCallback")(js.Any.fromFunction2((t0: /* scene */ typingsJapgolly.cesium.mod.Scene, t1: /* dataSource */ typingsJapgolly.cesium.mod.DataSource) => visualizersCallback(t0, t1).runNow()))
    __obj.asInstanceOf[AnonDataSourceCollection]
  }
}

