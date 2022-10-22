package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.AggregateField
import typingsJapgolly.arcgisJsApi.esri.AggregateFieldConstructor
import typingsJapgolly.arcgisJsApi.esri.AggregateFieldProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportAggregateFieldMod extends Shortcut {
  
  @JSImport("esri/layers/support/AggregateField", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AggregateFieldConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/AggregateField", JSImport.Namespace)
  @js.native
  /**
    * Defines the aggregate fields used in a layer visualized with [binning](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionBinning.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AggregateField.html)
    */
  open class Class ()
    extends StObject
       with AggregateField {
    def this(properties: AggregateFieldProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & AggregateFieldConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportAggregateFieldMod.foo` */
  override def _to: js.Object & AggregateFieldConstructor = ^
}
