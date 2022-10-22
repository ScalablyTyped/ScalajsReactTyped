package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.geotriggersInfoFeatureFilter
import typingsJapgolly.arcgisJsApi.esri.geotriggersInfoFeatureFilterConstructor
import typingsJapgolly.arcgisJsApi.esri.geotriggersInfoFeatureFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebdocGeotriggersInfoFeatureFilterMod extends Shortcut {
  
  @JSImport("esri/webdoc/geotriggersInfo/FeatureFilter", JSImport.Namespace)
  @js.native
  val ^ : js.Object & geotriggersInfoFeatureFilterConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webdoc/geotriggersInfo/FeatureFilter", JSImport.Namespace)
  @js.native
  /**
    * Description of spatial and attribute filters that will be applied to Feature data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureFilter.html)
    */
  open class Class ()
    extends StObject
       with geotriggersInfoFeatureFilter {
    def this(properties: geotriggersInfoFeatureFilterProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & geotriggersInfoFeatureFilterConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWebdocGeotriggersInfoFeatureFilterMod.foo` */
  override def _to: js.Object & geotriggersInfoFeatureFilterConstructor = ^
}
