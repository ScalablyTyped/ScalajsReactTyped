package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.libAutoDashCompleteInputElementMod.InputElementProps
import typingsJapgolly.antd.libAutoDashCompleteInputElementMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InputElement {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[InputElementProps, default, Unit, InputElementProps] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libAutoDashCompleteInputElementMod.InputElementProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libAutoDashCompleteInputElementMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libAutoDashCompleteInputElementMod.InputElementProps])(children: _*)
  }
  @JSImport("antd/lib/auto-complete/InputElement", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

