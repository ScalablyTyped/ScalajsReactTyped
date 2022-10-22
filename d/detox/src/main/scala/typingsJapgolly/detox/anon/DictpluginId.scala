package typingsJapgolly.detox.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.detox.detoxStrings.all
import typingsJapgolly.detox.detoxStrings.disabled
import typingsJapgolly.detox.detoxStrings.enabled
import typingsJapgolly.detox.detoxStrings.failing
import typingsJapgolly.detox.detoxStrings.manual
import typingsJapgolly.detox.detoxStrings.none
import typingsJapgolly.detox.mod.global.Detox.DetoxInstrumentsArtifactsPluginConfig
import typingsJapgolly.detox.mod.global.Detox.DetoxLogArtifactsPluginConfig
import typingsJapgolly.detox.mod.global.Detox.DetoxScreenshotArtifactsPluginConfig
import typingsJapgolly.detox.mod.global.Detox.DetoxTimelineArtifactsPluginConfig
import typingsJapgolly.detox.mod.global.Detox.DetoxUIHierarchyArtifactsPluginConfig
import typingsJapgolly.detox.mod.global.Detox.DetoxVideoArtifactsPluginConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictpluginId
  extends StObject
     with /* pluginId */ StringDictionary[Any] {
  
  var instruments: js.UndefOr[none | all | DetoxInstrumentsArtifactsPluginConfig] = js.undefined
  
  var log: js.UndefOr[none | failing | all | DetoxLogArtifactsPluginConfig] = js.undefined
  
  var screenshot: js.UndefOr[none | manual | failing | all | DetoxScreenshotArtifactsPluginConfig] = js.undefined
  
  var timeline: js.UndefOr[none | all | DetoxTimelineArtifactsPluginConfig] = js.undefined
  
  var uiHierarchy: js.UndefOr[disabled | enabled | DetoxUIHierarchyArtifactsPluginConfig] = js.undefined
  
  var video: js.UndefOr[none | failing | all | DetoxVideoArtifactsPluginConfig] = js.undefined
}
object DictpluginId {
  
  inline def apply(): DictpluginId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictpluginId]
  }
  
  extension [Self <: DictpluginId](x: Self) {
    
    inline def setInstruments(value: none | all | DetoxInstrumentsArtifactsPluginConfig): Self = StObject.set(x, "instruments", value.asInstanceOf[js.Any])
    
    inline def setInstrumentsUndefined: Self = StObject.set(x, "instruments", js.undefined)
    
    inline def setLog(value: none | failing | all | DetoxLogArtifactsPluginConfig): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setScreenshot(value: none | manual | failing | all | DetoxScreenshotArtifactsPluginConfig): Self = StObject.set(x, "screenshot", value.asInstanceOf[js.Any])
    
    inline def setScreenshotUndefined: Self = StObject.set(x, "screenshot", js.undefined)
    
    inline def setTimeline(value: none | all | DetoxTimelineArtifactsPluginConfig): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    
    inline def setTimelineUndefined: Self = StObject.set(x, "timeline", js.undefined)
    
    inline def setUiHierarchy(value: disabled | enabled | DetoxUIHierarchyArtifactsPluginConfig): Self = StObject.set(x, "uiHierarchy", value.asInstanceOf[js.Any])
    
    inline def setUiHierarchyUndefined: Self = StObject.set(x, "uiHierarchy", js.undefined)
    
    inline def setVideo(value: none | failing | all | DetoxVideoArtifactsPluginConfig): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
