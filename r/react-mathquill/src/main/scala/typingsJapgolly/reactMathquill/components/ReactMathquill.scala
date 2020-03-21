package typingsJapgolly.reactMathquill.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.edtrIoMathquill.mod.Config
import typingsJapgolly.edtrIoMathquill.mod.MQ
import typingsJapgolly.reactMathquill.mod.Props
import typingsJapgolly.reactMathquill.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMathquill {
  def apply(
    config: Config = null,
    latex: String = null,
    mathquillDidMount: /* mathField */ MQ => Callback = null,
    onChange: /* mathField */ MQ => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (latex != null) __obj.updateDynamic("latex")(latex.asInstanceOf[js.Any])
    if (mathquillDidMount != null) __obj.updateDynamic("mathquillDidMount")(js.Any.fromFunction1((t0: /* mathField */ typingsJapgolly.edtrIoMathquill.mod.MQ) => mathquillDidMount(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* mathField */ typingsJapgolly.edtrIoMathquill.mod.MQ) => onChange(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMathquill.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMathquill.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMathquill.mod.Props])(children: _*)
  }
  @JSImport("react-mathquill", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

