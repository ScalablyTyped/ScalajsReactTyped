package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.WaterSymbol3DLayer
import typingsJapgolly.arcgisJsApi.esri.WaterSymbol3DLayerConstructor
import typingsJapgolly.arcgisJsApi.esri.WaterSymbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSymbolsWaterSymbol3DLayerMod extends Shortcut {
  
  @JSImport("esri/symbols/WaterSymbol3DLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & WaterSymbol3DLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/WaterSymbol3DLayer", JSImport.Namespace)
  @js.native
  /**
    * WaterSymbol3DLayer is used to render [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometries as realistic, animated water surfaces, therefore it can only be used inside a [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html)
    */
  open class Class ()
    extends StObject
       with WaterSymbol3DLayer {
    def this(properties: WaterSymbol3DLayerProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & WaterSymbol3DLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriSymbolsWaterSymbol3DLayerMod.foo` */
  override def _to: js.Object & WaterSymbol3DLayerConstructor = ^
}
