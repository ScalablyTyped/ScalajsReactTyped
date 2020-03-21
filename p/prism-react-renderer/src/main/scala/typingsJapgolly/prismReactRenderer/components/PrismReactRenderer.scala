package typingsJapgolly.prismReactRenderer.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.prismReactRenderer.mod.HighlightProps
import typingsJapgolly.prismReactRenderer.mod.Language
import typingsJapgolly.prismReactRenderer.mod.PrismLib
import typingsJapgolly.prismReactRenderer.mod.PrismTheme
import typingsJapgolly.prismReactRenderer.mod.RenderProps
import typingsJapgolly.prismReactRenderer.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PrismReactRenderer {
  def apply(
    Prism: PrismLib,
    code: String,
    language: Language,
    theme: PrismTheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: RenderProps => CallbackTo[Node]
  ): UnmountedWithRoot[HighlightProps, default, Unit, HighlightProps] = {
    val __obj = js.Dynamic.literal(Prism = Prism.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.prismReactRenderer.mod.RenderProps) => children(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.prismReactRenderer.mod.HighlightProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.prismReactRenderer.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.prismReactRenderer.mod.HighlightProps])
  }
  @JSImport("prism-react-renderer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

