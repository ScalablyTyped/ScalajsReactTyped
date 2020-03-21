package typingsJapgolly.ol

import typingsJapgolly.ol.groupMod.Options
import typingsJapgolly.ol.groupMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/layer", JSImport.Namespace)
@js.native
object layerMod extends js.Object {
  @js.native
  class Group () extends default {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  class Heatmap ()
    extends typingsJapgolly.ol.heatmapMod.default {
    def this(opt_options: typingsJapgolly.ol.heatmapMod.Options) = this()
  }
  
  @js.native
  class Image ()
    extends typingsJapgolly.ol.imageMod.default {
    def this(opt_options: typingsJapgolly.ol.baseImageMod.Options) = this()
  }
  
  @js.native
  class Layer[SourceType /* <: typingsJapgolly.ol.sourceSourceMod.default */] protected ()
    extends typingsJapgolly.ol.layerLayerMod.default[SourceType] {
    def this(options: typingsJapgolly.ol.layerLayerMod.Options) = this()
  }
  
  @js.native
  class Tile ()
    extends typingsJapgolly.ol.tileMod.default {
    def this(opt_options: typingsJapgolly.ol.baseTileMod.Options) = this()
  }
  
  @js.native
  class Vector ()
    extends typingsJapgolly.ol.vectorMod.default {
    def this(opt_options: typingsJapgolly.ol.baseVectorMod.Options) = this()
  }
  
  @js.native
  class VectorImage ()
    extends typingsJapgolly.ol.vectorImageMod.default {
    def this(opt_options: typingsJapgolly.ol.vectorImageMod.Options) = this()
  }
  
  @js.native
  class VectorTile ()
    extends typingsJapgolly.ol.vectorTileMod.default {
    def this(opt_options: typingsJapgolly.ol.vectorTileMod.Options) = this()
  }
  
}

