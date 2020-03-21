package typingsJapgolly.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceTargetDefinition extends js.Object {
  /**
    * The attribute to be changed.
    */
  var Attribute: js.UndefOr[ResourceAttribute] = js.native
  /**
    * If the attribute is Properties, the value is the name of the property. Otherwise, the value is null.
    */
  var Name: js.UndefOr[PropertyName] = js.native
  /**
    * If the attribute is Properties, indicates whether a change to this property causes the resource to be re-created.
    */
  var RequiresRecreation: js.UndefOr[typingsJapgolly.awsSdk.servicecatalogMod.RequiresRecreation] = js.native
}

object ResourceTargetDefinition {
  @scala.inline
  def apply(
    Attribute: ResourceAttribute = null,
    Name: PropertyName = null,
    RequiresRecreation: RequiresRecreation = null
  ): ResourceTargetDefinition = {
    val __obj = js.Dynamic.literal()
    if (Attribute != null) __obj.updateDynamic("Attribute")(Attribute.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RequiresRecreation != null) __obj.updateDynamic("RequiresRecreation")(RequiresRecreation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTargetDefinition]
  }
}

