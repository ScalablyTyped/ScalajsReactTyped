package typingsJapgolly.reactNativeFlipCard.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeFlipCard.mod.FaceProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Face {
  def apply(
    chilren: js.Array[Element],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FaceProps, typingsJapgolly.reactNativeFlipCard.mod.Face, Unit, FaceProps] = {
    val __obj = js.Dynamic.literal(chilren = chilren.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeFlipCard.mod.FaceProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeFlipCard.mod.Face](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeFlipCard.mod.FaceProps])(children: _*)
  }
  @JSImport("react-native-flip-card", "Face")
  @js.native
  object componentImport extends js.Object
  
}

