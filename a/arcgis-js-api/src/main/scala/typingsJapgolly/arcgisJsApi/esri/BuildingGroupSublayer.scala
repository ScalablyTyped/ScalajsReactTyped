package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`building-group`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`hide-children`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.hide
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingGroupSublayer
  extends StObject
     with BuildingSublayer {
  
  /**
    * Indicates how the sublayer should display in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
    *
    * @default show
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingGroupSublayer.html#listMode)
    */
  var listMode: show | hide | `hide-children` = js.native
  
  /**
    * Loads all contained sublayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingGroupSublayer.html#loadAll)
    */
  def loadAll(): js.Promise[BuildingSceneLayer] = js.native
  
  /**
    * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of sublayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingGroupSublayer.html#sublayers)
    */
  val sublayers: Collection[BuildingGroupSublayer | BuildingComponentSublayer] = js.native
  
  val `type`: `building-group` = js.native
}
