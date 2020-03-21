package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridHiding
  extends /**
	 * Option for igGridHiding
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies time of milliseconds for animation duration to show/hide modal dialog
  	 *
  	 */
  var columnChooserAnimationDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Event fired when button Apply in column chooser is clicked
  	 */
  var columnChooserButtonApplyClick: js.UndefOr[ColumnChooserButtonApplyClickEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies text of button which apply changes in modal dialog. Use option [locale.columnChooserButtonApplyText](ui.iggridhiding#options:locale.columnChooserButtonApplyText).
  	 */
  var columnChooserButtonApplyText: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Specifies text of button which cancel changes in modal dialog. Use option [locale.columnChooserButtonCancelText](ui.iggridhiding#options:locale.columnChooserButtonCancelText).
  	 */
  var columnChooserButtonCancelText: js.UndefOr[String] = js.undefined
  /**
  	 * Event fired when button Reset in column chooser is clicked
  	 */
  var columnChooserButtonResetClick: js.UndefOr[ColumnChooserButtonResetClickEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * The caption of the column chooser dialog. Use option [locale.columnChooserCaptionText](ui.iggridhiding#options:locale.columnChooserCaptionText).
  	 */
  var columnChooserCaptionText: js.UndefOr[String] = js.undefined
  /**
  	 * Event fired after the column chooser has been closed.
  	 */
  var columnChooserClosed: js.UndefOr[ColumnChooserClosedEvent] = js.undefined
  /**
  	 * Event fired before the column chooser is closed.
  	 */
  var columnChooserClosing: js.UndefOr[ColumnChooserClosingEvent] = js.undefined
  /**
  	 * Controls containment behavior.
  	 *
  	 * owner  The column chooser dialog will be draggable only in the grid area
  	 * window  The column chooser dialog will be draggable in the whole window area
  	 */
  var columnChooserContainment: js.UndefOr[String] = js.undefined
  /**
  	 * Event fired after the contents of the column chooser are rendered.
  	 */
  var columnChooserContentsRendered: js.UndefOr[ColumnChooserContentsRenderedEvent] = js.undefined
  /**
  	 * Event fired before the contents of the column chooser are rendered.
  	 */
  var columnChooserContentsRendering: js.UndefOr[ColumnChooserContentsRenderingEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * The text used in the drop down tools menu(Feature Chooser) to launch the column chooser dialog. Use option [locale.columnChooserDisplayText](ui.iggridhiding#options:locale.columnChooserDisplayText).
  	 */
  var columnChooserDisplayText: js.UndefOr[String] = js.undefined
  /**
  	 * The default column chooser height.
  	 *
  	 */
  var columnChooserHeight: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies on click show/hide directly to be shown/hidden columns. If columnChooserHideOnClick is false then Apply and Cancel Buttons are shown on the bottom of modal dialog. Columns are Shown/Hidden after the Apply button is clicked
  	 *
  	 */
  var columnChooserHideOnClick: js.UndefOr[Boolean] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * The text used in the column chooser to hide column. Use option [locale.columnChooserHideText](ui.iggridhiding#options:locale.columnChooserHideText).
  	 */
  var columnChooserHideText: js.UndefOr[String] = js.undefined
  /**
  	 * Event fired every time the column chooser changes its position.
  	 */
  var columnChooserMoving: js.UndefOr[ColumnChooserMovingEvent] = js.undefined
  /**
  	 * Event fired after the column chooser is already opened.
  	 */
  var columnChooserOpened: js.UndefOr[ColumnChooserOpenedEvent] = js.undefined
  /**
  	 * Event fired before the column chooser is opened.
  	 */
  var columnChooserOpening: js.UndefOr[ColumnChooserOpeningEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Text label for reset button. Use option [locale.columnChooserResetButtonLabel](ui.iggridhiding#options:locale.columnChooserResetButtonLabel).
  	 */
  var columnChooserResetButtonLabel: js.UndefOr[String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * The text used in the column chooser to show column. Use option [locale.columnChooserShowText](ui.iggridhiding#options:locale.columnChooserShowText).
  	 */
  var columnChooserShowText: js.UndefOr[String] = js.undefined
  /**
  	 * The default column chooser width.
  	 *
  	 */
  var columnChooserWidth: js.UndefOr[String] = js.undefined
  /**
  	 * Event fired after the hiding has been executed and results are rendered.
  	 */
  var columnHidden: js.UndefOr[ColumnHiddenEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * The text used in the drop down tools menu(Feature Chooser) to hide a column. Use option [locale.columnHideText](ui.iggridhiding#options:locale.columnHideText).
  	 */
  var columnHideText: js.UndefOr[String] = js.undefined
  /**
  	 * Event fired before a hiding operation is executed.
  	 */
  var columnHiding: js.UndefOr[ColumnHidingEvent] = js.undefined
  /**
  	 * Event fired when trying to hide all columns in fixed or unfixed area.
  	 */
  var columnHidingRefused: js.UndefOr[ColumnHidingRefusedEvent] = js.undefined
  /**
  	 * A list of column settings that specifies hiding options on a per column basis.
  	 *
  	 */
  var columnSettings: js.UndefOr[js.Array[IgGridHidingColumnSetting]] = js.undefined
  /**
  	 * Event fired before a showing operation is executed.
  	 */
  var columnShowing: js.UndefOr[ColumnShowingEvent] = js.undefined
  /**
  	 * Event fired when trying to show column(s) in fixed area and total width of fixed are will be larger than whole grid width.
  	 */
  var columnShowingRefused: js.UndefOr[ColumnShowingRefusedEvent] = js.undefined
  /**
  	 * Event fired after the showing has been executed and results are rendered.
  	 */
  var columnShown: js.UndefOr[ColumnShownEvent] = js.undefined
  /**
  	 * Name of the dialog widget to be used. It should inherit from $.ui.igGridModalDialog.
  	 *
  	 */
  var dialogWidget: js.UndefOr[String] = js.undefined
  /**
  	 * The duration of the dropdown animation in milliseconds.
  	 *
  	 */
  var dropDownAnimationDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * The width in pixels of the hidden column indicator in the header.
  	 *
  	 */
  var hiddenColumnIndicatorHeaderWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * The text displayed in the tooltip of the hidden column indicator. Use option [locale.hiddenColumnIndicatorTooltipText](ui.iggridhiding#options:locale.hiddenColumnIndicatorTooltipText).
  	 */
  var hiddenColumnIndicatorTooltipText: js.UndefOr[String] = js.undefined
  /**
  	 * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
  	 *
  	 */
  var inherit: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[IgGridHidingLocale] = js.undefined
  /**
  	 * Event fired before a hiding operation is executed.
  	 */
  var multiColumnHiding: js.UndefOr[MultiColumnHidingEvent] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
}

object IgGridHiding {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igGridHiding
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    columnChooserAnimationDuration: Int | Double = null,
    columnChooserButtonApplyClick: (/* event */ Event_, /* ui */ ColumnChooserButtonApplyClickEventUIParam) => Callback = null,
    columnChooserButtonApplyText: String = null,
    columnChooserButtonCancelText: String = null,
    columnChooserButtonResetClick: (/* event */ Event_, /* ui */ ColumnChooserButtonResetClickEventUIParam) => Callback = null,
    columnChooserCaptionText: String = null,
    columnChooserClosed: (/* event */ Event_, /* ui */ ColumnChooserClosedEventUIParam) => Callback = null,
    columnChooserClosing: (/* event */ Event_, /* ui */ ColumnChooserClosingEventUIParam) => Callback = null,
    columnChooserContainment: String = null,
    columnChooserContentsRendered: (/* event */ Event_, /* ui */ ColumnChooserContentsRenderedEventUIParam) => Callback = null,
    columnChooserContentsRendering: (/* event */ Event_, /* ui */ ColumnChooserContentsRenderingEventUIParam) => Callback = null,
    columnChooserDisplayText: String = null,
    columnChooserHeight: String = null,
    columnChooserHideOnClick: js.UndefOr[Boolean] = js.undefined,
    columnChooserHideText: String = null,
    columnChooserMoving: (/* event */ Event_, /* ui */ ColumnChooserMovingEventUIParam) => Callback = null,
    columnChooserOpened: (/* event */ Event_, /* ui */ ColumnChooserOpenedEventUIParam) => Callback = null,
    columnChooserOpening: (/* event */ Event_, /* ui */ ColumnChooserOpeningEventUIParam) => Callback = null,
    columnChooserResetButtonLabel: String = null,
    columnChooserShowText: String = null,
    columnChooserWidth: String = null,
    columnHidden: (/* event */ Event_, /* ui */ ColumnHiddenEventUIParam) => Callback = null,
    columnHideText: String = null,
    columnHiding: (/* event */ Event_, /* ui */ ColumnHidingEventUIParam) => Callback = null,
    columnHidingRefused: (/* event */ Event_, /* ui */ ColumnHidingRefusedEventUIParam) => Callback = null,
    columnSettings: js.Array[IgGridHidingColumnSetting] = null,
    columnShowing: (/* event */ Event_, /* ui */ ColumnShowingEventUIParam) => Callback = null,
    columnShowingRefused: (/* event */ Event_, /* ui */ ColumnShowingRefusedEventUIParam) => Callback = null,
    columnShown: (/* event */ Event_, /* ui */ ColumnShownEventUIParam) => Callback = null,
    dialogWidget: String = null,
    dropDownAnimationDuration: Int | Double = null,
    hiddenColumnIndicatorHeaderWidth: Int | Double = null,
    hiddenColumnIndicatorTooltipText: String = null,
    inherit: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    locale: IgGridHidingLocale = null,
    multiColumnHiding: (/* event */ Event_, /* ui */ MultiColumnHidingEventUIParam) => Callback = null,
    regional: String | js.Object = null
  ): IgGridHiding = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (columnChooserAnimationDuration != null) __obj.updateDynamic("columnChooserAnimationDuration")(columnChooserAnimationDuration.asInstanceOf[js.Any])
    if (columnChooserButtonApplyClick != null) __obj.updateDynamic("columnChooserButtonApplyClick")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ColumnChooserButtonApplyClickEventUIParam) => columnChooserButtonApplyClick(t0, t1).runNow()))
    if (columnChooserButtonApplyText != null) __obj.updateDynamic("columnChooserButtonApplyText")(columnChooserButtonApplyText.asInstanceOf[js.Any])
    if (columnChooserButtonCancelText != null) __obj.updateDynamic("columnChooserButtonCancelText")(columnChooserButtonCancelText.asInstanceOf[js.Any])
    if (columnChooserButtonResetClick != null) __obj.updateDynamic("columnChooserButtonResetClick")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ColumnChooserButtonResetClickEventUIParam) => columnChooserButtonResetClick(t0, t1).runNow()))
    if (columnChooserCaptionText != null) __obj.updateDynamic("columnChooserCaptionText")(columnChooserCaptionText.asInstanceOf[js.Any])
    if (columnChooserClosed != null) __obj.updateDynamic("columnChooserClosed")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ColumnChooserClosedEventUIParam) => columnChooserClosed(t0, t1).runNow()))
    if (columnChooserClosing != null) __obj.updateDynamic("columnChooserClosing")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ColumnChooserClosingEventUIParam) => columnChooserClosing(t0, t1).runNow()))
    if (columnChooserContainment != null) __obj.updateDynamic("columnChooserContainment")(columnChooserContainment.asInstanceOf[js.Any])
    if (columnChooserContentsRendered != null) __obj.updateDynamic("columnChooserContentsRendered")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ColumnChooserContentsRenderedEventUIParam) => columnChooserContentsRendered(t0, t1).runNow()))
    if (columnChooserContentsRendering != null) __obj.updateDynamic("columnChooserContentsRendering")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ColumnChooserContentsRenderingEventUIParam) => columnChooserContentsRendering(t0, t1).runNow()))
    if (columnChooserDisplayText != null) __obj.updateDynamic("columnChooserDisplayText")(columnChooserDisplayText.asInstanceOf[js.Any])
    if (columnChooserHeight != null) __obj.updateDynamic("columnChooserHeight")(columnChooserHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(columnChooserHideOnClick)) __obj.updateDynamic("columnChooserHideOnClick")(columnChooserHideOnClick.asInstanceOf[js.Any])
    if (columnChooserHideText != null) __obj.updateDynamic("columnChooserHideText")(columnChooserHideText.asInstanceOf[js.Any])
    if (columnChooserMoving != null) __obj.updateDynamic("columnChooserMoving")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ColumnChooserMovingEventUIParam) => columnChooserMoving(t0, t1).runNow()))
    if (columnChooserOpened != null) __obj.updateDynamic("columnChooserOpened")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ColumnChooserOpenedEventUIParam) => columnChooserOpened(t0, t1).runNow()))
    if (columnChooserOpening != null) __obj.updateDynamic("columnChooserOpening")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ColumnChooserOpeningEventUIParam) => columnChooserOpening(t0, t1).runNow()))
    if (columnChooserResetButtonLabel != null) __obj.updateDynamic("columnChooserResetButtonLabel")(columnChooserResetButtonLabel.asInstanceOf[js.Any])
    if (columnChooserShowText != null) __obj.updateDynamic("columnChooserShowText")(columnChooserShowText.asInstanceOf[js.Any])
    if (columnChooserWidth != null) __obj.updateDynamic("columnChooserWidth")(columnChooserWidth.asInstanceOf[js.Any])
    if (columnHidden != null) __obj.updateDynamic("columnHidden")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ColumnHiddenEventUIParam) => columnHidden(t0, t1).runNow()))
    if (columnHideText != null) __obj.updateDynamic("columnHideText")(columnHideText.asInstanceOf[js.Any])
    if (columnHiding != null) __obj.updateDynamic("columnHiding")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ColumnHidingEventUIParam) => columnHiding(t0, t1).runNow()))
    if (columnHidingRefused != null) __obj.updateDynamic("columnHidingRefused")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ColumnHidingRefusedEventUIParam) => columnHidingRefused(t0, t1).runNow()))
    if (columnSettings != null) __obj.updateDynamic("columnSettings")(columnSettings.asInstanceOf[js.Any])
    if (columnShowing != null) __obj.updateDynamic("columnShowing")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ColumnShowingEventUIParam) => columnShowing(t0, t1).runNow()))
    if (columnShowingRefused != null) __obj.updateDynamic("columnShowingRefused")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ColumnShowingRefusedEventUIParam) => columnShowingRefused(t0, t1).runNow()))
    if (columnShown != null) __obj.updateDynamic("columnShown")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ColumnShownEventUIParam) => columnShown(t0, t1).runNow()))
    if (dialogWidget != null) __obj.updateDynamic("dialogWidget")(dialogWidget.asInstanceOf[js.Any])
    if (dropDownAnimationDuration != null) __obj.updateDynamic("dropDownAnimationDuration")(dropDownAnimationDuration.asInstanceOf[js.Any])
    if (hiddenColumnIndicatorHeaderWidth != null) __obj.updateDynamic("hiddenColumnIndicatorHeaderWidth")(hiddenColumnIndicatorHeaderWidth.asInstanceOf[js.Any])
    if (hiddenColumnIndicatorTooltipText != null) __obj.updateDynamic("hiddenColumnIndicatorTooltipText")(hiddenColumnIndicatorTooltipText.asInstanceOf[js.Any])
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (multiColumnHiding != null) __obj.updateDynamic("multiColumnHiding")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.MultiColumnHidingEventUIParam) => multiColumnHiding(t0, t1).runNow()))
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridHiding]
  }
}

