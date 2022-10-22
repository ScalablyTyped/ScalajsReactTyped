package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.BuildingComponentSublayer
import typingsJapgolly.arcgisJsApi.esri.BuildingComponentSublayerConstructor
import typingsJapgolly.arcgisJsApi.esri.BuildingComponentSublayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersBuildingSublayersBuildingComponentSublayerMod extends Shortcut {
  
  @JSImport("esri/layers/buildingSublayers/BuildingComponentSublayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BuildingComponentSublayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/buildingSublayers/BuildingComponentSublayer", JSImport.Namespace)
  @js.native
  /**
    * BuildingComponentSublayers contain 3D Object features representing building components like doors, pipes or AC units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html)
    */
  open class Class ()
    extends StObject
       with BuildingComponentSublayer {
    def this(properties: BuildingComponentSublayerProperties) = this()
  }
  
  type _To = js.Object & BuildingComponentSublayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersBuildingSublayersBuildingComponentSublayerMod.foo` */
  override def _to: js.Object & BuildingComponentSublayerConstructor = ^
}
