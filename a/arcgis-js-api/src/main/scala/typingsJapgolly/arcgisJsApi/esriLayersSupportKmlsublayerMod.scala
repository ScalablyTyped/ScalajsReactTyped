package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.KMLSublayer
import typingsJapgolly.arcgisJsApi.esri.KMLSublayerConstructor
import typingsJapgolly.arcgisJsApi.esri.KMLSublayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportKmlsublayerMod extends Shortcut {
  
  @JSImport("esri/layers/support/KMLSublayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & KMLSublayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/KMLSublayer", JSImport.Namespace)
  @js.native
  /**
    * Represents a sublayer in a [KMLLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-KMLSublayer.html)
    */
  open class Class ()
    extends StObject
       with KMLSublayer {
    def this(properties: KMLSublayerProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & KMLSublayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportKmlsublayerMod.foo` */
  override def _to: js.Object & KMLSublayerConstructor = ^
}
