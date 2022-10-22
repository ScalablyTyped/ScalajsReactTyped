package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.BuildingFilter
import typingsJapgolly.arcgisJsApi.esri.BuildingFilterConstructor
import typingsJapgolly.arcgisJsApi.esri.BuildingFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportBuildingFilterMod extends Shortcut {
  
  @JSImport("esri/layers/support/BuildingFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BuildingFilterConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/BuildingFilter", JSImport.Namespace)
  @js.native
  /**
    * The `BuildingFilter` class defines a set of conditions that can be used to show or hide specific features of a [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) in the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html)
    */
  open class Class ()
    extends StObject
       with BuildingFilter {
    def this(properties: BuildingFilterProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & BuildingFilterConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportBuildingFilterMod.foo` */
  override def _to: js.Object & BuildingFilterConstructor = ^
}
