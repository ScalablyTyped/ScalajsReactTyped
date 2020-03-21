package typingsJapgolly.radium.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.radium.mod.Radium.RadiumConfig
import typingsJapgolly.radium.mod.Radium.StyleRoot
import typingsJapgolly.radium.mod.Radium.StyleRootProps
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadiumStyleRoot {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[StyleRoot] = null,
    ClassAttributes: ClassAttributes[StyleRoot] = null,
    radiumConfig: RadiumConfig = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[StyleRootProps, typingsJapgolly.radium.mod.default.StyleRoot, Unit, StyleRootProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (radiumConfig != null) __obj.updateDynamic("radiumConfig")(radiumConfig.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.radium.mod.Radium.StyleRootProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.radium.mod.default.StyleRoot](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.radium.mod.Radium.StyleRootProps])(children: _*)
  }
  @JSImport("radium", "default.StyleRoot")
  @js.native
  object componentImport extends js.Object
  
}

