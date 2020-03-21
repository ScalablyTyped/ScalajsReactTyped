package typingsJapgolly.inboxsdk.mod.Search

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteSearchResultBase extends js.Object {
  var externalURL: js.UndefOr[String] = js.undefined
  var iconHTML: js.UndefOr[String] = js.undefined
  var iconUrl: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var routeName: js.UndefOr[String] = js.undefined
  var routeParams: js.UndefOr[js.Array[String]] = js.undefined
}

object AutocompleteSearchResultBase {
  @scala.inline
  def apply(
    externalURL: String = null,
    iconHTML: String = null,
    iconUrl: String = null,
    onClick: js.UndefOr[Callback] = js.undefined,
    routeName: String = null,
    routeParams: js.Array[String] = null
  ): AutocompleteSearchResultBase = {
    val __obj = js.Dynamic.literal()
    if (externalURL != null) __obj.updateDynamic("externalURL")(externalURL.asInstanceOf[js.Any])
    if (iconHTML != null) __obj.updateDynamic("iconHTML")(iconHTML.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    if (routeName != null) __obj.updateDynamic("routeName")(routeName.asInstanceOf[js.Any])
    if (routeParams != null) __obj.updateDynamic("routeParams")(routeParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteSearchResultBase]
  }
}

