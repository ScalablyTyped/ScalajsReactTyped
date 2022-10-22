package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksFragmentDerivativeBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/Fragment/derivativeBlock", "DerivativeBlock")
  @js.native
  open class DerivativeBlock protected () extends NodeMaterialBlock {
    /**
      * Create a new DerivativeBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the derivative output on x
      */
    def dx: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the derivative output on y
      */
    def dy: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the input component
      */
    def input: NodeMaterialConnectionPoint = js.native
  }
}
