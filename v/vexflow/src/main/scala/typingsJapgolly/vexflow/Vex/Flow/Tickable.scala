package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tickable extends js.Object {
  def addModifier(mod: Modifier): Tickable
  def addToModifierContext(mc: ModifierContext): Unit
  def applyTickMultiplier(numerator: Double, denominator: Double): Unit
  def getBoundingBox(): BoundingBox
  def getCenterXShift(): Double
  def getIntrinsicTicks(): Fraction
  def getTickMultiplier(): Fraction
  def getTicks(): Fraction
  def getTuplet(): Tuplet
  def getVoice(): Voice
  def getWidth(): Double
  def isCenterAligned(): Boolean
  def postFormat(): Tickable
  def preFormat(): Unit
  def setCenterAlignment(align_center: Boolean): Tickable
  def setContext(context: IRenderContext): Unit
  def setDuration(duration: Fraction): Unit
  def setIntrinsicTicks(intrinsicTicks: Fraction): Unit
  def setTickContext(tc: TickContext): Unit
  def setTuplet(tuplet: Tuplet): Tickable
  def setVoice(voice: Voice): Unit
  def setXShift(x: Double): Tickable
  def shouldIgnoreTicks(): Boolean
}

object Tickable {
  @scala.inline
  def apply(
    addModifier: Modifier => CallbackTo[Tickable],
    addToModifierContext: ModifierContext => Callback,
    applyTickMultiplier: (Double, Double) => Callback,
    getBoundingBox: CallbackTo[BoundingBox],
    getCenterXShift: CallbackTo[Double],
    getIntrinsicTicks: CallbackTo[Fraction],
    getTickMultiplier: CallbackTo[Fraction],
    getTicks: CallbackTo[Fraction],
    getTuplet: CallbackTo[Tuplet],
    getVoice: CallbackTo[Voice],
    getWidth: CallbackTo[Double],
    isCenterAligned: CallbackTo[Boolean],
    postFormat: CallbackTo[Tickable],
    preFormat: Callback,
    setCenterAlignment: Boolean => CallbackTo[Tickable],
    setContext: IRenderContext => Callback,
    setDuration: Fraction => Callback,
    setIntrinsicTicks: Fraction => Callback,
    setTickContext: TickContext => Callback,
    setTuplet: Tuplet => CallbackTo[Tickable],
    setVoice: Voice => Callback,
    setXShift: Double => CallbackTo[Tickable],
    shouldIgnoreTicks: CallbackTo[Boolean]
  ): Tickable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addModifier")(js.Any.fromFunction1((t0: typingsJapgolly.vexflow.Vex.Flow.Modifier) => addModifier(t0).runNow()))
    __obj.updateDynamic("addToModifierContext")(js.Any.fromFunction1((t0: typingsJapgolly.vexflow.Vex.Flow.ModifierContext) => addToModifierContext(t0).runNow()))
    __obj.updateDynamic("applyTickMultiplier")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => applyTickMultiplier(t0, t1).runNow()))
    __obj.updateDynamic("getBoundingBox")(getBoundingBox.toJsFn)
    __obj.updateDynamic("getCenterXShift")(getCenterXShift.toJsFn)
    __obj.updateDynamic("getIntrinsicTicks")(getIntrinsicTicks.toJsFn)
    __obj.updateDynamic("getTickMultiplier")(getTickMultiplier.toJsFn)
    __obj.updateDynamic("getTicks")(getTicks.toJsFn)
    __obj.updateDynamic("getTuplet")(getTuplet.toJsFn)
    __obj.updateDynamic("getVoice")(getVoice.toJsFn)
    __obj.updateDynamic("getWidth")(getWidth.toJsFn)
    __obj.updateDynamic("isCenterAligned")(isCenterAligned.toJsFn)
    __obj.updateDynamic("postFormat")(postFormat.toJsFn)
    __obj.updateDynamic("preFormat")(preFormat.toJsFn)
    __obj.updateDynamic("setCenterAlignment")(js.Any.fromFunction1((t0: scala.Boolean) => setCenterAlignment(t0).runNow()))
    __obj.updateDynamic("setContext")(js.Any.fromFunction1((t0: typingsJapgolly.vexflow.Vex.IRenderContext) => setContext(t0).runNow()))
    __obj.updateDynamic("setDuration")(js.Any.fromFunction1((t0: typingsJapgolly.vexflow.Vex.Flow.Fraction) => setDuration(t0).runNow()))
    __obj.updateDynamic("setIntrinsicTicks")(js.Any.fromFunction1((t0: typingsJapgolly.vexflow.Vex.Flow.Fraction) => setIntrinsicTicks(t0).runNow()))
    __obj.updateDynamic("setTickContext")(js.Any.fromFunction1((t0: typingsJapgolly.vexflow.Vex.Flow.TickContext) => setTickContext(t0).runNow()))
    __obj.updateDynamic("setTuplet")(js.Any.fromFunction1((t0: typingsJapgolly.vexflow.Vex.Flow.Tuplet) => setTuplet(t0).runNow()))
    __obj.updateDynamic("setVoice")(js.Any.fromFunction1((t0: typingsJapgolly.vexflow.Vex.Flow.Voice) => setVoice(t0).runNow()))
    __obj.updateDynamic("setXShift")(js.Any.fromFunction1((t0: scala.Double) => setXShift(t0).runNow()))
    __obj.updateDynamic("shouldIgnoreTicks")(shouldIgnoreTicks.toJsFn)
    __obj.asInstanceOf[Tickable]
  }
}

