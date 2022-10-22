package typingsJapgolly.playable

import org.scalajs.dom.HTMLElement
import typingsJapgolly.playable.distSrcModulesUiTopBlockTypesMod.ITopBlockViewConfig
import typingsJapgolly.playable.distSrcModulesUiTopBlockTypesMod.ITopBlockViewStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiTopBlockTopBlockDotviewMod {
  
  @JSImport("playable/dist/src/modules/ui/top-block/top-block.view", JSImport.Default)
  @js.native
  open class default protected () extends TopBlockView {
    def this(config: ITopBlockViewConfig) = this()
  }
  
  @js.native
  trait TopBlockView
    extends typingsJapgolly.playable.distSrcModulesUiCoreViewMod.default[ITopBlockViewStyles] {
    
    /* private */ @JSName("_$liveIndicatorContainer")
    var _$liveIndicatorContainer: Any = js.native
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ @JSName("_$titleContainer")
    var _$titleContainer: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _callbacks: Any = js.native
    
    /* private */ var _initDOM: Any = js.native
    
    /* private */ var _preventClickPropagation: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def hideContent(): Unit = js.native
    
    def hideLiveIndicator(): Unit = js.native
    
    def hideTitle(): Unit = js.native
    
    def show(): Unit = js.native
    
    def showContent(): Unit = js.native
    
    def showLiveIndicator(): Unit = js.native
    
    def showTitle(): Unit = js.native
  }
}
