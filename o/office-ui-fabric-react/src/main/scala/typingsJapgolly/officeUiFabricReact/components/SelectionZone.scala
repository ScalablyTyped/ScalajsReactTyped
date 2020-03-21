package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps
import typingsJapgolly.std.Event_
import typingsJapgolly.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsJapgolly.uifabricUtilities.selectionTypesMod.ISelection
import typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SelectionZone {
  def apply(
    selection: ISelection[IObjectWithKey],
    componentRef: js.UndefOr[Callback] = js.undefined,
    disableAutoSelectOnInputElements: js.UndefOr[Boolean] = js.undefined,
    enterModalOnTouch: js.UndefOr[Boolean] = js.undefined,
    isSelectedOnFocus: js.UndefOr[Boolean] = js.undefined,
    layout: js.Object = null,
    onItemContextMenu: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event_]) => CallbackTo[Unit | Boolean] = null,
    onItemInvoked: (/* item */ js.UndefOr[IObjectWithKey], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event_]) => Callback = null,
    selectionMode: SelectionMode = null,
    selectionPreservedOnEmptyClick: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ISelectionZoneProps, 
    typingsJapgolly.officeUiFabricReact.mod.SelectionZone, 
    Unit, 
    ISelectionZoneProps
  ] = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
  
      componentRef.foreach(p => __obj.updateDynamic("componentRef")(p.toJsFn))
    if (!js.isUndefined(disableAutoSelectOnInputElements)) __obj.updateDynamic("disableAutoSelectOnInputElements")(disableAutoSelectOnInputElements.asInstanceOf[js.Any])
    if (!js.isUndefined(enterModalOnTouch)) __obj.updateDynamic("enterModalOnTouch")(enterModalOnTouch.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelectedOnFocus)) __obj.updateDynamic("isSelectedOnFocus")(isSelectedOnFocus.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (onItemContextMenu != null) __obj.updateDynamic("onItemContextMenu")(js.Any.fromFunction3((t0: /* item */ js.UndefOr[js.Any], t1: /* index */ js.UndefOr[scala.Double], t2: /* ev */ js.UndefOr[typingsJapgolly.std.Event_]) => onItemContextMenu(t0, t1, t2).runNow()))
    if (onItemInvoked != null) __obj.updateDynamic("onItemInvoked")(js.Any.fromFunction3((t0: /* item */ js.UndefOr[typingsJapgolly.uifabricUtilities.selectionTypesMod.IObjectWithKey], t1: /* index */ js.UndefOr[scala.Double], t2: /* ev */ js.UndefOr[typingsJapgolly.std.Event_]) => onItemInvoked(t0, t1, t2).runNow()))
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionPreservedOnEmptyClick)) __obj.updateDynamic("selectionPreservedOnEmptyClick")(selectionPreservedOnEmptyClick.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.mod.SelectionZone](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.selectionZoneMod.ISelectionZoneProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "SelectionZone")
  @js.native
  object componentImport extends js.Object
  
}

