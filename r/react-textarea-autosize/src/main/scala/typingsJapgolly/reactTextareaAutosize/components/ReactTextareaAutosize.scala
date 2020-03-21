package typingsJapgolly.reactTextareaAutosize.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactTextareaAutosize.mod.TextareaAutosizeProps
import typingsJapgolly.reactTextareaAutosize.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactTextareaAutosize {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLTextAreaElement] = null,
    ClassAttributes: ClassAttributes[HTMLTextAreaElement] = null,
    inputRef: (js.Function1[/* node */ HTMLTextAreaElement, Unit]) | RefHandle[HTMLTextAreaElement] = null,
    maxRows: Int | Double = null,
    minRows: Int | Double = null,
    onChange: /* event */ ReactEventFrom[HTMLTextAreaElement] => Callback = null,
    onHeightChange: /* height */ Double => Callback = null,
    useCacheForDOMMeasurements: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TextareaAutosizeProps, default, Unit, TextareaAutosizeProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (minRows != null) __obj.updateDynamic("minRows")(minRows.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLTextAreaElement]) => onChange(t0).runNow()))
    if (onHeightChange != null) __obj.updateDynamic("onHeightChange")(js.Any.fromFunction1((t0: /* height */ scala.Double) => onHeightChange(t0).runNow()))
    if (!js.isUndefined(useCacheForDOMMeasurements)) __obj.updateDynamic("useCacheForDOMMeasurements")(useCacheForDOMMeasurements.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTextareaAutosize.mod.TextareaAutosizeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactTextareaAutosize.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTextareaAutosize.mod.TextareaAutosizeProps])(children: _*)
  }
  @JSImport("react-textarea-autosize", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

