package typingsJapgolly.playable

import org.scalajs.dom.HTMLElement
import typingsJapgolly.playable.distSrcModulesUiTitleTypesMod.ITitleViewConfig
import typingsJapgolly.playable.distSrcModulesUiTitleTypesMod.ITitleViewStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiTitleTitleDotviewMod {
  
  @JSImport("playable/dist/src/modules/ui/title/title.view", JSImport.Default)
  @js.native
  open class default protected () extends TitleView {
    def this(config: ITitleViewConfig) = this()
  }
  
  @js.native
  trait TitleView
    extends typingsJapgolly.playable.distSrcModulesUiCoreViewMod.default[ITitleViewStyles] {
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _callbacks: Any = js.native
    
    /* private */ var _initDOM: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setDisplayAsLink(flag: Boolean): Unit = js.native
    
    def setTitle(): Unit = js.native
    def setTitle(title: String): Unit = js.native
    
    def show(): Unit = js.native
  }
}
