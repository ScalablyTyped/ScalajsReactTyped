package typingsJapgolly.babylonjs.materialsIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "NodeMaterialConnectionPoint")
@js.native
open class NodeMaterialConnectionPoint protected ()
  extends typingsJapgolly.babylonjs.materialsNodeIndexMod.NodeMaterialConnectionPoint {
  /**
    * Creates a new connection point
    * @param name defines the connection point name
    * @param ownerBlock defines the block hosting this connection point
    * @param direction defines the direction of the connection point
    */
  def this(
    name: String,
    ownerBlock: typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock,
    direction: typingsJapgolly.babylonjs.materialsNodeNodeMaterialBlockConnectionPointMod.NodeMaterialConnectionPointDirection
  ) = this()
}
/* static members */
object NodeMaterialConnectionPoint {
  
  @JSImport("babylonjs/Materials/index", "NodeMaterialConnectionPoint")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Checks if two types are equivalent
    * @param type1 type 1 to check
    * @param type2 type 2 to check
    * @returns true if both types are equivalent, else false
    */
  inline def AreEquivalentTypes(type1: Double, type2: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("AreEquivalentTypes")(type1.asInstanceOf[js.Any], type2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
