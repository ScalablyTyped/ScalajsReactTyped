package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import typingsJapgolly.semanticUiReact.cardCardMod.CardProps
import typingsJapgolly.semanticUiReact.cardDescriptionMod.CardDescriptionProps
import typingsJapgolly.semanticUiReact.cardHeaderMod.CardHeaderProps
import typingsJapgolly.semanticUiReact.cardMetaMod.CardMetaProps
import typingsJapgolly.semanticUiReact.cardMod.default
import typingsJapgolly.semanticUiReact.genericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.imageImageMod.ImageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Card {
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    color: SemanticCOLORS = null,
    content: SemanticShorthandContent = null,
    description: SemanticShorthandItem[CardDescriptionProps] = null,
    extra: SemanticShorthandContent = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    header: SemanticShorthandItem[CardHeaderProps] = null,
    href: String = null,
    image: SemanticShorthandItem[ImageProps] = null,
    link: js.UndefOr[Boolean] = js.undefined,
    meta: SemanticShorthandItem[CardMetaProps] = null,
    onClick: (/* event */ ReactMouseEventFrom[HTMLAnchorElement], /* data */ CardProps) => Callback = null,
    raised: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CardProps, default, Unit, CardProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement], t1: /* data */ typingsJapgolly.semanticUiReact.cardCardMod.CardProps) => onClick(t0, t1).runNow()))
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.semanticUiReact.cardCardMod.CardProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.semanticUiReact.cardMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.semanticUiReact.cardCardMod.CardProps])(children: _*)
  }
  @JSImport("semantic-ui-react/dist/commonjs/views/Card", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

