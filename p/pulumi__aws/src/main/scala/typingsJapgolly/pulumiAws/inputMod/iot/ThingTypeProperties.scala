package typingsJapgolly.pulumiAws.inputMod.iot

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingTypeProperties extends js.Object {
  /**
    * The description of the thing type.
    */
  var description: js.UndefOr[Input[String]] = js.native
  /**
    * A list of searchable thing attribute names.
    */
  var searchableAttributes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object ThingTypeProperties {
  @scala.inline
  def apply(description: Input[String] = null, searchableAttributes: Input[js.Array[Input[String]]] = null): ThingTypeProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (searchableAttributes != null) __obj.updateDynamic("searchableAttributes")(searchableAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingTypeProperties]
  }
}

