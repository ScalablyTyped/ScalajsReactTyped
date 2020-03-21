package typingsJapgolly.spectacle.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.spectacle.mod.CSSProperties
import typingsJapgolly.spectacle.mod.CodePaneProps
import typingsJapgolly.spectacle.mod.themeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CodePane {
  def apply(
    className: String = null,
    contentEditable: js.UndefOr[Boolean] = js.undefined,
    lang: String = null,
    source: String = null,
    style: CSSProperties = null,
    theme: themeType = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CodePaneProps, typingsJapgolly.spectacle.mod.CodePane, Unit, CodePaneProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(contentEditable)) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.spectacle.mod.CodePaneProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.spectacle.mod.CodePane](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.spectacle.mod.CodePaneProps])(children: _*)
  }
  @JSImport("spectacle", "CodePane")
  @js.native
  object componentImport extends js.Object
  
}

