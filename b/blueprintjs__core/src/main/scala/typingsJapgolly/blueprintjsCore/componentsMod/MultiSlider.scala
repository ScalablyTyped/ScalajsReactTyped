package typingsJapgolly.blueprintjsCore.componentsMod

import typingsJapgolly.blueprintjsCore.AnonLabelPrecision
import typingsJapgolly.blueprintjsCore.handlePropsMod.IHandleProps
import typingsJapgolly.blueprintjsCore.multiSliderMod.IMultiSliderProps
import typingsJapgolly.blueprintjsCore.multiSliderMod.ISliderBaseProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components", "MultiSlider")
@js.native
class MultiSlider ()
  extends typingsJapgolly.blueprintjsCore.multiSliderMod.MultiSlider

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components", "MultiSlider")
@js.native
object MultiSlider extends js.Object {
  var Handle: FunctionComponent[IHandleProps] = js.native
  var defaultProps: IMultiSliderProps = js.native
  var defaultSliderProps: ISliderBaseProps = js.native
  var displayName: String = js.native
  var getLabelPrecision: js.Any = js.native
  def getDerivedStateFromProps(props: IMultiSliderProps): AnonLabelPrecision = js.native
}

