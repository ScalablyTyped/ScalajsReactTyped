package typingsJapgolly.reactSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSelect.componentsInputMod.InputProps
import typingsJapgolly.reactSelect.typesMod.ClassNamesState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsInput {
  def apply(
    isHidden: Boolean,
    cx: (Null | String, ClassNamesState, String) => CallbackTo[String | Unit],
    getStyles: (String, js.Any) => CallbackTo[js.Object],
    innerRef: Ref => Callback,
    className: String = null,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    InputProps, 
    MountedWithRawType[InputProps, js.Object, RawMounted[InputProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(isHidden = isHidden.asInstanceOf[js.Any])
  
      __obj.updateDynamic("cx")(js.Any.fromFunction3((t0: scala.Null | java.lang.String, t1: typingsJapgolly.reactSelect.typesMod.ClassNamesState, t2: java.lang.String) => cx(t0, t1, t2).runNow()))
    __obj.updateDynamic("getStyles")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => getStyles(t0, t1).runNow()))
    __obj.updateDynamic("innerRef")(js.Any.fromFunction1((t0: japgolly.scalajs.react.raw.React.Ref) => innerRef(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactSelect.componentsInputMod.InputProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSelect.componentsInputMod.InputProps])(children: _*)
  }
  @JSImport("react-select", "components.Input")
  @js.native
  object componentImport extends js.Object
  
}

