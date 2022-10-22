package typingsJapgolly.tensorflowTfjsBackendWasm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsTypesMod {
  
  @js.native
  sealed trait CppDType extends StObject
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/types", "CppDType")
  @js.native
  object CppDType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CppDType & Double] = js.native
    
    @js.native
    sealed trait bool
      extends StObject
         with CppDType
    /* 2 */ val bool: typingsJapgolly.tensorflowTfjsBackendWasm.distKernelsTypesMod.CppDType.bool & Double = js.native
    
    @js.native
    sealed trait complex64
      extends StObject
         with CppDType
    /* 4 */ val complex64: typingsJapgolly.tensorflowTfjsBackendWasm.distKernelsTypesMod.CppDType.complex64 & Double = js.native
    
    @js.native
    sealed trait float32
      extends StObject
         with CppDType
    /* 0 */ val float32: typingsJapgolly.tensorflowTfjsBackendWasm.distKernelsTypesMod.CppDType.float32 & Double = js.native
    
    @js.native
    sealed trait int32
      extends StObject
         with CppDType
    /* 1 */ val int32: typingsJapgolly.tensorflowTfjsBackendWasm.distKernelsTypesMod.CppDType.int32 & Double = js.native
    
    @js.native
    sealed trait string
      extends StObject
         with CppDType
    /* 3 */ val string: typingsJapgolly.tensorflowTfjsBackendWasm.distKernelsTypesMod.CppDType.string & Double = js.native
  }
  
  @js.native
  sealed trait FusableActivation extends StObject
  @JSImport("@tensorflow/tfjs-backend-wasm/dist/kernels/types", "FusableActivation")
  @js.native
  object FusableActivation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FusableActivation & Double] = js.native
    
    @js.native
    sealed trait elu
      extends StObject
         with FusableActivation
    /* 6 */ val elu: typingsJapgolly.tensorflowTfjsBackendWasm.distKernelsTypesMod.FusableActivation.elu & Double = js.native
    
    @js.native
    sealed trait leakyrelu
      extends StObject
         with FusableActivation
    /* 4 */ val leakyrelu: typingsJapgolly.tensorflowTfjsBackendWasm.distKernelsTypesMod.FusableActivation.leakyrelu & Double = js.native
    
    @js.native
    sealed trait linear
      extends StObject
         with FusableActivation
    /* 0 */ val linear: typingsJapgolly.tensorflowTfjsBackendWasm.distKernelsTypesMod.FusableActivation.linear & Double = js.native
    
    @js.native
    sealed trait prelu
      extends StObject
         with FusableActivation
    /* 3 */ val prelu: typingsJapgolly.tensorflowTfjsBackendWasm.distKernelsTypesMod.FusableActivation.prelu & Double = js.native
    
    @js.native
    sealed trait relu
      extends StObject
         with FusableActivation
    /* 1 */ val relu: typingsJapgolly.tensorflowTfjsBackendWasm.distKernelsTypesMod.FusableActivation.relu & Double = js.native
    
    @js.native
    sealed trait relu6
      extends StObject
         with FusableActivation
    /* 2 */ val relu6: typingsJapgolly.tensorflowTfjsBackendWasm.distKernelsTypesMod.FusableActivation.relu6 & Double = js.native
    
    @js.native
    sealed trait sigmoid
      extends StObject
         with FusableActivation
    /* 5 */ val sigmoid: typingsJapgolly.tensorflowTfjsBackendWasm.distKernelsTypesMod.FusableActivation.sigmoid & Double = js.native
  }
}
