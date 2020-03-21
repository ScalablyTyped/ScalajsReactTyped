package typingsJapgolly.egjsAxes

import typingsJapgolly.egjsAxes.animationManagerMod.AnimationParam
import typingsJapgolly.egjsAxes.axisManagerMod.Axis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@egjs/axes/EventManager", JSImport.Namespace)
@js.native
object eventManagerMod extends js.Object {
  @js.native
  class EventManager protected () extends js.Object {
    def this(axes: js.Any, axm: js.Any) = this()
    var axes: js.Any = js.native
    var axm: js.Any = js.native
    /* private */ def createUserControll(pos: js.Any): js.Any = js.native
    /* private */ def createUserControll(pos: js.Any, duration: js.Any): js.Any = js.native
    def destroy(): Unit = js.native
    def triggerAnimationEnd(): Unit = js.native
    def triggerAnimationStart(param: AnimationParam): Boolean = js.native
    def triggerChange(pos: Axis): Unit = js.native
    def triggerChange(pos: Axis, event: js.Any): Unit = js.native
    def triggerHold(pos: Axis, event: js.Any): Unit = js.native
    def triggerRelease(param: AnimationParam): Unit = js.native
    def triggerRelease(param: AnimationParam, event: js.Any): Unit = js.native
  }
  
}

