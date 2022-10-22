package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.GeotriggersInfo
import typingsJapgolly.arcgisJsApi.esri.GeotriggersInfoConstructor
import typingsJapgolly.arcgisJsApi.esri.GeotriggersInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebdocGeotriggersInfoMod extends Shortcut {
  
  @JSImport("esri/webdoc/GeotriggersInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & GeotriggersInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webdoc/GeotriggersInfo", JSImport.Namespace)
  @js.native
  /**
    * Information relating to a list of Geotriggers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-GeotriggersInfo.html)
    */
  open class Class ()
    extends StObject
       with GeotriggersInfo {
    def this(properties: GeotriggersInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & GeotriggersInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWebdocGeotriggersInfoMod.foo` */
  override def _to: js.Object & GeotriggersInfoConstructor = ^
}
