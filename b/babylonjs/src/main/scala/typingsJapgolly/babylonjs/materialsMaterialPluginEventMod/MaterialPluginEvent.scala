package typingsJapgolly.babylonjs.materialsMaterialPluginEventMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MaterialPluginEvent extends StObject
@JSImport("babylonjs/Materials/materialPluginEvent", "MaterialPluginEvent")
@js.native
object MaterialPluginEvent extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MaterialPluginEvent & Double] = js.native
  
  @js.native
  sealed trait BindForSubMesh
    extends StObject
       with MaterialPluginEvent
  /* 64 */ val BindForSubMesh: typingsJapgolly.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.BindForSubMesh & Double = js.native
  
  @js.native
  sealed trait Created
    extends StObject
       with MaterialPluginEvent
  /* 1 */ val Created: typingsJapgolly.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.Created & Double = js.native
  
  @js.native
  sealed trait Disposed
    extends StObject
       with MaterialPluginEvent
  /* 2 */ val Disposed: typingsJapgolly.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.Disposed & Double = js.native
  
  @js.native
  sealed trait FillRenderTargetTextures
    extends StObject
       with MaterialPluginEvent
  /* 2048 */ val FillRenderTargetTextures: typingsJapgolly.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.FillRenderTargetTextures & Double = js.native
  
  @js.native
  sealed trait GetActiveTextures
    extends StObject
       with MaterialPluginEvent
  /* 512 */ val GetActiveTextures: typingsJapgolly.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.GetActiveTextures & Double = js.native
  
  @js.native
  sealed trait GetAnimatables
    extends StObject
       with MaterialPluginEvent
  /* 256 */ val GetAnimatables: typingsJapgolly.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.GetAnimatables & Double = js.native
  
  @js.native
  sealed trait GetDefineNames
    extends StObject
       with MaterialPluginEvent
  /* 4 */ val GetDefineNames: typingsJapgolly.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.GetDefineNames & Double = js.native
  
  @js.native
  sealed trait HardBindForSubMesh
    extends StObject
       with MaterialPluginEvent
  /* 8192 */ val HardBindForSubMesh: typingsJapgolly.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.HardBindForSubMesh & Double = js.native
  
  @js.native
  sealed trait HasRenderTargetTextures
    extends StObject
       with MaterialPluginEvent
  /* 4096 */ val HasRenderTargetTextures: typingsJapgolly.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.HasRenderTargetTextures & Double = js.native
  
  @js.native
  sealed trait HasTexture
    extends StObject
       with MaterialPluginEvent
  /* 1024 */ val HasTexture: typingsJapgolly.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.HasTexture & Double = js.native
  
  @js.native
  sealed trait IsReadyForSubMesh
    extends StObject
       with MaterialPluginEvent
  /* 16 */ val IsReadyForSubMesh: typingsJapgolly.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.IsReadyForSubMesh & Double = js.native
  
  @js.native
  sealed trait PrepareDefines
    extends StObject
       with MaterialPluginEvent
  /* 32 */ val PrepareDefines: typingsJapgolly.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.PrepareDefines & Double = js.native
  
  @js.native
  sealed trait PrepareEffect
    extends StObject
       with MaterialPluginEvent
  /* 128 */ val PrepareEffect: typingsJapgolly.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.PrepareEffect & Double = js.native
  
  @js.native
  sealed trait PrepareUniformBuffer
    extends StObject
       with MaterialPluginEvent
  /* 8 */ val PrepareUniformBuffer: typingsJapgolly.babylonjs.materialsMaterialPluginEventMod.MaterialPluginEvent.PrepareUniformBuffer & Double = js.native
}
