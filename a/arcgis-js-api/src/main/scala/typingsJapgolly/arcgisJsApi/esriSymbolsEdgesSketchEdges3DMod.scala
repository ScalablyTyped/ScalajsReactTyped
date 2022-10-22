package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.SketchEdges3D
import typingsJapgolly.arcgisJsApi.esri.SketchEdges3DConstructor
import typingsJapgolly.arcgisJsApi.esri.SketchEdges3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSymbolsEdgesSketchEdges3DMod extends Shortcut {
  
  @JSImport("esri/symbols/edges/SketchEdges3D", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SketchEdges3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/edges/SketchEdges3D", JSImport.Namespace)
  @js.native
  /**
    * SketchEdges3D is a symbol type that visualizes edges of [3D Object SceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), extruded polygons or mesh geometries with a sketched line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-SketchEdges3D.html)
    */
  open class Class ()
    extends StObject
       with SketchEdges3D {
    def this(properties: SketchEdges3DProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & SketchEdges3DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriSymbolsEdgesSketchEdges3DMod.foo` */
  override def _to: js.Object & SketchEdges3DConstructor = ^
}
