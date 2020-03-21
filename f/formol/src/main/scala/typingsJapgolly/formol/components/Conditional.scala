package typingsJapgolly.formol.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.formol.mod.ConditionalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Conditional {
  def apply(
    context: js.Any = null,
    readOnly: (js.Function1[js.Any, Boolean]) | Boolean = null,
    show: (js.Function1[js.Any, Boolean]) | Boolean = null,
    value: js.Any => CallbackTo[js.Any] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ConditionalProps[js.Any], 
    typingsJapgolly.formol.mod.Conditional, 
    Unit, 
    ConditionalProps[js.Any]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(js.Any.fromFunction1((t0: js.Any) => value(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.formol.mod.ConditionalProps[js.Any], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.formol.mod.Conditional](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.formol.mod.ConditionalProps[js.Any]])(children: _*)
  }
  @JSImport("formol", "Conditional")
  @js.native
  object componentImport extends js.Object
  
}

