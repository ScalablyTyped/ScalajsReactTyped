package typingsJapgolly.fluentReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fluentReact.mod.LocalizedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Localized {
  def apply(
    id: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    attrs: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LocalizedProps, typingsJapgolly.fluentReact.mod.Localized, Unit, LocalizedProps] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.fluentReact.mod.LocalizedProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.fluentReact.mod.Localized](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.fluentReact.mod.LocalizedProps])(children: _*)
  }
  @JSImport("@fluent/react", "Localized")
  @js.native
  object componentImport extends js.Object
  
}

