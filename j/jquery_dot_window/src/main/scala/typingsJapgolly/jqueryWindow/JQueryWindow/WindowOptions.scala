package typingsJapgolly.jqueryWindow.JQueryWindow

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jqueryWindow.AnonX
import typingsJapgolly.jqueryWindow.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Instance options
trait WindowOptions extends js.Object {
  /**
    a callback function after window cascaded
    **/
  var afterCascade: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function after window dragged
    **/
  var afterDrag: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function after window maximized
    **/
  var afterMaximize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function after window minimized
    **/
  var afterMinimize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function after window resized
    **/
  var afterResize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    to control window with remote url could be bookmarked
    **/
  var bookmarkable: js.UndefOr[Boolean] = js.undefined
  /**
    to check window dialog overflow html body or caller element
    **/
  var checkBoundary: js.UndefOr[Boolean] = js.undefined
  /**
    to control window closable
    **/
  var closable: js.UndefOr[Boolean] = js.undefined
  /**
    container extra class
    **/
  var containerClass: js.UndefOr[String] = js.undefined
  /**
    this attribute only works when url is null. when passing a jquery object or a element, it will clone the original one to append.
    **/
  var content: js.UndefOr[String | JQuery | HTMLElement] = js.undefined
  /**
    random the new created window position, it only works when options x,y value both are -1
    **/
  var createRandomOffset: js.UndefOr[AnonX] = js.undefined
  /**
    to describe the customized button display and callback function
    **/
  var custBtns: js.UndefOr[js.Array[Button]] = js.undefined
  /**
    to control window draggable
    **/
  var draggable: js.UndefOr[Boolean] = js.undefined
  /**
    footer extra class
    **/
  var footerClass: js.UndefOr[String] = js.undefined
  /**
    same as content attribute, but it's put on footer panel.
    **/
  var footerContent: js.UndefOr[String | JQuery | HTMLElement] = js.undefined
  /**
    frame extra class
    **/
  var frameClass: js.UndefOr[String] = js.undefined
  /**
    header extra class
    **/
  var headerClass: js.UndefOr[String] = js.undefined
  /**
    window height
    **/
  var height: js.UndefOr[Double] = js.undefined
  /**
    an icon image url string. if this attribute is given, it will force to replace the original favicon of remote page on window. or you can set it as null to hide icon.
    **/
  var icon: js.UndefOr[String] = js.undefined
  /**
    if null means no check, or pass a string to show warning message while iframe is going to redirect current top page
    **/
  var iframeRedirectCheckMsg: js.UndefOr[String] = js.undefined
  /**
    the maximum height, if -1 means no checking
    **/
  var maxHeight: js.UndefOr[Double] = js.undefined
  /**
    the maximum width, if -1 means no checking
    **/
  var maxWidth: js.UndefOr[Double] = js.undefined
  /**
    to control window maximizable
    **/
  var maximizable: js.UndefOr[Boolean] = js.undefined
  /**
    the minimum height, if -1 means no checking
    **/
  var minHeight: js.UndefOr[Double] = js.undefined
  /**
    the minimum width, if -1 means no checking
    **/
  var minWidth: js.UndefOr[Double] = js.undefined
  /**
    to control window minimizable
    **/
  var minimizable: js.UndefOr[Boolean] = js.undefined
  /**
    the opacity of modal dialog
    **/
  var modalOpacity: js.UndefOr[Double] = js.undefined
  /**
    a callback function while window is going to cascade
    **/
  var onCascade: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function while user click close button
    **/
  var onClose: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function while window is going to drag
    **/
  var onDrag: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function while iframe load finished. this attribute only works while url attribute is given
    **/
  var onIframeEnd: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function while iframe ready to connect remoting url. this attribute only works while url attribute is given
    **/
  var onIframeStart: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function while window is going to maximize
    **/
  var onMaximize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function while window is going to minimize
    **/
  var onMinimize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function while container is added into body
    **/
  var onOpen: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function while window is going to resize
    **/
  var onResize: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function while user select the window
    **/
  var onSelect: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function while whole window display routine is finished
    **/
  var onShow: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    a callback function while window unselected
    **/
  var onUnselect: js.UndefOr[js.Function1[/* wnd */ Window, Unit]] = js.undefined
  /**
    to control window resizable
    **/
  var resizable: js.UndefOr[Boolean] = js.undefined
  /**
    to show scroll bar or not
    **/
  var scrollable: js.UndefOr[Boolean] = js.undefined
  /**
    selected header extra class
    **/
  var selectedHeaderClass: js.UndefOr[String] = js.undefined
  /**
    to control show footer panel
    **/
  var showFooter: js.UndefOr[Boolean] = js.undefined
  /**
    to control show modal on background
    **/
  var showModal: js.UndefOr[Boolean] = js.undefined
  /**
    to control display window as round corner
    **/
  var showRoundCorner: js.UndefOr[Boolean] = js.undefined
  /**
    the title text of window
    **/
  var title: String
  /**
    the target url of iframe ready to load.
    **/
  var url: js.UndefOr[String] = js.undefined
  /**
    window width
    **/
  var width: js.UndefOr[Double] = js.undefined
  /**
    to limit window only can be dragged within browser window. this attribute only works when checkBoundary is true and caller is null.
    **/
  var withinBrowserWindow: js.UndefOr[Boolean] = js.undefined
  /**
    the x-axis value on screen(or caller element), if -1 means put on screen(or caller element) center
    **/
  var x: js.UndefOr[Double] = js.undefined
  /**
    the y-axis value on screen(or caller element), if -1 means put on screen(or caller element) center
    **/
  var y: js.UndefOr[Double] = js.undefined
  /**
    the css z-index value
    **/
  var z: js.UndefOr[Double] = js.undefined
}

