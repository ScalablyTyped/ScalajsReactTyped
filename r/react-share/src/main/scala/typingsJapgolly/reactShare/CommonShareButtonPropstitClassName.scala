package typingsJapgolly.reactShare

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.StyleHTMLAttributes
import typingsJapgolly.reactShare.reactShareStrings.screenCenter
import typingsJapgolly.reactShare.reactShareStrings.windowCenter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-share.react-share.CommonShareButtonProps & {  title ? :string,   description ? :string,   image ? :string} */
trait CommonShareButtonPropstitClassName extends js.Object {
  /**
    * An object to pass any additional properties, such as `aria-*` attributes.
    */
  var additionalProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
  /**
    *  Takes a function that returns a Promise to be fulfilled before calling
    * `onClick`. If you do not return promise, `onClick` is called immediately.
    */
  var beforeOnClick: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
  /**
    * A class name to add to the others added by react-share (SocialMediaShareButton, ...).
    */
  var className: js.UndefOr[String] = js.undefined
  /** Description of the shared page */
  var description: js.UndefOr[String] = js.undefined
  /** Disables click action and adds `disabled` class */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Style when button is disabled
    * @default { opacity: 0.6 }
    */
  var disabledStyle: js.UndefOr[StyleHTMLAttributes[HTMLDivElement]] = js.undefined
  /** An absolute link to the image that will be shared */
  var image: js.UndefOr[String] = js.undefined
  /**
    * Click callback handler.
    */
  var onClick: js.UndefOr[js.Function1[/* link */ String, Unit]] = js.undefined
  /**
    * Takes a function to be called after closing share dialog.
    */
  var onShareWindowClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * If false, does not open a new window and call the onClick callback instead.
    * @default true
    */
  var openWindow: js.UndefOr[Boolean] = js.undefined
  /**
    * The HTML role of the div.
    * @default "button"
    */
  var role: js.UndefOr[String] = js.undefined
  /**
    * Extra style for the button.
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Indicates that its element can be focused, and where it participates in sequential keyboard
    * navigation.
    * @default "0"
    */
  var tabIndex: js.UndefOr[Double] = js.undefined
  /** Title of the shared page */
  var title: js.UndefOr[String] = js.undefined
  /**
    * URL of the shared page
    */
  var url: String
  var windowHeight: js.UndefOr[Double] = js.undefined
  /**
    * Whether to center the share box respectively to the screen or to the window.
    * @default "windowCenter"
    */
  var windowPosition: js.UndefOr[windowCenter | screenCenter] = js.undefined
  var windowWidth: js.UndefOr[Double] = js.undefined
}

object CommonShareButtonPropstitClassName {
  @scala.inline
  def apply(
    url: String,
    additionalProps: HTMLAttributes[HTMLDivElement] = null,
    beforeOnClick: js.UndefOr[CallbackTo[js.Promise[Unit] | Unit]] = js.undefined,
    className: String = null,
    description: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledStyle: StyleHTMLAttributes[HTMLDivElement] = null,
    image: String = null,
    onClick: /* link */ String => Callback = null,
    onShareWindowClose: js.UndefOr[Callback] = js.undefined,
    openWindow: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    title: String = null,
    windowHeight: Int | Double = null,
    windowPosition: windowCenter | screenCenter = null,
    windowWidth: Int | Double = null
  ): CommonShareButtonPropstitClassName = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (additionalProps != null) __obj.updateDynamic("additionalProps")(additionalProps.asInstanceOf[js.Any])
    beforeOnClick.foreach(p => __obj.updateDynamic("beforeOnClick")(p.toJsFn))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledStyle != null) __obj.updateDynamic("disabledStyle")(disabledStyle.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* link */ java.lang.String) => onClick(t0).runNow()))
    onShareWindowClose.foreach(p => __obj.updateDynamic("onShareWindowClose")(p.toJsFn))
    if (!js.isUndefined(openWindow)) __obj.updateDynamic("openWindow")(openWindow.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (windowHeight != null) __obj.updateDynamic("windowHeight")(windowHeight.asInstanceOf[js.Any])
    if (windowPosition != null) __obj.updateDynamic("windowPosition")(windowPosition.asInstanceOf[js.Any])
    if (windowWidth != null) __obj.updateDynamic("windowWidth")(windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonShareButtonPropstitClassName]
  }
}

