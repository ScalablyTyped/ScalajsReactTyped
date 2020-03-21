package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsJapgolly.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsJapgolly.officeUiFabricReact.keytipTypesMod.IKeytipStyleProps
import typingsJapgolly.officeUiFabricReact.keytipTypesMod.IKeytipStyles
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.ipointMod.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IKeytipProps690989460[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    content: String,
    keySequences: js.Array[String],
    calloutProps: ICalloutProps = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hasDynamicChildren: js.UndefOr[Boolean] = js.undefined,
    hasMenu: js.UndefOr[Boolean] = js.undefined,
    offset: IPoint = null,
    onExecute: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Callback = null,
    onReturn: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Callback = null,
    overflowSetSequence: js.Array[String] = null,
    styles: IStyleFunctionOrObject[IKeytipStyleProps, IKeytipStyles] = null,
    theme: ITheme = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IKeytipProps, ComponentRef, Unit, IKeytipProps] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], keySequences = keySequences.asInstanceOf[js.Any])
  
      if (calloutProps != null) __obj.updateDynamic("calloutProps")(calloutProps.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDynamicChildren)) __obj.updateDynamic("hasDynamicChildren")(hasDynamicChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(hasMenu)) __obj.updateDynamic("hasMenu")(hasMenu.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onExecute != null) __obj.updateDynamic("onExecute")(js.Any.fromFunction2((t0: /* executeTarget */ org.scalajs.dom.raw.HTMLElement | scala.Null, t1: /* target */ org.scalajs.dom.raw.HTMLElement | scala.Null) => onExecute(t0, t1).runNow()))
    if (onReturn != null) __obj.updateDynamic("onReturn")(js.Any.fromFunction2((t0: /* executeTarget */ org.scalajs.dom.raw.HTMLElement | scala.Null, t1: /* target */ org.scalajs.dom.raw.HTMLElement | scala.Null) => onReturn(t0, t1).runNow()))
    if (overflowSetSequence != null) __obj.updateDynamic("overflowSetSequence")(overflowSetSequence.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.keytipTypesMod.IKeytipProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.keytipTypesMod.IKeytipProps])(children: _*)
  }
}

