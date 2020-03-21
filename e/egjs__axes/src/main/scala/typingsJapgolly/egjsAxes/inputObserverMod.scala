package typingsJapgolly.egjsAxes

import typingsJapgolly.egjsAxes.animationManagerMod.AnimationManager
import typingsJapgolly.egjsAxes.axesMod.AxesOption
import typingsJapgolly.egjsAxes.axisManagerMod.Axis
import typingsJapgolly.egjsAxes.axisManagerMod.AxisManager
import typingsJapgolly.egjsAxes.eventManagerMod.EventManager
import typingsJapgolly.egjsAxes.inputTypeMod.IInputTypeObserver
import typingsJapgolly.egjsAxes.interruptManagerMod.InterruptManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@egjs/axes/InputObserver", JSImport.Namespace)
@js.native
object inputObserverMod extends js.Object {
  @js.native
  class InputObserver protected () extends IInputTypeObserver {
    def this(
      options: AxesOption,
      itm: InterruptManager,
      em: EventManager,
      axm: AxisManager,
      am: AnimationManager
    ) = this()
    var am: js.Any = js.native
    var axm: js.Any = js.native
    var em: js.Any = js.native
    var isOutside: Boolean = js.native
    var itm: js.Any = js.native
    var moveDistance: Axis = js.native
    /* private */ def atOutside(pos: js.Any): js.Any = js.native
    def change(inputType: js.Any, event: js.Any, offset: Axis): Unit = js.native
  }
  
}

