package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.auto
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.metadata
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAudioPlayerMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/AudioPlayer", JSImport.Default)
  @js.native
  val default: FC[AudioPlayerProps & RefAttributes[AudioPlayerImperativeActions]] = js.native
  
  trait AudioPlayerImperativeActions extends StObject {
    
    def focus(): Unit
  }
  object AudioPlayerImperativeActions {
    
    inline def apply(focus: Callback): AudioPlayerImperativeActions = {
      val __obj = js.Dynamic.literal(focus = focus.toJsFn)
      __obj.asInstanceOf[AudioPlayerImperativeActions]
    }
    
    extension [Self <: AudioPlayerImperativeActions](x: Self) {
      
      inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
    }
  }
  
  trait AudioPlayerProps extends StObject {
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLoadError: js.UndefOr[js.Function1[/* errorMsg */ String, Unit]] = js.undefined
    
    var onPause: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPlay: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSeek: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var preload: js.UndefOr[metadata | auto | none_] = js.undefined
    
    var src: String
    
    var webAudioAPI: js.UndefOr[Boolean] = js.undefined
  }
  object AudioPlayerProps {
    
    inline def apply(src: String): AudioPlayerProps = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[AudioPlayerProps]
    }
    
    extension [Self <: AudioPlayerProps](x: Self) {
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setOnEnd(value: Callback): Self = StObject.set(x, "onEnd", value.toJsFn)
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnLoad(value: Callback): Self = StObject.set(x, "onLoad", value.toJsFn)
      
      inline def setOnLoadError(value: /* errorMsg */ String => Callback): Self = StObject.set(x, "onLoadError", js.Any.fromFunction1((t0: /* errorMsg */ String) => value(t0).runNow()))
      
      inline def setOnLoadErrorUndefined: Self = StObject.set(x, "onLoadError", js.undefined)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnPause(value: Callback): Self = StObject.set(x, "onPause", value.toJsFn)
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnPlay(value: Callback): Self = StObject.set(x, "onPlay", value.toJsFn)
      
      inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      inline def setOnSeek(value: Callback): Self = StObject.set(x, "onSeek", value.toJsFn)
      
      inline def setOnSeekUndefined: Self = StObject.set(x, "onSeek", js.undefined)
      
      inline def setPreload(value: metadata | auto | none_): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setWebAudioAPI(value: Boolean): Self = StObject.set(x, "webAudioAPI", value.asInstanceOf[js.Any])
      
      inline def setWebAudioAPIUndefined: Self = StObject.set(x, "webAudioAPI", js.undefined)
    }
  }
  
  type _To = FC[AudioPlayerProps & RefAttributes[AudioPlayerImperativeActions]]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesAudioPlayerMod.foo` */
  override def _to: FC[AudioPlayerProps & RefAttributes[AudioPlayerImperativeActions]] = default
}
