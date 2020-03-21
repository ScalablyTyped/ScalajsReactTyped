package typingsJapgolly.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityFilter extends js.Object {
  /**
    * The name of the entity search filter field. REFERENCED_ENTITY_ID filters on entities that are used by the entity in the result set. For example, you can filter on the ID of a property that is used in a state.
    */
  var name: js.UndefOr[EntityFilterName] = js.native
  /**
    * An array of string values for the search filter field. Multiple values function as AND criteria in the search.
    */
  var value: js.UndefOr[EntityFilterValues] = js.native
}

object EntityFilter {
  @scala.inline
  def apply(name: EntityFilterName = null, value: EntityFilterValues = null): EntityFilter = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityFilter]
  }
}

