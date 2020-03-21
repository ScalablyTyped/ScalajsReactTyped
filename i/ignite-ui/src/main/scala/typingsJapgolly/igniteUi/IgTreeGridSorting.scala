package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridSorting
  extends /**
	 * Option for igTreeGridSorting
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Enables/disables special styling for sorted columns. If false, sorted column cells will not have any special sort-related styling.
  	 *
  	 */
  var applySortedColumnCss: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Enables or disables the case sensitivity of the sorting. Works only for [local](ui.iggridsorting#options:type) sorting.
  	 *
  	 */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /**
  	 * A list of custom column settings that specify custom sorting settings for a specific column (whether sorting is enabled / disabled, default sort direction, first sort direction, etc.).
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[IgGridSortingColumnSetting]] = js.undefined
  /**
  	 * Event fired after the column has already been sorted and data - re-rendered.
  	 */
  var columnSorted: js.UndefOr[ColumnSortedEvent] = js.undefined
  /**
  	 * Event fired before sorting is invoked for a certain column.
  	 * Return false in order to cancel column sorting.
  	 */
  var columnSorting: js.UndefOr[ColumnSortingEvent] = js.undefined
  /**
  	 * Custom sort function(or name of the function as a string) accepting three parameters - the data to be sorted, an array of data source field definitions, and the direction to sort with (optional). The function should return the sorted data array.
  	 *
  	 */
  var customSortFunction: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog.
  	 *
  	 */
  var dialogWidget: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the text shown in the feature chooser item for sorting in ascending order (displayed only on touch environment).
  	 * Use option [locale.featureChooserSortAsc](ui.iggridsorting#options:locale.featureChooserSortAsc).
  	 */
  var featureChooserSortAsc: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the text shown in the feature chooser item for sorting in descending order (displayed only on touch environment).
  	 * Use option [locale.featureChooserSortDesc](ui.iggridsorting#options:locale.featureChooserSortDesc).
  	 */
  var featureChooserSortDesc: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies the text of the feature chooser sorting button.
  	 * Use option [locale.featureChooserText](ui.iggridsorting#options:locale.featureChooserText).
  	 */
  var featureChooserText: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies which direction to use on the first click / keydown, if the column is sorted for the first time.
  	 *
  	 *
  	 * Valid values:
  	 * "ascending" The first sort of the column data will be in ascending order.
  	 * "descending" The first sort of the column data will be in descending order.
  	 */
  var firstSortDirection: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies from which data bound level to be applied sorting - 0 is the first level
  	 *
  	 */
  var fromLevel: js.UndefOr[Double] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
  	 */
  var inherit: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[IgGridSortingLocale] = js.undefined
  /**
  	 * Specifies time of milliseconds for animation duration to show/hide modal dialog.
  	 *
  	 */
  var modalDialogAnimationDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Event fired when button Apply in modal dialog is clicked
  	 */
  var modalDialogButtonApplyClick: js.UndefOr[ModalDialogButtonApplyClickEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies text of button which apply changes in modal dialog.
  	 * Use option [locale.modalDialogButtonApplyText](ui.iggridsorting#options:locale.modalDialogButtonApplyText).
  	 */
  var modalDialogButtonApplyText: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies text of button which cancels the changes in the advanced sorting modal dialog.
  	 * Use option [locale.modalDialogButtonCancelText](ui.iggridsorting#options:locale.modalDialogButtonCancelText).
  	 */
  var modalDialogButtonCancelText: js.UndefOr[String] = js.undefined
  /**
  	 * Event fired when the button to reset sorting is clicked.
  	 */
  var modalDialogButtonResetClick: js.UndefOr[ModalDialogButtonResetClickEvent] = js.undefined
  /**
  	 * Event fired when button to unsort column is clicked in modal dialog
  	 */
  var modalDialogButtonUnsortClick: js.UndefOr[ModalDialogButtonUnsortClickEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for each ascending sorted column in multiple sorting dialog.
  	 * Use option [locale.modalDialogCaptionButtonAsc](ui.iggridsorting#options:locale.modalDialogCaptionButtonAsc).
  	 */
  var modalDialogCaptionButtonAsc: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for each descending sorted column in multiple sorting dialog.
  	 * Use option [locale.modalDialogCaptionButtonDesc](ui.iggridsorting#options:locale.modalDialogCaptionButtonDesc).
  	 */
  var modalDialogCaptionButtonDesc: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption for unsort button in multiple sorting dialog.
  	 * Use option [locale.modalDialogCaptionButtonUnsort](ui.iggridsorting#options:locale.modalDialogCaptionButtonUnsort).
  	 */
  var modalDialogCaptionButtonUnsort: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies caption text for multiple sorting dialog.
  	 * Use option [locale.modalDialogCaptionText](ui.iggridsorting#options:locale.modalDialogCaptionText).
  	 */
  var modalDialogCaptionText: js.UndefOr[String] = js.undefined
  /**
  	 * Event fired after the modal dialog has been closed.
  	 */
  var modalDialogClosed: js.UndefOr[ModalDialogClosedEvent] = js.undefined
  /**
  	 * Event fired before the modal dialog is closed.
  	 */
  var modalDialogClosing: js.UndefOr[ModalDialogClosingEvent] = js.undefined
  /**
  	 * Event fired after the contents of the modal dialog are rendered.
  	 */
  var modalDialogContentsRendered: js.UndefOr[ModalDialogContentsRenderedEvent] = js.undefined
  /**
  	 * Event fired before the contents of the modal dialog are rendered.
  	 */
  var modalDialogContentsRendering: js.UndefOr[ModalDialogContentsRenderingEvent] = js.undefined
  /**
  	 * Specifies height of multiple sorting dialog.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The widget height can be set in pixels (px) and percentage (%).
  	 * "number" The widget height can be set in pixels as a number.
  	 */
  var modalDialogHeight: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Event fired every time the modal dialog changes its position.
  	 */
  var modalDialogMoving: js.UndefOr[ModalDialogMovingEvent] = js.undefined
  /**
  	 * Event fired after the modal dialog is already opened.
  	 */
  var modalDialogOpened: js.UndefOr[ModalDialogOpenedEvent] = js.undefined
  /**
  	 * Event fired before the modal dialog is opened.
  	 */
  var modalDialogOpening: js.UndefOr[ModalDialogOpeningEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies reset button text in multiple sorting dialog.
  	 * Use option [locale.modalDialogResetButton](ui.iggridsorting#options:locale.modalDialogResetButton).
  	 */
  var modalDialogResetButtonLabel: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies sortby button text for each unsorted column in multiple sorting dialog.
  	 * Use option [locale.modalDialogSortByButtonText](ui.iggridsorting#options:locale.modalDialogSortByButtonText).
  	 */
  var modalDialogSortByButtonText: js.UndefOr[String] = js.undefined
  /**
  	 * Event fired when column(which is not sorted) is clicked to be sorted in modal dialog
  	 */
  var modalDialogSortClick: js.UndefOr[ModalDialogSortClickEvent] = js.undefined
  /**
  	 * Specifies whether sorting to be applied immediately when click sort/unsort columns when using the multiple sorting dialog. When it is false Apply button shows and sorting is applied when the button is clicked.
  	 *
  	 */
  var modalDialogSortOnClick: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Event fired when sorting of column is changed in modal dialog. Column should be sorted
  	 */
  var modalDialogSortingChanged: js.UndefOr[ModalDialogSortingChangedEvent] = js.undefined
  /**
  	 * Specifies width of multiple sorting dialog.
  	 *
  	 *
  	 * Valid values:
  	 * "string" Specifies the width in pixels as a string ("300px").
  	 * "number" Specifies the width in pixels as a number (300)
  	 */
  var modalDialogWidth: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Defines single column sorting or multiple column sorting.
  	 *
  	 *
  	 * Valid values:
  	 * "single" Only a single column can be sorted. Previously sorted columns will not preserve their sorting upon sorting a new column.
  	 * "multi" If enabled, previous sorted state for columns won't be cleared
  	 */
  var mode: js.UndefOr[String] = js.undefined
  /**
  	 * Enables/disables sorting persistence when the grid is rebound.
  	 *
  	 */
  var persist: js.UndefOr[Boolean] = js.undefined
  /**
  	 * URL param name which specifies how sorting expressions will be encoded in the URL. Uses OData conventions. ex: ?sort(col1)=asc
  	 *
  	 */
  var sortUrlKey: js.UndefOr[String] = js.undefined
  /**
  	 * URL param value for ascending type of sorting. Uses OData conventions. Example: ?sort(col1)=asc
  	 *
  	 */
  var sortUrlKeyAscValue: js.UndefOr[String] = js.undefined
  /**
  	 * URL param value for descending type of sorting. Uses OData conventions. Example: ?sort(col1)=desc
  	 *
  	 */
  var sortUrlKeyDescValue: js.UndefOr[String] = js.undefined
  /**
  	 * Controls containment behavior of multiple sorting dialog.
  	 *
  	 * owner  The multi sorting dialog will be draggable only in the grid area
  	 * window  The multi sorting dialog will be draggable in the whole window area
  	 */
  var sortingDialogContainment: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies to which data bound level to be applied sorting - if -1 sorting should be applied to the last data bound level
  	 *
  	 */
  var toLevel: js.UndefOr[Double] = js.undefined
  /**
  	 * Defines local or remote sorting operations.
  	 *
  	 *
  	 * Valid values:
  	 * "remote" Sorting is performed remotely as a server-side operation.
  	 * "local" Sorting is performed locally by the [$.ig.DataSource](ig.datasource) component.
  	 */
  var `type`: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Custom unsorted column tooltip in [igTemplating](http://www.igniteui.com/help/igtemplating-overview) format.
  	 * Use option [locale.unsortedColumnTooltip](ui.iggridsorting#options:locale.unsortedColumnTooltip).
  	 */
  var unsortedColumnTooltip: js.UndefOr[String] = js.undefined
}

object IgTreeGridSorting {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igTreeGridSorting
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    applySortedColumnCss: js.UndefOr[Boolean] = js.undefined,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    columnSettings: js.Array[IgGridSortingColumnSetting] = null,
    columnSorted: (/* event */ Event_, /* ui */ ColumnSortedEventUIParam) => Callback = null,
    columnSorting: (/* event */ Event_, /* ui */ ColumnSortingEventUIParam) => Callback = null,
    customSortFunction: js.Function = null,
    dialogWidget: String = null,
    featureChooserSortAsc: String = null,
    featureChooserSortDesc: String = null,
    featureChooserText: String = null,
    firstSortDirection: String = null,
    fromLevel: Int | Double = null,
    inherit: js.UndefOr[Boolean] = js.undefined,
    locale: IgGridSortingLocale = null,
    modalDialogAnimationDuration: Int | Double = null,
    modalDialogButtonApplyClick: (/* event */ Event_, /* ui */ ModalDialogButtonApplyClickEventUIParam) => Callback = null,
    modalDialogButtonApplyText: String = null,
    modalDialogButtonCancelText: String = null,
    modalDialogButtonResetClick: (/* event */ Event_, /* ui */ ModalDialogButtonResetClickEventUIParam) => Callback = null,
    modalDialogButtonUnsortClick: (/* event */ Event_, /* ui */ ModalDialogButtonUnsortClickEventUIParam) => Callback = null,
    modalDialogCaptionButtonAsc: String = null,
    modalDialogCaptionButtonDesc: String = null,
    modalDialogCaptionButtonUnsort: String = null,
    modalDialogCaptionText: String = null,
    modalDialogClosed: (/* event */ Event_, /* ui */ ModalDialogClosedEventUIParam) => Callback = null,
    modalDialogClosing: (/* event */ Event_, /* ui */ ModalDialogClosingEventUIParam) => Callback = null,
    modalDialogContentsRendered: (/* event */ Event_, /* ui */ ModalDialogContentsRenderedEventUIParam) => Callback = null,
    modalDialogContentsRendering: (/* event */ Event_, /* ui */ ModalDialogContentsRenderingEventUIParam) => Callback = null,
    modalDialogHeight: String | Double = null,
    modalDialogMoving: (/* event */ Event_, /* ui */ ModalDialogMovingEventUIParam) => Callback = null,
    modalDialogOpened: (/* event */ Event_, /* ui */ ModalDialogOpenedEventUIParam) => Callback = null,
    modalDialogOpening: (/* event */ Event_, /* ui */ ModalDialogOpeningEventUIParam) => Callback = null,
    modalDialogResetButtonLabel: String = null,
    modalDialogSortByButtonText: String = null,
    modalDialogSortClick: (/* event */ Event_, /* ui */ ModalDialogSortClickEventUIParam) => Callback = null,
    modalDialogSortOnClick: js.UndefOr[Boolean] = js.undefined,
    modalDialogSortingChanged: (/* event */ Event_, /* ui */ ModalDialogSortingChangedEventUIParam) => Callback = null,
    modalDialogWidth: String | Double = null,
    mode: String = null,
    persist: js.UndefOr[Boolean] = js.undefined,
    sortUrlKey: String = null,
    sortUrlKeyAscValue: String = null,
    sortUrlKeyDescValue: String = null,
    sortingDialogContainment: String = null,
    toLevel: Int | Double = null,
    `type`: String = null,
    unsortedColumnTooltip: String = null
  ): IgTreeGridSorting = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(applySortedColumnCss)) __obj.updateDynamic("applySortedColumnCss")(applySortedColumnCss.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (columnSettings != null) __obj.updateDynamic("columnSettings")(columnSettings.asInstanceOf[js.Any])
    if (columnSorted != null) __obj.updateDynamic("columnSorted")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ColumnSortedEventUIParam) => columnSorted(t0, t1).runNow()))
    if (columnSorting != null) __obj.updateDynamic("columnSorting")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ColumnSortingEventUIParam) => columnSorting(t0, t1).runNow()))
    if (customSortFunction != null) __obj.updateDynamic("customSortFunction")(customSortFunction.asInstanceOf[js.Any])
    if (dialogWidget != null) __obj.updateDynamic("dialogWidget")(dialogWidget.asInstanceOf[js.Any])
    if (featureChooserSortAsc != null) __obj.updateDynamic("featureChooserSortAsc")(featureChooserSortAsc.asInstanceOf[js.Any])
    if (featureChooserSortDesc != null) __obj.updateDynamic("featureChooserSortDesc")(featureChooserSortDesc.asInstanceOf[js.Any])
    if (featureChooserText != null) __obj.updateDynamic("featureChooserText")(featureChooserText.asInstanceOf[js.Any])
    if (firstSortDirection != null) __obj.updateDynamic("firstSortDirection")(firstSortDirection.asInstanceOf[js.Any])
    if (fromLevel != null) __obj.updateDynamic("fromLevel")(fromLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (modalDialogAnimationDuration != null) __obj.updateDynamic("modalDialogAnimationDuration")(modalDialogAnimationDuration.asInstanceOf[js.Any])
    if (modalDialogButtonApplyClick != null) __obj.updateDynamic("modalDialogButtonApplyClick")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ModalDialogButtonApplyClickEventUIParam) => modalDialogButtonApplyClick(t0, t1).runNow()))
    if (modalDialogButtonApplyText != null) __obj.updateDynamic("modalDialogButtonApplyText")(modalDialogButtonApplyText.asInstanceOf[js.Any])
    if (modalDialogButtonCancelText != null) __obj.updateDynamic("modalDialogButtonCancelText")(modalDialogButtonCancelText.asInstanceOf[js.Any])
    if (modalDialogButtonResetClick != null) __obj.updateDynamic("modalDialogButtonResetClick")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ModalDialogButtonResetClickEventUIParam) => modalDialogButtonResetClick(t0, t1).runNow()))
    if (modalDialogButtonUnsortClick != null) __obj.updateDynamic("modalDialogButtonUnsortClick")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ModalDialogButtonUnsortClickEventUIParam) => modalDialogButtonUnsortClick(t0, t1).runNow()))
    if (modalDialogCaptionButtonAsc != null) __obj.updateDynamic("modalDialogCaptionButtonAsc")(modalDialogCaptionButtonAsc.asInstanceOf[js.Any])
    if (modalDialogCaptionButtonDesc != null) __obj.updateDynamic("modalDialogCaptionButtonDesc")(modalDialogCaptionButtonDesc.asInstanceOf[js.Any])
    if (modalDialogCaptionButtonUnsort != null) __obj.updateDynamic("modalDialogCaptionButtonUnsort")(modalDialogCaptionButtonUnsort.asInstanceOf[js.Any])
    if (modalDialogCaptionText != null) __obj.updateDynamic("modalDialogCaptionText")(modalDialogCaptionText.asInstanceOf[js.Any])
    if (modalDialogClosed != null) __obj.updateDynamic("modalDialogClosed")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ModalDialogClosedEventUIParam) => modalDialogClosed(t0, t1).runNow()))
    if (modalDialogClosing != null) __obj.updateDynamic("modalDialogClosing")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ModalDialogClosingEventUIParam) => modalDialogClosing(t0, t1).runNow()))
    if (modalDialogContentsRendered != null) __obj.updateDynamic("modalDialogContentsRendered")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ModalDialogContentsRenderedEventUIParam) => modalDialogContentsRendered(t0, t1).runNow()))
    if (modalDialogContentsRendering != null) __obj.updateDynamic("modalDialogContentsRendering")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ModalDialogContentsRenderingEventUIParam) => modalDialogContentsRendering(t0, t1).runNow()))
    if (modalDialogHeight != null) __obj.updateDynamic("modalDialogHeight")(modalDialogHeight.asInstanceOf[js.Any])
    if (modalDialogMoving != null) __obj.updateDynamic("modalDialogMoving")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ModalDialogMovingEventUIParam) => modalDialogMoving(t0, t1).runNow()))
    if (modalDialogOpened != null) __obj.updateDynamic("modalDialogOpened")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ModalDialogOpenedEventUIParam) => modalDialogOpened(t0, t1).runNow()))
    if (modalDialogOpening != null) __obj.updateDynamic("modalDialogOpening")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ModalDialogOpeningEventUIParam) => modalDialogOpening(t0, t1).runNow()))
    if (modalDialogResetButtonLabel != null) __obj.updateDynamic("modalDialogResetButtonLabel")(modalDialogResetButtonLabel.asInstanceOf[js.Any])
    if (modalDialogSortByButtonText != null) __obj.updateDynamic("modalDialogSortByButtonText")(modalDialogSortByButtonText.asInstanceOf[js.Any])
    if (modalDialogSortClick != null) __obj.updateDynamic("modalDialogSortClick")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ModalDialogSortClickEventUIParam) => modalDialogSortClick(t0, t1).runNow()))
    if (!js.isUndefined(modalDialogSortOnClick)) __obj.updateDynamic("modalDialogSortOnClick")(modalDialogSortOnClick.asInstanceOf[js.Any])
    if (modalDialogSortingChanged != null) __obj.updateDynamic("modalDialogSortingChanged")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ModalDialogSortingChangedEventUIParam) => modalDialogSortingChanged(t0, t1).runNow()))
    if (modalDialogWidth != null) __obj.updateDynamic("modalDialogWidth")(modalDialogWidth.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    if (sortUrlKey != null) __obj.updateDynamic("sortUrlKey")(sortUrlKey.asInstanceOf[js.Any])
    if (sortUrlKeyAscValue != null) __obj.updateDynamic("sortUrlKeyAscValue")(sortUrlKeyAscValue.asInstanceOf[js.Any])
    if (sortUrlKeyDescValue != null) __obj.updateDynamic("sortUrlKeyDescValue")(sortUrlKeyDescValue.asInstanceOf[js.Any])
    if (sortingDialogContainment != null) __obj.updateDynamic("sortingDialogContainment")(sortingDialogContainment.asInstanceOf[js.Any])
    if (toLevel != null) __obj.updateDynamic("toLevel")(toLevel.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unsortedColumnTooltip != null) __obj.updateDynamic("unsortedColumnTooltip")(unsortedColumnTooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTreeGridSorting]
  }
}

