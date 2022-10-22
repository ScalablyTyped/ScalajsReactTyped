package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.InputBlock")
@js.native
open class InputBlock protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.InputBlock {
  /**
    * Creates a new InputBlock
    * @param name defines the block name
    * @param target defines the target of that block (Vertex by default)
    * @param type defines the type of the input (can be set to NodeMaterialBlockConnectionPointTypes.AutoDetect)
    */
  def this(name: String) = this()
  def this(name: String, target: typingsJapgolly.babylonjs.BABYLON.NodeMaterialBlockTargets) = this()
  def this(
    name: String,
    target: Unit,
    `type`: typingsJapgolly.babylonjs.BABYLON.NodeMaterialBlockConnectionPointTypes
  ) = this()
  def this(
    name: String,
    target: typingsJapgolly.babylonjs.BABYLON.NodeMaterialBlockTargets,
    `type`: typingsJapgolly.babylonjs.BABYLON.NodeMaterialBlockConnectionPointTypes
  ) = this()
}
