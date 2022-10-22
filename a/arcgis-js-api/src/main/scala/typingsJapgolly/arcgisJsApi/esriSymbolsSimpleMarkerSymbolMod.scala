package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.SimpleMarkerSymbol
import typingsJapgolly.arcgisJsApi.esri.SimpleMarkerSymbolConstructor
import typingsJapgolly.arcgisJsApi.esri.SimpleMarkerSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSymbolsSimpleMarkerSymbolMod extends Shortcut {
  
  @JSImport("esri/symbols/SimpleMarkerSymbol", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SimpleMarkerSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/SimpleMarkerSymbol", JSImport.Namespace)
  @js.native
  /**
    * SimpleMarkerSymbol is used for rendering 2D [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries with a simple shape and [color](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#color) in either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html)
    */
  open class Class ()
    extends StObject
       with SimpleMarkerSymbol {
    def this(properties: SimpleMarkerSymbolProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & SimpleMarkerSymbolConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriSymbolsSimpleMarkerSymbolMod.foo` */
  override def _to: js.Object & SimpleMarkerSymbolConstructor = ^
}
