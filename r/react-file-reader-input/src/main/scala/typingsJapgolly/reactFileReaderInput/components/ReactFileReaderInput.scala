package typingsJapgolly.reactFileReaderInput.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactFileReaderInput.mod.Format
import typingsJapgolly.reactFileReaderInput.mod.Props
import typingsJapgolly.reactFileReaderInput.mod.Result
import typingsJapgolly.reactFileReaderInput.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactFileReaderInput {
  def apply(
    onChange: (ReactEventFrom[Element], js.Array[Result]) => Callback,
    as: Format = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, ^, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element], t1: js.Array[typingsJapgolly.reactFileReaderInput.mod.Result]) => onChange(t0, t1).runNow()))
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactFileReaderInput.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactFileReaderInput.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFileReaderInput.mod.Props])(children: _*)
  }
  @JSImport("react-file-reader-input", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

