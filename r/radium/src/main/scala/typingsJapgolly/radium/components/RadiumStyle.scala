package typingsJapgolly.radium.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.radium.mod.Radium.StyleProps
import typingsJapgolly.radium.mod.Radium.StyleRules
import typingsJapgolly.radium.mod.default.Style
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadiumStyle {
  def apply(
    rules: CSSProperties | StyleRules,
    scopeSelector: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[StyleProps, Style, Unit, StyleProps] = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
  
      if (scopeSelector != null) __obj.updateDynamic("scopeSelector")(scopeSelector.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.radium.mod.Radium.StyleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.radium.mod.default.Style](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.radium.mod.Radium.StyleProps])(children: _*)
  }
  @JSImport("radium", "default.Style")
  @js.native
  object componentImport extends js.Object
  
}

