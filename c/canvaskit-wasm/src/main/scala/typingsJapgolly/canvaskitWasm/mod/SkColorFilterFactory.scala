package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkColorFilterFactory extends js.Object {
  def MakeBlend(color: SkColor, blendMode: SkBlendMode): SkColorFilter
  def MakeCompose(first: SkColorFilter, second: SkColorFilter): SkColorFilter
  def MakeLerp(lerp: Double, first: SkColorFilter, second: SkColorFilter): SkColorFilter
  def MakeLinearToSRGBGamma(): SkColorFilter
  def MakeMatrix(matrix: SkMatrix): SkColorFilter
  def MakeSRGBToLinearGamma(): SkColorFilter
}

object SkColorFilterFactory {
  @scala.inline
  def apply(
    MakeBlend: (SkColor, SkBlendMode) => CallbackTo[SkColorFilter],
    MakeCompose: (SkColorFilter, SkColorFilter) => CallbackTo[SkColorFilter],
    MakeLerp: (Double, SkColorFilter, SkColorFilter) => CallbackTo[SkColorFilter],
    MakeLinearToSRGBGamma: CallbackTo[SkColorFilter],
    MakeMatrix: SkMatrix => CallbackTo[SkColorFilter],
    MakeSRGBToLinearGamma: CallbackTo[SkColorFilter]
  ): SkColorFilterFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MakeBlend")(js.Any.fromFunction2((t0: typingsJapgolly.canvaskitWasm.mod.SkColor, t1: typingsJapgolly.canvaskitWasm.mod.SkBlendMode) => MakeBlend(t0, t1).runNow()))
    __obj.updateDynamic("MakeCompose")(js.Any.fromFunction2((t0: typingsJapgolly.canvaskitWasm.mod.SkColorFilter, t1: typingsJapgolly.canvaskitWasm.mod.SkColorFilter) => MakeCompose(t0, t1).runNow()))
    __obj.updateDynamic("MakeLerp")(js.Any.fromFunction3((t0: scala.Double, t1: typingsJapgolly.canvaskitWasm.mod.SkColorFilter, t2: typingsJapgolly.canvaskitWasm.mod.SkColorFilter) => MakeLerp(t0, t1, t2).runNow()))
    __obj.updateDynamic("MakeLinearToSRGBGamma")(MakeLinearToSRGBGamma.toJsFn)
    __obj.updateDynamic("MakeMatrix")(js.Any.fromFunction1((t0: typingsJapgolly.canvaskitWasm.mod.SkMatrix) => MakeMatrix(t0).runNow()))
    __obj.updateDynamic("MakeSRGBToLinearGamma")(MakeSRGBToLinearGamma.toJsFn)
    __obj.asInstanceOf[SkColorFilterFactory]
  }
}

