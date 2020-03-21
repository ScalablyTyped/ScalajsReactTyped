package typingsJapgolly.calidation.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.calidation.mod.Dictionary
import typingsJapgolly.calidation.mod.SimpleValidatorConfig
import typingsJapgolly.calidation.mod.ValidatorsProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ValidatorsProvider {
  def apply(
    validators: Dictionary[
      js.Function1[/* config */ SimpleValidatorConfig, js.Function1[/* value */ _, String | Null]]
    ],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ValidatorsProviderProps, 
    typingsJapgolly.calidation.mod.ValidatorsProvider, 
    Unit, 
    ValidatorsProviderProps
  ] = {
    val __obj = js.Dynamic.literal(validators = validators.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.calidation.mod.ValidatorsProviderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.calidation.mod.ValidatorsProvider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.calidation.mod.ValidatorsProviderProps])(children: _*)
  }
  @JSImport("calidation", "ValidatorsProvider")
  @js.native
  object componentImport extends js.Object
  
}

