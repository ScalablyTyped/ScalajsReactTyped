package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.WMTSStyle
import typingsJapgolly.arcgisJsApi.esri.WMTSStyleConstructor
import typingsJapgolly.arcgisJsApi.esri.WMTSStyleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportWmtsstyleMod extends Shortcut {
  
  @JSImport("esri/layers/support/WMTSStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Object & WMTSStyleConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/WMTSStyle", JSImport.Namespace)
  @js.native
  /**
    * Contains information about the WMTS Style for [WMTSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html)
    */
  open class Class ()
    extends StObject
       with WMTSStyle {
    def this(properties: WMTSStyleProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & WMTSStyleConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportWmtsstyleMod.foo` */
  override def _to: js.Object & WMTSStyleConstructor = ^
}
