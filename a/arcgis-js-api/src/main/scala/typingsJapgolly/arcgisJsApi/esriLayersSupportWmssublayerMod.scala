package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.WMSSublayer
import typingsJapgolly.arcgisJsApi.esri.WMSSublayerConstructor
import typingsJapgolly.arcgisJsApi.esri.WMSSublayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportWmssublayerMod extends Shortcut {
  
  @JSImport("esri/layers/support/WMSSublayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & WMSSublayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/WMSSublayer", JSImport.Namespace)
  @js.native
  /**
    * Represents a sublayer in a [WMSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html)
    */
  open class Class ()
    extends StObject
       with WMSSublayer {
    def this(properties: WMSSublayerProperties) = this()
  }
  
  type _To = js.Object & WMSSublayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportWmssublayerMod.foo` */
  override def _to: js.Object & WMSSublayerConstructor = ^
}
