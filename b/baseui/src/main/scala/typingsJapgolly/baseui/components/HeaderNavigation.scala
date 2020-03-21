package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.headerNavigationMod.HeaderNavigationOverrides
import typingsJapgolly.baseui.headerNavigationMod.HeaderNavigationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HeaderNavigation {
  def apply(
    overrides: HeaderNavigationOverrides = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HeaderNavigationProps, 
    typingsJapgolly.baseui.headerNavigationMod.HeaderNavigation, 
    Unit, 
    HeaderNavigationProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.headerNavigationMod.HeaderNavigationProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.headerNavigationMod.HeaderNavigation](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.headerNavigationMod.HeaderNavigationProps])(children: _*)
  }
  @JSImport("baseui/header-navigation", "HeaderNavigation")
  @js.native
  object componentImport extends js.Object
  
}

