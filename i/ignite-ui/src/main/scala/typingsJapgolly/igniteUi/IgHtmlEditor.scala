package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgHtmlEditor
  extends /**
	 * Option for igHtmlEditor
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Event fired after a toolbar item is clicked.
  	 */
  var actionExecuted: js.UndefOr[ActionExecutedEvent] = js.undefined
  /**
  	 * Event fired before a toolbar item is clicked.
  	 */
  var actionExecuting: js.UndefOr[ActionExecutingEvent] = js.undefined
  /**
  	 * Event is fired on keyboard copy action.
  	 */
  var copy: js.UndefOr[CopyEvent] = js.undefined
  /**
  	 * The html editor custom toolbars list.
  	 *
  	 */
  var customToolbars: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Event is fired on keyboard cut action.
  	 */
  var cut: js.UndefOr[CutEvent] = js.undefined
  /**
  	 * The height of the html editor. It can be set as a number in pixels, string (px) or percentage (%).
  	 *
  	 */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
  	 * The name attribute of the html editor source view.
  	 *
  	 */
  var inputName: js.UndefOr[String] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Event is fired on keyboard paste action.
  	 */
  var paste: js.UndefOr[PasteEvent] = js.undefined
  /**
  	 * Event is fired on keyboard redo action.
  	 */
  var redo: js.UndefOr[RedoEvent] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Event fired after the html editor widget has been rendered.
  	 */
  var rendered: js.UndefOr[RenderedEvent] = js.undefined
  /**
  	 * Event fired before the html editor widget is rendered.
  	 */
  var rendering: js.UndefOr[RenderingEvent] = js.undefined
  /**
  	 * Shows/hides the "Copy Paste" toolbar.
  	 *
  	 */
  var showCopyPasteToolbar: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Shows/hides the "Formatting" toolbar.
  	 *
  	 */
  var showFormattingToolbar: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Shows/hides the "Insert Object" toolbar.
  	 *
  	 */
  var showInsertObjectToolbar: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Shows/hides the "Text" toolbar.
  	 *
  	 */
  var showTextToolbar: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Event fired after a toolbar is collapsed.
  	 */
  var toolbarCollapsed: js.UndefOr[ToolbarCollapsedEvent] = js.undefined
  /**
  	 * Event fired before a toolbar is collapsed.
  	 */
  var toolbarCollapsing: js.UndefOr[ToolbarCollapsingEvent] = js.undefined
  /**
  	 * Event fired after a toolbar is expanded.
  	 */
  var toolbarExpanded: js.UndefOr[ToolbarExpandedEvent] = js.undefined
  /**
  	 * Event fired before a toolbar is expanded.
  	 */
  var toolbarExpanding: js.UndefOr[ToolbarExpandingEvent] = js.undefined
  /**
  	 * The html editor toolbars list.
  	 *
  	 */
  var toolbarSettings: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Event is fired on keyboard undo action.
  	 */
  var undo: js.UndefOr[UndoEvent] = js.undefined
  /**
  	 * Used to render inside the html editor as initial content
  	 *
  	 */
  var value: js.UndefOr[String] = js.undefined
  /**
  	 * The width of the html editor. It can be set as a number in pixels, string (px) or percentage (%).
  	 *
  	 */
  var width: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Event is fired after the workspace has been resized
  	 */
  var workspaceResized: js.UndefOr[WorkspaceResizedEvent] = js.undefined
}

