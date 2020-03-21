package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkPaint extends SkObject[SkPaint] {
  def getBlendMode(): SkBlendMode
  def getColor(): SkColor
  def getFilterQuality(): SkFilterQuality
  def getStrokeCap(): SkStrokeCap
  def getStrokeJoin(): SkStrokeJoin
  def getStrokeMiter(): Double
  def getStrokeWidth(): Double
  def setAntiAlias(value: Boolean): Unit
  def setBlendMode(value: SkBlendMode): Unit
  def setColor(value: SkColor): Unit
  def setColorFilter(value: SkColorFilter): Unit
  def setColorf(fRed: Double, fGreen: Double, fBlue: Double, fAlpha: Double): Unit
  def setFilterQuality(value: SkFilterQuality): Unit
  def setImageFilter(value: SkImageFilter): Unit
  def setMaskFilter(value: SkMaskFilter): Unit
  def setPathEffect(value: SkPathEffect): Unit
  def setShader(value: SkShader): Unit
  def setStrokeCap(value: SkStrokeCap): Unit
  def setStrokeJoin(value: SkStrokeJoin): Unit
  def setStrokeMiter(value: Double): Unit
  def setStrokeWidth(value: Double): Unit
  def setStyle(value: SkPaintStyle): Unit
}

object SkPaint {
  @scala.inline
  def apply(
    delete: Callback,
    deleteAfter: Callback,
    getBlendMode: CallbackTo[SkBlendMode],
    getColor: CallbackTo[SkColor],
    getFilterQuality: CallbackTo[SkFilterQuality],
    getStrokeCap: CallbackTo[SkStrokeCap],
    getStrokeJoin: CallbackTo[SkStrokeJoin],
    getStrokeMiter: CallbackTo[Double],
    getStrokeWidth: CallbackTo[Double],
    isAliasOf: js.Any => CallbackTo[Boolean],
    isDeleted: CallbackTo[Boolean],
    setAntiAlias: Boolean => Callback,
    setBlendMode: SkBlendMode => Callback,
    setColor: SkColor => Callback,
    setColorFilter: SkColorFilter => Callback,
    setColorf: (Double, Double, Double, Double) => Callback,
    setFilterQuality: SkFilterQuality => Callback,
    setImageFilter: SkImageFilter => Callback,
    setMaskFilter: SkMaskFilter => Callback,
    setPathEffect: SkPathEffect => Callback,
    setShader: SkShader => Callback,
    setStrokeCap: SkStrokeCap => Callback,
    setStrokeJoin: SkStrokeJoin => Callback,
    setStrokeMiter: Double => Callback,
    setStrokeWidth: Double => Callback,
    setStyle: SkPaintStyle => Callback
  ): SkPaint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.updateDynamic("deleteAfter")(deleteAfter.toJsFn)
    __obj.updateDynamic("getBlendMode")(getBlendMode.toJsFn)
    __obj.updateDynamic("getColor")(getColor.toJsFn)
    __obj.updateDynamic("getFilterQuality")(getFilterQuality.toJsFn)
    __obj.updateDynamic("getStrokeCap")(getStrokeCap.toJsFn)
    __obj.updateDynamic("getStrokeJoin")(getStrokeJoin.toJsFn)
    __obj.updateDynamic("getStrokeMiter")(getStrokeMiter.toJsFn)
    __obj.updateDynamic("getStrokeWidth")(getStrokeWidth.toJsFn)
    __obj.updateDynamic("isAliasOf")(js.Any.fromFunction1((t0: js.Any) => isAliasOf(t0).runNow()))
    __obj.updateDynamic("isDeleted")(isDeleted.toJsFn)
    __obj.updateDynamic("setAntiAlias")(js.Any.fromFunction1((t0: scala.Boolean) => setAntiAlias(t0).runNow()))
    __obj.updateDynamic("setBlendMode")(js.Any.fromFunction1((t0: typingsJapgolly.canvaskitWasm.mod.SkBlendMode) => setBlendMode(t0).runNow()))
    __obj.updateDynamic("setColor")(js.Any.fromFunction1((t0: typingsJapgolly.canvaskitWasm.mod.SkColor) => setColor(t0).runNow()))
    __obj.updateDynamic("setColorFilter")(js.Any.fromFunction1((t0: typingsJapgolly.canvaskitWasm.mod.SkColorFilter) => setColorFilter(t0).runNow()))
    __obj.updateDynamic("setColorf")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => setColorf(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("setFilterQuality")(js.Any.fromFunction1((t0: typingsJapgolly.canvaskitWasm.mod.SkFilterQuality) => setFilterQuality(t0).runNow()))
    __obj.updateDynamic("setImageFilter")(js.Any.fromFunction1((t0: typingsJapgolly.canvaskitWasm.mod.SkImageFilter) => setImageFilter(t0).runNow()))
    __obj.updateDynamic("setMaskFilter")(js.Any.fromFunction1((t0: typingsJapgolly.canvaskitWasm.mod.SkMaskFilter) => setMaskFilter(t0).runNow()))
    __obj.updateDynamic("setPathEffect")(js.Any.fromFunction1((t0: typingsJapgolly.canvaskitWasm.mod.SkPathEffect) => setPathEffect(t0).runNow()))
    __obj.updateDynamic("setShader")(js.Any.fromFunction1((t0: typingsJapgolly.canvaskitWasm.mod.SkShader) => setShader(t0).runNow()))
    __obj.updateDynamic("setStrokeCap")(js.Any.fromFunction1((t0: typingsJapgolly.canvaskitWasm.mod.SkStrokeCap) => setStrokeCap(t0).runNow()))
    __obj.updateDynamic("setStrokeJoin")(js.Any.fromFunction1((t0: typingsJapgolly.canvaskitWasm.mod.SkStrokeJoin) => setStrokeJoin(t0).runNow()))
    __obj.updateDynamic("setStrokeMiter")(js.Any.fromFunction1((t0: scala.Double) => setStrokeMiter(t0).runNow()))
    __obj.updateDynamic("setStrokeWidth")(js.Any.fromFunction1((t0: scala.Double) => setStrokeWidth(t0).runNow()))
    __obj.updateDynamic("setStyle")(js.Any.fromFunction1((t0: typingsJapgolly.canvaskitWasm.mod.SkPaintStyle) => setStyle(t0).runNow()))
    __obj.asInstanceOf[SkPaint]
  }
}

