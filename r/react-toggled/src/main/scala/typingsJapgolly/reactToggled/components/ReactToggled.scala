package typingsJapgolly.reactToggled.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactToggled.mod.ReactToggledProps
import typingsJapgolly.reactToggled.mod.TogglerStateAndHelpers
import typingsJapgolly.reactToggled.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactToggled {
  def apply(
    defaultOn: js.UndefOr[Boolean] = js.undefined,
    on: js.UndefOr[Boolean] = js.undefined,
    onToggle: (/* on */ Boolean, /* object */ TogglerStateAndHelpers) => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* options */ TogglerStateAndHelpers => CallbackTo[Node]
  ): UnmountedWithRoot[ReactToggledProps, default, Unit, ReactToggledProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.reactToggled.mod.TogglerStateAndHelpers) => children(t0).runNow()))
    if (!js.isUndefined(defaultOn)) __obj.updateDynamic("defaultOn")(defaultOn.asInstanceOf[js.Any])
    if (!js.isUndefined(on)) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction2((t0: /* on */ scala.Boolean, t1: /* object */ typingsJapgolly.reactToggled.mod.TogglerStateAndHelpers) => onToggle(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactToggled.mod.ReactToggledProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactToggled.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactToggled.mod.ReactToggledProps])
  }
  @JSImport("react-toggled", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

