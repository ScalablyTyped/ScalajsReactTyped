package typingsJapgolly.reactMotion.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transition properties
  */
trait TransitionProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* interpolatedStyles */ js.Array[TransitionPlainStyle], Element]] = js.undefined
  /**
    * Default styles on first render
    */
  var defaultStyles: js.UndefOr[js.Array[TransitionPlainStyle]] = js.undefined
  /**
    * Triggers when an element has disappeared
    * @param styleThatLeft
    */
  var didLeave: js.UndefOr[js.Function1[/* styleThatLeft */ TransitionStyle, Unit]] = js.undefined
  /**
    * Styles to interpolate. Accepts array of TransitionStyle objects or interpolated function similar as for
    * <StaggeredMotion/>
    */
  var styles: js.Array[TransitionStyle] | InterpolateFunction
  /**
    * Triggers when a new element will appear
    * @param styleThatEntered
    */
  var willEnter: js.UndefOr[js.Function1[/* styleThatEntered */ TransitionStyle, PlainStyle]] = js.undefined
  /**
    * Triggers when an element will disappear
    * @param styleThatLeft
    */
  var willLeave: js.UndefOr[js.Function1[/* styleThatLeft */ TransitionStyle, Style | Unit]] = js.undefined
}

object TransitionProps {
  @scala.inline
  def apply(
    styles: js.Array[TransitionStyle] | InterpolateFunction,
    children: /* interpolatedStyles */ js.Array[TransitionPlainStyle] => CallbackTo[Element] = null,
    defaultStyles: js.Array[TransitionPlainStyle] = null,
    didLeave: /* styleThatLeft */ TransitionStyle => Callback = null,
    willEnter: /* styleThatEntered */ TransitionStyle => CallbackTo[PlainStyle] = null,
    willLeave: /* styleThatLeft */ TransitionStyle => CallbackTo[Style | Unit] = null
  ): TransitionProps = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* interpolatedStyles */ js.Array[typingsJapgolly.reactMotion.mod.TransitionPlainStyle]) => children(t0).runNow()))
    if (defaultStyles != null) __obj.updateDynamic("defaultStyles")(defaultStyles.asInstanceOf[js.Any])
    if (didLeave != null) __obj.updateDynamic("didLeave")(js.Any.fromFunction1((t0: /* styleThatLeft */ typingsJapgolly.reactMotion.mod.TransitionStyle) => didLeave(t0).runNow()))
    if (willEnter != null) __obj.updateDynamic("willEnter")(js.Any.fromFunction1((t0: /* styleThatEntered */ typingsJapgolly.reactMotion.mod.TransitionStyle) => willEnter(t0).runNow()))
    if (willLeave != null) __obj.updateDynamic("willLeave")(js.Any.fromFunction1((t0: /* styleThatLeft */ typingsJapgolly.reactMotion.mod.TransitionStyle) => willLeave(t0).runNow()))
    __obj.asInstanceOf[TransitionProps]
  }
}

