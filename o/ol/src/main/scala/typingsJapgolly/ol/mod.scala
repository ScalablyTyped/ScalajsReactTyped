package typingsJapgolly.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.UIEvent
import typingsJapgolly.ol.assertionErrorMod.default
import typingsJapgolly.ol.collectionMod.Options
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.imageCanvasMod.Loader
import typingsJapgolly.ol.imageMod.LoadFunction
import typingsJapgolly.ol.imageStateMod.ImageState
import typingsJapgolly.ol.pluggableMapMod.FrameState
import typingsJapgolly.ol.pluggableMapMod.MapOptions
import typingsJapgolly.ol.tileQueueMod.PriorityFunction
import typingsJapgolly.ol.tileStateMod.TileState
import typingsJapgolly.ol.tilecoordMod.TileCoord
import typingsJapgolly.ol.viewMod.ViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol", "AssertionError")
  @js.native
  open class AssertionError protected () extends default {
    def this(code: Double) = this()
  }
  
  @JSImport("ol", "Collection")
  @js.native
  open class Collection[T] ()
    extends typingsJapgolly.ol.collectionMod.default[T] {
    def this(opt_array: js.Array[T]) = this()
    def this(opt_array: js.Array[T], opt_options: Options) = this()
    def this(opt_array: Unit, opt_options: Options) = this()
  }
  
  @JSImport("ol", "Disposable")
  @js.native
  open class Disposable ()
    extends typingsJapgolly.ol.disposableMod.default
  
  @JSImport("ol", "Feature")
  @js.native
  open class Feature[GeomType /* <: typingsJapgolly.ol.geomGeometryMod.default */] ()
    extends typingsJapgolly.ol.featureMod.default[GeomType] {
    def this(opt_geometryOrProperties: GeomType) = this()
    def this(opt_geometryOrProperties: StringDictionary[Any]) = this()
  }
  
  @JSImport("ol", "Geolocation")
  @js.native
  open class Geolocation ()
    extends typingsJapgolly.ol.geolocationMod.default {
    def this(opt_options: typingsJapgolly.ol.geolocationMod.Options) = this()
  }
  
  @JSImport("ol", "Graticule")
  @js.native
  open class Graticule ()
    extends typingsJapgolly.ol.layerGraticuleMod.default {
    def this(opt_options: typingsJapgolly.ol.layerGraticuleMod.Options) = this()
  }
  
  @JSImport("ol", "Image")
  @js.native
  open class Image protected ()
    extends typingsJapgolly.ol.imageMod.default {
    def this(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      src: String,
      crossOrigin: String,
      imageLoadFunction: LoadFunction
    ) = this()
    def this(
      extent: Extent,
      resolution: Unit,
      pixelRatio: Double,
      src: String,
      crossOrigin: String,
      imageLoadFunction: LoadFunction
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("ol", "ImageBase")
  @js.native
  open class ImageBase protected ()
    extends typingsJapgolly.ol.imageBaseMod.default {
    def this(extent: Extent, resolution: Double, pixelRatio: Double, state: ImageState) = this()
    def this(extent: Extent, resolution: Unit, pixelRatio: Double, state: ImageState) = this()
  }
  
  @JSImport("ol", "ImageCanvas")
  @js.native
  open class ImageCanvas protected ()
    extends typingsJapgolly.ol.imageCanvasMod.default {
    def this(extent: Extent, resolution: Double, pixelRatio: Double, canvas: HTMLCanvasElement) = this()
    def this(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      canvas: HTMLCanvasElement,
      opt_loader: Loader
    ) = this()
  }
  
  @JSImport("ol", "ImageTile")
  @js.native
  open class ImageTile protected ()
    extends typingsJapgolly.ol.imageTileMod.default {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      crossOrigin: String,
      tileLoadFunction: typingsJapgolly.ol.tileMod.LoadFunction
    ) = this()
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      crossOrigin: String,
      tileLoadFunction: typingsJapgolly.ol.tileMod.LoadFunction,
      opt_options: typingsJapgolly.ol.tileMod.Options
    ) = this()
  }
  
  @JSImport("ol", "Kinetic")
  @js.native
  open class Kinetic protected ()
    extends typingsJapgolly.ol.kineticMod.default {
    def this(decay: Double, minVelocity: Double, delay: Double) = this()
  }
  
  @JSImport("ol", "Map")
  @js.native
  open class Map protected ()
    extends typingsJapgolly.ol.mapMod.default {
    def this(options: MapOptions) = this()
  }
  
  @JSImport("ol", "MapBrowserEvent")
  @js.native
  open class MapBrowserEvent[EVENT /* <: UIEvent */] protected ()
    extends typingsJapgolly.ol.mapBrowserEventMod.default[EVENT] {
    def this(`type`: String, map: typingsJapgolly.ol.pluggableMapMod.default, originalEvent: EVENT) = this()
    def this(
      `type`: String,
      map: typingsJapgolly.ol.pluggableMapMod.default,
      originalEvent: EVENT,
      opt_dragging: Boolean
    ) = this()
    def this(
      `type`: String,
      map: typingsJapgolly.ol.pluggableMapMod.default,
      originalEvent: EVENT,
      opt_dragging: Boolean,
      opt_frameState: FrameState
    ) = this()
    def this(
      `type`: String,
      map: typingsJapgolly.ol.pluggableMapMod.default,
      originalEvent: EVENT,
      opt_dragging: Unit,
      opt_frameState: FrameState
    ) = this()
  }
  
  @JSImport("ol", "MapBrowserEventHandler")
  @js.native
  open class MapBrowserEventHandler protected ()
    extends typingsJapgolly.ol.mapBrowserEventHandlerMod.default {
    def this(map: typingsJapgolly.ol.pluggableMapMod.default) = this()
    def this(map: typingsJapgolly.ol.pluggableMapMod.default, moveTolerance: Double) = this()
  }
  
  @JSImport("ol", "MapEvent")
  @js.native
  open class MapEvent protected ()
    extends typingsJapgolly.ol.mapEventMod.default {
    def this(`type`: String, map: typingsJapgolly.ol.pluggableMapMod.default) = this()
    def this(`type`: String, map: typingsJapgolly.ol.pluggableMapMod.default, opt_frameState: FrameState) = this()
  }
  
  @JSImport("ol", "Object")
  @js.native
  open class Object ()
    extends typingsJapgolly.ol.objectMod.default {
    def this(opt_values: StringDictionary[Any]) = this()
  }
  
  @JSImport("ol", "Observable")
  @js.native
  open class Observable ()
    extends typingsJapgolly.ol.observableMod.default
  
  @JSImport("ol", "Overlay")
  @js.native
  open class Overlay protected ()
    extends typingsJapgolly.ol.overlayMod.default {
    def this(options: typingsJapgolly.ol.overlayMod.Options) = this()
  }
  
  @JSImport("ol", "PluggableMap")
  @js.native
  open class PluggableMap protected ()
    extends typingsJapgolly.ol.pluggableMapMod.default {
    def this(options: MapOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("ol", "Tile")
  @js.native
  open class Tile protected ()
    extends typingsJapgolly.ol.tileMod.default {
    def this(tileCoord: TileCoord, state: TileState) = this()
    def this(tileCoord: TileCoord, state: TileState, opt_options: typingsJapgolly.ol.tileMod.Options) = this()
  }
  
  @JSImport("ol", "TileCache")
  @js.native
  open class TileCache ()
    extends typingsJapgolly.ol.tileCacheMod.default
  
  @JSImport("ol", "TileQueue")
  @js.native
  open class TileQueue protected ()
    extends typingsJapgolly.ol.tileQueueMod.default {
    def this(tilePriorityFunction: PriorityFunction, tileChangeCallback: js.Function0[Any]) = this()
  }
  
  @JSImport("ol", "TileRange")
  @js.native
  open class TileRange protected ()
    extends typingsJapgolly.ol.tileRangeMod.default {
    def this(minX: Double, maxX: Double, minY: Double, maxY: Double) = this()
  }
  
  @JSImport("ol", "VERSION")
  @js.native
  val VERSION: String = js.native
  
  @JSImport("ol", "VectorRenderTile")
  @js.native
  open class VectorRenderTile protected ()
    extends typingsJapgolly.ol.vectorRenderTileMod.default {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      urlTileCoord: TileCoord,
      getSourceTiles: js.Function1[
            /* p0 */ typingsJapgolly.ol.vectorRenderTileMod.VectorRenderTile, 
            js.Array[typingsJapgolly.ol.vectorTileMod.default]
          ]
    ) = this()
  }
  
  @JSImport("ol", "VectorTile")
  @js.native
  open class VectorTile protected ()
    extends typingsJapgolly.ol.vectorTileMod.default {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      format: typingsJapgolly.ol.formatFeatureMod.default,
      tileLoadFunction: typingsJapgolly.ol.tileMod.LoadFunction
    ) = this()
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      format: typingsJapgolly.ol.formatFeatureMod.default,
      tileLoadFunction: typingsJapgolly.ol.tileMod.LoadFunction,
      opt_options: typingsJapgolly.ol.tileMod.Options
    ) = this()
  }
  
  @JSImport("ol", "View")
  @js.native
  open class View ()
    extends typingsJapgolly.ol.viewMod.default {
    def this(opt_options: ViewOptions) = this()
  }
  
  inline def getUid(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUid")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
}