object WindowOptions {
  @scala.inline
  def apply(
    title: String,
    afterCascade: /* wnd */ Window => Callback = null,
    afterDrag: /* wnd */ Window => Callback = null,
    afterMaximize: /* wnd */ Window => Callback = null,
    afterMinimize: /* wnd */ Window => Callback = null,
    afterResize: /* wnd */ Window => Callback = null,
    bookmarkable: js.UndefOr[Boolean] = js.undefined,
    checkBoundary: js.UndefOr[Boolean] = js.undefined,
    closable: js.UndefOr[Boolean] = js.undefined,
    containerClass: String = null,
    content: String | JQuery | HTMLElement = null,
    createRandomOffset: AnonX = null,
    custBtns: js.Array[Button] = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    footerClass: String = null,
    footerContent: String | JQuery | HTMLElement = null,
    frameClass: String = null,
    headerClass: String = null,
    height: Int | Double = null,
    icon: String = null,
    iframeRedirectCheckMsg: String = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    maximizable: js.UndefOr[Boolean] = js.undefined,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    minimizable: js.UndefOr[Boolean] = js.undefined,
    modalOpacity: Int | Double = null,
    onCascade: /* wnd */ Window => Callback = null,
    onClose: /* wnd */ Window => Callback = null,
    onDrag: /* wnd */ Window => Callback = null,
    onIframeEnd: /* wnd */ Window => Callback = null,
    onIframeStart: /* wnd */ Window => Callback = null,
    onMaximize: /* wnd */ Window => Callback = null,
    onMinimize: /* wnd */ Window => Callback = null,
    onOpen: /* wnd */ Window => Callback = null,
    onResize: /* wnd */ Window => Callback = null,
    onSelect: /* wnd */ Window => Callback = null,
    onShow: /* wnd */ Window => Callback = null,
    onUnselect: /* wnd */ Window => Callback = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    selectedHeaderClass: String = null,
    showFooter: js.UndefOr[Boolean] = js.undefined,
    showModal: js.UndefOr[Boolean] = js.undefined,
    showRoundCorner: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    width: Int | Double = null,
    withinBrowserWindow: js.UndefOr[Boolean] = js.undefined,
    x: Int | Double = null,
    y: Int | Double = null,
    z: Int | Double = null
  ): WindowOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (afterCascade != null) __obj.updateDynamic("afterCascade")(js.Any.fromFunction1((t0: /* wnd */ typingsJapgolly.jqueryWindow.JQueryWindow.Window) => afterCascade(t0).runNow()))
    if (afterDrag != null) __obj.updateDynamic("afterDrag")(js.Any.fromFunction1((t0: /* wnd */ typingsJapgolly.jqueryWindow.JQueryWindow.Window) => afterDrag(t0).runNow()))
    if (afterMaximize != null) __obj.updateDynamic("afterMaximize")(js.Any.fromFunction1((t0: /* wnd */ typingsJapgolly.jqueryWindow.JQueryWindow.Window) => afterMaximize(t0).runNow()))
    if (afterMinimize != null) __obj.updateDynamic("afterMinimize")(js.Any.fromFunction1((t0: /* wnd */ typingsJapgolly.jqueryWindow.JQueryWindow.Window) => afterMinimize(t0).runNow()))
    if (afterResize != null) __obj.updateDynamic("afterResize")(js.Any.fromFunction1((t0: /* wnd */ typingsJapgolly.jqueryWindow.JQueryWindow.Window) => afterResize(t0).runNow()))
    if (!js.isUndefined(bookmarkable)) __obj.updateDynamic("bookmarkable")(bookmarkable.asInstanceOf[js.Any])
    if (!js.isUndefined(checkBoundary)) __obj.updateDynamic("checkBoundary")(checkBoundary.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (createRandomOffset != null) __obj.updateDynamic("createRandomOffset")(createRandomOffset.asInstanceOf[js.Any])
    if (custBtns != null) __obj.updateDynamic("custBtns")(custBtns.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (footerClass != null) __obj.updateDynamic("footerClass")(footerClass.asInstanceOf[js.Any])
    if (footerContent != null) __obj.updateDynamic("footerContent")(footerContent.asInstanceOf[js.Any])
    if (frameClass != null) __obj.updateDynamic("frameClass")(frameClass.asInstanceOf[js.Any])
    if (headerClass != null) __obj.updateDynamic("headerClass")(headerClass.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iframeRedirectCheckMsg != null) __obj.updateDynamic("iframeRedirectCheckMsg")(iframeRedirectCheckMsg.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(maximizable)) __obj.updateDynamic("maximizable")(maximizable.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(minimizable)) __obj.updateDynamic("minimizable")(minimizable.asInstanceOf[js.Any])
    if (modalOpacity != null) __obj.updateDynamic("modalOpacity")(modalOpacity.asInstanceOf[js.Any])
    if (onCascade != null) __obj.updateDynamic("onCascade")(js.Any.fromFunction1((t0: /* wnd */ typingsJapgolly.jqueryWindow.JQueryWindow.Window) => onCascade(t0).runNow()))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* wnd */ typingsJapgolly.jqueryWindow.JQueryWindow.Window) => onClose(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: /* wnd */ typingsJapgolly.jqueryWindow.JQueryWindow.Window) => onDrag(t0).runNow()))
    if (onIframeEnd != null) __obj.updateDynamic("onIframeEnd")(js.Any.fromFunction1((t0: /* wnd */ typingsJapgolly.jqueryWindow.JQueryWindow.Window) => onIframeEnd(t0).runNow()))
    if (onIframeStart != null) __obj.updateDynamic("onIframeStart")(js.Any.fromFunction1((t0: /* wnd */ typingsJapgolly.jqueryWindow.JQueryWindow.Window) => onIframeStart(t0).runNow()))
    if (onMaximize != null) __obj.updateDynamic("onMaximize")(js.Any.fromFunction1((t0: /* wnd */ typingsJapgolly.jqueryWindow.JQueryWindow.Window) => onMaximize(t0).runNow()))
    if (onMinimize != null) __obj.updateDynamic("onMinimize")(js.Any.fromFunction1((t0: /* wnd */ typingsJapgolly.jqueryWindow.JQueryWindow.Window) => onMinimize(t0).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1((t0: /* wnd */ typingsJapgolly.jqueryWindow.JQueryWindow.Window) => onOpen(t0).runNow()))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1((t0: /* wnd */ typingsJapgolly.jqueryWindow.JQueryWindow.Window) => onResize(t0).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* wnd */ typingsJapgolly.jqueryWindow.JQueryWindow.Window) => onSelect(t0).runNow()))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: /* wnd */ typingsJapgolly.jqueryWindow.JQueryWindow.Window) => onShow(t0).runNow()))
    if (onUnselect != null) __obj.updateDynamic("onUnselect")(js.Any.fromFunction1((t0: /* wnd */ typingsJapgolly.jqueryWindow.JQueryWindow.Window) => onUnselect(t0).runNow()))
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (selectedHeaderClass != null) __obj.updateDynamic("selectedHeaderClass")(selectedHeaderClass.asInstanceOf[js.Any])
    if (!js.isUndefined(showFooter)) __obj.updateDynamic("showFooter")(showFooter.asInstanceOf[js.Any])
    if (!js.isUndefined(showModal)) __obj.updateDynamic("showModal")(showModal.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoundCorner)) __obj.updateDynamic("showRoundCorner")(showRoundCorner.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(withinBrowserWindow)) __obj.updateDynamic("withinBrowserWindow")(withinBrowserWindow.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOptions]
  }
}

