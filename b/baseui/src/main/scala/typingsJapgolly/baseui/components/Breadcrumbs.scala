package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.breadcrumbsMod.BreadcrumbsOverrides
import typingsJapgolly.baseui.breadcrumbsMod.BreadcrumbsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Breadcrumbs {
  def apply(
    ariaLabel: String = null,
    overrides: BreadcrumbsOverrides = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    BreadcrumbsProps, 
    MountedWithRawType[BreadcrumbsProps, js.Object, RawMounted[BreadcrumbsProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.breadcrumbsMod.BreadcrumbsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.breadcrumbsMod.BreadcrumbsProps])(children: _*)
  }
  @JSImport("baseui/breadcrumbs", "Breadcrumbs")
  @js.native
  object componentImport extends js.Object
  
}

