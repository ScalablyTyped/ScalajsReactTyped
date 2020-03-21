package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gestalt.AnonActiveIndex
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.mod.SegmentedControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SegmentedControl {
  def apply(
    items: js.Array[Node],
    selectedItemIndex: Double,
    onChange: AnonActiveIndex => Callback,
    size: md | lg = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SegmentedControlProps, 
    typingsJapgolly.gestalt.mod.SegmentedControl, 
    Unit, 
    SegmentedControlProps
  ] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], selectedItemIndex = selectedItemIndex.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.gestalt.AnonActiveIndex) => onChange(t0).runNow()))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gestalt.mod.SegmentedControlProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gestalt.mod.SegmentedControl](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gestalt.mod.SegmentedControlProps])(children: _*)
  }
  @JSImport("gestalt", "SegmentedControl")
  @js.native
  object componentImport extends js.Object
  
}

