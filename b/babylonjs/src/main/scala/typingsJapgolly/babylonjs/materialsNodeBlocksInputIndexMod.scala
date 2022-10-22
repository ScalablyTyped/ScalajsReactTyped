package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialBlockConnectionPointTypesMod.NodeMaterialBlockConnectionPointTypes
import typingsJapgolly.babylonjs.materialsNodeEnumsNodeMaterialBlockTargetsMod.NodeMaterialBlockTargets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksInputIndexMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Input/index", "AnimatedInputBlockTypes")
  @js.native
  object AnimatedInputBlockTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.babylonjs.materialsNodeBlocksInputAnimatedInputBlockTypesMod.AnimatedInputBlockTypes & Double
      ] = js.native
    
    /* 0 */ val None: typingsJapgolly.babylonjs.materialsNodeBlocksInputAnimatedInputBlockTypesMod.AnimatedInputBlockTypes.None & Double = js.native
    
    /* 1 */ val Time: typingsJapgolly.babylonjs.materialsNodeBlocksInputAnimatedInputBlockTypesMod.AnimatedInputBlockTypes.Time & Double = js.native
  }
  
  @JSImport("babylonjs/Materials/Node/Blocks/Input/index", "InputBlock")
  @js.native
  open class InputBlock protected ()
    extends typingsJapgolly.babylonjs.materialsNodeBlocksInputInputBlockMod.InputBlock {
    /**
      * Creates a new InputBlock
      * @param name defines the block name
      * @param target defines the target of that block (Vertex by default)
      * @param type defines the type of the input (can be set to NodeMaterialBlockConnectionPointTypes.AutoDetect)
      */
    def this(name: String) = this()
    def this(name: String, target: NodeMaterialBlockTargets) = this()
    def this(name: String, target: Unit, `type`: NodeMaterialBlockConnectionPointTypes) = this()
    def this(name: String, target: NodeMaterialBlockTargets, `type`: NodeMaterialBlockConnectionPointTypes) = this()
  }
}
