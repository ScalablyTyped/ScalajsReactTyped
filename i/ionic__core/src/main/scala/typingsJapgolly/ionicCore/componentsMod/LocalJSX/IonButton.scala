package typingsJapgolly.ionicCore.componentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.CustomEvent
import typingsJapgolly.ionicCore.interfaceMod.RouterDirection
import typingsJapgolly.ionicCore.ionicCoreStrings.block
import typingsJapgolly.ionicCore.ionicCoreStrings.button
import typingsJapgolly.ionicCore.ionicCoreStrings.clear
import typingsJapgolly.ionicCore.ionicCoreStrings.default
import typingsJapgolly.ionicCore.ionicCoreStrings.full
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.large
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.ionicCoreStrings.outline
import typingsJapgolly.ionicCore.ionicCoreStrings.reset
import typingsJapgolly.ionicCore.ionicCoreStrings.round
import typingsJapgolly.ionicCore.ionicCoreStrings.small
import typingsJapgolly.ionicCore.ionicCoreStrings.solid
import typingsJapgolly.ionicCore.ionicCoreStrings.submit
import typingsJapgolly.ionicCore.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonButton extends js.Object {
  /**
    * The type of button.
    */
  var buttonType: js.UndefOr[String] = js.undefined
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * If `true`, the user cannot interact with the button.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * This attribute instructs browsers to download a URL instead of navigating to it, so the user will be prompted to save it as a local file. If the attribute has a value, it is used as the pre-filled file name in the Save prompt (the user can still change the file name if they want).
    */
  var download: js.UndefOr[String] = js.undefined
  /**
    * Set to `"block"` for a full-width button or to `"full"` for a full-width button without left and right borders.
    */
  var expand: js.UndefOr[full | block] = js.undefined
  /**
    * Set to `"clear"` for a transparent button, to `"outline"` for a transparent button with a border, or to `"solid"`. The default style is `"solid"` except inside of a toolbar, where the default is `"clear"`.
    */
  var fill: js.UndefOr[clear | outline | solid | default] = js.undefined
  /**
    * Contains a URL or a URL fragment that the hyperlink points to. If this property is set, an anchor tag will be rendered.
    */
  var href: js.UndefOr[String] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  /**
    * Emitted when the button loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Emitted when the button has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ CustomEvent, Unit]] = js.undefined
  /**
    * Specifies the relationship of the target object to the link object. The value is a space-separated list of [link types](https://developer.mozilla.org/en-US/docs/Web/HTML/Link_types).
    */
  var rel: js.UndefOr[String] = js.undefined
  /**
    * When using a router, it specifies the transition direction when navigating to another page using `href`.
    */
  var routerDirection: js.UndefOr[RouterDirection] = js.undefined
  /**
    * The button shape.
    */
  var shape: js.UndefOr[round] = js.undefined
  /**
    * The button size.
    */
  var size: js.UndefOr[small | default | large] = js.undefined
  /**
    * If `true`, activates a button with a heavier font weight.
    */
  var strong: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies where to display the linked URL. Only applies when an `href` is provided. Special keywords: `"_blank"`, `"_self"`, `"_parent"`, `"_top"`.
    */
  var target: js.UndefOr[String] = js.undefined
  /**
    * The type of the button.
    */
  var `type`: js.UndefOr[submit | reset | button] = js.undefined
}

object IonButton {
  @scala.inline
  def apply(
    buttonType: String = null,
    color: Color = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    download: String = null,
    expand: full | block = null,
    fill: clear | outline | solid | default = null,
    href: String = null,
    mode: ios | md = null,
    onIonBlur: /* event */ CustomEvent => Callback = null,
    onIonFocus: /* event */ CustomEvent => Callback = null,
    rel: String = null,
    routerDirection: RouterDirection = null,
    shape: round = null,
    size: small | default | large = null,
    strong: js.UndefOr[Boolean] = js.undefined,
    target: String = null,
    `type`: submit | reset | button = null
  ): IonButton = {
    val __obj = js.Dynamic.literal()
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onIonBlur != null) __obj.updateDynamic("onIonBlur")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonBlur(t0).runNow()))
    if (onIonFocus != null) __obj.updateDynamic("onIonFocus")(js.Any.fromFunction1((t0: /* event */ org.scalajs.dom.raw.CustomEvent) => onIonFocus(t0).runNow()))
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    if (routerDirection != null) __obj.updateDynamic("routerDirection")(routerDirection.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(strong)) __obj.updateDynamic("strong")(strong.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonButton]
  }
}

