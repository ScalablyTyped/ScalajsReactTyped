package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slice extends Widget_ {
  /**
    * A reference to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice.html#view)
    */
  var view: SceneView = js.native
  /**
    * The view model for this widget. This is a class that contains the properties and methods that control this widget's behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice.html#viewModel)
    */
  var viewModel: SliceViewModel = js.native
}

@JSGlobal("__esri.Slice")
@js.native
object Slice extends TopLevel[SliceConstructor]

