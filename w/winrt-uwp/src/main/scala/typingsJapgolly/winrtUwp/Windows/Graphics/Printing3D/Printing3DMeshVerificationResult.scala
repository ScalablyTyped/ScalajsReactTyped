package typingsJapgolly.winrtUwp.Windows.Graphics.Printing3D

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the VerifyAsync method. */
trait Printing3DMeshVerificationResult extends StObject {
  
  /** Gets a value that indicates if the mesh is valid. */
  var isValid: Boolean
  
  /** Gets the triangles with non-manifold edges, if applicable. */
  var nonmanifoldTriangles: IVectorView[Double]
  
  /** Gets the reverse normal triangles, if applicable. */
  var reversedNormalTriangles: IVectorView[Double]
}
object Printing3DMeshVerificationResult {
  
  inline def apply(
    isValid: Boolean,
    nonmanifoldTriangles: IVectorView[Double],
    reversedNormalTriangles: IVectorView[Double]
  ): Printing3DMeshVerificationResult = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], nonmanifoldTriangles = nonmanifoldTriangles.asInstanceOf[js.Any], reversedNormalTriangles = reversedNormalTriangles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DMeshVerificationResult]
  }
  
  extension [Self <: Printing3DMeshVerificationResult](x: Self) {
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setNonmanifoldTriangles(value: IVectorView[Double]): Self = StObject.set(x, "nonmanifoldTriangles", value.asInstanceOf[js.Any])
    
    inline def setReversedNormalTriangles(value: IVectorView[Double]): Self = StObject.set(x, "reversedNormalTriangles", value.asInstanceOf[js.Any])
  }
}
