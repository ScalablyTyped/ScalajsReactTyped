package typingsJapgolly.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientContribution extends js.Object {
  /**
    * Description of the contribution/type
    */
  var description: String
  /**
    * Fully qualified identifier of the contribution/type
    */
  var id: String
  /**
    * Includes is a set of contributions that should have this contribution included in their targets list.
    */
  var includes: js.Array[String]
  /**
    * Properties/attributes of this contribution
    */
  var properties: js.Any
  /**
    * The ids of the contribution(s) that this contribution targets. (parent contributions)
    */
  var targets: js.Array[String]
  /**
    * Id of the Contribution Type
    */
  var `type`: String
}

object ClientContribution {
  @scala.inline
  def apply(
    description: String,
    id: String,
    includes: js.Array[String],
    properties: js.Any,
    targets: js.Array[String],
    `type`: String
  ): ClientContribution = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientContribution]
  }
}

