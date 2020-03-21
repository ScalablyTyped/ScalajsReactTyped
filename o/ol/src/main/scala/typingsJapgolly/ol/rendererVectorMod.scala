package typingsJapgolly.ol

import typingsJapgolly.ol.builderGroupMod.default
import typingsJapgolly.ol.olFeatureMod.FeatureLike
import typingsJapgolly.ol.projMod.TransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/vector", JSImport.Namespace)
@js.native
object rendererVectorMod extends js.Object {
  def defaultOrder(feature1: FeatureLike, feature2: FeatureLike): Double = js.native
  def getSquaredTolerance(resolution: Double, pixelRatio: Double): Double = js.native
  def getTolerance(resolution: Double, pixelRatio: Double): Double = js.native
  def renderFeature[T](
    replayGroup: default,
    feature: FeatureLike,
    style: typingsJapgolly.ol.styleStyleMod.default,
    squaredTolerance: Double,
    listener: js.Function1[/* p0 */ typingsJapgolly.ol.eventMod.default, Unit]
  ): Boolean = js.native
  def renderFeature[T](
    replayGroup: default,
    feature: FeatureLike,
    style: typingsJapgolly.ol.styleStyleMod.default,
    squaredTolerance: Double,
    listener: js.Function1[/* p0 */ typingsJapgolly.ol.eventMod.default, Unit],
    opt_transform: TransformFunction
  ): Boolean = js.native
}

