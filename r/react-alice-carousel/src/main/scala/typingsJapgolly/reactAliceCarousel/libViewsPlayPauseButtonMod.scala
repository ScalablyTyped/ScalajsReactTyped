package typingsJapgolly.reactAliceCarousel

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactAliceCarousel.anon.IsPlaying
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libViewsPlayPauseButtonMod {
  
  @JSImport("react-alice-carousel/lib/views/PlayPauseButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def PlayPauseButton(hasIsPlayingOnClickRenderPlayPauseButton: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PlayPauseButton")(hasIsPlayingOnClickRenderPlayPauseButton.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var isPlaying: Boolean
    
    def onClick(e: Any): Unit
    
    var renderPlayPauseButton: js.UndefOr[js.Function1[/* hasIsPlaying */ IsPlaying, Any]] = js.undefined
  }
  object Props {
    
    inline def apply(isPlaying: Boolean, onClick: Any => Callback): Props = {
      val __obj = js.Dynamic.literal(isPlaying = isPlaying.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: Any) => onClick(t0).runNow()))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setIsPlaying(value: Boolean): Self = StObject.set(x, "isPlaying", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: Any => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setRenderPlayPauseButton(value: /* hasIsPlaying */ IsPlaying => Any): Self = StObject.set(x, "renderPlayPauseButton", js.Any.fromFunction1(value))
      
      inline def setRenderPlayPauseButtonUndefined: Self = StObject.set(x, "renderPlayPauseButton", js.undefined)
    }
  }
}
