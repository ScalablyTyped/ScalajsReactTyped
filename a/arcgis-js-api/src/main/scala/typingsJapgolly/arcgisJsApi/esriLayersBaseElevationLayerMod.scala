package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.BaseElevationLayer
import typingsJapgolly.arcgisJsApi.esri.BaseElevationLayerConstructor
import typingsJapgolly.arcgisJsApi.esri.BaseElevationLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersBaseElevationLayerMod extends Shortcut {
  
  @JSImport("esri/layers/BaseElevationLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BaseElevationLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/BaseElevationLayer", JSImport.Namespace)
  @js.native
  /**
    * BaseElevationLayer is intended to be extended for creating custom elevation layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html)
    */
  open class Class ()
    extends StObject
       with BaseElevationLayer {
    def this(properties: BaseElevationLayerProperties) = this()
  }
  
  type _To = js.Object & BaseElevationLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersBaseElevationLayerMod.foo` */
  override def _to: js.Object & BaseElevationLayerConstructor = ^
}
