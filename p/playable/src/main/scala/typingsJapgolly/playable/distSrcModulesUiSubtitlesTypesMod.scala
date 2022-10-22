package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiSubtitlesTypesMod {
  
  trait ISubtitleConfig extends StObject {
    
    var label: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[String] = js.undefined
    
    var src: String
  }
  object ISubtitleConfig {
    
    inline def apply(src: String): ISubtitleConfig = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISubtitleConfig]
    }
    
    extension [Self <: ISubtitleConfig](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISubtitles extends StObject {
    
    def destroy(): Unit = js.native
    
    def hideSubtitles(): Unit = js.native
    
    def removeSubtitles(): Unit = js.native
    
    def setActiveSubtitle(index: Double): Unit = js.native
    
    def setSubtitles(subtitles: String): Unit = js.native
    def setSubtitles(subtitles: js.Array[ISubtitleConfig]): Unit = js.native
    def setSubtitles(subtitles: ISubtitleConfig): Unit = js.native
    
    def showSubtitles(): Unit = js.native
  }
  
  trait ISubtitlesAPI extends StObject {
    
    var hideSubtitles: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var removeSubtitles: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var setActiveSubtitle: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var setSubtitles: js.UndefOr[
        js.Function1[/* subtitles */ String | ISubtitleConfig | js.Array[ISubtitleConfig], Unit]
      ] = js.undefined
    
    var showSubtitles: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ISubtitlesAPI {
    
    inline def apply(): ISubtitlesAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISubtitlesAPI]
    }
    
    extension [Self <: ISubtitlesAPI](x: Self) {
      
      inline def setHideSubtitles(value: Callback): Self = StObject.set(x, "hideSubtitles", value.toJsFn)
      
      inline def setHideSubtitlesUndefined: Self = StObject.set(x, "hideSubtitles", js.undefined)
      
      inline def setRemoveSubtitles(value: Callback): Self = StObject.set(x, "removeSubtitles", value.toJsFn)
      
      inline def setRemoveSubtitlesUndefined: Self = StObject.set(x, "removeSubtitles", js.undefined)
      
      inline def setSetActiveSubtitle(value: /* index */ Double => Callback): Self = StObject.set(x, "setActiveSubtitle", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
      
      inline def setSetActiveSubtitleUndefined: Self = StObject.set(x, "setActiveSubtitle", js.undefined)
      
      inline def setSetSubtitles(value: /* subtitles */ String | ISubtitleConfig | js.Array[ISubtitleConfig] => Callback): Self = StObject.set(x, "setSubtitles", js.Any.fromFunction1((t0: /* subtitles */ String | ISubtitleConfig | js.Array[ISubtitleConfig]) => value(t0).runNow()))
      
      inline def setSetSubtitlesUndefined: Self = StObject.set(x, "setSubtitles", js.undefined)
      
      inline def setShowSubtitles(value: Callback): Self = StObject.set(x, "showSubtitles", value.toJsFn)
      
      inline def setShowSubtitlesUndefined: Self = StObject.set(x, "showSubtitles", js.undefined)
    }
  }
  
  trait ISubtitlesViewStyles extends StObject {
    
    var container: String
    
    var controlsShown: String
    
    var hidden: String
    
    var subtitle: String
    
    var subtitlesContainer: String
  }
  object ISubtitlesViewStyles {
    
    inline def apply(
      container: String,
      controlsShown: String,
      hidden: String,
      subtitle: String,
      subtitlesContainer: String
    ): ISubtitlesViewStyles = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], controlsShown = controlsShown.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], subtitlesContainer = subtitlesContainer.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISubtitlesViewStyles]
    }
    
    extension [Self <: ISubtitlesViewStyles](x: Self) {
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setControlsShown(value: String): Self = StObject.set(x, "controlsShown", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitlesContainer(value: String): Self = StObject.set(x, "subtitlesContainer", value.asInstanceOf[js.Any])
    }
  }
}
