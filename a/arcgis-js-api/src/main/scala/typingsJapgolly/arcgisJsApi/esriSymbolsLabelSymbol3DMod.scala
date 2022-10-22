package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.LabelSymbol3D
import typingsJapgolly.arcgisJsApi.esri.LabelSymbol3DConstructor
import typingsJapgolly.arcgisJsApi.esri.LabelSymbol3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSymbolsLabelSymbol3DMod extends Shortcut {
  
  @JSImport("esri/symbols/LabelSymbol3D", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LabelSymbol3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/LabelSymbol3D", JSImport.Namespace)
  @js.native
  /**
    * LabelSymbol3D is used to render labels for features from a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html)
    */
  open class Class ()
    extends StObject
       with LabelSymbol3D {
    def this(properties: LabelSymbol3DProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & LabelSymbol3DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriSymbolsLabelSymbol3DMod.foo` */
  override def _to: js.Object & LabelSymbol3DConstructor = ^
}
