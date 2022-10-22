package typingsJapgolly.flipsnap

import org.scalajs.dom.Event
import typingsJapgolly.flipsnap.flipsnapStrings.fstouchend
import typingsJapgolly.flipsnap.flipsnapStrings.fstouchmove
import typingsJapgolly.flipsnap.flipsnapStrings.fstouchstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLElement extends StObject {
  
  @JSName("addEventListener")
  def addEventListener_fstouchend(`type`: fstouchend, listener: js.Function1[/* ev */ FlipsnapTouchEndEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchend(
    `type`: fstouchend,
    listener: js.Function1[/* ev */ FlipsnapTouchEndEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchmove(`type`: fstouchmove, listener: js.Function1[/* ev */ FlipsnapTouchMoveEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchmove(
    `type`: fstouchmove,
    listener: js.Function1[/* ev */ FlipsnapTouchMoveEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchstart(`type`: fstouchstart, listener: js.Function1[/* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchstart(`type`: fstouchstart, listener: js.Function1[/* ev */ Event, Any], useCapture: Boolean): Unit = js.native
}
