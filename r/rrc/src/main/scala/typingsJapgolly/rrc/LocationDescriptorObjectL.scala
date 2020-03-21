package typingsJapgolly.rrc

import typingsJapgolly.history.mod.Hash
import typingsJapgolly.history.mod.LocationKey
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.history.mod.Pathname
import typingsJapgolly.history.mod.Search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined history.history.LocationDescriptorObject<history.history.LocationState> & {  pathname  :history.history.Pathname} */
trait LocationDescriptorObjectL extends js.Object {
  var hash: js.UndefOr[Hash] = js.undefined
  var key: js.UndefOr[LocationKey] = js.undefined
  var pathname: js.UndefOr[Pathname] = js.undefined
  var search: js.UndefOr[Search] = js.undefined
  var state: js.UndefOr[LocationState] = js.undefined
}

object LocationDescriptorObjectL {
  @scala.inline
  def apply(
    hash: Hash = null,
    key: LocationKey = null,
    pathname: Pathname = null,
    search: Search = null,
    state: LocationState = null
  ): LocationDescriptorObjectL = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationDescriptorObjectL]
  }
}

