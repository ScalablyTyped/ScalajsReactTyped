package typingsJapgolly.vsoNodeApi.profileInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeDescriptor extends js.Object {
  var attributeName: String
  var containerName: String
}

object AttributeDescriptor {
  @scala.inline
  def apply(attributeName: String, containerName: String): AttributeDescriptor = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AttributeDescriptor]
  }
}

