package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLFormElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.IonButtonCustomEvent
import typingsJapgolly.ionicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonButton extends StObject {
  
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
    * Set to `"block"` for a full-width button or to `"full"` for a full-width button with square corners and no left or right borders.
    */
  var expand: js.UndefOr[full | block] = js.undefined
  
  /**
    * Set to `"clear"` for a transparent button that resembles a flat button, to `"outline"` for a transparent button with a border, or to `"solid"` for a button with a filled background. The default fill is `"solid"` except inside of a toolbar, where the default is `"clear"`.
    */
  var fill: js.UndefOr[clear | outline | solid | default] = js.undefined
  
  /**
    * The HTML form element or form element id. Used to submit a form when the button is not a child of the form.
    */
  var form: js.UndefOr[String | HTMLFormElement] = js.undefined
  
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
  var onIonBlur: js.UndefOr[js.Function1[/* event */ IonButtonCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the button has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ IonButtonCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Specifies the relationship of the target object to the link object. The value is a space-separated list of [link types](https://developer.mozilla.org/en-US/docs/Web/HTML/Link_types).
    */
  var rel: js.UndefOr[String] = js.undefined
  
  /**
    * When using a router, it specifies the transition animation when navigating to another page using `href`.
    */
  var routerAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * When using a router, it specifies the transition direction when navigating to another page using `href`.
    */
  var routerDirection: js.UndefOr[RouterDirection] = js.undefined
  
  /**
    * Set to `"round"` for a button with more rounded corners.
    */
  var shape: js.UndefOr[round] = js.undefined
  
  /**
    * Set to `"small"` for a button with less height and padding, to `"default"` for a button with the default height and padding, or to `"large"` for a button with more height and padding. By default the size is unset, unless the button is inside of an item, where the size is `"small"` by default. Set the size to `"default"` inside of an item to make it a standard size button.
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
  
  inline def apply(): IonButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonButton]
  }
  
  extension [Self <: IonButton](x: Self) {
    
    inline def setButtonType(value: String): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
    
    inline def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setExpand(value: full | block): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setFill(value: clear | outline | solid | default): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setForm(value: String | HTMLFormElement): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnIonBlur(value: /* event */ IonButtonCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonBlur", js.Any.fromFunction1((t0: /* event */ IonButtonCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonBlurUndefined: Self = StObject.set(x, "onIonBlur", js.undefined)
    
    inline def setOnIonFocus(value: /* event */ IonButtonCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonFocus", js.Any.fromFunction1((t0: /* event */ IonButtonCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonFocusUndefined: Self = StObject.set(x, "onIonFocus", js.undefined)
    
    inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setRouterAnimation(value: (/* baseEl */ Any, /* opts */ js.UndefOr[Any]) => Animation): Self = StObject.set(x, "routerAnimation", js.Any.fromFunction2(value))
    
    inline def setRouterAnimationUndefined: Self = StObject.set(x, "routerAnimation", js.undefined)
    
    inline def setRouterDirection(value: RouterDirection): Self = StObject.set(x, "routerDirection", value.asInstanceOf[js.Any])
    
    inline def setRouterDirectionUndefined: Self = StObject.set(x, "routerDirection", js.undefined)
    
    inline def setShape(value: round): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(value: small | default | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStrong(value: Boolean): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
    
    inline def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
