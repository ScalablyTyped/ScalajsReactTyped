package typingsJapgolly.tensorflowTfjsBackendWebgl

import typingsJapgolly.tensorflowTfjsBackendWebgl.anon.AttrsCropAndResizeAttrs
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.KernelConfig
import typingsJapgolly.tensorflowTfjsCore.distKernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distKernelsCropAndResizeMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/CropAndResize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cropAndResize(args: AttrsCropAndResizeAttrs): TensorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(args.asInstanceOf[js.Any]).asInstanceOf[TensorInfo]
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/kernels/CropAndResize", "cropAndResizeConfig")
  @js.native
  val cropAndResizeConfig: KernelConfig = js.native
}
