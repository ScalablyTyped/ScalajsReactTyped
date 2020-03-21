package typingsJapgolly.protonNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protonNative.mod.GridProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Grid {
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    padded: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GridProps, typingsJapgolly.protonNative.mod.Grid, Unit, GridProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(padded)) __obj.updateDynamic("padded")(padded.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.protonNative.mod.GridProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.protonNative.mod.Grid](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.protonNative.mod.GridProps])(children: _*)
  }
  @JSImport("proton-native", "Grid")
  @js.native
  object componentImport extends js.Object
  
}

