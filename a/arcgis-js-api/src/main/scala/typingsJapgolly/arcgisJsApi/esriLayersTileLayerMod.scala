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
import typingsJapgolly.arcgisJsApi.esri.Collection
import typingsJapgolly.arcgisJsApi.esri.Effect
import typingsJapgolly.arcgisJsApi.esri.PortalItem
import typingsJapgolly.arcgisJsApi.esri.Sublayer
import typingsJapgolly.arcgisJsApi.esri.TileLayer
import typingsJapgolly.arcgisJsApi.esri.TileLayerConstructor
import typingsJapgolly.arcgisJsApi.esri.TileLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersTileLayerMod extends Shortcut {
  
  @JSImport("esri/layers/TileLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TileLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/TileLayer", JSImport.Namespace)
  @js.native
  /**
    * The TileLayer allows you work with a cached [map service](https://enterprise.arcgis.com/en/server/latest/publish-services/windows/what-is-a-map-service.htm) exposed by the ArcGIS Server REST API and add it to a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) as a tile layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html)
    */
  open class Class ()
    extends StObject
       with TileLayer {
    def this(properties: TileLayerProperties) = this()
    
    /**
      * An authorization string used to access a resource or service.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-APIKeyMixin.html#apiKey)
      */
    /* CompleteClass */
    var apiKey: String = js.native
    
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
      * Returns a deep clone of a map service's [sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) as defined by the service.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SublayersOwner.html#createServiceSublayers)
      */
    /* CompleteClass */
    override def createServiceSublayers(): Collection[Sublayer] = js.native
    
    /**
      * A list of custom parameters appended to the URL of all resources fetched by the layer.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-CustomParametersMixin.html#customParameters)
      */
    /* CompleteClass */
    var customParameters: Any = js.native
    
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
      * Returns the sublayer with the given layerId.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SublayersOwner.html#findSublayerById)
      */
    /* CompleteClass */
    override def findSublayerById(id: Double): Sublayer = js.native
    
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
      * The portal item from which the layer is loaded.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
      */
    /* CompleteClass */
    var portalItem: PortalItem = js.native
    
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
  
  type _To = js.Object & TileLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersTileLayerMod.foo` */
  override def _to: js.Object & TileLayerConstructor = ^
}
