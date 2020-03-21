package typingsJapgolly.reactCopyToClipboard.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactCopyToClipboard.mod.Options
import typingsJapgolly.reactCopyToClipboard.mod.Props
import typingsJapgolly.reactCopyToClipboard.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCopyToClipboard {
  def apply(
    text: String,
    onCopy: (/* text */ String, /* result */ Boolean) => Callback = null,
    options: Options = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, ^, Unit, Props] = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
  
      if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction2((t0: /* text */ java.lang.String, t1: /* result */ scala.Boolean) => onCopy(t0, t1).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCopyToClipboard.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactCopyToClipboard.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCopyToClipboard.mod.Props])(children: _*)
  }
  @JSImport("react-copy-to-clipboard", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

