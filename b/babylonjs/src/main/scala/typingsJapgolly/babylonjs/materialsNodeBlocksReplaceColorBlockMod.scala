package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPoint
import typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeBlocksReplaceColorBlockMod {
  
  @JSImport("babylonjs/Materials/Node/Blocks/replaceColorBlock", "ReplaceColorBlock")
  @js.native
  open class ReplaceColorBlock protected () extends NodeMaterialBlock {
    /**
      * Creates a new ReplaceColorBlock
      * @param name defines the block name
      */
    def this(name: String) = this()
    
    /**
      * Gets the distance input component
      */
    def distance: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the output component
      */
    def output: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the reference input component
      */
    def reference: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the replacement input component
      */
    def replacement: NodeMaterialConnectionPoint = js.native
    
    /**
      * Gets the value input component
      */
    def value: NodeMaterialConnectionPoint = js.native
  }
}
