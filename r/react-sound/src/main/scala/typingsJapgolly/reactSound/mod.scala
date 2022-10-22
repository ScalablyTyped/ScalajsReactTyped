package typingsJapgolly.reactSound

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSound.reactSoundStrings.PAUSED
import typingsJapgolly.reactSound.reactSoundStrings.PLAYING
import typingsJapgolly.reactSound.reactSoundStrings.STOPPED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-sound", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[ReactSoundProps, js.Object, Any] {
    def this(props: ReactSoundProps) = this()
    def this(props: ReactSoundProps, context: Any) = this()
  }
  @JSImport("react-sound", JSImport.Default)
  @js.native
  val default: ComponentClassP[ReactSoundProps & js.Object] = js.native
  
  trait ReactSoundProps extends StObject {
    
    var autoLoad: js.UndefOr[Boolean] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var onBufferChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFinishedPlaying: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLoading: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPause: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPlaying: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onResume: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onStop: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var playFromPosition: js.UndefOr[Double] = js.undefined
    
    var playStatus: PLAYING | STOPPED | PAUSED
    
    var playbackRate: js.UndefOr[Double] = js.undefined
    
    var position: js.UndefOr[Double] = js.undefined
    
    var url: String
    
    var volume: js.UndefOr[Double] = js.undefined
  }
  object ReactSoundProps {
    
    inline def apply(playStatus: PLAYING | STOPPED | PAUSED, url: String): ReactSoundProps = {
      val __obj = js.Dynamic.literal(playStatus = playStatus.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactSoundProps]
    }
    
    extension [Self <: ReactSoundProps](x: Self) {
      
      inline def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
      
      inline def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setOnBufferChange(value: Callback): Self = StObject.set(x, "onBufferChange", value.toJsFn)
      
      inline def setOnBufferChangeUndefined: Self = StObject.set(x, "onBufferChange", js.undefined)
      
      inline def setOnError(value: Callback): Self = StObject.set(x, "onError", value.toJsFn)
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFinishedPlaying(value: Callback): Self = StObject.set(x, "onFinishedPlaying", value.toJsFn)
      
      inline def setOnFinishedPlayingUndefined: Self = StObject.set(x, "onFinishedPlaying", js.undefined)
      
      inline def setOnLoad(value: Callback): Self = StObject.set(x, "onLoad", value.toJsFn)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnLoading(value: Callback): Self = StObject.set(x, "onLoading", value.toJsFn)
      
      inline def setOnLoadingUndefined: Self = StObject.set(x, "onLoading", js.undefined)
      
      inline def setOnPause(value: Callback): Self = StObject.set(x, "onPause", value.toJsFn)
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlaying(value: Callback): Self = StObject.set(x, "onPlaying", value.toJsFn)
      
      inline def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      inline def setOnResume(value: Callback): Self = StObject.set(x, "onResume", value.toJsFn)
      
      inline def setOnResumeUndefined: Self = StObject.set(x, "onResume", js.undefined)
      
      inline def setOnStop(value: Callback): Self = StObject.set(x, "onStop", value.toJsFn)
      
      inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      inline def setPlayFromPosition(value: Double): Self = StObject.set(x, "playFromPosition", value.asInstanceOf[js.Any])
      
      inline def setPlayFromPositionUndefined: Self = StObject.set(x, "playFromPosition", js.undefined)
      
      inline def setPlayStatus(value: PLAYING | STOPPED | PAUSED): Self = StObject.set(x, "playStatus", value.asInstanceOf[js.Any])
      
      inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
      
      inline def setPlaybackRateUndefined: Self = StObject.set(x, "playbackRate", js.undefined)
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
  
  type _To = ComponentClassP[ReactSoundProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ComponentClassP[ReactSoundProps & js.Object] = default
}
