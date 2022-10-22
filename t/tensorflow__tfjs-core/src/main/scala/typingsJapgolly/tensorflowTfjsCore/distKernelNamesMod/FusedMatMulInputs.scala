package typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod

import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.NamedTensorInfoMap
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FusedMatMulInputs
  extends StObject
     with NamedTensorInfoMap {
  
  var a: TensorInfo
  
  var b: TensorInfo
  
  var bias: js.UndefOr[TensorInfo] = js.undefined
  
  var preluActivationWeights: js.UndefOr[TensorInfo] = js.undefined
}
object FusedMatMulInputs {
  
  inline def apply(a: TensorInfo, b: TensorInfo): FusedMatMulInputs = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedMatMulInputs]
  }
  
  extension [Self <: FusedMatMulInputs](x: Self) {
    
    inline def setA(value: TensorInfo): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: TensorInfo): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setBias(value: TensorInfo): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
    
    inline def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
    
    inline def setPreluActivationWeights(value: TensorInfo): Self = StObject.set(x, "preluActivationWeights", value.asInstanceOf[js.Any])
    
    inline def setPreluActivationWeightsUndefined: Self = StObject.set(x, "preluActivationWeights", js.undefined)
  }
}
