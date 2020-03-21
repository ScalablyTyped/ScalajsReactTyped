package typingsJapgolly.ol

import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.olFeatureMod.FeatureLike
import typingsJapgolly.ol.pixelMod.Pixel
import typingsJapgolly.ol.pluggableMapMod.FrameState
import typingsJapgolly.ol.renderEventTypeMod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/Map", JSImport.Namespace)
@js.native
object mapMod extends js.Object {
  @js.native
  trait MapRenderer
    extends typingsJapgolly.ol.disposableMod.default {
    /* protected */ def calculateMatrices2D(frameState: FrameState): Unit = js.native
    def dispatchRenderEvent(`type`: EventType, frameState: FrameState): Unit = js.native
    def forEachFeatureAtCoordinate[S, T, U](
      coordinate: Coordinate,
      frameState: FrameState,
      hitTolerance: Double,
      checkWrapped: Boolean,
      callback: js.ThisFunction2[
          /* this */ S, 
          /* p0 */ FeatureLike, 
          /* p1 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
          T
        ],
      thisArg: S,
      layerFilter: js.ThisFunction1[
          /* this */ U, 
          /* p0 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
          Boolean
        ],
      thisArg2: U
    ): T = js.native
    def forEachLayerAtPixel[S, T, U](
      pixel: Pixel,
      frameState: FrameState,
      hitTolerance: Double,
      callback: js.ThisFunction2[
          /* this */ S, 
          /* p0 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
          /* p1 */ scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Uint8Array, 
          T
        ],
      layerFilter: js.ThisFunction1[
          /* this */ U, 
          /* p0 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
          Boolean
        ]
    ): T = js.native
    def getMap(): typingsJapgolly.ol.pluggableMapMod.default = js.native
    def hasFeatureAtCoordinate[U](
      coordinate: Coordinate,
      frameState: FrameState,
      hitTolerance: Double,
      checkWrapped: Boolean,
      layerFilter: js.ThisFunction1[
          /* this */ U, 
          /* p0 */ typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default], 
          Boolean
        ],
      thisArg: U
    ): Boolean = js.native
    def renderFrame(frameState: FrameState): Unit = js.native
    /* protected */ def scheduleExpireIconCache(frameState: FrameState): Unit = js.native
  }
  
  @js.native
  abstract class default protected () extends MapRenderer {
    def this(map: typingsJapgolly.ol.pluggableMapMod.default) = this()
  }
  
}

