package typingsJapgolly.playable.anon

import typingsJapgolly.playable.distSrcCoreConfigMod.IPlayerConfig
import typingsJapgolly.playable.distSrcModulesEventEmitterTypesMod.IEventEmitter
import typingsJapgolly.playable.distSrcModulesPlaybackEngineTypesMod.IPlaybackEngine
import typingsJapgolly.playable.distSrcModulesRootContainerTypesMod.IRootContainer
import typingsJapgolly.playable.distSrcModulesUiCoreThemeTypesMod.IThemeService
import typingsJapgolly.playable.distSrcModulesUiLoaderTypesMod.ILoader
import typingsJapgolly.playable.distSrcModulesUiMainUiBlockTypesMod.IMainUIBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loader extends StObject {
  
  var config: IPlayerConfig
  
  var engine: IPlaybackEngine
  
  var eventEmitter: IEventEmitter
  
  var loader: ILoader
  
  var mainUIBlock: IMainUIBlock
  
  var rootContainer: IRootContainer
  
  var theme: IThemeService
}
object Loader {
  
  inline def apply(
    config: IPlayerConfig,
    engine: IPlaybackEngine,
    eventEmitter: IEventEmitter,
    loader: ILoader,
    mainUIBlock: IMainUIBlock,
    rootContainer: IRootContainer,
    theme: IThemeService
  ): Loader = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], mainUIBlock = mainUIBlock.asInstanceOf[js.Any], rootContainer = rootContainer.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loader]
  }
  
  extension [Self <: Loader](x: Self) {
    
    inline def setConfig(value: IPlayerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    inline def setLoader(value: ILoader): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setMainUIBlock(value: IMainUIBlock): Self = StObject.set(x, "mainUIBlock", value.asInstanceOf[js.Any])
    
    inline def setRootContainer(value: IRootContainer): Self = StObject.set(x, "rootContainer", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
