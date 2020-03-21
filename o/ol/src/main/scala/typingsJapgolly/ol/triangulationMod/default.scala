package typingsJapgolly.ol.triangulationMod

import typingsJapgolly.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/reproj/Triangulation", JSImport.Default)
@js.native
class default protected () extends Triangulation {
  def this(
    sourceProj: typingsJapgolly.ol.projectionMod.default,
    targetProj: typingsJapgolly.ol.projectionMod.default,
    targetExtent: Extent,
    maxSourceExtent: Extent,
    errorThreshold: Double
  ) = this()
  /* CompleteClass */
  override def calculateSourceExtent(): Extent = js.native
  /* CompleteClass */
  override def getTriangles(): js.Array[Triangle] = js.native
}

