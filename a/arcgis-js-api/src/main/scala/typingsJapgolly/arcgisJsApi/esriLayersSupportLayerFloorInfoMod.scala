package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.LayerFloorInfo
import typingsJapgolly.arcgisJsApi.esri.LayerFloorInfoConstructor
import typingsJapgolly.arcgisJsApi.esri.LayerFloorInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportLayerFloorInfoMod extends Shortcut {
  
  @JSImport("esri/layers/support/LayerFloorInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LayerFloorInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/LayerFloorInfo", JSImport.Namespace)
  @js.native
  /**
    * LayerFloorInfo contains properties that allow a layer to be floor-aware.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LayerFloorInfo.html)
    */
  open class Class ()
    extends StObject
       with LayerFloorInfo {
    def this(properties: LayerFloorInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & LayerFloorInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportLayerFloorInfoMod.foo` */
  override def _to: js.Object & LayerFloorInfoConstructor = ^
}
