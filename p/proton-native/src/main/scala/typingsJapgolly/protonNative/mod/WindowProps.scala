package typingsJapgolly.protonNative.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.protonNative.AnonW
import typingsJapgolly.protonNative.AnonY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowProps extends js.Object {
  /**
    * Whether the window will have a border on the inside.
    */
  var borderless: js.UndefOr[Boolean] = js.undefined
  /**
    * Window can only have one child. To have more than one child, use boxes.
    */
  var children: js.UndefOr[Element] = js.undefined
  /**
    * Whether the window is closed. If set to closed, then the window will be closed.
    */
  var closed: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the window will be fullscreen on start.
    */
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the window is the last window. If set to `true`, then the program will quit once the window is closed.
    */
  var lastWindow: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether all children will have a margin around them and the outer edge of the window.
    */
  var margined: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether a menubar will be shown on the top of the window.
    */
  var menuBar: js.UndefOr[Boolean] = js.undefined
  /**
    * Called when the window is closed.
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Called when the window size is changed by the user. The new size is passed as an argument, in an object.
    */
  var onContentSizeChange: js.UndefOr[js.Function1[/* size */ AnonY, Unit]] = js.undefined
  /**
    * How big the window is when the application is first started.
    */
  var size: js.UndefOr[AnonW] = js.undefined
  /**
    * The title of the window. Will be shown at the top left ribbon.
    */
  var title: js.UndefOr[String] = js.undefined
}

object WindowProps {
  @scala.inline
  def apply(
    borderless: js.UndefOr[Boolean] = js.undefined,
    children: VdomElement = null,
    closed: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    lastWindow: js.UndefOr[Boolean] = js.undefined,
    margined: js.UndefOr[Boolean] = js.undefined,
    menuBar: js.UndefOr[Boolean] = js.undefined,
    onClose: js.UndefOr[Callback] = js.undefined,
    onContentSizeChange: /* size */ AnonY => Callback = null,
    size: AnonW = null,
    title: String = null
  ): WindowProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (!js.isUndefined(lastWindow)) __obj.updateDynamic("lastWindow")(lastWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(margined)) __obj.updateDynamic("margined")(margined.asInstanceOf[js.Any])
    if (!js.isUndefined(menuBar)) __obj.updateDynamic("menuBar")(menuBar.asInstanceOf[js.Any])
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    if (onContentSizeChange != null) __obj.updateDynamic("onContentSizeChange")(js.Any.fromFunction1((t0: /* size */ typingsJapgolly.protonNative.AnonY) => onContentSizeChange(t0).runNow()))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowProps]
  }
}

