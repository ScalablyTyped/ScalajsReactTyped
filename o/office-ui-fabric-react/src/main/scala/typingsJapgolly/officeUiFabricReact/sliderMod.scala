package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`1000`
import typingsJapgolly.officeUiFabricReact.sliderTypesMod.ISliderProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Slider", JSImport.Namespace)
@js.native
object sliderMod extends js.Object {
  @js.native
  class SliderBase protected ()
    extends typingsJapgolly.officeUiFabricReact.sliderBaseMod.SliderBase {
    def this(props: ISliderProps) = this()
  }
  
  val ONKEYDOWN_TIMEOUT_DURATION: `1000` = js.native
  val Slider: FunctionComponent[ISliderProps] = js.native
  /* static members */
  @js.native
  object SliderBase extends js.Object {
    var defaultProps: ISliderProps = js.native
  }
  
}

