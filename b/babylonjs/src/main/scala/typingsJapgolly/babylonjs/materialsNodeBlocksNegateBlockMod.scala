package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksNegateBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/negateBlock", "NegateBlock")
  @js.native
  open class NegateBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new NegateBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the value input component
      */
    def value: NodeMaterialConnectionPoint = js.native
  }
}
