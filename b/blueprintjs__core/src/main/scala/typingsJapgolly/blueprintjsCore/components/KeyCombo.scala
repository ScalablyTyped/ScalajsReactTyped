package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.keyComboMod.IKeyComboProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object KeyCombo {
  def apply(
    combo: String,
    className: String = null,
    minimal: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IKeyComboProps, typingsJapgolly.blueprintjsCore.mod.KeyCombo, Unit, IKeyComboProps] = {
    val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(minimal)) __obj.updateDynamic("minimal")(minimal.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.keyComboMod.IKeyComboProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.mod.KeyCombo](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.keyComboMod.IKeyComboProps])(children: _*)
  }
  @JSImport("@blueprintjs/core", "KeyCombo")
  @js.native
  object componentImport extends js.Object
  
}

