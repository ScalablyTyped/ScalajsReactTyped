package typingsJapgolly.reactInstantsearchCore.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactInstantsearchCore.AnonConfigure
import typingsJapgolly.reactInstantsearchCore.AnonDictkey
import typingsJapgolly.reactInstantsearchCore.AnonMax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchState
  extends /* widgetId */ StringDictionary[js.Any] {
  var configure: js.UndefOr[AnonDictkey] = js.undefined
  var hierarchicalMenu: js.UndefOr[StringDictionary[String]] = js.undefined
  var hitsPerPage: js.UndefOr[Double] = js.undefined
  var indices: js.UndefOr[StringDictionary[AnonConfigure]] = js.undefined
  var menu: js.UndefOr[StringDictionary[String]] = js.undefined
  var multiRange: js.UndefOr[StringDictionary[String]] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var range: js.UndefOr[StringDictionary[AnonMax]] = js.undefined
  var refinementList: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  var sortBy: js.UndefOr[String] = js.undefined
  var toggle: js.UndefOr[StringDictionary[Boolean]] = js.undefined
}

object SearchState {
  @scala.inline
  def apply(
    StringDictionary: /* widgetId */ StringDictionary[js.Any] = null,
    configure: AnonDictkey = null,
    hierarchicalMenu: StringDictionary[String] = null,
    hitsPerPage: Int | Double = null,
    indices: StringDictionary[AnonConfigure] = null,
    menu: StringDictionary[String] = null,
    multiRange: StringDictionary[String] = null,
    page: Int | Double = null,
    query: String = null,
    range: StringDictionary[AnonMax] = null,
    refinementList: StringDictionary[js.Array[String]] = null,
    sortBy: String = null,
    toggle: StringDictionary[Boolean] = null
  ): SearchState = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (configure != null) __obj.updateDynamic("configure")(configure.asInstanceOf[js.Any])
    if (hierarchicalMenu != null) __obj.updateDynamic("hierarchicalMenu")(hierarchicalMenu.asInstanceOf[js.Any])
    if (hitsPerPage != null) __obj.updateDynamic("hitsPerPage")(hitsPerPage.asInstanceOf[js.Any])
    if (indices != null) __obj.updateDynamic("indices")(indices.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (multiRange != null) __obj.updateDynamic("multiRange")(multiRange.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (refinementList != null) __obj.updateDynamic("refinementList")(refinementList.asInstanceOf[js.Any])
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchState]
  }
}

