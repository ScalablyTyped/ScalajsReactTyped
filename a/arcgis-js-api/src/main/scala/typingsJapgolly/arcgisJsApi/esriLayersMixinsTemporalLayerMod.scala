package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.TemporalLayer
import typingsJapgolly.arcgisJsApi.esri.TemporalLayerConstructor
import typingsJapgolly.arcgisJsApi.esri.TimeExtent
import typingsJapgolly.arcgisJsApi.esri.TimeInfo
import typingsJapgolly.arcgisJsApi.esri.TimeInterval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersMixinsTemporalLayerMod extends Shortcut {
  
  @JSImport("esri/layers/mixins/TemporalLayer", JSImport.Namespace)
  @js.native
  val ^ : TemporalLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/mixins/TemporalLayer", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with TemporalLayer {
    
    /**
      * The layer's time extent.
      *
      * @default null
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeExtent)
      */
    /* CompleteClass */
    var timeExtent: TimeExtent = js.native
    
    /**
      * TimeInfo provides information such as date fields that store [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField) time for each feature and the [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for the layer.
      *
      * @default null
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeInfo)
      */
    /* CompleteClass */
    var timeInfo: TimeInfo = js.native
    
    /**
      * A temporary offset of the time data based on a certain [TimeInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html).
      *
      * @default null
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeOffset)
      */
    /* CompleteClass */
    var timeOffset: TimeInterval = js.native
    
    /**
      * Determines if the layer will update its temporal data based on the view's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent).
      *
      * @default true
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#useViewTime)
      */
    /* CompleteClass */
    var useViewTime: Boolean = js.native
  }
  
  type _To = TemporalLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersMixinsTemporalLayerMod.foo` */
  override def _to: TemporalLayerConstructor = ^
}
