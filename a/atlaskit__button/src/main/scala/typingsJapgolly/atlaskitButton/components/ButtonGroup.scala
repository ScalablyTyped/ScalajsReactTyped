package typingsJapgolly.atlaskitButton.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atlaskitButton.mod.ButtonAppearances
import typingsJapgolly.atlaskitButton.mod.ButtonGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ButtonGroup {
  def apply(
    appearance: ButtonAppearances = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ButtonGroupProps, 
    typingsJapgolly.atlaskitButton.mod.ButtonGroup, 
    Unit, 
    ButtonGroupProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atlaskitButton.mod.ButtonGroupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atlaskitButton.mod.ButtonGroup](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atlaskitButton.mod.ButtonGroupProps])(children: _*)
  }
  @JSImport("@atlaskit/button", "ButtonGroup")
  @js.native
  object componentImport extends js.Object
  
}

