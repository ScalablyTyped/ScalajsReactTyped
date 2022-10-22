package typingsJapgolly.playable

import org.scalajs.dom.HTMLElement
import typingsJapgolly.playable.distSrcModulesUiLoaderTypesMod.ILoaderViewStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiLoaderLoaderDotviewMod {
  
  @JSImport("playable/dist/src/modules/ui/loader/loader.view", JSImport.Default)
  @js.native
  open class default () extends LoaderView
  
  @js.native
  trait LoaderView
    extends typingsJapgolly.playable.distSrcModulesUiCoreViewMod.default[ILoaderViewStyles] {
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def hideContent(): Unit = js.native
    
    def show(): Unit = js.native
    
    def showContent(): Unit = js.native
  }
}
