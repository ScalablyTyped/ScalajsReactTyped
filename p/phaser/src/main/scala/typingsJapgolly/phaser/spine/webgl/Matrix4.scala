package typingsJapgolly.phaser.spine.webgl

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phaser.spine.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Matrix4 extends StObject {
  
  def copy(): Matrix4
  
  def determinant(): Double
  
  def identity(): Matrix4
  
  def invert(): Matrix4
  
  def lookAt(position: Vector3, direction: Vector3, up: Vector3): this.type
  
  def multiply(matrix: Matrix4): Matrix4
  
  def multiplyLeft(matrix: Matrix4): Matrix4
  
  def ortho(left: Double, right: Double, bottom: Double, top: Double, near: Double, far: Double): Matrix4
  
  def ortho2d(x: Double, y: Double, width: Double, height: Double): Matrix4
  
  def projection(near: Double, far: Double, fovy: Double, aspectRatio: Double): Matrix4
  
  def set(values: ArrayLike[Double]): Matrix4
  
  var temp: js.typedarray.Float32Array
  
  def translate(x: Double, y: Double, z: Double): Matrix4
  
  def transpose(): Matrix4
  
  var values: js.typedarray.Float32Array
}
object Matrix4 {
  
  inline def apply(
    copy: CallbackTo[Matrix4],
    determinant: CallbackTo[Double],
    identity: CallbackTo[Matrix4],
    invert: CallbackTo[Matrix4],
    lookAt: (Vector3, Vector3, Vector3) => Matrix4,
    multiply: Matrix4 => Matrix4,
    multiplyLeft: Matrix4 => Matrix4,
    ortho: (Double, Double, Double, Double, Double, Double) => Matrix4,
    ortho2d: (Double, Double, Double, Double) => Matrix4,
    projection: (Double, Double, Double, Double) => Matrix4,
    set: ArrayLike[Double] => Matrix4,
    temp: js.typedarray.Float32Array,
    translate: (Double, Double, Double) => Matrix4,
    transpose: CallbackTo[Matrix4],
    values: js.typedarray.Float32Array
  ): Matrix4 = {
    val __obj = js.Dynamic.literal(copy = copy.toJsFn, determinant = determinant.toJsFn, identity = identity.toJsFn, invert = invert.toJsFn, lookAt = js.Any.fromFunction3(lookAt), multiply = js.Any.fromFunction1(multiply), multiplyLeft = js.Any.fromFunction1(multiplyLeft), ortho = js.Any.fromFunction6(ortho), ortho2d = js.Any.fromFunction4(ortho2d), projection = js.Any.fromFunction4(projection), set = js.Any.fromFunction1(set), temp = temp.asInstanceOf[js.Any], translate = js.Any.fromFunction3(translate), transpose = transpose.toJsFn, values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Matrix4]
  }
  
  extension [Self <: Matrix4](x: Self) {
    
    inline def setCopy(value: CallbackTo[Matrix4]): Self = StObject.set(x, "copy", value.toJsFn)
    
    inline def setDeterminant(value: CallbackTo[Double]): Self = StObject.set(x, "determinant", value.toJsFn)
    
    inline def setIdentity(value: CallbackTo[Matrix4]): Self = StObject.set(x, "identity", value.toJsFn)
    
    inline def setInvert(value: CallbackTo[Matrix4]): Self = StObject.set(x, "invert", value.toJsFn)
    
    inline def setLookAt(value: (Vector3, Vector3, Vector3) => Matrix4): Self = StObject.set(x, "lookAt", js.Any.fromFunction3(value))
    
    inline def setMultiply(value: Matrix4 => Matrix4): Self = StObject.set(x, "multiply", js.Any.fromFunction1(value))
    
    inline def setMultiplyLeft(value: Matrix4 => Matrix4): Self = StObject.set(x, "multiplyLeft", js.Any.fromFunction1(value))
    
    inline def setOrtho(value: (Double, Double, Double, Double, Double, Double) => Matrix4): Self = StObject.set(x, "ortho", js.Any.fromFunction6(value))
    
    inline def setOrtho2d(value: (Double, Double, Double, Double) => Matrix4): Self = StObject.set(x, "ortho2d", js.Any.fromFunction4(value))
    
    inline def setProjection(value: (Double, Double, Double, Double) => Matrix4): Self = StObject.set(x, "projection", js.Any.fromFunction4(value))
    
    inline def setSet(value: ArrayLike[Double] => Matrix4): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setTemp(value: js.typedarray.Float32Array): Self = StObject.set(x, "temp", value.asInstanceOf[js.Any])
    
    inline def setTranslate(value: (Double, Double, Double) => Matrix4): Self = StObject.set(x, "translate", js.Any.fromFunction3(value))
    
    inline def setTranspose(value: CallbackTo[Matrix4]): Self = StObject.set(x, "transpose", value.toJsFn)
    
    inline def setValues(value: js.typedarray.Float32Array): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
