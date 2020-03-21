package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.PartialIOverflowListProps
import typingsJapgolly.blueprintjsCore.boundaryMod.Boundary
import typingsJapgolly.blueprintjsCore.breadcrumbMod.IBreadcrumbProps
import typingsJapgolly.blueprintjsCore.breadcrumbsMod.IBreadcrumbsProps
import typingsJapgolly.blueprintjsCore.popoverMod.IPopoverProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Breadcrumbs {
  def apply(
    items: js.Array[IBreadcrumbProps],
    breadcrumbRenderer: /* props */ IBreadcrumbProps => CallbackTo[Element] = null,
    className: String = null,
    collapseFrom: Boundary = null,
    currentBreadcrumbRenderer: /* props */ IBreadcrumbProps => CallbackTo[Element] = null,
    minVisibleItems: Int | Double = null,
    overflowListProps: PartialIOverflowListProps = null,
    popoverProps: IPopoverProps = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IBreadcrumbsProps, 
    typingsJapgolly.blueprintjsCore.mod.Breadcrumbs, 
    Unit, 
    IBreadcrumbsProps
  ] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
  
      if (breadcrumbRenderer != null) __obj.updateDynamic("breadcrumbRenderer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.blueprintjsCore.breadcrumbMod.IBreadcrumbProps) => breadcrumbRenderer(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (collapseFrom != null) __obj.updateDynamic("collapseFrom")(collapseFrom.asInstanceOf[js.Any])
    if (currentBreadcrumbRenderer != null) __obj.updateDynamic("currentBreadcrumbRenderer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.blueprintjsCore.breadcrumbMod.IBreadcrumbProps) => currentBreadcrumbRenderer(t0).runNow()))
    if (minVisibleItems != null) __obj.updateDynamic("minVisibleItems")(minVisibleItems.asInstanceOf[js.Any])
    if (overflowListProps != null) __obj.updateDynamic("overflowListProps")(overflowListProps.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.breadcrumbsMod.IBreadcrumbsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.mod.Breadcrumbs](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.breadcrumbsMod.IBreadcrumbsProps])(children: _*)
  }
  @JSImport("@blueprintjs/core", "Breadcrumbs")
  @js.native
  object componentImport extends js.Object
  
}

