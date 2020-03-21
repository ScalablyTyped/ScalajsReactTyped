package typingsJapgolly.tensorflowTfjsCore.convUtilMod

import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsFirst
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.channelsLast
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/conv_util", "computeConv2DInfo")
@js.native
object computeConv2DInfo extends js.Object {
  def apply(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same_ | valid_ | Double
  ): Conv2DInfo = js.native
  def apply(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same_ | valid_ | Double,
    roundingMode: floor | round | ceil
  ): Conv2DInfo = js.native
  def apply(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same_ | valid_ | Double,
    roundingMode: floor | round | ceil,
    depthwise: Boolean
  ): Conv2DInfo = js.native
  def apply(
    inShape: js.Tuple4[Double, Double, Double, Double],
    filterShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double | (js.Tuple2[Double, Double]),
    dilations: Double | (js.Tuple2[Double, Double]),
    pad: same_ | valid_ | Double,
    roundingMode: floor | round | ceil,
    depthwise: Boolean,
    dataFormat: channelsFirst | channelsLast
  ): Conv2DInfo = js.native
}

