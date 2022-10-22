package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.BuildingGroupSublayer
import typingsJapgolly.arcgisJsApi.esri.BuildingGroupSublayerConstructor
import typingsJapgolly.arcgisJsApi.esri.BuildingGroupSublayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersBuildingSublayersBuildingGroupSublayerMod extends Shortcut {
  
  @JSImport("esri/layers/buildingSublayers/BuildingGroupSublayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BuildingGroupSublayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/buildingSublayers/BuildingGroupSublayer", JSImport.Namespace)
  @js.native
  /**
    * Hierarchical group of [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) sublayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingGroupSublayer.html)
    */
  open class Class ()
    extends StObject
       with BuildingGroupSublayer {
    def this(properties: BuildingGroupSublayerProperties) = this()
  }
  
  type _To = js.Object & BuildingGroupSublayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersBuildingSublayersBuildingGroupSublayerMod.foo` */
  override def _to: js.Object & BuildingGroupSublayerConstructor = ^
}
