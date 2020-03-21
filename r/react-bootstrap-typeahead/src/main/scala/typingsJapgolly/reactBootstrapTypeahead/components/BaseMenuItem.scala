package typingsJapgolly.reactBootstrapTypeahead.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactBootstrapTypeahead.mod.BaseMenuItemProps
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.li
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BaseMenuItem {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[li] = null,
    ClassAttributes: ClassAttributes[li] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    BaseMenuItemProps, 
    typingsJapgolly.reactBootstrapTypeahead.mod.BaseMenuItem, 
    Unit, 
    BaseMenuItemProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrapTypeahead.mod.BaseMenuItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrapTypeahead.mod.BaseMenuItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrapTypeahead.mod.BaseMenuItemProps])(children: _*)
  }
  @JSImport("react-bootstrap-typeahead", "BaseMenuItem")
  @js.native
  object componentImport extends js.Object
  
}

