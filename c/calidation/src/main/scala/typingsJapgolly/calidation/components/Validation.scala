package typingsJapgolly.calidation.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.calidation.mod.Dictionary
import typingsJapgolly.calidation.mod.FieldsConfig
import typingsJapgolly.calidation.mod.Transforms
import typingsJapgolly.calidation.mod.ValidationContext
import typingsJapgolly.calidation.mod.ValidationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Validation {
  def apply(
    config: FieldsConfig,
    initialValues: Dictionary[_] = null,
    transforms: Transforms = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ValidationContext => CallbackTo[Node]
  ): UnmountedWithRoot[ValidationProps, typingsJapgolly.calidation.mod.Validation, Unit, ValidationProps] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.calidation.mod.ValidationContext) => children(t0).runNow()))
    if (initialValues != null) __obj.updateDynamic("initialValues")(initialValues.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.calidation.mod.ValidationProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.calidation.mod.Validation](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.calidation.mod.ValidationProps])
  }
  @JSImport("calidation", "Validation")
  @js.native
  object componentImport extends js.Object
  
}

