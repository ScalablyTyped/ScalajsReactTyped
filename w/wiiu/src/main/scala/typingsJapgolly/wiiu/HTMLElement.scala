package typingsJapgolly.wiiu

import org.scalajs.dom.CustomEvent
import typingsJapgolly.wiiu.wiiuStrings.wiiu_videoplayer_end
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLElement extends StObject {
  
  @JSName("addEventListener")
  def addEventListener_wiiuvideoplayerend(`type`: wiiu_videoplayer_end, listener: js.Function1[/* ev */ CustomEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuvideoplayerend(
    `type`: wiiu_videoplayer_end,
    listener: js.Function1[/* ev */ CustomEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
}
