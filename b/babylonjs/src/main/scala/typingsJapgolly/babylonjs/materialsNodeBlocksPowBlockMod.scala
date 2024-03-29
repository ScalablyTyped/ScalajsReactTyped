package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksPowBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/powBlock", "PowBlock")
  @js.native
  open class PowBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new PowBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the power operand input component
      */
    def power: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the value operand input component
      */
    def value: NodeMaterialConnectionPoint = js.native
  }
}
