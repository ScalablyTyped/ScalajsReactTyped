package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.focusZoneTypesMod.IFocusZoneProps
import typingsJapgolly.officeUiFabricReact.overflowSetTypesMod.IOverflowSet
import typingsJapgolly.officeUiFabricReact.overflowSetTypesMod.IOverflowSetItemProps
import typingsJapgolly.officeUiFabricReact.overflowSetTypesMod.IOverflowSetProps
import typingsJapgolly.officeUiFabricReact.overflowSetTypesMod.IOverflowSetStyles
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OverflowSetBase {
  def apply(
    onRenderItem: IOverflowSetItemProps => CallbackTo[js.Any],
    onRenderOverflowButton: (/* props */ js.UndefOr[js.Array[js.Any]], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[js.Array[js.Any]], Element | Null]]) => CallbackTo[Element | Null],
    className: String = null,
    componentRef: IRefObject[IOverflowSet] = null,
    doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.undefined,
    focusZoneProps: IFocusZoneProps = null,
    itemSubMenuProvider: /* item */ IOverflowSetItemProps => CallbackTo[js.UndefOr[js.Array[js.Any]]] = null,
    items: js.Array[IOverflowSetItemProps] = null,
    keytipSequences: js.Array[String] = null,
    overflowItems: js.Array[IOverflowSetItemProps] = null,
    role: String = null,
    styles: IStyleFunctionOrObject[IOverflowSetProps, IOverflowSetStyles] = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IOverflowSetProps, 
    typingsJapgolly.officeUiFabricReact.mod.OverflowSetBase, 
    Unit, 
    IOverflowSetProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onRenderItem")(js.Any.fromFunction1((t0: typingsJapgolly.officeUiFabricReact.overflowSetTypesMod.IOverflowSetItemProps) => onRenderItem(t0).runNow()))
    __obj.updateDynamic("onRenderOverflowButton")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[js.Array[js.Any]], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[js.Array[js.Any]], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderOverflowButton(t0, t1).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotContainWithinFocusZone)) __obj.updateDynamic("doNotContainWithinFocusZone")(doNotContainWithinFocusZone.asInstanceOf[js.Any])
    if (focusZoneProps != null) __obj.updateDynamic("focusZoneProps")(focusZoneProps.asInstanceOf[js.Any])
    if (itemSubMenuProvider != null) __obj.updateDynamic("itemSubMenuProvider")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.officeUiFabricReact.overflowSetTypesMod.IOverflowSetItemProps) => itemSubMenuProvider(t0).runNow()))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (keytipSequences != null) __obj.updateDynamic("keytipSequences")(keytipSequences.asInstanceOf[js.Any])
    if (overflowItems != null) __obj.updateDynamic("overflowItems")(overflowItems.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.overflowSetTypesMod.IOverflowSetProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.mod.OverflowSetBase](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.overflowSetTypesMod.IOverflowSetProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "OverflowSetBase")
  @js.native
  object componentImport extends js.Object
  
}

