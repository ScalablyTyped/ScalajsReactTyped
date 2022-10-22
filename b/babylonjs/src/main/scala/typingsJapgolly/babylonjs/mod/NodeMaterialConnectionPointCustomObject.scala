package typingsJapgolly.babylonjs.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "NodeMaterialConnectionPointCustomObject")
@js.native
open class NodeMaterialConnectionPointCustomObject[T /* <: typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock */] protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.NodeMaterialConnectionPointCustomObject[T] {
  /**
    * Creates a new connection point
    * @param name defines the connection point name
    * @param ownerBlock defines the block hosting this connection point
    * @param direction defines the direction of the connection point
    * @param _blockType
    * @param _blockName
    * @param _nameForCheking
    */
  def this(
    name: String,
    ownerBlock: typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock,
    direction: typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPointDirection,
    _blockType: Instantiable1[/* args (repeated) */ Any, T],
    _blockName: String
  ) = this()
  def this(
    name: String,
    ownerBlock: typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock,
    direction: typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPointDirection,
    _blockType: Instantiable1[/* args (repeated) */ Any, T],
    _blockName: String,
    _nameForCheking: String
  ) = this()
}
