package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.horizontal
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.vertical
import typingsJapgolly.antDesignReactNative.stepsMod.StepsProps
import typingsJapgolly.antDesignReactNative.stepsMod.default
import typingsJapgolly.antDesignReactNative.stepsStyleMod.StepsStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Steps {
  def apply(
    current: Int | Double = null,
    direction: vertical | horizontal = null,
    finishIcon: String = null,
    size: String = null,
    styles: Partial[StepsStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[Element]
  ): UnmountedWithRoot[StepsProps, default, Unit, StepsProps] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
      if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (finishIcon != null) __obj.updateDynamic("finishIcon")(finishIcon.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.stepsMod.StepsProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.antDesignReactNative.stepsMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.stepsMod.StepsProps])
  }
  @JSImport("@ant-design/react-native/lib/steps", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

