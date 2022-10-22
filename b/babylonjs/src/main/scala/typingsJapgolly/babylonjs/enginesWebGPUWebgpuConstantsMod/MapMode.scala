package typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MapMode extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "MapMode")
@js.native
object MapMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MapMode & Double] = js.native
  
  @js.native
  sealed trait Read
    extends StObject
       with MapMode
  /* 1 */ val Read: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.MapMode.Read & Double = js.native
  
  @js.native
  sealed trait Write
    extends StObject
       with MapMode
  /* 2 */ val Write: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.MapMode.Write & Double = js.native
}
