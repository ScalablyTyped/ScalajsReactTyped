package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`color-burn`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`color-dodge`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`destination-atop`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`destination-in`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`destination-out`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`destination-over`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`hard-light`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`soft-light`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`source-atop`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`source-in`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`source-out`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`vivid-light`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.average
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.color
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.darken
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.difference
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.exclusion
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.hue
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.invert
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.lighten
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.lighter
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.luminosity
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.minus
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.multiply
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.normal
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.overlay
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.plus
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.reflect
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.saturation
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.screen
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.xor
import typingsJapgolly.arcgisJsApi.esri.CSVLayer
import typingsJapgolly.arcgisJsApi.esri.CSVLayerConstructor
import typingsJapgolly.arcgisJsApi.esri.CSVLayerProperties
import typingsJapgolly.arcgisJsApi.esri.Effect
import typingsJapgolly.arcgisJsApi.esri.FeatureEffect
import typingsJapgolly.arcgisJsApi.esri.OrderedLayerOrderBy
import typingsJapgolly.arcgisJsApi.esri.PortalItem
import typingsJapgolly.arcgisJsApi.esri.TimeExtent
import typingsJapgolly.arcgisJsApi.esri.TimeInfo
import typingsJapgolly.arcgisJsApi.esri.TimeInterval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersCsvlayerMod extends Shortcut {
  
  @JSImport("esri/layers/CSVLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CSVLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/CSVLayer", JSImport.Namespace)
  @js.native
  /**
    * The CSVLayer is a point layer based on a CSV file (.csv, .txt).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html)
    */
  open class Class ()
    extends StObject
       with CSVLayer {
    def this(properties: CSVLayerProperties) = this()
    
    /**
      * Blend modes are used to blend layers together to create an interesting effect in a layer, or even to produce what seems like a new layer.
      *
      * @default normal
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-BlendLayer.html#blendMode)
      */
    /* CompleteClass */
    var blendMode: average | `color-burn` | `color-dodge` | color | darken | `destination-atop` | `destination-in` | `destination-out` | `destination-over` | difference | exclusion | `hard-light` | hue | invert | lighten | lighter | luminosity | minus | multiply | normal | overlay | plus | reflect | saturation | screen | `soft-light` | `source-atop` | `source-in` | `source-out` | `vivid-light` | xor = js.native
    
    /**
      * Effect provides various filter functions that can be performed on the layer to achieve different visual effects similar to how image filters work.
      *
      * @default null
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-BlendLayer.html#effect)
      */
    /* CompleteClass */
    var effect: Effect = js.native
    
    /**
      * The featureEffect can be used to draw attention features of interest.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureEffectLayer.html#featureEffect)
      */
    /* CompleteClass */
    var featureEffect: FeatureEffect = js.native
    
    /**
      * The maximum scale (most zoomed in) at which the layer is visible in the view.
      *
      * @default 0
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
      */
    /* CompleteClass */
    var maxScale: Double = js.native
    
    /**
      * The minimum scale (most zoomed out) at which the layer is visible in the view.
      *
      * @default 0
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
      */
    /* CompleteClass */
    var minScale: Double = js.native
    
    /**
      * Determines the order in which features are drawn in the view.
      *
      * @default null
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-OrderedLayer.html#orderBy)
      */
    /* CompleteClass */
    var orderBy: js.Array[OrderedLayerOrderBy] = js.native
    
    /**
      * The portal item from which the layer is loaded.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
      */
    /* CompleteClass */
    var portalItem: PortalItem = js.native
    
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
  
  type _To = js.Object & CSVLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersCsvlayerMod.foo` */
  override def _to: js.Object & CSVLayerConstructor = ^
}
