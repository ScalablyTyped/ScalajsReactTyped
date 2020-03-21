package typingsJapgolly.rcSelect.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcSelect.mod.RcSelect.OptGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OptGroup {
  def apply(
    label: String | Element = null,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[OptGroupProps, typingsJapgolly.rcSelect.mod.OptGroup, Unit, OptGroupProps] = {
    val __obj = js.Dynamic.literal()
  
      if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rcSelect.mod.RcSelect.OptGroupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rcSelect.mod.OptGroup](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcSelect.mod.RcSelect.OptGroupProps])(children: _*)
  }
  @JSImport("rc-select", "OptGroup")
  @js.native
  object componentImport extends js.Object
  
}

