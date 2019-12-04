package typingsJapgolly.semanticDashUiDashReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageHeaderMod.MessageHeaderProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageItemMod.MessageItemProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageMod.MessageProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageMod.MessageSizeProp
import typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsMessageMod.default
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.bottom
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Message {
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    attached: Boolean | bottom | top = null,
    className: String = null,
    color: SemanticCOLORS = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandContent = null,
    error: js.UndefOr[Boolean] = js.undefined,
    floating: js.UndefOr[Boolean] = js.undefined,
    header: SemanticShorthandItem[MessageHeaderProps] = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icon: js.Any | Boolean = null,
    info: js.UndefOr[Boolean] = js.undefined,
    list: SemanticShorthandCollection[MessageItemProps] = null,
    negative: js.UndefOr[Boolean] = js.undefined,
    onDismiss: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ MessageProps) => Callback = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    size: MessageSizeProp = null,
    success: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    warning: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MessageProps, default, Unit, MessageProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(info)) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (!js.isUndefined(negative)) __obj.updateDynamic("negative")(negative.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageMod.MessageProps) => onDismiss(t0, t1).runNow()))
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageMod.MessageProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsMessageMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageMod.MessageProps])(children: _*)
  }
  @JSImport("semantic-ui-react/dist/commonjs/collections/Message", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

