package typingsJapgolly.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericResourceFilter extends js.Object {
  /**
    * The resource type.
    */
  var resourceType: js.UndefOr[String] = js.undefined
  /**
    * The tag name.
    */
  var tagname: js.UndefOr[String] = js.undefined
  /**
    * The tag value.
    */
  var tagvalue: js.UndefOr[String] = js.undefined
}

object GenericResourceFilter {
  @scala.inline
  def apply(resourceType: String = null, tagname: String = null, tagvalue: String = null): GenericResourceFilter = {
    val __obj = js.Dynamic.literal()
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (tagname != null) __obj.updateDynamic("tagname")(tagname.asInstanceOf[js.Any])
    if (tagvalue != null) __obj.updateDynamic("tagvalue")(tagvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericResourceFilter]
  }
}

