package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.TimeInfo
import typingsJapgolly.arcgisJsApi.esri.TimeInfoConstructor
import typingsJapgolly.arcgisJsApi.esri.TimeInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportTimeInfoMod extends Shortcut {
  
  @JSImport("esri/layers/support/TimeInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TimeInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/TimeInfo", JSImport.Namespace)
  @js.native
  /**
    * Time info represents the temporal data of a time-aware layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html)
    */
  open class Class ()
    extends StObject
       with TimeInfo {
    def this(properties: TimeInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & TimeInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportTimeInfoMod.foo` */
  override def _to: js.Object & TimeInfoConstructor = ^
}
