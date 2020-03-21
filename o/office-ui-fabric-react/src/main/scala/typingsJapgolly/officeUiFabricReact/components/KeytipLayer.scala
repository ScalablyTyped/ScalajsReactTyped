package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.ikeytiptransitionkeyMod.IKeytipTransitionKey
import typingsJapgolly.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayer
import typingsJapgolly.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayerProps
import typingsJapgolly.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayerStyleProps
import typingsJapgolly.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayerStyles
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object KeytipLayer {
  def apply(
    content: String,
    componentRef: IRefObject[IKeytipLayer] = null,
    keytipExitSequences: js.Array[IKeytipTransitionKey] = null,
    keytipReturnSequences: js.Array[IKeytipTransitionKey] = null,
    keytipStartSequences: js.Array[IKeytipTransitionKey] = null,
    onEnterKeytipMode: js.UndefOr[Callback] = js.undefined,
    onExitKeytipMode: /* ev */ js.UndefOr[ReactKeyboardEventFrom[HTMLElement] | ReactMouseEventFrom[HTMLElement]] => Callback = null,
    styles: IStyleFunctionOrObject[IKeytipLayerStyleProps, IKeytipLayerStyles] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IKeytipLayerProps, LegacyRef[IKeytipLayer], Unit, IKeytipLayerProps] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
  
      if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (keytipExitSequences != null) __obj.updateDynamic("keytipExitSequences")(keytipExitSequences.asInstanceOf[js.Any])
    if (keytipReturnSequences != null) __obj.updateDynamic("keytipReturnSequences")(keytipReturnSequences.asInstanceOf[js.Any])
    if (keytipStartSequences != null) __obj.updateDynamic("keytipStartSequences")(keytipStartSequences.asInstanceOf[js.Any])
    onEnterKeytipMode.foreach(p => __obj.updateDynamic("onEnterKeytipMode")(p.toJsFn))
    if (onExitKeytipMode != null) __obj.updateDynamic("onExitKeytipMode")(js.Any.fromFunction1((t0: /* ev */ js.UndefOr[
  japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.HTMLElement] | japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onExitKeytipMode(t0).runNow()))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.react.mod.LegacyRef[typingsJapgolly.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayer]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.keytipLayerTypesMod.IKeytipLayerProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "KeytipLayer")
  @js.native
  object componentImport extends js.Object
  
}

