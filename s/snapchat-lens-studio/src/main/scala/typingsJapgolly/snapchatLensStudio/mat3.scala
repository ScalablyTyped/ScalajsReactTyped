package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A 3x3 matrix. */
trait mat3 extends StObject {
  
  /** Returns the result of adding the two matrices together. */
  def add(mat: mat3): mat3
  
  /** The first column of the matrix. */
  var column0: vec3
  
  /** The second column of the matrix. */
  var column1: vec3
  
  /** The third column of the matrix. */
  var column2: vec3
  
  /** Returns a string representation of the matrix. */
  var description: String
  
  /** Returns the determinant of the matrix. */
  def determinant(): Double
  
  /** Returns the result of dividing the two matrices. */
  def div(mat: mat3): mat3
  
  /** Returns whether the two matrices are equal. */
  def equal(mat: mat3): Boolean
  
  /** Returns the inverse of the matrix. */
  def inverse(): mat3
  
  /** Returns the result of multiplying the two matrices. */
  def mult(mat: mat3): mat3
  
  /** Returns the result of scalar multiplying the matrix. */
  def multiplyScalar(scalar: Double): mat3
  
  /** Returns the result of subtracting the two matrices. */
  def sub(mat: mat3): mat3
  
  /** Returns the transpose of this matrix. */
  def transpose(): mat3
}
object mat3 {
  
  inline def apply(
    add: mat3 => mat3,
    column0: vec3,
    column1: vec3,
    column2: vec3,
    description: String,
    determinant: CallbackTo[Double],
    div: mat3 => mat3,
    equal: mat3 => Boolean,
    inverse: CallbackTo[mat3],
    mult: mat3 => mat3,
    multiplyScalar: Double => mat3,
    sub: mat3 => mat3,
    transpose: CallbackTo[mat3]
  ): mat3 = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), column0 = column0.asInstanceOf[js.Any], column1 = column1.asInstanceOf[js.Any], column2 = column2.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], determinant = determinant.toJsFn, div = js.Any.fromFunction1(div), equal = js.Any.fromFunction1(equal), inverse = inverse.toJsFn, mult = js.Any.fromFunction1(mult), multiplyScalar = js.Any.fromFunction1(multiplyScalar), sub = js.Any.fromFunction1(sub), transpose = transpose.toJsFn)
    __obj.asInstanceOf[mat3]
  }
  
  extension [Self <: mat3](x: Self) {
    
    inline def setAdd(value: mat3 => mat3): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setColumn0(value: vec3): Self = StObject.set(x, "column0", value.asInstanceOf[js.Any])
    
    inline def setColumn1(value: vec3): Self = StObject.set(x, "column1", value.asInstanceOf[js.Any])
    
    inline def setColumn2(value: vec3): Self = StObject.set(x, "column2", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDeterminant(value: CallbackTo[Double]): Self = StObject.set(x, "determinant", value.toJsFn)
    
    inline def setDiv(value: mat3 => mat3): Self = StObject.set(x, "div", js.Any.fromFunction1(value))
    
    inline def setEqual(value: mat3 => Boolean): Self = StObject.set(x, "equal", js.Any.fromFunction1(value))
    
    inline def setInverse(value: CallbackTo[mat3]): Self = StObject.set(x, "inverse", value.toJsFn)
    
    inline def setMult(value: mat3 => mat3): Self = StObject.set(x, "mult", js.Any.fromFunction1(value))
    
    inline def setMultiplyScalar(value: Double => mat3): Self = StObject.set(x, "multiplyScalar", js.Any.fromFunction1(value))
    
    inline def setSub(value: mat3 => mat3): Self = StObject.set(x, "sub", js.Any.fromFunction1(value))
    
    inline def setTranspose(value: CallbackTo[mat3]): Self = StObject.set(x, "transpose", value.toJsFn)
  }
}
