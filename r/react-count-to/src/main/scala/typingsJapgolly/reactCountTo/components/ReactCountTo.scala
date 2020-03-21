package typingsJapgolly.reactCountTo.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactCountTo.mod.Props
import typingsJapgolly.reactCountTo.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCountTo {
  def apply(
    speed: Double,
    to: Double,
    className: String = null,
    delay: Int | Double = null,
    digits: Int | Double = null,
    easing: /* progress */ Double => CallbackTo[Double] = null,
    from: Int | Double = null,
    onComplete: js.UndefOr[Callback] = js.undefined,
    tagName: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* value */ Double => CallbackTo[Element] = null
  ): UnmountedWithRoot[Props, ^, Unit, Props] = {
    val __obj = js.Dynamic.literal(speed = speed.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* value */ scala.Double) => children(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (digits != null) __obj.updateDynamic("digits")(digits.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1((t0: /* progress */ scala.Double) => easing(t0).runNow()))
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    onComplete.foreach(p => __obj.updateDynamic("onComplete")(p.toJsFn))
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCountTo.mod.Props, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactCountTo.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCountTo.mod.Props])
  }
  @JSImport("react-count-to", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

