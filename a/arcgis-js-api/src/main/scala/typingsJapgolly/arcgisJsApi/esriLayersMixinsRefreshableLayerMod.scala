package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.RefreshableLayer
import typingsJapgolly.arcgisJsApi.esri.RefreshableLayerConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersMixinsRefreshableLayerMod extends Shortcut {
  
  @JSImport("esri/layers/mixins/RefreshableLayer", JSImport.Namespace)
  @js.native
  val ^ : RefreshableLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/mixins/RefreshableLayer", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with RefreshableLayer {
    
    /**
      * Fetches all the data for the layer.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refresh)
      */
    /* CompleteClass */
    override def refresh(): Unit = js.native
    
    /**
      * Refresh interval of the layer in minutes.
      *
      * @default 0
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refreshInterval)
      */
    /* CompleteClass */
    var refreshInterval: Double = js.native
  }
  
  type _To = RefreshableLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersMixinsRefreshableLayerMod.foo` */
  override def _to: RefreshableLayerConstructor = ^
}
