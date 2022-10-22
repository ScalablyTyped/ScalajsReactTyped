package typingsJapgolly.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeEnumsNodeMaterialBlockConnectionPointTypesMod {
  
  @js.native
  sealed trait NodeMaterialBlockConnectionPointTypes extends StObject
  @JSImport("babylonjs/Materials/Node/Enums/nodeMaterialBlockConnectionPointTypes", "NodeMaterialBlockConnectionPointTypes")
  @js.native
  object NodeMaterialBlockConnectionPointTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NodeMaterialBlockConnectionPointTypes & Double] = js.native
    
    /** Detect type based on connection */
    @js.native
    sealed trait AutoDetect
      extends StObject
         with NodeMaterialBlockConnectionPointTypes
    /* 1024 */ val AutoDetect: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes.AutoDetect & Double = js.native
    
    /** Output type that will be defined by input type */
    @js.native
    sealed trait BasedOnInput
      extends StObject
         with NodeMaterialBlockConnectionPointTypes
    /* 2048 */ val BasedOnInput: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes.BasedOnInput & Double = js.native
    
    /** Color3 */
    @js.native
    sealed trait Color3
      extends StObject
         with NodeMaterialBlockConnectionPointTypes
    /* 32 */ val Color3: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes.Color3 & Double = js.native
    
    /** Color4 */
    @js.native
    sealed trait Color4
      extends StObject
         with NodeMaterialBlockConnectionPointTypes
    /* 64 */ val Color4: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes.Color4 & Double = js.native
    
    /** Float */
    @js.native
    sealed trait Float
      extends StObject
         with NodeMaterialBlockConnectionPointTypes
    /* 1 */ val Float: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes.Float & Double = js.native
    
    /** Int */
    @js.native
    sealed trait Int
      extends StObject
         with NodeMaterialBlockConnectionPointTypes
    /* 2 */ val Int: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes.Int & Double = js.native
    
    /** Matrix */
    @js.native
    sealed trait Matrix
      extends StObject
         with NodeMaterialBlockConnectionPointTypes
    /* 128 */ val Matrix: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes.Matrix & Double = js.native
    
    /** Custom object */
    @js.native
    sealed trait Object
      extends StObject
         with NodeMaterialBlockConnectionPointTypes
    /* 256 */ val Object: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes.Object & Double = js.native
    
    /** Vector2 */
    @js.native
    sealed trait Vector2
      extends StObject
         with NodeMaterialBlockConnectionPointTypes
    /* 4 */ val Vector2: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes.Vector2 & Double = js.native
    
    /** Vector3 */
    @js.native
    sealed trait Vector3
      extends StObject
         with NodeMaterialBlockConnectionPointTypes
    /* 8 */ val Vector3: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes.Vector3 & Double = js.native
    
    /** Vector4 */
    @js.native
    sealed trait Vector4
      extends StObject
         with NodeMaterialBlockConnectionPointTypes
    /* 16 */ val Vector4: typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes.Vector4 & Double = js.native
  }
}
