package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.playable.distSrcModulesUiCoreThemeTypesMod.IThemeService
import typingsJapgolly.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiTitleTypesMod {
  
  @js.native
  trait ITitle extends StObject {
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setTitle(): Unit = js.native
    def setTitle(title: String): Unit = js.native
    
    def setTitleClickCallback(): Unit = js.native
    def setTitleClickCallback(callback: js.Function0[Unit]): Unit = js.native
    
    def show(): Unit = js.native
  }
  
  trait ITitleAPI extends StObject {
    
    var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.undefined
    
    var setTitleClickCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Function0[Unit]], Unit]] = js.undefined
  }
  object ITitleAPI {
    
    inline def apply(): ITitleAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITitleAPI]
    }
    
    extension [Self <: ITitleAPI](x: Self) {
      
      inline def setSetTitle(value: /* title */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setTitle", js.Any.fromFunction1((t0: /* title */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setSetTitleClickCallback(value: /* callback */ js.UndefOr[js.Function0[Unit]] => Callback): Self = StObject.set(x, "setTitleClickCallback", js.Any.fromFunction1((t0: /* callback */ js.UndefOr[js.Function0[Unit]]) => value(t0).runNow()))
      
      inline def setSetTitleClickCallbackUndefined: Self = StObject.set(x, "setTitleClickCallback", js.undefined)
      
      inline def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
    }
  }
  
  trait ITitleViewCallbacks extends StObject {
    
    var onClick: EventListenerOrEventListenerObject
  }
  object ITitleViewCallbacks {
    
    inline def apply(onClick: EventListenerOrEventListenerObject): ITitleViewCallbacks = {
      val __obj = js.Dynamic.literal(onClick = onClick.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITitleViewCallbacks]
    }
    
    extension [Self <: ITitleViewCallbacks](x: Self) {
      
      inline def setOnClick(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickFunction1(value: /* evt */ Event => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* evt */ Event) => value(t0).runNow()))
    }
  }
  
  trait ITitleViewConfig extends StObject {
    
    var callbacks: ITitleViewCallbacks
    
    var theme: IThemeService
  }
  object ITitleViewConfig {
    
    inline def apply(callbacks: ITitleViewCallbacks, theme: IThemeService): ITitleViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITitleViewConfig]
    }
    
    extension [Self <: ITitleViewConfig](x: Self) {
      
      inline def setCallbacks(value: ITitleViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITitleViewStyles extends StObject {
    
    var hidden: String
    
    var link: String
    
    var title: String
  }
  object ITitleViewStyles {
    
    inline def apply(hidden: String, link: String, title: String): ITitleViewStyles = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITitleViewStyles]
    }
    
    extension [Self <: ITitleViewStyles](x: Self) {
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
