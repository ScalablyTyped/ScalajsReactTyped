package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.AttrsFusedConv2DAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsFusedConv2DMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/FusedConv2D", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/FusedConv2D", "fusedConv2DConfig")
  @js.native
  val fusedConv2DConfig: KernelConfig = js.native
  
  inline def fusedConv2d(args: AttrsFusedConv2DAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fusedConv2d")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
}
