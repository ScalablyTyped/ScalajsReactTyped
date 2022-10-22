package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.FeatureFilter
import typingsJapgolly.arcgisJsApi.esri.FeatureFilterConstructor
import typingsJapgolly.arcgisJsApi.esri.FeatureFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportFeatureFilterMod extends Shortcut {
  
  @JSImport("esri/layers/support/FeatureFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FeatureFilterConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/FeatureFilter", JSImport.Namespace)
  @js.native
  /**
    * This class defines parameters for setting a client-side filter on a [featureEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#featureEffect) or [layer view](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#filter).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html)
    */
  open class Class ()
    extends StObject
       with FeatureFilter {
    def this(properties: FeatureFilterProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & FeatureFilterConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportFeatureFilterMod.foo` */
  override def _to: js.Object & FeatureFilterConstructor = ^
}
