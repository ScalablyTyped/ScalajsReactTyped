package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.auto
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.baseline
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.center
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.end
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.inherit
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.initial
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.start
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.stretch
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.unset
import typingsJapgolly.officeUiFabricReact.stackItemTypesMod.IStackItemProps
import typingsJapgolly.officeUiFabricReact.stackItemTypesMod.IStackItemStyles
import typingsJapgolly.officeUiFabricReact.stackItemTypesMod.IStackItemTokens
import typingsJapgolly.uifabricFoundation.ihtmlslotsMod.IHTMLSlot
import typingsJapgolly.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject
import typingsJapgolly.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StackItem {
  def apply(
    align: auto | stretch | baseline | start | center | end = null,
    className: String = null,
    disableShrink: js.UndefOr[Boolean] = js.undefined,
    grow: Boolean | Double | inherit | initial | unset = null,
    order: Double | String = null,
    root: IHTMLSlot = null,
    shrink: Boolean | Double | inherit | initial | unset = null,
    styles: IStylesFunctionOrObject[IStackItemProps, IStackItemTokens, IStackItemStyles] = null,
    theme: ITheme = null,
    tokens: ITokenFunctionOrObject[IStackItemProps, IStackItemTokens] = null,
    verticalFill: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    IStackItemProps, 
    MountedWithRawType[IStackItemProps, js.Object, RawMounted[IStackItemProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableShrink)) __obj.updateDynamic("disableShrink")(disableShrink.asInstanceOf[js.Any])
    if (grow != null) __obj.updateDynamic("grow")(grow.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (shrink != null) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalFill)) __obj.updateDynamic("verticalFill")(verticalFill.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.officeUiFabricReact.stackItemTypesMod.IStackItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.stackItemTypesMod.IStackItemProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react/lib/components/Stack/StackItem/StackItem", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

