package typingsJapgolly.reactMic.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Blob
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMic.mod.ReactMicProps
import typingsJapgolly.reactMic.mod.ReactMicStopEvent
import typingsJapgolly.reactMic.reactMicInts.`1`
import typingsJapgolly.reactMic.reactMicInts.`2`
import typingsJapgolly.reactMic.reactMicStrings.audioSlashwav
import typingsJapgolly.reactMic.reactMicStrings.audioSlashwebm
import typingsJapgolly.reactMic.reactMicStrings.frequencyBars
import typingsJapgolly.reactMic.reactMicStrings.sinewave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMic {
  
  @JSImport("react-mic", "ReactMic")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMic.mod.ReactMic] {
    
    inline def autoGainControl(value: Boolean): this.type = set("autoGainControl", value.asInstanceOf[js.Any])
    
    inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def channelCount(value: `1` | `2`): this.type = set("channelCount", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def echoCancellation(value: Boolean): this.type = set("echoCancellation", value.asInstanceOf[js.Any])
    
    inline def mimeType(value: audioSlashwebm | audioSlashwav): this.type = set("mimeType", value.asInstanceOf[js.Any])
    
    inline def noiseSuppression(value: Boolean): this.type = set("noiseSuppression", value.asInstanceOf[js.Any])
    
    inline def onData(value: /* recordedData */ Blob => Callback): this.type = set("onData", js.Any.fromFunction1((t0: /* recordedData */ Blob) => value(t0).runNow()))
    
    inline def onStop(value: /* recordedData */ ReactMicStopEvent => Callback): this.type = set("onStop", js.Any.fromFunction1((t0: /* recordedData */ ReactMicStopEvent) => value(t0).runNow()))
    
    inline def pause(value: Boolean): this.type = set("pause", value.asInstanceOf[js.Any])
    
    inline def record(value: Boolean): this.type = set("record", value.asInstanceOf[js.Any])
    
    inline def strokeColor(value: String): this.type = set("strokeColor", value.asInstanceOf[js.Any])
    
    inline def visualSetting(value: sinewave | frequencyBars): this.type = set("visualSetting", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactMic.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactMicProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
