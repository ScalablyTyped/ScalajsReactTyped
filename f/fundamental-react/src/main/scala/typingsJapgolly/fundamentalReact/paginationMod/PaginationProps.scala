package typingsJapgolly.fundamentalReact.paginationMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fundamentalReact.AnonNext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  /* Set to **true** to show total number of items along with `totalText` string. */
  var displayTotal: js.UndefOr[Boolean] = js.undefined
  var displayTotalProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Initial page to be selected. */
  var initialPage: js.UndefOr[Double] = js.undefined
  /* Number of items to display on page. */
  var itemsPerPage: js.UndefOr[Double] = js.undefined
  /* Total number of items. itemsTotal / itemsPerPage calculates how many navigation items should be shown in the control. */
  var itemsTotal: Double
  /* Additional props to be spread to the page number `<a>` elements. */
  var linkProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var localizedText: js.UndefOr[AnonNext] = js.undefined
  /* Additional props to be spread to the next arrow `<a>` element. */
  var nextProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the previous arrow `<a>` element. */
  var prevProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Localized text to display next to the total number of items.  Used with `displayTotal`. */
  var totalText: js.UndefOr[String] = js.undefined
  def onClick(page: Double): Unit
}

object PaginationProps {
  @scala.inline
  def apply(
    itemsTotal: Double,
    onClick: Double => Callback,
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    displayTotal: js.UndefOr[Boolean] = js.undefined,
    displayTotalProps: StringDictionary[js.Any] = null,
    initialPage: Int | Double = null,
    itemsPerPage: Int | Double = null,
    linkProps: StringDictionary[js.Any] = null,
    localizedText: AnonNext = null,
    nextProps: StringDictionary[js.Any] = null,
    prevProps: StringDictionary[js.Any] = null,
    totalText: String = null
  ): PaginationProps = {
    val __obj = js.Dynamic.literal(itemsTotal = itemsTotal.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: scala.Double) => onClick(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(displayTotal)) __obj.updateDynamic("displayTotal")(displayTotal.asInstanceOf[js.Any])
    if (displayTotalProps != null) __obj.updateDynamic("displayTotalProps")(displayTotalProps.asInstanceOf[js.Any])
    if (initialPage != null) __obj.updateDynamic("initialPage")(initialPage.asInstanceOf[js.Any])
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage.asInstanceOf[js.Any])
    if (linkProps != null) __obj.updateDynamic("linkProps")(linkProps.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (nextProps != null) __obj.updateDynamic("nextProps")(nextProps.asInstanceOf[js.Any])
    if (prevProps != null) __obj.updateDynamic("prevProps")(prevProps.asInstanceOf[js.Any])
    if (totalText != null) __obj.updateDynamic("totalText")(totalText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
}

