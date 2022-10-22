package typingsJapgolly.ol

import typingsJapgolly.ol.layerGraticuleMod.Options
import typingsJapgolly.ol.layerGraticuleMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerMod {
  
  @JSImport("ol/layer", "Graticule")
  @js.native
  open class Graticule () extends default {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/layer", "Group")
  @js.native
  open class Group ()
    extends typingsJapgolly.ol.layerGroupMod.default {
    def this(opt_options: typingsJapgolly.ol.layerGroupMod.Options) = this()
  }
  
  @JSImport("ol/layer", "Heatmap")
  @js.native
  open class Heatmap ()
    extends typingsJapgolly.ol.layerHeatmapMod.default {
    def this(opt_options: typingsJapgolly.ol.layerHeatmapMod.Options) = this()
  }
  
  @JSImport("ol/layer", "Image")
  @js.native
  open class Image ()
    extends typingsJapgolly.ol.layerImageMod.default {
    def this(opt_options: typingsJapgolly.ol.layerBaseImageMod.Options) = this()
  }
  
  @JSImport("ol/layer", "Layer")
  @js.native
  open class Layer[SourceType /* <: typingsJapgolly.ol.sourceSourceMod.default */] protected ()
    extends typingsJapgolly.ol.layerLayerMod.default[SourceType] {
    def this(options: typingsJapgolly.ol.layerLayerMod.Options) = this()
  }
  
  @JSImport("ol/layer", "MapboxVector")
  @js.native
  open class MapboxVector protected ()
    extends typingsJapgolly.ol.layerMapboxVectorMod.default {
    def this(options: typingsJapgolly.ol.layerMapboxVectorMod.Options) = this()
  }
  
  @JSImport("ol/layer", "Tile")
  @js.native
  open class Tile ()
    extends typingsJapgolly.ol.layerTileMod.default {
    def this(opt_options: typingsJapgolly.ol.layerBaseTileMod.Options) = this()
  }
  
  @JSImport("ol/layer", "Vector")
  @js.native
  open class Vector ()
    extends typingsJapgolly.ol.layerVectorMod.default {
    def this(opt_options: typingsJapgolly.ol.layerBaseVectorMod.Options) = this()
  }
  
  @JSImport("ol/layer", "VectorImage")
  @js.native
  open class VectorImage ()
    extends typingsJapgolly.ol.layerVectorImageMod.default {
    def this(opt_options: typingsJapgolly.ol.layerVectorImageMod.Options) = this()
  }
  
  @JSImport("ol/layer", "VectorTile")
  @js.native
  open class VectorTile ()
    extends typingsJapgolly.ol.layerVectorTileMod.default {
    def this(opt_options: typingsJapgolly.ol.layerVectorTileMod.Options) = this()
  }
  
  @JSImport("ol/layer", "WebGLPoints")
  @js.native
  open class WebGLPoints protected ()
    extends typingsJapgolly.ol.layerWebGLPointsMod.default {
    def this(options: typingsJapgolly.ol.layerWebGLPointsMod.Options) = this()
  }
}
