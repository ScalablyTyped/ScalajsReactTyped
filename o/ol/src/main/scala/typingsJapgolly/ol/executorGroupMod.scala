package typingsJapgolly.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsJapgolly.ol.builderTypeMod.BuilderType
import typingsJapgolly.ol.canvasMod.DeclutterGroup
import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.olFeatureMod.FeatureLike
import typingsJapgolly.ol.olMod.Transform
import typingsJapgolly.ol.pluggableMapMod.DeclutterItems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/ExecutorGroup", JSImport.Namespace)
@js.native
object executorGroupMod extends js.Object {
  @js.native
  trait ExecutorGroup
    extends typingsJapgolly.ol.disposableMod.default {
    def clip(context: CanvasRenderingContext2D, transform: Transform): Unit = js.native
    def execute(
      context: CanvasRenderingContext2D,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean
    ): Unit = js.native
    def execute(
      context: CanvasRenderingContext2D,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean,
      opt_builderTypes: js.Array[BuilderType]
    ): Unit = js.native
    def execute(
      context: CanvasRenderingContext2D,
      transform: Transform,
      viewRotation: Double,
      snapToPixel: Boolean,
      opt_builderTypes: js.Array[BuilderType],
      opt_declutterReplays: StringDictionary[DeclutterGroup]
    ): Unit = js.native
    def forEachFeatureAtCoordinate[T](
      coordinate: Coordinate,
      resolution: Double,
      rotation: Double,
      hitTolerance: Double,
      callback: js.Function1[/* p0 */ FeatureLike, T],
      declutteredFeatures: js.Array[FeatureLike]
    ): T = js.native
    def getClipCoords(transform: Transform): js.Array[Double] = js.native
    def hasExecutors(executors: js.Array[BuilderType]): Boolean = js.native
    def isEmpty(): Boolean = js.native
  }
  
  @js.native
  class default protected () extends ExecutorGroup {
    def this(
      maxExtent: Extent,
      resolution: Double,
      pixelRatio: Double,
      overlaps: Boolean,
      allInstructions: StringDictionary[typingsJapgolly.ol.olStrings.default with js.Any]
    ) = this()
    def this(
      maxExtent: Extent,
      resolution: Double,
      pixelRatio: Double,
      overlaps: Boolean,
      allInstructions: StringDictionary[typingsJapgolly.ol.olStrings.default with js.Any],
      opt_renderBuffer: Double
    ) = this()
  }
  
  def getCircleArray(radius: Double): js.Array[js.Array[js.UndefOr[Boolean]]] = js.native
  def replayDeclutter(
    declutterReplays: StringDictionary[js.Array[_]],
    context: CanvasRenderingContext2D,
    rotation: Double,
    opacity: Double,
    snapToPixel: Boolean,
    declutterItems: js.Array[DeclutterItems]
  ): Unit = js.native
}

