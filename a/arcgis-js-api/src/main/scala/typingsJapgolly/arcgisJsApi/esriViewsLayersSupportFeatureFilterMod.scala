package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.supportFeatureFilter
import typingsJapgolly.arcgisJsApi.esri.supportFeatureFilterConstructor
import typingsJapgolly.arcgisJsApi.esri.supportFeatureFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsLayersSupportFeatureFilterMod extends Shortcut {
  
  @JSImport("esri/views/layers/support/FeatureFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Object & supportFeatureFilterConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/layers/support/FeatureFilter", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with supportFeatureFilter {
    def this(properties: supportFeatureFilterProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & supportFeatureFilterConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViewsLayersSupportFeatureFilterMod.foo` */
  override def _to: js.Object & supportFeatureFilterConstructor = ^
}
