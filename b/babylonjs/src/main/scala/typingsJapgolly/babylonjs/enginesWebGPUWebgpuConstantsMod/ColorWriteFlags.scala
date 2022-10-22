package typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColorWriteFlags extends StObject
@JSImport("babylonjs/Engines/WebGPU/webgpuConstants", "ColorWriteFlags")
@js.native
object ColorWriteFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColorWriteFlags & Double] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with ColorWriteFlags
  /* 15 */ val All: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.ColorWriteFlags.All & Double = js.native
  
  @js.native
  sealed trait Alpha
    extends StObject
       with ColorWriteFlags
  /* 8 */ val Alpha: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.ColorWriteFlags.Alpha & Double = js.native
  
  @js.native
  sealed trait Blue
    extends StObject
       with ColorWriteFlags
  /* 4 */ val Blue: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.ColorWriteFlags.Blue & Double = js.native
  
  @js.native
  sealed trait Green
    extends StObject
       with ColorWriteFlags
  /* 2 */ val Green: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.ColorWriteFlags.Green & Double = js.native
  
  @js.native
  sealed trait Red
    extends StObject
       with ColorWriteFlags
  /* 1 */ val Red: typingsJapgolly.babylonjs.enginesWebGPUWebgpuConstantsMod.ColorWriteFlags.Red & Double = js.native
}
