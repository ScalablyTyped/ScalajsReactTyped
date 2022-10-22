package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.Vex.IRenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tickable extends StObject {
  
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
  
  inline def apply(
    addModifier: Modifier => Tickable,
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
    setCenterAlignment: Boolean => Tickable,
    setContext: IRenderContext => Callback,
    setDuration: Fraction => Callback,
    setIntrinsicTicks: Fraction => Callback,
    setTickContext: TickContext => Callback,
    setTuplet: Tuplet => Tickable,
    setVoice: Voice => Callback,
    setXShift: Double => Tickable,
    shouldIgnoreTicks: CallbackTo[Boolean]
  ): Tickable = {
    val __obj = js.Dynamic.literal(addModifier = js.Any.fromFunction1(addModifier), addToModifierContext = js.Any.fromFunction1((t0: ModifierContext) => addToModifierContext(t0).runNow()), applyTickMultiplier = js.Any.fromFunction2((t0: Double, t1: Double) => (applyTickMultiplier(t0, t1)).runNow()), getBoundingBox = getBoundingBox.toJsFn, getCenterXShift = getCenterXShift.toJsFn, getIntrinsicTicks = getIntrinsicTicks.toJsFn, getTickMultiplier = getTickMultiplier.toJsFn, getTicks = getTicks.toJsFn, getTuplet = getTuplet.toJsFn, getVoice = getVoice.toJsFn, getWidth = getWidth.toJsFn, isCenterAligned = isCenterAligned.toJsFn, postFormat = postFormat.toJsFn, preFormat = preFormat.toJsFn, setCenterAlignment = js.Any.fromFunction1(setCenterAlignment), setContext = js.Any.fromFunction1((t0: IRenderContext) => setContext(t0).runNow()), setDuration = js.Any.fromFunction1((t0: Fraction) => setDuration(t0).runNow()), setIntrinsicTicks = js.Any.fromFunction1((t0: Fraction) => setIntrinsicTicks(t0).runNow()), setTickContext = js.Any.fromFunction1((t0: TickContext) => setTickContext(t0).runNow()), setTuplet = js.Any.fromFunction1(setTuplet), setVoice = js.Any.fromFunction1((t0: Voice) => setVoice(t0).runNow()), setXShift = js.Any.fromFunction1(setXShift), shouldIgnoreTicks = shouldIgnoreTicks.toJsFn)
    __obj.asInstanceOf[Tickable]
  }
  
  extension [Self <: Tickable](x: Self) {
    
    inline def setAddModifier(value: Modifier => Tickable): Self = StObject.set(x, "addModifier", js.Any.fromFunction1(value))
    
    inline def setAddToModifierContext(value: ModifierContext => Callback): Self = StObject.set(x, "addToModifierContext", js.Any.fromFunction1((t0: ModifierContext) => value(t0).runNow()))
    
    inline def setApplyTickMultiplier(value: (Double, Double) => Callback): Self = StObject.set(x, "applyTickMultiplier", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setGetBoundingBox(value: CallbackTo[BoundingBox]): Self = StObject.set(x, "getBoundingBox", value.toJsFn)
    
    inline def setGetCenterXShift(value: CallbackTo[Double]): Self = StObject.set(x, "getCenterXShift", value.toJsFn)
    
    inline def setGetIntrinsicTicks(value: CallbackTo[Fraction]): Self = StObject.set(x, "getIntrinsicTicks", value.toJsFn)
    
    inline def setGetTickMultiplier(value: CallbackTo[Fraction]): Self = StObject.set(x, "getTickMultiplier", value.toJsFn)
    
    inline def setGetTicks(value: CallbackTo[Fraction]): Self = StObject.set(x, "getTicks", value.toJsFn)
    
    inline def setGetTuplet(value: CallbackTo[Tuplet]): Self = StObject.set(x, "getTuplet", value.toJsFn)
    
    inline def setGetVoice(value: CallbackTo[Voice]): Self = StObject.set(x, "getVoice", value.toJsFn)
    
    inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
    
    inline def setIsCenterAligned(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCenterAligned", value.toJsFn)
    
    inline def setPostFormat(value: CallbackTo[Tickable]): Self = StObject.set(x, "postFormat", value.toJsFn)
    
    inline def setPreFormat(value: Callback): Self = StObject.set(x, "preFormat", value.toJsFn)
    
    inline def setSetCenterAlignment(value: Boolean => Tickable): Self = StObject.set(x, "setCenterAlignment", js.Any.fromFunction1(value))
    
    inline def setSetContext(value: IRenderContext => Callback): Self = StObject.set(x, "setContext", js.Any.fromFunction1((t0: IRenderContext) => value(t0).runNow()))
    
    inline def setSetDuration(value: Fraction => Callback): Self = StObject.set(x, "setDuration", js.Any.fromFunction1((t0: Fraction) => value(t0).runNow()))
    
    inline def setSetIntrinsicTicks(value: Fraction => Callback): Self = StObject.set(x, "setIntrinsicTicks", js.Any.fromFunction1((t0: Fraction) => value(t0).runNow()))
    
    inline def setSetTickContext(value: TickContext => Callback): Self = StObject.set(x, "setTickContext", js.Any.fromFunction1((t0: TickContext) => value(t0).runNow()))
    
    inline def setSetTuplet(value: Tuplet => Tickable): Self = StObject.set(x, "setTuplet", js.Any.fromFunction1(value))
    
    inline def setSetVoice(value: Voice => Callback): Self = StObject.set(x, "setVoice", js.Any.fromFunction1((t0: Voice) => value(t0).runNow()))
    
    inline def setSetXShift(value: Double => Tickable): Self = StObject.set(x, "setXShift", js.Any.fromFunction1(value))
    
    inline def setShouldIgnoreTicks(value: CallbackTo[Boolean]): Self = StObject.set(x, "shouldIgnoreTicks", value.toJsFn)
  }
}
