package typingsJapgolly.bizcharts.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.bizcharts.mod.Guide_
import typingsJapgolly.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Guide {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props[js.Any], Guide_, Unit, Props[js.Any]] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.react.mod.Props[js.Any], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.bizcharts.mod.Guide_](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.Props[js.Any]])(children: _*)
  }
  @JSImport("bizcharts", "Guide")
  @js.native
  object componentImport extends js.Object
  
}

