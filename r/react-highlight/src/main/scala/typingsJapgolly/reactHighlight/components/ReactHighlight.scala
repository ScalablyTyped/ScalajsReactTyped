package typingsJapgolly.reactHighlight.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactHighlight.mod.HighlightProps
import typingsJapgolly.reactHighlight.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactHighlight {
  def apply(
    className: String = null,
    innerHTML: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[HighlightProps, default, Unit, HighlightProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(innerHTML)) __obj.updateDynamic("innerHTML")(innerHTML.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactHighlight.mod.HighlightProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactHighlight.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactHighlight.mod.HighlightProps])(children: _*)
  }
  @JSImport("react-highlight", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

