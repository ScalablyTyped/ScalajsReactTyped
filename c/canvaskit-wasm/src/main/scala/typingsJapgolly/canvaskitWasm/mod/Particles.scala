package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Particles
  extends StObject
     with EmbindObject[Particles] {
  
  /**
    * Draws the current state of the particles on the given canvas.
    * @param canvas
    */
  def draw(canvas: Canvas): Unit
  
  /**
    * Returns the nth uniform from the effect.
    * @param index
    */
  def getUniform(index: Double): SkSLUniform
  
  /**
    * Returns the number of uniforms on the effect.
    */
  def getUniformCount(): Double
  
  /**
    * Returns the total number of floats across all uniforms on the effect. This is the length
    * of the array returned by `uniforms()`. For example, an effect with a single float3 uniform,
    * would return 1 from `getUniformCount()`, but 3 from `getUniformFloatCount()`.
    */
  def getUniformFloatCount(): Double
  
  /**
    * Returns the name of the nth effect uniform.
    * @param index
    */
  def getUniformName(index: Double): String
  
  /**
    * Sets the base position of the effect.
    * @param point
    */
  def setPosition(point: InputPoint): Unit
  
  /**
    * Sets the base rate of the effect.
    * @param rate
    */
  def setRate(rate: Double): Unit
  
  /**
    * Starts playing the effect.
    * @param now
    * @param looping
    */
  def start(now: Double, looping: Boolean): Unit
  
  /**
    * Returns a Float32Array bound to the WASM memory of these uniforms. Changing these
    * floats will change the corresponding uniforms instantly.
    */
  def uniforms(): js.typedarray.Float32Array
  
  /**
    * Updates the effect using the new time.
    * @param now
    */
  def update(now: Double): Unit
}
object Particles {
  
  inline def apply(
    delete: Callback,
    deleteLater: Callback,
    draw: Canvas => Callback,
    getUniform: Double => SkSLUniform,
    getUniformCount: CallbackTo[Double],
    getUniformFloatCount: CallbackTo[Double],
    getUniformName: Double => String,
    isAliasOf: Any => Boolean,
    isDeleted: CallbackTo[Boolean],
    setPosition: InputPoint => Callback,
    setRate: Double => Callback,
    start: (Double, Boolean) => Callback,
    uniforms: CallbackTo[js.typedarray.Float32Array],
    update: Double => Callback
  ): Particles = {
    val __obj = js.Dynamic.literal(delete = delete.toJsFn, deleteLater = deleteLater.toJsFn, draw = js.Any.fromFunction1((t0: Canvas) => draw(t0).runNow()), getUniform = js.Any.fromFunction1(getUniform), getUniformCount = getUniformCount.toJsFn, getUniformFloatCount = getUniformFloatCount.toJsFn, getUniformName = js.Any.fromFunction1(getUniformName), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = isDeleted.toJsFn, setPosition = js.Any.fromFunction1((t0: InputPoint) => setPosition(t0).runNow()), setRate = js.Any.fromFunction1((t0: Double) => setRate(t0).runNow()), start = js.Any.fromFunction2((t0: Double, t1: Boolean) => (start(t0, t1)).runNow()), uniforms = uniforms.toJsFn, update = js.Any.fromFunction1((t0: Double) => update(t0).runNow()))
    __obj.asInstanceOf[Particles]
  }
  
  extension [Self <: Particles](x: Self) {
    
    inline def setDraw(value: Canvas => Callback): Self = StObject.set(x, "draw", js.Any.fromFunction1((t0: Canvas) => value(t0).runNow()))
    
    inline def setGetUniform(value: Double => SkSLUniform): Self = StObject.set(x, "getUniform", js.Any.fromFunction1(value))
    
    inline def setGetUniformCount(value: CallbackTo[Double]): Self = StObject.set(x, "getUniformCount", value.toJsFn)
    
    inline def setGetUniformFloatCount(value: CallbackTo[Double]): Self = StObject.set(x, "getUniformFloatCount", value.toJsFn)
    
    inline def setGetUniformName(value: Double => String): Self = StObject.set(x, "getUniformName", js.Any.fromFunction1(value))
    
    inline def setSetPosition(value: InputPoint => Callback): Self = StObject.set(x, "setPosition", js.Any.fromFunction1((t0: InputPoint) => value(t0).runNow()))
    
    inline def setSetRate(value: Double => Callback): Self = StObject.set(x, "setRate", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setStart(value: (Double, Boolean) => Callback): Self = StObject.set(x, "start", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setUniforms(value: CallbackTo[js.typedarray.Float32Array]): Self = StObject.set(x, "uniforms", value.toJsFn)
    
    inline def setUpdate(value: Double => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
