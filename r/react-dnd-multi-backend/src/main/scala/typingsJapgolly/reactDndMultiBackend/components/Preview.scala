package typingsJapgolly.reactDndMultiBackend.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactDndMultiBackend.mod.PreviewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Preview {
  def apply(
    generator: (String, js.Any, CSSProperties) => CallbackTo[Element],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PreviewProps, typingsJapgolly.reactDndMultiBackend.mod.Preview, Unit, PreviewProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("generator")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: typingsJapgolly.react.mod.CSSProperties) => generator(t0, t1, t2).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDndMultiBackend.mod.PreviewProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDndMultiBackend.mod.Preview](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDndMultiBackend.mod.PreviewProps])(children: _*)
  }
  @JSImport("react-dnd-multi-backend", "Preview")
  @js.native
  object componentImport extends js.Object
  
}

