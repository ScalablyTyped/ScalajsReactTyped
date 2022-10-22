package typingsJapgolly.forgeViewer.THREE

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vector extends StObject {
  
  def add(v: Vector): Vector
  
  def addVectors(a: Vector, b: Vector): Vector
  
  def copy(v: Vector): Vector
  
  var distanceTo: js.UndefOr[js.Function1[/* v */ this.type, Double]] = js.undefined
  
  var distanceToSquared: js.UndefOr[js.Function1[/* v */ this.type, Double]] = js.undefined
  
  def divideScalar(s: Double): Vector
  
  def dot(v: Vector): Double
  
  def equals(v: Vector): Boolean
  
  def getComponent(index: Double): Double
  
  def length(): Double
  
  def lengthSq(): Double
  
  def lerp(v: Vector, alpha: Double): Vector
  
  def multiplyScalar(s: Double): Vector
  
  def negate(): Vector
  
  def normalize(): Vector
  
  def setComponent(index: Double, value: Double): Unit
  
  def setLength(l: Double): Vector
  
  def sub(v: Vector): Vector
  
  def subVectors(a: Vector, b: Vector): Vector
}
object Vector {
  
  inline def apply(
    add: Vector => Vector,
    addVectors: (Vector, Vector) => Vector,
    copy: Vector => Vector,
    divideScalar: Double => Vector,
    dot: Vector => Double,
    equals_ : Vector => Boolean,
    getComponent: Double => Double,
    length: CallbackTo[Double],
    lengthSq: CallbackTo[Double],
    lerp: (Vector, Double) => Vector,
    multiplyScalar: Double => Vector,
    negate: CallbackTo[Vector],
    normalize: CallbackTo[Vector],
    setComponent: (Double, Double) => Callback,
    setLength: Double => Vector,
    sub: Vector => Vector,
    subVectors: (Vector, Vector) => Vector
  ): Vector = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addVectors = js.Any.fromFunction2(addVectors), copy = js.Any.fromFunction1(copy), divideScalar = js.Any.fromFunction1(divideScalar), dot = js.Any.fromFunction1(dot), getComponent = js.Any.fromFunction1(getComponent), length = length.toJsFn, lengthSq = lengthSq.toJsFn, lerp = js.Any.fromFunction2(lerp), multiplyScalar = js.Any.fromFunction1(multiplyScalar), negate = negate.toJsFn, normalize = normalize.toJsFn, setComponent = js.Any.fromFunction2((t0: Double, t1: Double) => (setComponent(t0, t1)).runNow()), setLength = js.Any.fromFunction1(setLength), sub = js.Any.fromFunction1(sub), subVectors = js.Any.fromFunction2(subVectors))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Vector]
  }
  
  extension [Self <: Vector](x: Self) {
    
    inline def setAdd(value: Vector => Vector): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddVectors(value: (Vector, Vector) => Vector): Self = StObject.set(x, "addVectors", js.Any.fromFunction2(value))
    
    inline def setCopy(value: Vector => Vector): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
    
    inline def setDistanceTo(value: Vector => Double): Self = StObject.set(x, "distanceTo", js.Any.fromFunction1(value))
    
    inline def setDistanceToSquared(value: Vector => Double): Self = StObject.set(x, "distanceToSquared", js.Any.fromFunction1(value))
    
    inline def setDistanceToSquaredUndefined: Self = StObject.set(x, "distanceToSquared", js.undefined)
    
    inline def setDistanceToUndefined: Self = StObject.set(x, "distanceTo", js.undefined)
    
    inline def setDivideScalar(value: Double => Vector): Self = StObject.set(x, "divideScalar", js.Any.fromFunction1(value))
    
    inline def setDot(value: Vector => Double): Self = StObject.set(x, "dot", js.Any.fromFunction1(value))
    
    inline def setEquals_(value: Vector => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setGetComponent(value: Double => Double): Self = StObject.set(x, "getComponent", js.Any.fromFunction1(value))
    
    inline def setLength(value: CallbackTo[Double]): Self = StObject.set(x, "length", value.toJsFn)
    
    inline def setLengthSq(value: CallbackTo[Double]): Self = StObject.set(x, "lengthSq", value.toJsFn)
    
    inline def setLerp(value: (Vector, Double) => Vector): Self = StObject.set(x, "lerp", js.Any.fromFunction2(value))
    
    inline def setMultiplyScalar(value: Double => Vector): Self = StObject.set(x, "multiplyScalar", js.Any.fromFunction1(value))
    
    inline def setNegate(value: CallbackTo[Vector]): Self = StObject.set(x, "negate", value.toJsFn)
    
    inline def setNormalize(value: CallbackTo[Vector]): Self = StObject.set(x, "normalize", value.toJsFn)
    
    inline def setSetComponent(value: (Double, Double) => Callback): Self = StObject.set(x, "setComponent", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetLength(value: Double => Vector): Self = StObject.set(x, "setLength", js.Any.fromFunction1(value))
    
    inline def setSub(value: Vector => Vector): Self = StObject.set(x, "sub", js.Any.fromFunction1(value))
    
    inline def setSubVectors(value: (Vector, Vector) => Vector): Self = StObject.set(x, "subVectors", js.Any.fromFunction2(value))
  }
}
