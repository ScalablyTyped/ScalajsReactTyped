package typingsJapgolly.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /** A composite filter. */
  var compositeFilter: js.UndefOr[CompositeFilter] = js.undefined
  /** A filter on a property. */
  var propertyFilter: js.UndefOr[PropertyFilter] = js.undefined
}

object Filter {
  @scala.inline
  def apply(compositeFilter: CompositeFilter = null, propertyFilter: PropertyFilter = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (compositeFilter != null) __obj.updateDynamic("compositeFilter")(compositeFilter.asInstanceOf[js.Any])
    if (propertyFilter != null) __obj.updateDynamic("propertyFilter")(propertyFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

