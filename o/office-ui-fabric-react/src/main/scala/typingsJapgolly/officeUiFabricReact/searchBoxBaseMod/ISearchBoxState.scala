package typingsJapgolly.officeUiFabricReact.searchBoxBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchBoxState extends js.Object {
  var hasFocus: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object ISearchBoxState {
  @scala.inline
  def apply(hasFocus: js.UndefOr[Boolean] = js.undefined, value: String = null): ISearchBoxState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasFocus)) __obj.updateDynamic("hasFocus")(hasFocus.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchBoxState]
  }
}

