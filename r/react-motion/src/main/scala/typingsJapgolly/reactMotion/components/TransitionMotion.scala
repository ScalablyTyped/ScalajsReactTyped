package typingsJapgolly.reactMotion.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactMotion.mod.InterpolateFunction
import typingsJapgolly.reactMotion.mod.PlainStyle
import typingsJapgolly.reactMotion.mod.Style
import typingsJapgolly.reactMotion.mod.TransitionPlainStyle
import typingsJapgolly.reactMotion.mod.TransitionProps
import typingsJapgolly.reactMotion.mod.TransitionStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TransitionMotion {
  def apply(
    styles: js.Array[TransitionStyle] | InterpolateFunction,
    defaultStyles: js.Array[TransitionPlainStyle] = null,
    didLeave: /* styleThatLeft */ TransitionStyle => Callback = null,
    willEnter: /* styleThatEntered */ TransitionStyle => CallbackTo[PlainStyle] = null,
    willLeave: /* styleThatLeft */ TransitionStyle => CallbackTo[Style | Unit] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* interpolatedStyles */ js.Array[TransitionPlainStyle] => CallbackTo[Element] = null
  ): UnmountedWithRoot[
    TransitionProps, 
    typingsJapgolly.reactMotion.mod.TransitionMotion, 
    Unit, 
    TransitionProps
  ] = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* interpolatedStyles */ js.Array[typingsJapgolly.reactMotion.mod.TransitionPlainStyle]) => children(t0).runNow()))
    if (defaultStyles != null) __obj.updateDynamic("defaultStyles")(defaultStyles.asInstanceOf[js.Any])
    if (didLeave != null) __obj.updateDynamic("didLeave")(js.Any.fromFunction1((t0: /* styleThatLeft */ typingsJapgolly.reactMotion.mod.TransitionStyle) => didLeave(t0).runNow()))
    if (willEnter != null) __obj.updateDynamic("willEnter")(js.Any.fromFunction1((t0: /* styleThatEntered */ typingsJapgolly.reactMotion.mod.TransitionStyle) => willEnter(t0).runNow()))
    if (willLeave != null) __obj.updateDynamic("willLeave")(js.Any.fromFunction1((t0: /* styleThatLeft */ typingsJapgolly.reactMotion.mod.TransitionStyle) => willLeave(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMotion.mod.TransitionProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactMotion.mod.TransitionMotion](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMotion.mod.TransitionProps])
  }
  @JSImport("react-motion", "TransitionMotion")
  @js.native
  object componentImport extends js.Object
  
}

