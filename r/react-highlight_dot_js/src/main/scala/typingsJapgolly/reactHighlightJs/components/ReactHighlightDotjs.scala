package typingsJapgolly.reactHighlightJs.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactHighlightJs.mod.HighlightProps
import typingsJapgolly.reactHighlightJs.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactHighlightDotjs {
  def apply(
    language: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[HighlightProps, default, Unit, HighlightProps] = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactHighlightJs.mod.HighlightProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactHighlightJs.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactHighlightJs.mod.HighlightProps])(children: _*)
  }
  @JSImport("react-highlight.js", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

