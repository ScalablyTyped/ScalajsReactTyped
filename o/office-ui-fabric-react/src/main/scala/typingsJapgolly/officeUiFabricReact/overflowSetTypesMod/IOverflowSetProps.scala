package typingsJapgolly.officeUiFabricReact.overflowSetTypesMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.officeUiFabricReact.focusZoneTypesMod.IFocusZoneProps
import typingsJapgolly.officeUiFabricReact.overflowSetBaseMod.OverflowSetBase
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOverflowSetProps extends ClassAttributes[OverflowSetBase] {
  /**
    * Class name
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IOverflowSet]] = js.undefined
  /**
    * If true do not contain the OverflowSet inside of a FocusZone,
    * otherwise the OverflowSet will contain a FocusZone.
    * If this is set to true focusZoneProps will be ignored.
    * Use one or the other.
    * @deprecated In 8.0 the OverflowSet will no longer be wrapped in a FocusZone
    */
  var doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom properties for OverflowSet's FocusZone.
    * If doNotContainWithinFocusZone is set to true focusZoneProps will be ignored.
    * Use one or the other.
    * @deprecated In 8.0 the OverflowSet will no longer be wrapped in a FocusZone
    */
  var focusZoneProps: js.UndefOr[IFocusZoneProps] = js.undefined
  /**
    * Function that will take in an IOverflowSetItemProps and return the subMenu for that item.
    * If not provided, will use 'item.subMenuProps.items' by default.
    * This is only used if your overflow set has keytips.
    */
  var itemSubMenuProvider: js.UndefOr[js.Function1[/* item */ IOverflowSetItemProps, js.UndefOr[js.Array[_]]]] = js.undefined
  /**
    * An array of items to be rendered by your onRenderItem function in the primary content area
    */
  var items: js.UndefOr[js.Array[IOverflowSetItemProps]] = js.undefined
  /**
    * Optional full keytip sequence for the overflow button, if it will have a keytip.
    */
  var keytipSequences: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Rendering method for overflow button and contextual menu. The argument to the function is
    * the overflowItems passed in as props to this function.
    */
  var onRenderOverflowButton: IRenderFunction[js.Array[_]]
  /**
    * An array of items to be passed to overflow contextual menu
    */
  var overflowItems: js.UndefOr[js.Array[IOverflowSetItemProps]] = js.undefined
  /**
    * The role for the OverflowSet.
    * @defaultvalue 'group'
    */
  var role: js.UndefOr[String] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IOverflowSetProps, IOverflowSetStyles]] = js.undefined
  /**
    * Change item layout direction to vertical/stacked.
    * If role is set to `menubar`, `vertical={true}` will also add proper `aria-orientation`.
    * @defaultvalue false
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
  /**
    * Method to call when trying to render an item.
    */
  def onRenderItem(item: IOverflowSetItemProps): js.Any
}

object IOverflowSetProps {
  @scala.inline
  def apply(
    onRenderItem: IOverflowSetItemProps => CallbackTo[js.Any],
    onRenderOverflowButton: (/* props */ js.UndefOr[js.Array[js.Any]], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[js.Array[js.Any]], Element | Null]]) => CallbackTo[Element | Null],
    className: String = null,
    componentRef: IRefObject[IOverflowSet] = null,
    doNotContainWithinFocusZone: js.UndefOr[Boolean] = js.undefined,
    focusZoneProps: IFocusZoneProps = null,
    itemSubMenuProvider: /* item */ IOverflowSetItemProps => CallbackTo[js.UndefOr[js.Array[js.Any]]] = null,
    items: js.Array[IOverflowSetItemProps] = null,
    key: Key = null,
    keytipSequences: js.Array[String] = null,
    overflowItems: js.Array[IOverflowSetItemProps] = null,
    ref: LegacyRef[OverflowSetBase] = null,
    role: String = null,
    styles: IStyleFunctionOrObject[IOverflowSetProps, IOverflowSetStyles] = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): IOverflowSetProps = {
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
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keytipSequences != null) __obj.updateDynamic("keytipSequences")(keytipSequences.asInstanceOf[js.Any])
    if (overflowItems != null) __obj.updateDynamic("overflowItems")(overflowItems.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverflowSetProps]
  }
}

