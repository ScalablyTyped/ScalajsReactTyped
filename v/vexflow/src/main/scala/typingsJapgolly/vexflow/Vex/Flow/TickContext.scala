package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.Vex.IRenderContext
import typingsJapgolly.vexflow.anon.ExtraLeft
import typingsJapgolly.vexflow.anon.ExtraRightPx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TickContext extends StObject {
  
  def addTickable(tickable: Tickable): TickContext
  
  def getCenterAlignedTickables(): js.Array[Tickable]
  
  def getContext(): IRenderContext
  
  def getCurrentTick(): Fraction
  
  def getExtraPx(): ExtraLeft
  
  def getMaxTicks(): Double
  
  def getMetrics(): ExtraRightPx
  
  def getMinTicks(): Double
  
  def getPixelsUsed(): Double
  
  def getTickables(): js.Array[Tickable]
  
  def getWidth(): Double
  
  def getX(): Double
  
  def getXBase(): Double
  
  def getXOffset(): Double
  
  def postFormat(): TickContext
  
  def preFormat(): TickContext
  
  def setContext(context: IRenderContext): Unit
  
  def setCurrentTick(tick: Fraction): Unit
  
  def setPadding(padding: Double): TickContext
  
  def setPixelsUsed(pixelsUsed: Double): TickContext
  
  def setX(x: Double): TickContext
  
  def setXBase(xBase: Double): Unit
  
  def setXOffset(xOffset: Double): Unit
  
  def shouldIgnoreTicks(): Boolean
}
object TickContext {
  
  inline def apply(
    addTickable: Tickable => TickContext,
    getCenterAlignedTickables: CallbackTo[js.Array[Tickable]],
    getContext: CallbackTo[IRenderContext],
    getCurrentTick: CallbackTo[Fraction],
    getExtraPx: CallbackTo[ExtraLeft],
    getMaxTicks: CallbackTo[Double],
    getMetrics: CallbackTo[ExtraRightPx],
    getMinTicks: CallbackTo[Double],
    getPixelsUsed: CallbackTo[Double],
    getTickables: CallbackTo[js.Array[Tickable]],
    getWidth: CallbackTo[Double],
    getX: CallbackTo[Double],
    getXBase: CallbackTo[Double],
    getXOffset: CallbackTo[Double],
    postFormat: CallbackTo[TickContext],
    preFormat: CallbackTo[TickContext],
    setContext: IRenderContext => Callback,
    setCurrentTick: Fraction => Callback,
    setPadding: Double => TickContext,
    setPixelsUsed: Double => TickContext,
    setX: Double => TickContext,
    setXBase: Double => Callback,
    setXOffset: Double => Callback,
    shouldIgnoreTicks: CallbackTo[Boolean]
  ): TickContext = {
    val __obj = js.Dynamic.literal(addTickable = js.Any.fromFunction1(addTickable), getCenterAlignedTickables = getCenterAlignedTickables.toJsFn, getContext = getContext.toJsFn, getCurrentTick = getCurrentTick.toJsFn, getExtraPx = getExtraPx.toJsFn, getMaxTicks = getMaxTicks.toJsFn, getMetrics = getMetrics.toJsFn, getMinTicks = getMinTicks.toJsFn, getPixelsUsed = getPixelsUsed.toJsFn, getTickables = getTickables.toJsFn, getWidth = getWidth.toJsFn, getX = getX.toJsFn, getXBase = getXBase.toJsFn, getXOffset = getXOffset.toJsFn, postFormat = postFormat.toJsFn, preFormat = preFormat.toJsFn, setContext = js.Any.fromFunction1((t0: IRenderContext) => setContext(t0).runNow()), setCurrentTick = js.Any.fromFunction1((t0: Fraction) => setCurrentTick(t0).runNow()), setPadding = js.Any.fromFunction1(setPadding), setPixelsUsed = js.Any.fromFunction1(setPixelsUsed), setX = js.Any.fromFunction1(setX), setXBase = js.Any.fromFunction1((t0: Double) => setXBase(t0).runNow()), setXOffset = js.Any.fromFunction1((t0: Double) => setXOffset(t0).runNow()), shouldIgnoreTicks = shouldIgnoreTicks.toJsFn)
    __obj.asInstanceOf[TickContext]
  }
  
  extension [Self <: TickContext](x: Self) {
    
    inline def setAddTickable(value: Tickable => TickContext): Self = StObject.set(x, "addTickable", js.Any.fromFunction1(value))
    
    inline def setGetCenterAlignedTickables(value: CallbackTo[js.Array[Tickable]]): Self = StObject.set(x, "getCenterAlignedTickables", value.toJsFn)
    
    inline def setGetContext(value: CallbackTo[IRenderContext]): Self = StObject.set(x, "getContext", value.toJsFn)
    
    inline def setGetCurrentTick(value: CallbackTo[Fraction]): Self = StObject.set(x, "getCurrentTick", value.toJsFn)
    
    inline def setGetExtraPx(value: CallbackTo[ExtraLeft]): Self = StObject.set(x, "getExtraPx", value.toJsFn)
    
    inline def setGetMaxTicks(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxTicks", value.toJsFn)
    
    inline def setGetMetrics(value: CallbackTo[ExtraRightPx]): Self = StObject.set(x, "getMetrics", value.toJsFn)
    
    inline def setGetMinTicks(value: CallbackTo[Double]): Self = StObject.set(x, "getMinTicks", value.toJsFn)
    
    inline def setGetPixelsUsed(value: CallbackTo[Double]): Self = StObject.set(x, "getPixelsUsed", value.toJsFn)
    
    inline def setGetTickables(value: CallbackTo[js.Array[Tickable]]): Self = StObject.set(x, "getTickables", value.toJsFn)
    
    inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
    
    inline def setGetX(value: CallbackTo[Double]): Self = StObject.set(x, "getX", value.toJsFn)
    
    inline def setGetXBase(value: CallbackTo[Double]): Self = StObject.set(x, "getXBase", value.toJsFn)
    
    inline def setGetXOffset(value: CallbackTo[Double]): Self = StObject.set(x, "getXOffset", value.toJsFn)
    
    inline def setPostFormat(value: CallbackTo[TickContext]): Self = StObject.set(x, "postFormat", value.toJsFn)
    
    inline def setPreFormat(value: CallbackTo[TickContext]): Self = StObject.set(x, "preFormat", value.toJsFn)
    
    inline def setSetContext(value: IRenderContext => Callback): Self = StObject.set(x, "setContext", js.Any.fromFunction1((t0: IRenderContext) => value(t0).runNow()))
    
    inline def setSetCurrentTick(value: Fraction => Callback): Self = StObject.set(x, "setCurrentTick", js.Any.fromFunction1((t0: Fraction) => value(t0).runNow()))
    
    inline def setSetPadding(value: Double => TickContext): Self = StObject.set(x, "setPadding", js.Any.fromFunction1(value))
    
    inline def setSetPixelsUsed(value: Double => TickContext): Self = StObject.set(x, "setPixelsUsed", js.Any.fromFunction1(value))
    
    inline def setSetX(value: Double => TickContext): Self = StObject.set(x, "setX", js.Any.fromFunction1(value))
    
    inline def setSetXBase(value: Double => Callback): Self = StObject.set(x, "setXBase", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetXOffset(value: Double => Callback): Self = StObject.set(x, "setXOffset", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setShouldIgnoreTicks(value: CallbackTo[Boolean]): Self = StObject.set(x, "shouldIgnoreTicks", value.toJsFn)
  }
}
