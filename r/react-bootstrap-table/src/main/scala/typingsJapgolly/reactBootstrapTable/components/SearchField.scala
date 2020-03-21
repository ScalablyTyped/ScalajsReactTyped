package typingsJapgolly.reactBootstrapTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactBootstrapTable.mod.SearchFieldProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchField {
  def apply(
    className: String = null,
    defaultValue: String = null,
    onKeyUp: /* e */ ReactKeyboardEventFrom[Element] => Callback = null,
    placeholder: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SearchFieldProps, 
    typingsJapgolly.reactBootstrapTable.mod.SearchField, 
    Unit, 
    SearchFieldProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.Element]) => onKeyUp(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrapTable.mod.SearchFieldProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrapTable.mod.SearchField](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrapTable.mod.SearchFieldProps])(children: _*)
  }
  @JSImport("react-bootstrap-table", "SearchField")
  @js.native
  object componentImport extends js.Object
  
}

