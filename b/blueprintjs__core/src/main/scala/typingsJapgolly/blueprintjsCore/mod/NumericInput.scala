package typingsJapgolly.blueprintjsCore.mod

import typingsJapgolly.blueprintjsCore.AnonPrevMaxProp
import typingsJapgolly.blueprintjsCore.numericInputMod.INumericInputProps
import typingsJapgolly.blueprintjsCore.numericInputMod.INumericInputState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core", "NumericInput")
@js.native
class NumericInput ()
  extends typingsJapgolly.blueprintjsCore.componentsMod.NumericInput

/* static members */
@JSImport("@blueprintjs/core", "NumericInput")
@js.native
object NumericInput extends js.Object {
  var CONTINUOUS_CHANGE_DELAY: js.Any = js.native
  var CONTINUOUS_CHANGE_INTERVAL: js.Any = js.native
  var VALUE_EMPTY: String = js.native
  var VALUE_ZERO: String = js.native
  var defaultProps: INumericInputProps = js.native
  var displayName: String = js.native
  var getSanitizedValue: js.Any = js.native
  var getStepMaxPrecision: js.Any = js.native
  def getDerivedStateFromProps(props: INumericInputProps, state: INumericInputState): AnonPrevMaxProp = js.native
}

