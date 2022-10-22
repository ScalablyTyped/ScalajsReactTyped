package typingsJapgolly.playable.anon

import typingsJapgolly.playable.distSrcModulesEventEmitterTypesMod.IEventEmitter
import typingsJapgolly.playable.distSrcModulesPlaybackEngineTypesMod.IPlaybackEngine
import typingsJapgolly.playable.distSrcModulesTextMapTypesMod.ITextMap
import typingsJapgolly.playable.distSrcModulesUiCoreThemeTypesMod.IThemeService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme extends StObject {
  
  var engine: IPlaybackEngine
  
  var eventEmitter: IEventEmitter
  
  var textMap: ITextMap
  
  var theme: IThemeService
}
object Theme {
  
  inline def apply(engine: IPlaybackEngine, eventEmitter: IEventEmitter, textMap: ITextMap, theme: IThemeService): Theme = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  
  extension [Self <: Theme](x: Self) {
    
    inline def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    inline def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
