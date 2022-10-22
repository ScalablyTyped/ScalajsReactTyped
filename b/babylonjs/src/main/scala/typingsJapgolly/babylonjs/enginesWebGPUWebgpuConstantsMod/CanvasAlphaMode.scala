package typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CanvasAlphaMode extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "CanvasAlphaMode")
@js.native
object CanvasAlphaMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CanvasAlphaMode & String] = js.native
  
  @js.native
  sealed trait Opaque
    extends StObject
       with CanvasAlphaMode
  /* "opaque" */ val Opaque: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.CanvasAlphaMode.Opaque & String = js.native
  
  @js.native
  sealed trait Premultiplied
    extends StObject
       with CanvasAlphaMode
  /* "premultiplied" */ val Premultiplied: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.CanvasAlphaMode.Premultiplied & String = js.native
}
