package typingsJapgolly.ejWebAll.ej.Dialog

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggered when the custom action button clicked.
    */
  var actionButtonClick: js.UndefOr[js.Function1[/* e */ ActionButtonClickEventArgs, Unit]] = js.undefined
  /** Adds action buttons like close, minimize, pin, maximize in the dialog header.
    */
  var actionButtons: js.UndefOr[js.Array[String]] = js.undefined
  /** This event is triggered whenever the AJAX request fails to retrieve the dialog content.
    */
  var ajaxError: js.UndefOr[js.Function1[/* e */ AjaxErrorEventArgs, Unit]] = js.undefined
  /** Specifies the ajaxSettings option to load the content to the Dialog control.
    * @Default {null}
    */
  var ajaxSettings: js.UndefOr[AjaxSettings] = js.undefined
  /** This event is triggered whenever the AJAX request to retrieve the dialog content, gets succeed.
    */
  var ajaxSuccess: js.UndefOr[js.Function1[/* e */ AjaxSuccessEventArgs, Unit]] = js.undefined
  /** Enables or disables draggable.
    */
  var allowDraggable: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables keyboard interaction.
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
  /** Customizes the Dialog widget animations. The Dialog widget can be animated while opening and closing the dialog. In order to customize animation effects, you need to set
    * â€œenableAnimationâ€ as true. It contains the following sub properties.
    */
  var animation: js.UndefOr[js.Any] = js.undefined
  /** To Enable or disable the scrolling for background element of the modal dialog. This will work only with modal dialog.
    */
  var backgroundScroll: js.UndefOr[Boolean] = js.undefined
  /** This event is triggered before the dialog widgets get closed.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, Unit]] = js.undefined
  /** This event is triggered before the dialog widgets gets open.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.undefined
  /** This event is triggered after the dialog widget is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.undefined
  /** Closes the dialog widget on pressing the ESC key when it is set to true.
    */
  var closeOnEscape: js.UndefOr[Boolean] = js.undefined
  /** Triggered when the dialog content is collapsed.
    */
  var collapse: js.UndefOr[js.Function1[/* e */ CollapseEventArgs, Unit]] = js.undefined
  /** The selector for the container element. If the property is set, then dialog will append to the selected element and it is restricted to move only within the specified container
    * element.
    */
  var containment: js.UndefOr[String] = js.undefined
  /** Triggered after the dialog content is loaded in DOM.
    */
  var contentLoad: js.UndefOr[js.Function1[/* e */ ContentLoadEventArgs, Unit]] = js.undefined
  /** The content type to load the dialog content at run time. The possible values are null, AJAX, iframe and image. When it is null (default value), the content inside dialog element
    * will be displayed as content and when it is not null, the content will be loaded from the URL specified in the contentUrl property.
    */
  var contentType: js.UndefOr[String] = js.undefined
  /** The URL to load the dialog content (such as AJAX, image, and iframe). In order to load content from URL, you need to set contentType as â€˜ajaxâ€™ or â€˜iframeâ€™ or â€˜imageâ€™.
    */
  var contentUrl: js.UndefOr[String] = js.undefined
  /** Triggered after the dialog is created successfully
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** The root class for the Dialog widget to customize the existing theme.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Triggered after the dialog widget is destroyed successfully
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Triggered while the dialog is dragged.
    */
  var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, Unit]] = js.undefined
  /** Triggered when the user starts dragging the dialog.
    */
  var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, Unit]] = js.undefined
  /** Triggered when the user stops dragging the dialog.
    */
  var dragStop: js.UndefOr[js.Function1[/* e */ DragStopEventArgs, Unit]] = js.undefined
  /** Enable or disables animation when the dialog is opened or closed.
    */
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  /** Enable or disables modal dialog. The modal dialog acts like a child window that is displayed on top of the main window/screen and disables the main window interaction until it is
    * closed.
    */
  var enableModal: js.UndefOr[Boolean] = js.undefined
  /** Allows the current model values to be saved in local storage or browser cookies for state maintenance when it is set to true.
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  /** Displays dialog content from right to left when set to true.
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Allows the dialog to be resized. The dialog cannot be resized less than the minimum height, width values and greater than the maximum height and width.
    */
  var enableResize: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the Dialog widget.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Triggered when the dialog content is expanded.
    */
  var expand: js.UndefOr[js.Function1[/* e */ ExpandEventArgs, Unit]] = js.undefined
  /** The CSS class name to display the favicon in the dialog header. In order to display favicon, you need to set showHeader as true since the favicon will be displayed in the dialog
    * header.
    */
  var faviconCSS: js.UndefOr[String] = js.undefined
  /** Sets the FooterTemplate for the Dialog widget.
    */
  var footerTemplateId: js.UndefOr[String] = js.undefined
  /** Sets the height for the dialog widget. It accepts both string and integer values. For example, it can accepts values like â€œautoâ€, â€œ100%â€, â€œ100pxâ€ as string type and
    * â€œ100â€, â€œ500â€ as integer type.
    */
  var height: js.UndefOr[String | Double] = js.undefined
  /** Specifies the HTML Attributes of the Dialog.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Enable or disables responsive behavior.
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Default Value:{:.param}â€œen-USâ€
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Sets the maximum height for the dialog widget.
    */
  var maxHeight: js.UndefOr[String | Double] = js.undefined
  /** Sets the maximum width for the dialog widget.
    */
  var maxWidth: js.UndefOr[String | Double] = js.undefined
  /** Sets the minimum height for the dialog widget.
    */
  var minHeight: js.UndefOr[String | Double] = js.undefined
  /** Sets the minimum width for the dialog widget.
    */
  var minWidth: js.UndefOr[String | Double] = js.undefined
  /** Triggered after the dialog is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.undefined
  /** Displays the Dialog widget at the given X and Y position.
    */
  var position: js.UndefOr[js.Any] = js.undefined
  /** Triggered while the dialog is resized.
    */
  var resize: js.UndefOr[js.Function1[/* e */ ResizeEventArgs, Unit]] = js.undefined
  /** Triggered when the user starts resizing the dialog.
    */
  var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, Unit]] = js.undefined
  /** Triggered when the user stops resizing the dialog.
    */
  var resizeStop: js.UndefOr[js.Function1[/* e */ ResizeStopEventArgs, Unit]] = js.undefined
  /** Sets the Footer for the Dialog widget.
    */
  var showFooter: js.UndefOr[Boolean] = js.undefined
  /** Shows or hides the dialog header.
    */
  var showHeader: js.UndefOr[Boolean] = js.undefined
  /** The Dialog widget can be opened by default i.e. on initialization, when it is set to true.
    */
  var showOnInit: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the rounder corner.
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
  /** The selector for the container element. If this property is set, the dialog will be displayed (positioned) based on its container.
    */
  var target: js.UndefOr[String] = js.undefined
  /** The title text to be displayed in the dialog header. In order to set title, you need to set showHeader as true since the title will be displayed in the dialog header.
    */
  var title: js.UndefOr[String] = js.undefined
  /** Add or configure the tooltip text for actionButtons in the dialog header.
    */
  var tooltip: js.UndefOr[js.Any] = js.undefined
  /** Sets the height for the dialog widget. It accepts both string and integer values. For example, it can accepts values like â€œautoâ€, â€œ100%â€, â€œ100pxâ€ as string type and
    * â€œ100â€, â€œ500â€ as integer type.
    */
  var width: js.UndefOr[String | Double] = js.undefined
  /** Sets the z-index value for the Dialog widget.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    actionButtonClick: /* e */ ActionButtonClickEventArgs => Callback = null,
    actionButtons: js.Array[String] = null,
    ajaxError: /* e */ AjaxErrorEventArgs => Callback = null,
    ajaxSettings: AjaxSettings = null,
    ajaxSuccess: /* e */ AjaxSuccessEventArgs => Callback = null,
    allowDraggable: js.UndefOr[Boolean] = js.undefined,
    allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    animation: js.Any = null,
    backgroundScroll: js.UndefOr[Boolean] = js.undefined,
    beforeClose: /* e */ BeforeCloseEventArgs => Callback = null,
    beforeOpen: /* e */ BeforeOpenEventArgs => Callback = null,
    close: /* e */ CloseEventArgs => Callback = null,
    closeOnEscape: js.UndefOr[Boolean] = js.undefined,
    collapse: /* e */ CollapseEventArgs => Callback = null,
    containment: String = null,
    contentLoad: /* e */ ContentLoadEventArgs => Callback = null,
    contentType: String = null,
    contentUrl: String = null,
    create: /* e */ CreateEventArgs => Callback = null,
    cssClass: String = null,
    destroy: /* e */ DestroyEventArgs => Callback = null,
    drag: /* e */ DragEventArgs => Callback = null,
    dragStart: /* e */ DragStartEventArgs => Callback = null,
    dragStop: /* e */ DragStopEventArgs => Callback = null,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    enableModal: js.UndefOr[Boolean] = js.undefined,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableResize: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    expand: /* e */ ExpandEventArgs => Callback = null,
    faviconCSS: String = null,
    footerTemplateId: String = null,
    height: String | Double = null,
    htmlAttributes: js.Any = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    maxHeight: String | Double = null,
    maxWidth: String | Double = null,
    minHeight: String | Double = null,
    minWidth: String | Double = null,
    open: /* e */ OpenEventArgs => Callback = null,
    position: js.Any = null,
    resize: /* e */ ResizeEventArgs => Callback = null,
    resizeStart: /* e */ ResizeStartEventArgs => Callback = null,
    resizeStop: /* e */ ResizeStopEventArgs => Callback = null,
    showFooter: js.UndefOr[Boolean] = js.undefined,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    showOnInit: js.UndefOr[Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    target: String = null,
    title: String = null,
    tooltip: js.Any = null,
    width: String | Double = null,
    zIndex: Int | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (actionButtonClick != null) __obj.updateDynamic("actionButtonClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Dialog.ActionButtonClickEventArgs) => actionButtonClick(t0).runNow()))
    if (actionButtons != null) __obj.updateDynamic("actionButtons")(actionButtons.asInstanceOf[js.Any])
    if (ajaxError != null) __obj.updateDynamic("ajaxError")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Dialog.AjaxErrorEventArgs) => ajaxError(t0).runNow()))
    if (ajaxSettings != null) __obj.updateDynamic("ajaxSettings")(ajaxSettings.asInstanceOf[js.Any])
    if (ajaxSuccess != null) __obj.updateDynamic("ajaxSuccess")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Dialog.AjaxSuccessEventArgs) => ajaxSuccess(t0).runNow()))
    if (!js.isUndefined(allowDraggable)) __obj.updateDynamic("allowDraggable")(allowDraggable.asInstanceOf[js.Any])
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundScroll)) __obj.updateDynamic("backgroundScroll")(backgroundScroll.asInstanceOf[js.Any])
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Dialog.BeforeCloseEventArgs) => beforeClose(t0).runNow()))
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Dialog.BeforeOpenEventArgs) => beforeOpen(t0).runNow()))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Dialog.CloseEventArgs) => close(t0).runNow()))
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape.asInstanceOf[js.Any])
    if (collapse != null) __obj.updateDynamic("collapse")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Dialog.CollapseEventArgs) => collapse(t0).runNow()))
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (contentLoad != null) __obj.updateDynamic("contentLoad")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Dialog.ContentLoadEventArgs) => contentLoad(t0).runNow()))
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Dialog.CreateEventArgs) => create(t0).runNow()))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Dialog.DestroyEventArgs) => destroy(t0).runNow()))
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Dialog.DragEventArgs) => drag(t0).runNow()))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Dialog.DragStartEventArgs) => dragStart(t0).runNow()))
    if (dragStop != null) __obj.updateDynamic("dragStop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Dialog.DragStopEventArgs) => dragStop(t0).runNow()))
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(enableModal)) __obj.updateDynamic("enableModal")(enableModal.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enableResize)) __obj.updateDynamic("enableResize")(enableResize.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Dialog.ExpandEventArgs) => expand(t0).runNow()))
    if (faviconCSS != null) __obj.updateDynamic("faviconCSS")(faviconCSS.asInstanceOf[js.Any])
    if (footerTemplateId != null) __obj.updateDynamic("footerTemplateId")(footerTemplateId.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Dialog.OpenEventArgs) => open(t0).runNow()))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Dialog.ResizeEventArgs) => resize(t0).runNow()))
    if (resizeStart != null) __obj.updateDynamic("resizeStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Dialog.ResizeStartEventArgs) => resizeStart(t0).runNow()))
    if (resizeStop != null) __obj.updateDynamic("resizeStop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Dialog.ResizeStopEventArgs) => resizeStop(t0).runNow()))
    if (!js.isUndefined(showFooter)) __obj.updateDynamic("showFooter")(showFooter.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnInit)) __obj.updateDynamic("showOnInit")(showOnInit.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

