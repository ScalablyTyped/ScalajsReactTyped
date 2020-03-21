package typingsJapgolly.reactBreadcrumbsDynamic.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactBreadcrumbsDynamic.mod.BreadcrumbsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Breadcrumbs {
  def apply(
    container: String | Element | js.Object = null,
    containerProps: js.Object = null,
    duplicateProps: js.Object = null,
    finalItem: String | Element | js.Object = null,
    finalProps: js.Object = null,
    item: String | Element | js.Object = null,
    renameProps: js.Object = null,
    separator: String | Element | js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    BreadcrumbsProps, 
    typingsJapgolly.reactBreadcrumbsDynamic.mod.Breadcrumbs, 
    Unit, 
    BreadcrumbsProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerProps != null) __obj.updateDynamic("containerProps")(containerProps.asInstanceOf[js.Any])
    if (duplicateProps != null) __obj.updateDynamic("duplicateProps")(duplicateProps.asInstanceOf[js.Any])
    if (finalItem != null) __obj.updateDynamic("finalItem")(finalItem.asInstanceOf[js.Any])
    if (finalProps != null) __obj.updateDynamic("finalProps")(finalProps.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (renameProps != null) __obj.updateDynamic("renameProps")(renameProps.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBreadcrumbsDynamic.mod.BreadcrumbsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBreadcrumbsDynamic.mod.Breadcrumbs](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBreadcrumbsDynamic.mod.BreadcrumbsProps])(children: _*)
  }
  @JSImport("react-breadcrumbs-dynamic", "Breadcrumbs")
  @js.native
  object componentImport extends js.Object
  
}

