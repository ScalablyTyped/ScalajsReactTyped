package typingsJapgolly.reactColor.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactColor.checkboardMod.CheckboardProps
import typingsJapgolly.reactColor.checkboardMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Checkboard {
  def apply(
    grey: String = null,
    size: Int | Double = null,
    white: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CheckboardProps, default, Unit, CheckboardProps] = {
    val __obj = js.Dynamic.literal()
  
      if (grey != null) __obj.updateDynamic("grey")(grey.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (white != null) __obj.updateDynamic("white")(white.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactColor.checkboardMod.CheckboardProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactColor.checkboardMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactColor.checkboardMod.CheckboardProps])(children: _*)
  }
  @JSImport("react-color/lib/components/common/Checkboard", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

