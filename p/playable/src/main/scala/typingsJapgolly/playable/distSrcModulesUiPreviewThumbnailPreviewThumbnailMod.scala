package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.HTMLElement
import typingsJapgolly.playable.anon.PreviewServiceIPreviewService
import typingsJapgolly.playable.distSrcModulesUiPreviewThumbnailTypesMod.IPreviewThumbnail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiPreviewThumbnailPreviewThumbnailMod {
  
  @JSImport("playable/dist/src/modules/ui/preview-thumbnail/preview-thumbnail", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PreviewThumbnail {
    def this(hasPreviewService: PreviewServiceIPreviewService) = this()
    
    /* private */ /* CompleteClass */
    var _currentFrames: Any = js.native
    
    /* private */ /* CompleteClass */
    var _initUI: Any = js.native
    
    /* private */ /* CompleteClass */
    var _previewService: Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def setTime(time: String): Unit = js.native
    
    /* CompleteClass */
    override def showAt(second: Double): Unit = js.native
    
    /* CompleteClass */
    var view: typingsJapgolly.playable.distSrcModulesUiPreviewThumbnailPreviewThumbnailDotviewMod.default = js.native
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/ui/preview-thumbnail/preview-thumbnail", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/preview-thumbnail/preview-thumbnail", "default.View")
    @js.native
    def View: Instantiable0[
        typingsJapgolly.playable.distSrcModulesUiPreviewThumbnailPreviewThumbnailDotviewMod.default
      ] = js.native
    inline def View_=(
      x: Instantiable0[
          typingsJapgolly.playable.distSrcModulesUiPreviewThumbnailPreviewThumbnailDotviewMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/preview-thumbnail/preview-thumbnail", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/preview-thumbnail/preview-thumbnail", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  trait PreviewThumbnail
    extends StObject
       with IPreviewThumbnail {
    
    /* private */ var _currentFrames: Any
    
    /* private */ var _initUI: Any
    
    /* private */ var _previewService: Any
    
    var view: typingsJapgolly.playable.distSrcModulesUiPreviewThumbnailPreviewThumbnailDotviewMod.default
  }
  object PreviewThumbnail {
    
    inline def apply(
      _currentFrames: Any,
      _initUI: Any,
      _previewService: Any,
      destroy: Callback,
      getElement: CallbackTo[HTMLElement],
      setTime: String => Callback,
      showAt: Double => Callback,
      view: typingsJapgolly.playable.distSrcModulesUiPreviewThumbnailPreviewThumbnailDotviewMod.default
    ): PreviewThumbnail = {
      val __obj = js.Dynamic.literal(_currentFrames = _currentFrames.asInstanceOf[js.Any], _initUI = _initUI.asInstanceOf[js.Any], _previewService = _previewService.asInstanceOf[js.Any], destroy = destroy.toJsFn, getElement = getElement.toJsFn, setTime = js.Any.fromFunction1((t0: String) => setTime(t0).runNow()), showAt = js.Any.fromFunction1((t0: Double) => showAt(t0).runNow()), view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviewThumbnail]
    }
    
    extension [Self <: PreviewThumbnail](x: Self) {
      
      inline def setView(value: typingsJapgolly.playable.distSrcModulesUiPreviewThumbnailPreviewThumbnailDotviewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def set_currentFrames(value: Any): Self = StObject.set(x, "_currentFrames", value.asInstanceOf[js.Any])
      
      inline def set_initUI(value: Any): Self = StObject.set(x, "_initUI", value.asInstanceOf[js.Any])
      
      inline def set_previewService(value: Any): Self = StObject.set(x, "_previewService", value.asInstanceOf[js.Any])
    }
  }
}
