package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.LayerOptions
import typingsJapgolly.arcgisJsApi.esri.LayerOptionsConstructor
import typingsJapgolly.arcgisJsApi.esri.LayerOptionsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriPopupLayerOptionsMod extends Shortcut {
  
  @JSImport("esri/popup/LayerOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LayerOptionsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/LayerOptions", JSImport.Namespace)
  @js.native
  /**
    * The `LayerOptions` class defines additional options that can be defined for a layer's [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-LayerOptions.html)
    */
  open class Class ()
    extends StObject
       with LayerOptions {
    def this(properties: LayerOptionsProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & LayerOptionsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriPopupLayerOptionsMod.foo` */
  override def _to: js.Object & LayerOptionsConstructor = ^
}
