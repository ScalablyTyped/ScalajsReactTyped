package typingsJapgolly.semanticDashUiDashReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsHeaderHeaderMod.HeaderProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticFLOATS
import typingsJapgolly.semanticDashUiDashReact.distCommonjsGenericMod.SemanticTEXTALIGNMENTS
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.bottom
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.huge
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.large
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.medium
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.small
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.tiny
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Header {
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    attached: Boolean | top | bottom = null,
    block: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    color: SemanticCOLORS = null,
    content: VdomNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dividing: js.UndefOr[Boolean] = js.undefined,
    floated: SemanticFLOATS = null,
    icon: js.Any = null,
    image: js.Any = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    size: tiny | small | medium | large | huge = null,
    sub: js.UndefOr[Boolean] = js.undefined,
    subheader: js.Any = null,
    textAlign: SemanticTEXTALIGNMENTS = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    HeaderProps, 
    MountedWithRawType[HeaderProps, js.Object, RawMounted[HeaderProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dividing)) __obj.updateDynamic("dividing")(dividing.asInstanceOf[js.Any])
    if (floated != null) __obj.updateDynamic("floated")(floated.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(sub)) __obj.updateDynamic("sub")(sub.asInstanceOf[js.Any])
    if (subheader != null) __obj.updateDynamic("subheader")(subheader.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsHeaderHeaderMod.HeaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsHeaderHeaderMod.HeaderProps])(children: _*)
  }
  @JSImport("semantic-ui-react/dist/commonjs/elements/Header", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

