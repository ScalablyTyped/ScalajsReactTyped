package typingsJapgolly.rmcFeedback

import typingsJapgolly.react.mod.Component
import typingsJapgolly.rmcFeedback.propTypesMod.ITouchProps
import typingsJapgolly.rmcFeedback.propTypesMod.ITouchState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-feedback/lib/TouchFeedback", JSImport.Namespace)
@js.native
object touchFeedbackMod extends js.Object {
  @js.native
  trait TouchFeedback
    extends Component[ITouchProps, ITouchState, js.Any] {
    @JSName("state")
    var state_TouchFeedback: AnonActive = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTouchFeedback(): Unit = js.native
    def onMouseDown(e: js.Any): Unit = js.native
    def onMouseLeave(e: js.Any): Unit = js.native
    def onMouseUp(e: js.Any): Unit = js.native
    def onTouchCancel(e: js.Any): Unit = js.native
    def onTouchEnd(e: js.Any): Unit = js.native
    def onTouchMove(e: js.Any): Unit = js.native
    def onTouchStart(e: js.Any): Unit = js.native
    def triggerEvent(`type`: js.Any, isActive: js.Any, ev: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends TouchFeedback
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AnonDisabled = js.native
  }
  
}

