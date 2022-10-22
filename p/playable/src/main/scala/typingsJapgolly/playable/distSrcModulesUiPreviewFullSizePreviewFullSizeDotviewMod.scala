package typingsJapgolly.playable

import org.scalajs.dom.HTMLElement
import typingsJapgolly.playable.distSrcModulesUiPreviewFullSizeTypesMod.IPreviewFullSizeViewStyles
import typingsJapgolly.playable.distSrcModulesUiPreviewServiceTypesMod.INormalizedFramesQuality
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiPreviewFullSizePreviewFullSizeDotviewMod {
  
  @JSImport("playable/dist/src/modules/ui/preview-full-size/preview-full-size.view", JSImport.Default)
  @js.native
  open class default () extends PreviewFullSizeView
  
  @js.native
  trait PreviewFullSizeView
    extends typingsJapgolly.playable.distSrcModulesUiCoreViewMod.default[IPreviewFullSizeViewStyles] {
    
    /* private */ @JSName("_$frame")
    var _$frame: Any = js.native
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ var _applyFrame: Any = js.native
    
    /* private */ var _initDOM: Any = js.native
    
    def clear(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setPreview(data: INormalizedFramesQuality): Unit = js.native
    
    def show(): Unit = js.native
  }
}
