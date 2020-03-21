package typingsJapgolly.rcMentions.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcMentions.dropdownMenuMod.DropdownMenuProps
import typingsJapgolly.rcMentions.dropdownMenuMod.default
import typingsJapgolly.rcMentions.optionMod.OptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DropdownMenu {
  def apply(
    options: js.Array[OptionProps],
    prefixCls: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DropdownMenuProps, default, Unit, DropdownMenuProps] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
  
      if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rcMentions.dropdownMenuMod.DropdownMenuProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rcMentions.dropdownMenuMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcMentions.dropdownMenuMod.DropdownMenuProps])(children: _*)
  }
  @JSImport("rc-mentions/lib/DropdownMenu", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

