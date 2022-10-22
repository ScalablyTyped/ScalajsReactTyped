package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAudioPlayerAudioPlayerDotuniDotdriverMod {
  
  trait AudioPlayerUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOnPlayPauseButton(): js.Promise[Unit]
    
    def timeIndicatorText(): js.Promise[String]
  }
  object AudioPlayerUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickOnPlayPauseButton: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      timeIndicatorText: CallbackTo[js.Promise[String]]
    ): AudioPlayerUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickOnPlayPauseButton = clickOnPlayPauseButton.toJsFn, element = element.toJsFn, exists = exists.toJsFn, timeIndicatorText = timeIndicatorText.toJsFn)
      __obj.asInstanceOf[AudioPlayerUniDriver]
    }
    
    extension [Self <: AudioPlayerUniDriver](x: Self) {
      
      inline def setClickOnPlayPauseButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOnPlayPauseButton", value.toJsFn)
      
      inline def setTimeIndicatorText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "timeIndicatorText", value.toJsFn)
    }
  }
}
