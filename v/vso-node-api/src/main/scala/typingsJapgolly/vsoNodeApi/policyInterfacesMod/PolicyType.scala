package typingsJapgolly.vsoNodeApi.policyInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyType extends PolicyTypeRef {
  /**
    * The links to other objects related to this object.
    */
  var _links: js.Any
  /**
    * Detailed description of the policy type.
    */
  var description: String
}

object PolicyType {
  @scala.inline
  def apply(_links: js.Any, description: String, displayName: String, id: String, url: String): PolicyType = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PolicyType]
  }
}

