package typingsJapgolly.playable

import org.scalajs.dom.HTMLElement
import typingsJapgolly.playable.distSrcModulesUiControlsPictureInPictureTypesMod.IPictureInPictureViewConfig
import typingsJapgolly.playable.distSrcModulesUiControlsPictureInPictureTypesMod.IPictureInPictureViewStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiControlsPictureInPicturePictureInPictureDotviewMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/picture-in-picture/picture-in-picture.view", JSImport.Default)
  @js.native
  open class default protected () extends PictureInPictureView {
    def this(config: IPictureInPictureViewConfig) = this()
  }
  
  @js.native
  trait PictureInPictureView
    extends typingsJapgolly.playable.distSrcModulesUiCoreViewMod.default[IPictureInPictureViewStyles] {
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ @JSName("_$togglePictureInPictureControl")
    var _$togglePictureInPictureControl: Any = js.native
    
    /* private */ var _bindEvents: Any = js.native
    
    /* private */ var _callbacks: Any = js.native
    
    /* private */ var _onButtonClick: Any = js.native
    
    /* private */ var _textMap: Any = js.native
    
    /* private */ var _tooltipReference: Any = js.native
    
    /* private */ var _unbindEvents: Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setPictureInPictureState(isPictureInPicture: Boolean): Unit = js.native
    
    def show(): Unit = js.native
  }
}
