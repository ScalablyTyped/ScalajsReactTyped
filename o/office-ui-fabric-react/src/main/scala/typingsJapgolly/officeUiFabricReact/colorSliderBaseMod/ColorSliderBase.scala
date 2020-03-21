package typingsJapgolly.officeUiFabricReact.colorSliderBaseMod

import typingsJapgolly.officeUiFabricReact.PartialIColorSliderProps
import typingsJapgolly.officeUiFabricReact.ReadonlyIColorSliderProps
import typingsJapgolly.officeUiFabricReact.ReadonlyIColorSliderState
import typingsJapgolly.officeUiFabricReact.colorSliderTypesMod.IColorSlider
import typingsJapgolly.officeUiFabricReact.colorSliderTypesMod.IColorSliderProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.base", "ColorSliderBase")
@js.native
class ColorSliderBase protected ()
  extends Component[IColorSliderProps, IColorSliderState, js.Any]
     with IColorSlider {
  def this(props: IColorSliderProps) = this()
  var _events: js.Any = js.native
  var _onKeyDown: js.Any = js.native
  var _onMouseDown: js.Any = js.native
  var _onMouseMove: js.Any = js.native
  var _onMouseUp: js.Any = js.native
  var _root: js.Any = js.native
  var _updateValue: js.Any = js.native
  /** Current value of the slider. */
  /* CompleteClass */
  override var value: Double = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MColorSliderBase(prevProps: ReadonlyIColorSliderProps, prevState: ReadonlyIColorSliderState): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MColorSliderBase(): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.base", "ColorSliderBase")
@js.native
object ColorSliderBase extends js.Object {
  var defaultProps: PartialIColorSliderProps = js.native
}

