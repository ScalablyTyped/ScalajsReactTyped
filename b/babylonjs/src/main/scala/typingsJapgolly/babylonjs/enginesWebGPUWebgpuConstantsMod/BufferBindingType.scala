package typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BufferBindingType extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "BufferBindingType")
@js.native
object BufferBindingType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BufferBindingType & String] = js.native
  
  @js.native
  sealed trait ReadOnlyStorage
    extends StObject
       with BufferBindingType
  /* "read-only-storage" */ val ReadOnlyStorage: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.BufferBindingType.ReadOnlyStorage & String = js.native
  
  @js.native
  sealed trait Storage
    extends StObject
       with BufferBindingType
  /* "storage" */ val Storage: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.BufferBindingType.Storage & String = js.native
  
  @js.native
  sealed trait Uniform
    extends StObject
       with BufferBindingType
  /* "uniform" */ val Uniform: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.BufferBindingType.Uniform & String = js.native
}
