package typingsJapgolly.snapchatLensStudio.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LookAtComponent {
  
  /**
    * The “aim” and “up” vectors used with LookAtComponent when determining rotation. LookAtComponent will try to point the Aim axis of the SceneObject towards the target, while keeping the Up axis
    * of the SceneObject pointing towards worldUpVector.
    */
  @JSGlobal("LookAtComponent.AimVectors")
  @js.native
  object AimVectors extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors & Double] = js.native
    
    /* 18 */ val NegativeXAimNegativeYUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.NegativeXAimNegativeYUp & Double = js.native
    
    /* 19 */ val NegativeXAimNegativeZUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.NegativeXAimNegativeZUp & Double = js.native
    
    /* 12 */ val NegativeXAimYUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.NegativeXAimYUp & Double = js.native
    
    /* 13 */ val NegativeXAimZUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.NegativeXAimZUp & Double = js.native
    
    /* 20 */ val NegativeYAimNegativeXUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.NegativeYAimNegativeXUp & Double = js.native
    
    /* 21 */ val NegativeYAimNegativeZUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.NegativeYAimNegativeZUp & Double = js.native
    
    /* 14 */ val NegativeYAimXUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.NegativeYAimXUp & Double = js.native
    
    /* 15 */ val NegativeYAimZUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.NegativeYAimZUp & Double = js.native
    
    /* 22 */ val NegativeZAimNegativeXUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.NegativeZAimNegativeXUp & Double = js.native
    
    /* 23 */ val NegativeZAimNegativeYUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.NegativeZAimNegativeYUp & Double = js.native
    
    /* 16 */ val NegativeZAimXUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.NegativeZAimXUp & Double = js.native
    
    /* 17 */ val NegativeZAimYUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.NegativeZAimYUp & Double = js.native
    
    /* 6 */ val XAimNegativeYUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.XAimNegativeYUp & Double = js.native
    
    /* 7 */ val XAimNegativeZUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.XAimNegativeZUp & Double = js.native
    
    /* 0 */ val XAimYUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.XAimYUp & Double = js.native
    
    /* 1 */ val XAimZUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.XAimZUp & Double = js.native
    
    /* 8 */ val YAimNegativeXUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.YAimNegativeXUp & Double = js.native
    
    /* 9 */ val YAimNegativeZUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.YAimNegativeZUp & Double = js.native
    
    /* 2 */ val YAimXUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.YAimXUp & Double = js.native
    
    /* 3 */ val YAimZUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.YAimZUp & Double = js.native
    
    /* 10 */ val ZAimNegativeXUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.ZAimNegativeXUp & Double = js.native
    
    /* 11 */ val ZAimNegativeYUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.ZAimNegativeYUp & Double = js.native
    
    /* 4 */ val ZAimXUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.ZAimXUp & Double = js.native
    
    /* 5 */ val ZAimYUp: typingsJapgolly.snapchatLensStudio.LookAtComponent.AimVectors.ZAimYUp & Double = js.native
  }
  
  /**
    * Modes used in LookAtComponent.lookAtMode to determine the rotation method being used.
    * ```
    * // @input Component.LookAtComponent lookAt
    *
    * script.lookAt.lookAtMode = LookAtComponent.LookAtMode.LookAtPoint;
    * script.lookAt.target = script.getSceneObject();
    * ```
    */
  @JSGlobal("LookAtComponent.LookAtMode")
  @js.native
  object LookAtMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.snapchatLensStudio.LookAtComponent.LookAtMode & Double] = js.native
    
    /* 1 */ val LookAtDirection: typingsJapgolly.snapchatLensStudio.LookAtComponent.LookAtMode.LookAtDirection & Double = js.native
    
    /* 0 */ val LookAtPoint: typingsJapgolly.snapchatLensStudio.LookAtComponent.LookAtMode.LookAtPoint & Double = js.native
  }
  
  /**
    * Used with LookAtComponent to set the “up” vector when determining rotation.
    * ```
    * // Set the LookAtComponent's WorldUpVector to SceneY
    * // @input Component.LookAtComponent lookAtComponent
    * script.lookAtComponent.worldUpVector = LookAtComponent.WorldUpVector.SceneY;
    * ```
    */
  @JSGlobal("LookAtComponent.WorldUpVector")
  @js.native
  object WorldUpVector extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.snapchatLensStudio.LookAtComponent.WorldUpVector & Double] = js.native
    
    /* 6 */ val ObjectX: typingsJapgolly.snapchatLensStudio.LookAtComponent.WorldUpVector.ObjectX & Double = js.native
    
    /* 7 */ val ObjectY: typingsJapgolly.snapchatLensStudio.LookAtComponent.WorldUpVector.ObjectY & Double = js.native
    
    /* 8 */ val ObjectZ: typingsJapgolly.snapchatLensStudio.LookAtComponent.WorldUpVector.ObjectZ & Double = js.native
    
    /* 0 */ val SceneX: typingsJapgolly.snapchatLensStudio.LookAtComponent.WorldUpVector.SceneX & Double = js.native
    
    /* 1 */ val SceneY: typingsJapgolly.snapchatLensStudio.LookAtComponent.WorldUpVector.SceneY & Double = js.native
    
    /* 2 */ val SceneZ: typingsJapgolly.snapchatLensStudio.LookAtComponent.WorldUpVector.SceneZ & Double = js.native
    
    /* 3 */ val TargetX: typingsJapgolly.snapchatLensStudio.LookAtComponent.WorldUpVector.TargetX & Double = js.native
    
    /* 4 */ val TargetY: typingsJapgolly.snapchatLensStudio.LookAtComponent.WorldUpVector.TargetY & Double = js.native
    
    /* 5 */ val TargetZ: typingsJapgolly.snapchatLensStudio.LookAtComponent.WorldUpVector.TargetZ & Double = js.native
  }
}
