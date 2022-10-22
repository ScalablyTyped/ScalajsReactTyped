package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.AttrsFusedDepthwiseConv2DAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsFusedDepthwiseConv2DMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/FusedDepthwiseConv2D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fusedDepthwiseConv2D(args: AttrsFusedDepthwiseConv2DAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fusedDepthwiseConv2D")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/FusedDepthwiseConv2D", "fusedDepthwiseConv2DConfig")
  @js.native
  val fusedDepthwiseConv2DConfig: KernelConfig = js.native
}
