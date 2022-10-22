package typingsJapgolly.playable

import org.scalajs.dom.HTMLElement
import typingsJapgolly.playable.distSrcModulesUiControlsChromecastTypesMod.IChromecastStyles
import typingsJapgolly.playable.distSrcModulesUiControlsChromecastTypesMod.IChromecastViewConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiControlsChromecastChromecastDotviewMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/chromecast/chromecast.view", JSImport.Default)
  @js.native
  open class default protected () extends ChromecastView {
    def this(config: IChromecastViewConfig) = this()
  }
  
  @js.native
  trait ChromecastView
    extends typingsJapgolly.playable.distSrcModulesUiCoreViewMod.default[IChromecastStyles] {
    
    /* private */ @JSName("_$downloadButton")
    var _$downloadButton: Any = js.native
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _callbacks: Any = js.native
    
    /* private */ var _getLabelText: Any = js.native
    
    /* private */ var _onButtonClick: Any = js.native
    
    /* private */ var _textMap: Any = js.native
    
    /* private */ var _tooltipReference: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setCastingState(isCasting: Boolean): Unit = js.native
    
    def show(): Unit = js.native
  }
}
