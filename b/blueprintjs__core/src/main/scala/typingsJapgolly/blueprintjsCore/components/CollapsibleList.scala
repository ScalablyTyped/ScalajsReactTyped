package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.boundaryMod.Boundary
import typingsJapgolly.blueprintjsCore.collapsibleListMod.ICollapsibleListProps
import typingsJapgolly.blueprintjsCore.menuItemMod.IMenuItemProps
import typingsJapgolly.blueprintjsCore.popoverMod.IPopoverProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CollapsibleList {
  def apply(
    dropdownTarget: VdomElement,
    visibleItemRenderer: (IMenuItemProps, Double) => CallbackTo[Element],
    className: String = null,
    collapseFrom: Boundary = null,
    dropdownProps: IPopoverProps = null,
    visibleItemClassName: String = null,
    visibleItemCount: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ICollapsibleListProps, 
    typingsJapgolly.blueprintjsCore.mod.CollapsibleList, 
    Unit, 
    ICollapsibleListProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (dropdownTarget != null) __obj.updateDynamic("dropdownTarget")(dropdownTarget.rawElement.asInstanceOf[js.Any])
    __obj.updateDynamic("visibleItemRenderer")(js.Any.fromFunction2((t0: typingsJapgolly.blueprintjsCore.menuItemMod.IMenuItemProps, t1: scala.Double) => visibleItemRenderer(t0, t1).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (collapseFrom != null) __obj.updateDynamic("collapseFrom")(collapseFrom.asInstanceOf[js.Any])
    if (dropdownProps != null) __obj.updateDynamic("dropdownProps")(dropdownProps.asInstanceOf[js.Any])
    if (visibleItemClassName != null) __obj.updateDynamic("visibleItemClassName")(visibleItemClassName.asInstanceOf[js.Any])
    if (visibleItemCount != null) __obj.updateDynamic("visibleItemCount")(visibleItemCount.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.collapsibleListMod.ICollapsibleListProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.mod.CollapsibleList](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.collapsibleListMod.ICollapsibleListProps])(children: _*)
  }
  @JSImport("@blueprintjs/core", "CollapsibleList")
  @js.native
  object componentImport extends js.Object
  
}

