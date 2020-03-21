package typingsJapgolly.baseui.pinCodeMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.baseui.AnonValues
import typingsJapgolly.baseui.baseuiStrings.both
import typingsJapgolly.baseui.baseuiStrings.change_
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.left
import typingsJapgolly.baseui.baseuiStrings.none
import typingsJapgolly.baseui.baseuiStrings.right
import typingsJapgolly.baseui.inputMod.InputOverrides
import typingsJapgolly.baseui.inputMod.SharedProps
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.KeyboardEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<baseui.baseui/pin-code.PinCodeProps> & baseui.baseui/pin-code.StatefulContainerProps & {  children ? :never,   overrides ? :baseui.baseui/pin-code.PinCodeOverrides} */
@js.native
trait StatefulPinCodeProps extends js.Object {
  var adjoined: js.UndefOr[none | left | right | both] = js.native
  var `aria-describedby`: js.UndefOr[String] = js.native
  var `aria-label`: js.UndefOr[String] = js.native
  var `aria-labelledby`: js.UndefOr[String] = js.native
  var autoComplete: js.UndefOr[String] = js.native
  var autoFocus: js.UndefOr[Boolean] = js.native
  var children: js.UndefOr[Node] = js.native
  var clearable: js.UndefOr[Boolean] = js.native
  var `data-baseweb`: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var endEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, Node]) | Node] = js.native
  var error: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var initialState: js.UndefOr[State] = js.native
  var inputRef: js.UndefOr[Ref] = js.native
  var manageFocus: js.UndefOr[Boolean] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  var onChange: js.UndefOr[js.Function1[/* args */ AnonValues, Unit]] = js.native
  var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  var overrides: js.UndefOr[InputOverrides with PinCodeOverrides] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var positive: js.UndefOr[Boolean] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var rows: js.UndefOr[Double] = js.native
  var size: js.UndefOr[default_ | compact | large_] = js.native
  var startEnhancer: js.UndefOr[(js.Function1[/* args */ SharedProps, Node]) | Node] = js.native
  var stateReducer: js.UndefOr[js.Function3[change_, /* nextState */ State, /* currentState */ State, State]] = js.native
  var `type`: js.UndefOr[String] = js.native
  var values: js.UndefOr[js.Array[String]] = js.native
}

