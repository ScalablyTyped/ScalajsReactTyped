package typingsJapgolly.wiiu

import org.scalajs.dom.raw.CustomEvent
import typingsJapgolly.wiiu.wiiuStrings.wiiu_videoplayer_end
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLElement extends js.Object {
  @JSName("addEventListener")
  def addEventListener_wiiuvideoplayerend(`type`: wiiu_videoplayer_end, listener: js.Function1[/* ev */ CustomEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuvideoplayerend(`type`: wiiu_videoplayer_end, listener: js.Function1[/* ev */ CustomEvent, _], useCapture: Boolean): Unit = js.native
}

