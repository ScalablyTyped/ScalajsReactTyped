package typingsJapgolly.spectacle.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.spectacle.mod.MarkdownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Markdown {
  def apply(
    mdastConfig: StringDictionary[Double | String] = null,
    source: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MarkdownProps, typingsJapgolly.spectacle.mod.Markdown, Unit, MarkdownProps] = {
    val __obj = js.Dynamic.literal()
  
      if (mdastConfig != null) __obj.updateDynamic("mdastConfig")(mdastConfig.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.spectacle.mod.MarkdownProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.spectacle.mod.Markdown](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.spectacle.mod.MarkdownProps])(children: _*)
  }
  @JSImport("spectacle", "Markdown")
  @js.native
  object componentImport extends js.Object
  
}

