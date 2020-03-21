package typingsJapgolly.reactDotdotdot.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactDotdotdot.mod.Dotdotdot
import typingsJapgolly.reactDotdotdot.mod.DotdotdotProps
import typingsJapgolly.reactDotdotdot.mod.default
import typingsJapgolly.reactDotdotdot.reactDotdotdotStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDotdotdot {
  def apply(
    clamp: String | Double | auto,
    AllHTMLAttributes: AllHTMLAttributes[Dotdotdot] = null,
    ClassAttributes: ClassAttributes[Dotdotdot] = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    splitOnChars: js.Array[String] = null,
    tagName: String = null,
    truncationChar: String = null,
    truncationHTML: String = null,
    useNativeClamp: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DotdotdotProps, default, Unit, DotdotdotProps] = {
    val __obj = js.Dynamic.literal(clamp = clamp.asInstanceOf[js.Any])
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (splitOnChars != null) __obj.updateDynamic("splitOnChars")(splitOnChars.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (truncationChar != null) __obj.updateDynamic("truncationChar")(truncationChar.asInstanceOf[js.Any])
    if (truncationHTML != null) __obj.updateDynamic("truncationHTML")(truncationHTML.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeClamp)) __obj.updateDynamic("useNativeClamp")(useNativeClamp.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDotdotdot.mod.DotdotdotProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDotdotdot.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDotdotdot.mod.DotdotdotProps])(children: _*)
  }
  @JSImport("react-dotdotdot", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

