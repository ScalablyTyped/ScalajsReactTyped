package typingsJapgolly.three.anon

import typingsJapgolly.three.srcThreeMod.BufferAttribute
import typingsJapgolly.three.srcThreeMod.InterleavedBufferAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InverseBindMatrices extends StObject {
  
  var inverseBindMatrices: js.UndefOr[BufferAttribute | InterleavedBufferAttribute] = js.undefined
  
  var joints: js.Array[Double]
}
object InverseBindMatrices {
  
  inline def apply(joints: js.Array[Double]): InverseBindMatrices = {
    val __obj = js.Dynamic.literal(joints = joints.asInstanceOf[js.Any])
    __obj.asInstanceOf[InverseBindMatrices]
  }
  
  extension [Self <: InverseBindMatrices](x: Self) {
    
    inline def setInverseBindMatrices(value: BufferAttribute | InterleavedBufferAttribute): Self = StObject.set(x, "inverseBindMatrices", value.asInstanceOf[js.Any])
    
    inline def setInverseBindMatricesUndefined: Self = StObject.set(x, "inverseBindMatrices", js.undefined)
    
    inline def setJoints(value: js.Array[Double]): Self = StObject.set(x, "joints", value.asInstanceOf[js.Any])
    
    inline def setJointsVarargs(value: Double*): Self = StObject.set(x, "joints", js.Array(value*))
  }
}
