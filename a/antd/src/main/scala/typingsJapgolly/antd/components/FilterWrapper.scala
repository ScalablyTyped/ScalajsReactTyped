package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.filterWrapperMod.FilterDropdownMenuWrapperProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FilterWrapper {
  def apply(
    className: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    FilterDropdownMenuWrapperProps, 
    MountedWithRawType[
      FilterDropdownMenuWrapperProps, 
      js.Object, 
      RawMounted[FilterDropdownMenuWrapperProps, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antd.filterWrapperMod.FilterDropdownMenuWrapperProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.filterWrapperMod.FilterDropdownMenuWrapperProps])(children: _*)
  }
  @JSImport("antd/lib/table/hooks/useFilter/FilterWrapper", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

