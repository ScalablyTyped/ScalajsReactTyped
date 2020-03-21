package typingsJapgolly.minecraftScriptingTypesServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Controls the collision box of the entity. When changes to the component are applied the entity's collision box is immediately updated to reflect the new dimensions. WARNING: If the change of the collision box dimensions would cause the entity to be inside a block, the entity might become stuck there and start suffocating.
  */
trait ICollisionBoxComponent extends js.Object {
  /**
    * Height of the collision box in blocks. A negative value will be assumed to be 0
    * @default 1.0
    */
  var height: Double
  /**
    * Width and Depth of the collision box in blocks. A negative value will be assumed to be 0
    * @default 1.0
    */
  var width: Double
}

object ICollisionBoxComponent {
  @scala.inline
  def apply(height: Double, width: Double): ICollisionBoxComponent = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICollisionBoxComponent]
  }
}

