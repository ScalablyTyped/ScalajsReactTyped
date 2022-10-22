package typingsJapgolly.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeEnumsNodeMaterialSystemValuesMod {
  
  @js.native
  sealed trait NodeMaterialSystemValues extends StObject
  @JSImport("babylonjs/Materials/Node/Enums/nodeMaterialSystemValues", "NodeMaterialSystemValues")
  @js.native
  object NodeMaterialSystemValues extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeMaterialSystemValues & Double] = js.native
    
    /** Camera parameters */
    @js.native
    sealed trait CameraParameters
      extends StObject
         with NodeMaterialSystemValues
    /* 10 */ val CameraParameters: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialSystemValuesMod.NodeMaterialSystemValues.CameraParameters & Double = js.native
    
    /** CameraPosition */
    @js.native
    sealed trait CameraPosition
      extends StObject
         with NodeMaterialSystemValues
    /* 7 */ val CameraPosition: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialSystemValuesMod.NodeMaterialSystemValues.CameraPosition & Double = js.native
    
    /** Delta time */
    @js.native
    sealed trait DeltaTime
      extends StObject
         with NodeMaterialSystemValues
    /* 9 */ val DeltaTime: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialSystemValuesMod.NodeMaterialSystemValues.DeltaTime & Double = js.native
    
    /** Fog Color */
    @js.native
    sealed trait FogColor
      extends StObject
         with NodeMaterialSystemValues
    /* 8 */ val FogColor: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialSystemValuesMod.NodeMaterialSystemValues.FogColor & Double = js.native
    
    /** Material alpha */
    @js.native
    sealed trait MaterialAlpha
      extends StObject
         with NodeMaterialSystemValues
    /* 11 */ val MaterialAlpha: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialSystemValuesMod.NodeMaterialSystemValues.MaterialAlpha & Double = js.native
    
    /** Projection */
    @js.native
    sealed trait Projection
      extends StObject
         with NodeMaterialSystemValues
    /* 3 */ val Projection: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialSystemValuesMod.NodeMaterialSystemValues.Projection & Double = js.native
    
    /** View */
    @js.native
    sealed trait View
      extends StObject
         with NodeMaterialSystemValues
    /* 2 */ val View: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialSystemValuesMod.NodeMaterialSystemValues.View & Double = js.native
    
    /** ViewProjection */
    @js.native
    sealed trait ViewProjection
      extends StObject
         with NodeMaterialSystemValues
    /* 4 */ val ViewProjection: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialSystemValuesMod.NodeMaterialSystemValues.ViewProjection & Double = js.native
    
    /** World */
    @js.native
    sealed trait World
      extends StObject
         with NodeMaterialSystemValues
    /* 1 */ val World: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialSystemValuesMod.NodeMaterialSystemValues.World & Double = js.native
    
    /** WorldView */
    @js.native
    sealed trait WorldView
      extends StObject
         with NodeMaterialSystemValues
    /* 5 */ val WorldView: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialSystemValuesMod.NodeMaterialSystemValues.WorldView & Double = js.native
    
    /** WorldViewProjection */
    @js.native
    sealed trait WorldViewProjection
      extends StObject
         with NodeMaterialSystemValues
    /* 6 */ val WorldViewProjection: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialSystemValuesMod.NodeMaterialSystemValues.WorldViewProjection & Double = js.native
  }
}
