package typingsJapgolly.semanticDashUiDashReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsIconIconMod.IconProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.HtmlIframeProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesEmbedEmbedMod.EmbedProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesEmbedMod.default
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`16:9`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`21:9`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`4:3`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.vimeo
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.youtube
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Embed {
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    aspectRatio: `4:3` | `16:9` | `21:9` = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    brandedUI: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    color: String = null,
    content: SemanticShorthandContent = null,
    defaultActive: js.UndefOr[Boolean] = js.undefined,
    hd: js.UndefOr[Boolean] = js.undefined,
    icon: SemanticShorthandItem[IconProps] = null,
    id: String = null,
    iframe: SemanticShorthandItem[HtmlIframeProps] = null,
    onClick: (/* event */ ReactMouseEventFrom[HTMLDivElement], /* data */ EmbedProps) => Callback = null,
    placeholder: String = null,
    source: youtube | vimeo = null,
    url: String = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[EmbedProps, default, Unit, EmbedProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (!js.isUndefined(brandedUI)) __obj.updateDynamic("brandedUI")(brandedUI.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActive)) __obj.updateDynamic("defaultActive")(defaultActive.asInstanceOf[js.Any])
    if (!js.isUndefined(hd)) __obj.updateDynamic("hd")(hd.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (iframe != null) __obj.updateDynamic("iframe")(iframe.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement], t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesEmbedEmbedMod.EmbedProps) => onClick(t0, t1).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesEmbedEmbedMod.EmbedProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesEmbedMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesEmbedEmbedMod.EmbedProps])(children: _*)
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Embed", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

