package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksDotBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/dotBlock", "DotBlock")
  @js.native
  open class DotBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new DotBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the left operand input component
      */
    def left: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the right operand input component
      */
    def right: NodeMaterialConnectionPoint = js.native
  }
}
