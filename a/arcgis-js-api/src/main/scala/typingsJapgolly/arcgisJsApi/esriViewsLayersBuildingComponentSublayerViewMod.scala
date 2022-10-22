package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.BuildingComponentSublayerView
import typingsJapgolly.arcgisJsApi.esri.BuildingComponentSublayerViewConstructor
import typingsJapgolly.arcgisJsApi.esri.BuildingComponentSublayerViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsLayersBuildingComponentSublayerViewMod extends Shortcut {
  
  @JSImport("esri/views/layers/BuildingComponentSublayerView", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BuildingComponentSublayerViewConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/layers/BuildingComponentSublayerView", JSImport.Namespace)
  @js.native
  /**
    * Represents the sublayer view of a [BuildingComponentSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-BuildingComponentSublayerView.html)
    */
  open class Class ()
    extends StObject
       with BuildingComponentSublayerView {
    def this(properties: BuildingComponentSublayerViewProperties) = this()
  }
  
  type _To = js.Object & BuildingComponentSublayerViewConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViewsLayersBuildingComponentSublayerViewMod.foo` */
  override def _to: js.Object & BuildingComponentSublayerViewConstructor = ^
}
