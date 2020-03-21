package typingsJapgolly.reactNativeFlipCard.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeFlipCard.mod.BackProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Back {
  def apply(
    chilren: js.Array[Element],
    flipHorizontal: Boolean,
    flipVertical: Boolean,
    perspective: Double,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[BackProps, typingsJapgolly.reactNativeFlipCard.mod.Back, Unit, BackProps] = {
    val __obj = js.Dynamic.literal(chilren = chilren.asInstanceOf[js.Any], flipHorizontal = flipHorizontal.asInstanceOf[js.Any], flipVertical = flipVertical.asInstanceOf[js.Any], perspective = perspective.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeFlipCard.mod.BackProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeFlipCard.mod.Back](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeFlipCard.mod.BackProps])(children: _*)
  }
  @JSImport("react-native-flip-card", "Back")
  @js.native
  object componentImport extends js.Object
  
}

