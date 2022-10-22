package typingsJapgolly.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.needsBeginFramesChanged
import typingsJapgolly.devtoolsProtocol.mod.Protocol.HeadlessExperimental.BeginFrameRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.HeadlessExperimental.BeginFrameResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.HeadlessExperimental.NeedsBeginFramesChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadlessExperimentalApi extends StObject {
  
  /**
    * Sends a BeginFrame to the target and returns when the frame was completed. Optionally captures a
    * screenshot from the resulting frame. Requires that the target was created with enabled
    * BeginFrameControl. Designed for use with --run-all-compositor-stages-before-draw, see also
    * https://goo.gle/chrome-headless-rendering for more background.
    */
  def beginFrame(params: BeginFrameRequest): js.Promise[BeginFrameResponse]
  
  /**
    * Disables headless events for the target.
    */
  def disable(): js.Promise[Unit]
  
  /**
    * Enables headless events for the target.
    */
  def enable(): js.Promise[Unit]
  
  /**
    * Issued when the target starts or stops needing BeginFrames.
    * Deprecated. Issue beginFrame unconditionally instead and use result from
    * beginFrame to detect whether the frames were suppressed.
    */
  @JSName("on")
  def on_needsBeginFramesChanged(
    event: needsBeginFramesChanged,
    listener: js.Function1[/* params */ NeedsBeginFramesChangedEvent, Unit]
  ): Unit
}
object HeadlessExperimentalApi {
  
  inline def apply(
    beginFrame: BeginFrameRequest => js.Promise[BeginFrameResponse],
    disable: CallbackTo[js.Promise[Unit]],
    enable: CallbackTo[js.Promise[Unit]],
    on: (needsBeginFramesChanged, js.Function1[/* params */ NeedsBeginFramesChangedEvent, Unit]) => Callback
  ): HeadlessExperimentalApi = {
    val __obj = js.Dynamic.literal(beginFrame = js.Any.fromFunction1(beginFrame), disable = disable.toJsFn, enable = enable.toJsFn, on = js.Any.fromFunction2((t0: needsBeginFramesChanged, t1: js.Function1[/* params */ NeedsBeginFramesChangedEvent, Unit]) => (on(t0, t1)).runNow()))
    __obj.asInstanceOf[HeadlessExperimentalApi]
  }
  
  extension [Self <: HeadlessExperimentalApi](x: Self) {
    
    inline def setBeginFrame(value: BeginFrameRequest => js.Promise[BeginFrameResponse]): Self = StObject.set(x, "beginFrame", js.Any.fromFunction1(value))
    
    inline def setDisable(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "disable", value.toJsFn)
    
    inline def setEnable(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "enable", value.toJsFn)
    
    inline def setOn(
      value: (needsBeginFramesChanged, js.Function1[/* params */ NeedsBeginFramesChangedEvent, Unit]) => Callback
    ): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: needsBeginFramesChanged, t1: js.Function1[/* params */ NeedsBeginFramesChangedEvent, Unit]) => (value(t0, t1)).runNow()))
  }
}
