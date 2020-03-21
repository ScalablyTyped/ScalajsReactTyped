package typingsJapgolly.egjsAxes

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.egjsAxes.axesMod.AxesOption
import typingsJapgolly.egjsAxes.axisManagerMod.Axis
import typingsJapgolly.egjsAxes.axisManagerMod.AxisOption
import typingsJapgolly.egjsAxes.constMod.DIRECTION
import typingsJapgolly.egjsAxes.pinchInputMod.PinchInputOption
import typingsJapgolly.egjsAxes.wheelInputMod.WheelInputOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@egjs/axes", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default protected ()
    extends typingsJapgolly.egjsAxes.axesMod.default {
    def this(axis: StringDictionary[AxisOption], options: AxesOption) = this()
    def this(axis: StringDictionary[AxisOption], options: AxesOption, startPos: Axis) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var DIRECTION_ALL: DIRECTION = js.native
    var DIRECTION_DOWN: DIRECTION = js.native
    var DIRECTION_HORIZONTAL: DIRECTION = js.native
    var DIRECTION_LEFT: DIRECTION = js.native
    var DIRECTION_NONE: DIRECTION = js.native
    var DIRECTION_RIGHT: DIRECTION = js.native
    var DIRECTION_UP: DIRECTION = js.native
    var DIRECTION_VERTICAL: DIRECTION = js.native
    var PanInput: TypeofPanInput = js.native
    var PinchInput: Instantiable2[
        /* el */ js.Any, 
        js.UndefOr[/* options */ PinchInputOption], 
        typingsJapgolly.egjsAxes.pinchInputMod.PinchInput
      ] = js.native
    var TRANSFORM: String = js.native
    var VERSION: String = js.native
    var WheelInput: Instantiable2[
        /* el */ js.Any, 
        js.UndefOr[/* options */ WheelInputOption], 
        typingsJapgolly.egjsAxes.wheelInputMod.WheelInput
      ] = js.native
  }
  
}

