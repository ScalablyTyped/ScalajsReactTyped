package typingsJapgolly.playable

import org.scalajs.dom.HTMLElement
import typingsJapgolly.playable.distSrcModulesUiLoadingCoverTypesMod.ILoadingCoverViewStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiLoadingCoverLoadingCoverDotviewMod {
  
  @JSImport("playable/dist/src/modules/ui/loading-cover/loading-cover.view", JSImport.Default)
  @js.native
  open class default () extends LoadingCoverView
  
  @js.native
  trait LoadingCoverView
    extends typingsJapgolly.playable.distSrcModulesUiCoreViewMod.default[ILoadingCoverViewStyles] {
    
    /* private */ @JSName("_$image")
    var _$image: Any = js.native
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ var _initDOM: Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setCover(url: String): Unit = js.native
    def setCover(url: Boolean): Unit = js.native
    
    def show(): Unit = js.native
  }
}
