package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.horizontal
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.vertical
import typingsJapgolly.antdMobileRn.stepsIndexNativeMod.StepsNativeProps
import typingsJapgolly.antdMobileRn.stepsStyleIndexNativeMod.IStepsStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Steps {
  def apply(
    current: Int | Double = null,
    direction: vertical | horizontal = null,
    finishIcon: String = null,
    size: String = null,
    styles: IStepsStyle = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[Element]
  ): UnmountedWithRoot[StepsNativeProps, typingsJapgolly.antdMobileRn.mod.Steps, Unit, StepsNativeProps] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
      if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (finishIcon != null) __obj.updateDynamic("finishIcon")(finishIcon.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.stepsIndexNativeMod.StepsNativeProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.antdMobileRn.mod.Steps](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.stepsIndexNativeMod.StepsNativeProps])
  }
  @JSImport("antd-mobile-rn", "Steps")
  @js.native
  object componentImport extends js.Object
  
}

