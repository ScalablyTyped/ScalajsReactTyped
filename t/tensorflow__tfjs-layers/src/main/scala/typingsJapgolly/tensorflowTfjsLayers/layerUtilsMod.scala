package typingsJapgolly.tensorflowTfjsLayers

import typingsJapgolly.tensorflowTfjsLayers.containerMod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/utils/layer_utils", JSImport.Namespace)
@js.native
object layerUtilsMod extends js.Object {
  def printSummary(model: Container): Unit = js.native
  def printSummary(model: Container, lineLength: Double): Unit = js.native
  def printSummary(model: Container, lineLength: Double, positions: js.Array[Double]): Unit = js.native
  def printSummary(
    model: Container,
    lineLength: Double,
    positions: js.Array[Double],
    printFn: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]
  ): Unit = js.native
}

