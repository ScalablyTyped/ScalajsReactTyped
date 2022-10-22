package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Applies additional transform processing on data for InputPlaceholders and OutputPlaceholders used with MLComponent. For more information, see the MLComponent Overview. */
trait Transformer
  extends StObject
     with ScriptObject {
  
  /** Inverse transformation matrix of this Transformer. */
  var inverseMatrix: mat3
  
  /** Transformation matrix of this Transformer. */
  var matrix: mat3
}
object Transformer {
  
  inline def apply(getTypeName: CallbackTo[String], inverseMatrix: mat3, isOfType: String => Boolean, matrix: mat3): Transformer = {
    val __obj = js.Dynamic.literal(getTypeName = getTypeName.toJsFn, inverseMatrix = inverseMatrix.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), matrix = matrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transformer]
  }
  
  extension [Self <: Transformer](x: Self) {
    
    inline def setInverseMatrix(value: mat3): Self = StObject.set(x, "inverseMatrix", value.asInstanceOf[js.Any])
    
    inline def setMatrix(value: mat3): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
  }
}
