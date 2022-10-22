package typingsJapgolly.playable.anon

import typingsJapgolly.playable.distSrcModulesEventEmitterTypesMod.IEventEmitter
import typingsJapgolly.playable.distSrcModulesPlaybackEngineTypesMod.IPlaybackEngine
import typingsJapgolly.playable.distSrcModulesTextMapTypesMod.ITextMap
import typingsJapgolly.playable.distSrcModulesUiCoreThemeTypesMod.IThemeService
import typingsJapgolly.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipService
import typingsJapgolly.playable.distSrcModulesUiPreviewFullSizeTypesMod.IPreviewFullSize
import typingsJapgolly.playable.distSrcModulesUiPreviewThumbnailTypesMod.IPreviewThumbnail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveStateEngine extends StObject {
  
  var engine: IPlaybackEngine
  
  var eventEmitter: IEventEmitter
  
  var liveStateEngine: Any
  
  var previewFullSize: IPreviewFullSize
  
  var previewThumbnail: IPreviewThumbnail
  
  var textMap: ITextMap
  
  var theme: IThemeService
  
  var tooltipService: ITooltipService
}
object LiveStateEngine {
  
  inline def apply(
    engine: IPlaybackEngine,
    eventEmitter: IEventEmitter,
    liveStateEngine: Any,
    previewFullSize: IPreviewFullSize,
    previewThumbnail: IPreviewThumbnail,
    textMap: ITextMap,
    theme: IThemeService,
    tooltipService: ITooltipService
  ): LiveStateEngine = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], liveStateEngine = liveStateEngine.asInstanceOf[js.Any], previewFullSize = previewFullSize.asInstanceOf[js.Any], previewThumbnail = previewThumbnail.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveStateEngine]
  }
  
  extension [Self <: LiveStateEngine](x: Self) {
    
    inline def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    inline def setLiveStateEngine(value: Any): Self = StObject.set(x, "liveStateEngine", value.asInstanceOf[js.Any])
    
    inline def setPreviewFullSize(value: IPreviewFullSize): Self = StObject.set(x, "previewFullSize", value.asInstanceOf[js.Any])
    
    inline def setPreviewThumbnail(value: IPreviewThumbnail): Self = StObject.set(x, "previewThumbnail", value.asInstanceOf[js.Any])
    
    inline def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
  }
}
