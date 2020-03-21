package typingsJapgolly.mjmlReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.mjmlReact.mod.MjmlFontProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlFont {
  def apply(
    href: String = null,
    name: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MjmlFontProps, typingsJapgolly.mjmlReact.mod.MjmlFont, Unit, MjmlFontProps] = {
    val __obj = js.Dynamic.literal()
  
      if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.mjmlReact.mod.MjmlFontProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.mjmlReact.mod.MjmlFont](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.mjmlReact.mod.MjmlFontProps])(children: _*)
  }
  @JSImport("mjml-react", "MjmlFont")
  @js.native
  object componentImport extends js.Object
  
}

