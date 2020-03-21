package typingsJapgolly.rrc.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.history.mod.Location
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.rrc.mod.OnUpdateProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OnUpdate {
  def apply(
    call: /* location */ Location[LocationState] => Callback,
    immediate: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[OnUpdateProps, typingsJapgolly.rrc.mod.OnUpdate, Unit, OnUpdateProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("call")(js.Any.fromFunction1((t0: /* location */ typingsJapgolly.history.mod.Location[typingsJapgolly.history.mod.LocationState]) => call(t0).runNow()))
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rrc.mod.OnUpdateProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rrc.mod.OnUpdate](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rrc.mod.OnUpdateProps])(children: _*)
  }
  @JSImport("rrc", "OnUpdate")
  @js.native
  object componentImport extends js.Object
  
}

