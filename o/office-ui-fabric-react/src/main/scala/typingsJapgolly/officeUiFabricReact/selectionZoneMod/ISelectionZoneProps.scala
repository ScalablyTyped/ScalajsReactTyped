package typingsJapgolly.officeUiFabricReact.selectionZoneMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.std.Event_
import typingsJapgolly.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsJapgolly.uifabricUtilities.selectionTypesMod.ISelection
import typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectionZoneProps extends ClassAttributes[SelectionZone] {
  /**
    * Reference to the component interface.
    */
  var componentRef: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * If true, disables automatic selection on input elements.
    */
  var disableAutoSelectOnInputElements: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, modal selection is enabled on touch event.
    */
  var enterModalOnTouch: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines if an item is selected on focus.
    *
    * @defaultvalue true
    */
  var isSelectedOnFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated No longer in use, focus is now managed by {@link FocusZone}.
    */
  var layout: js.UndefOr[js.Object] = js.undefined
  /**
    * Optional callback for when an
    * item's contextual menu action occurs.
    */
  var onItemContextMenu: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* ev */ js.UndefOr[Event_], 
      Unit | Boolean
    ]
  ] = js.undefined
  /**
    * Optional callback for when an item is
    * invoked via ENTER or double-click.
    */
  var onItemInvoked: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[IObjectWithKey], 
      /* index */ js.UndefOr[Double], 
      /* ev */ js.UndefOr[Event_], 
      Unit
    ]
  ] = js.undefined
  /**
    * Required {@link ISelection} instance bound to the {@link SelectionZone}.
    */
  var selection: ISelection[IObjectWithKey]
  /**
    * The mode of Selection, where the value is one of
    * 'none', 'single', or 'multiple'.
    *
    * @defaultvalue {@link SelectionMode.multiple}
    */
  var selectionMode: js.UndefOr[SelectionMode] = js.undefined
  /**
    * If true, selection is preserved on outer click.
    */
  var selectionPreservedOnEmptyClick: js.UndefOr[Boolean] = js.undefined
}

object ISelectionZoneProps {
  @scala.inline
  def apply(
    selection: ISelection[IObjectWithKey],
    componentRef: js.UndefOr[Callback] = js.undefined,
    disableAutoSelectOnInputElements: js.UndefOr[Boolean] = js.undefined,
    enterModalOnTouch: js.UndefOr[Boolean] = js.undefined,
    isSelectedOnFocus: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    layout: js.Object = null,
    onItemContextMenu: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event_]) => CallbackTo[Unit | Boolean] = null,
    onItemInvoked: (/* item */ js.UndefOr[IObjectWithKey], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event_]) => Callback = null,
    ref: LegacyRef[SelectionZone] = null,
    selectionMode: SelectionMode = null,
    selectionPreservedOnEmptyClick: js.UndefOr[Boolean] = js.undefined
  ): ISelectionZoneProps = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    componentRef.foreach(p => __obj.updateDynamic("componentRef")(p.toJsFn))
    if (!js.isUndefined(disableAutoSelectOnInputElements)) __obj.updateDynamic("disableAutoSelectOnInputElements")(disableAutoSelectOnInputElements.asInstanceOf[js.Any])
    if (!js.isUndefined(enterModalOnTouch)) __obj.updateDynamic("enterModalOnTouch")(enterModalOnTouch.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelectedOnFocus)) __obj.updateDynamic("isSelectedOnFocus")(isSelectedOnFocus.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (onItemContextMenu != null) __obj.updateDynamic("onItemContextMenu")(js.Any.fromFunction3((t0: /* item */ js.UndefOr[js.Any], t1: /* index */ js.UndefOr[scala.Double], t2: /* ev */ js.UndefOr[typingsJapgolly.std.Event_]) => onItemContextMenu(t0, t1, t2).runNow()))
    if (onItemInvoked != null) __obj.updateDynamic("onItemInvoked")(js.Any.fromFunction3((t0: /* item */ js.UndefOr[typingsJapgolly.uifabricUtilities.selectionTypesMod.IObjectWithKey], t1: /* index */ js.UndefOr[scala.Double], t2: /* ev */ js.UndefOr[typingsJapgolly.std.Event_]) => onItemInvoked(t0, t1, t2).runNow()))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionPreservedOnEmptyClick)) __obj.updateDynamic("selectionPreservedOnEmptyClick")(selectionPreservedOnEmptyClick.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectionZoneProps]
  }
}

