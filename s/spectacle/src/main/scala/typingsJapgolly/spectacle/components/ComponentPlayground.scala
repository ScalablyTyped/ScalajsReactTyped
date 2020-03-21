package typingsJapgolly.spectacle.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.spectacle.mod.ComponentPlaygroundProps
import typingsJapgolly.spectacle.mod.themeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentPlayground {
  def apply(
    code: String = null,
    previewBackgroundColor: String = null,
    scope: js.Object = null,
    theme: themeType = null,
    transformCode: /* code */ String => CallbackTo[String] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ComponentPlaygroundProps, 
    typingsJapgolly.spectacle.mod.ComponentPlayground, 
    Unit, 
    ComponentPlaygroundProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (previewBackgroundColor != null) __obj.updateDynamic("previewBackgroundColor")(previewBackgroundColor.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (transformCode != null) __obj.updateDynamic("transformCode")(js.Any.fromFunction1((t0: /* code */ java.lang.String) => transformCode(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.spectacle.mod.ComponentPlaygroundProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.spectacle.mod.ComponentPlayground](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.spectacle.mod.ComponentPlaygroundProps])(children: _*)
  }
  @JSImport("spectacle", "ComponentPlayground")
  @js.native
  object componentImport extends js.Object
  
}