object IgHtmlEditor {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igHtmlEditor
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    actionExecuted: (/* event */ Event_, /* ui */ ActionExecutedEventUIParam) => Callback = null,
    actionExecuting: (/* event */ Event_, /* ui */ ActionExecutingEventUIParam) => Callback = null,
    copy: (/* event */ Event_, /* ui */ CopyEventUIParam) => Callback = null,
    customToolbars: js.Array[_] = null,
    cut: (/* event */ Event_, /* ui */ CutEventUIParam) => Callback = null,
    height: String | Double = null,
    inputName: String = null,
    language: String = null,
    locale: js.Any = null,
    paste: (/* event */ Event_, /* ui */ PasteEventUIParam) => Callback = null,
    redo: (/* event */ Event_, /* ui */ RedoEventUIParam) => Callback = null,
    regional: String | js.Object = null,
    rendered: (/* event */ Event_, /* ui */ RenderedEventUIParam) => Callback = null,
    rendering: (/* event */ Event_, /* ui */ RenderingEventUIParam) => Callback = null,
    showCopyPasteToolbar: js.UndefOr[Boolean] = js.undefined,
    showFormattingToolbar: js.UndefOr[Boolean] = js.undefined,
    showInsertObjectToolbar: js.UndefOr[Boolean] = js.undefined,
    showTextToolbar: js.UndefOr[Boolean] = js.undefined,
    toolbarCollapsed: (/* event */ Event_, /* ui */ ToolbarCollapsedEventUIParam) => Callback = null,
    toolbarCollapsing: (/* event */ Event_, /* ui */ ToolbarCollapsingEventUIParam) => Callback = null,
    toolbarExpanded: (/* event */ Event_, /* ui */ ToolbarExpandedEventUIParam) => Callback = null,
    toolbarExpanding: (/* event */ Event_, /* ui */ ToolbarExpandingEventUIParam) => Callback = null,
    toolbarSettings: js.Array[_] = null,
    undo: (/* event */ Event_, /* ui */ UndoEventUIParam) => Callback = null,
    value: String = null,
    width: String | Double = null,
    workspaceResized: (/* event */ Event_, /* ui */ WorkspaceResizedEventUIParam) => Callback = null
  ): IgHtmlEditor = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (actionExecuted != null) __obj.updateDynamic("actionExecuted")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ActionExecutedEventUIParam) => actionExecuted(t0, t1).runNow()))
    if (actionExecuting != null) __obj.updateDynamic("actionExecuting")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ActionExecutingEventUIParam) => actionExecuting(t0, t1).runNow()))
    if (copy != null) __obj.updateDynamic("copy")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.CopyEventUIParam) => copy(t0, t1).runNow()))
    if (customToolbars != null) __obj.updateDynamic("customToolbars")(customToolbars.asInstanceOf[js.Any])
    if (cut != null) __obj.updateDynamic("cut")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.CutEventUIParam) => cut(t0, t1).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (inputName != null) __obj.updateDynamic("inputName")(inputName.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (paste != null) __obj.updateDynamic("paste")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.PasteEventUIParam) => paste(t0, t1).runNow()))
    if (redo != null) __obj.updateDynamic("redo")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.RedoEventUIParam) => redo(t0, t1).runNow()))
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (rendered != null) __obj.updateDynamic("rendered")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.RenderedEventUIParam) => rendered(t0, t1).runNow()))
    if (rendering != null) __obj.updateDynamic("rendering")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.RenderingEventUIParam) => rendering(t0, t1).runNow()))
    if (!js.isUndefined(showCopyPasteToolbar)) __obj.updateDynamic("showCopyPasteToolbar")(showCopyPasteToolbar.asInstanceOf[js.Any])
    if (!js.isUndefined(showFormattingToolbar)) __obj.updateDynamic("showFormattingToolbar")(showFormattingToolbar.asInstanceOf[js.Any])
    if (!js.isUndefined(showInsertObjectToolbar)) __obj.updateDynamic("showInsertObjectToolbar")(showInsertObjectToolbar.asInstanceOf[js.Any])
    if (!js.isUndefined(showTextToolbar)) __obj.updateDynamic("showTextToolbar")(showTextToolbar.asInstanceOf[js.Any])
    if (toolbarCollapsed != null) __obj.updateDynamic("toolbarCollapsed")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ToolbarCollapsedEventUIParam) => toolbarCollapsed(t0, t1).runNow()))
    if (toolbarCollapsing != null) __obj.updateDynamic("toolbarCollapsing")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ToolbarCollapsingEventUIParam) => toolbarCollapsing(t0, t1).runNow()))
    if (toolbarExpanded != null) __obj.updateDynamic("toolbarExpanded")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ToolbarExpandedEventUIParam) => toolbarExpanded(t0, t1).runNow()))
    if (toolbarExpanding != null) __obj.updateDynamic("toolbarExpanding")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ToolbarExpandingEventUIParam) => toolbarExpanding(t0, t1).runNow()))
    if (toolbarSettings != null) __obj.updateDynamic("toolbarSettings")(toolbarSettings.asInstanceOf[js.Any])
    if (undo != null) __obj.updateDynamic("undo")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.UndoEventUIParam) => undo(t0, t1).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (workspaceResized != null) __obj.updateDynamic("workspaceResized")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.WorkspaceResizedEventUIParam) => workspaceResized(t0, t1).runNow()))
    __obj.asInstanceOf[IgHtmlEditor]
  }
}

