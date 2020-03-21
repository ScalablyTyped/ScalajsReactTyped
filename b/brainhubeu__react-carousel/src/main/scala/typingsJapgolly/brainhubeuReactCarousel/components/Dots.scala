package typingsJapgolly.brainhubeuReactCarousel.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.brainhubeuReactCarousel.mod.DotsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dots {
  def apply(
    number: Int | Double = null,
    onChange: /* value */ Double => Callback = null,
    thumbnails: js.Array[Element] = null,
    value: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DotsProps, typingsJapgolly.brainhubeuReactCarousel.mod.Dots, Unit, DotsProps] = {
    val __obj = js.Dynamic.literal()
  
      if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ scala.Double) => onChange(t0).runNow()))
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.brainhubeuReactCarousel.mod.DotsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.brainhubeuReactCarousel.mod.Dots](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.brainhubeuReactCarousel.mod.DotsProps])(children: _*)
  }
  @JSImport("@brainhubeu/react-carousel", "Dots")
  @js.native
  object componentImport extends js.Object
  
}

