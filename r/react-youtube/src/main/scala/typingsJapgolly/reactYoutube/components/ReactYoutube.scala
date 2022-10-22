package typingsJapgolly.reactYoutube.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactYoutube.mod.YouTubeEvent
import typingsJapgolly.reactYoutube.mod.YouTubeProps
import typingsJapgolly.reactYoutube.mod.default
import typingsJapgolly.reactYoutube.reactYoutubeStrings.`lazy`
import typingsJapgolly.reactYoutube.reactYoutubeStrings.eager
import typingsJapgolly.youtubePlayer.distTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactYoutube {
  
  @JSImport("react-youtube", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def iframeClassName(value: String): this.type = set("iframeClassName", value.asInstanceOf[js.Any])
    
    inline def loading(value: eager | `lazy`): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def onEnd(value: /* event */ YouTubeEvent[Double] => Callback): this.type = set("onEnd", js.Any.fromFunction1((t0: /* event */ YouTubeEvent[Double]) => value(t0).runNow()))
    
    inline def onError(value: /* event */ YouTubeEvent[Double] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* event */ YouTubeEvent[Double]) => value(t0).runNow()))
    
    inline def onPause(value: /* event */ YouTubeEvent[Double] => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: /* event */ YouTubeEvent[Double]) => value(t0).runNow()))
    
    inline def onPlay(value: /* event */ YouTubeEvent[Double] => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: /* event */ YouTubeEvent[Double]) => value(t0).runNow()))
    
    inline def onPlaybackQualityChange(value: /* event */ YouTubeEvent[String] => Callback): this.type = set("onPlaybackQualityChange", js.Any.fromFunction1((t0: /* event */ YouTubeEvent[String]) => value(t0).runNow()))
    
    inline def onPlaybackRateChange(value: /* event */ YouTubeEvent[Double] => Callback): this.type = set("onPlaybackRateChange", js.Any.fromFunction1((t0: /* event */ YouTubeEvent[Double]) => value(t0).runNow()))
    
    inline def onReady(value: /* event */ YouTubeEvent[Any] => Callback): this.type = set("onReady", js.Any.fromFunction1((t0: /* event */ YouTubeEvent[Any]) => value(t0).runNow()))
    
    inline def onStateChange(value: /* event */ YouTubeEvent[Double] => Callback): this.type = set("onStateChange", js.Any.fromFunction1((t0: /* event */ YouTubeEvent[Double]) => value(t0).runNow()))
    
    inline def opts(value: Options): this.type = set("opts", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def videoId(value: String): this.type = set("videoId", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactYoutube.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: YouTubeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
