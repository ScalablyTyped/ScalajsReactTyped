package typingsJapgolly.inboxsdk.mod.Search

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteSearchResultText
  extends AutocompleteSearchResultBase
     with AutocompleteSearchResult {
  var description: String
  var name: String
}

object AutocompleteSearchResultText {
  @scala.inline
  def apply(
    description: String,
    name: String,
    externalURL: String = null,
    iconHTML: String = null,
    iconUrl: String = null,
    onClick: js.UndefOr[Callback] = js.undefined,
    routeName: String = null,
    routeParams: js.Array[String] = null
  ): AutocompleteSearchResultText = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (externalURL != null) __obj.updateDynamic("externalURL")(externalURL.asInstanceOf[js.Any])
    if (iconHTML != null) __obj.updateDynamic("iconHTML")(iconHTML.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    if (routeName != null) __obj.updateDynamic("routeName")(routeName.asInstanceOf[js.Any])
    if (routeParams != null) __obj.updateDynamic("routeParams")(routeParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteSearchResultText]
  }
}

