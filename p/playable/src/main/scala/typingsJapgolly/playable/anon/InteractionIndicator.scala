package typingsJapgolly.playable.anon

import typingsJapgolly.playable.distSrcCoreConfigMod.IPlayerConfig
import typingsJapgolly.playable.distSrcModulesEventEmitterTypesMod.IEventEmitter
import typingsJapgolly.playable.distSrcModulesFullScreenManagerTypesMod.IFullScreenManager
import typingsJapgolly.playable.distSrcModulesPlaybackEngineTypesMod.IPlaybackEngine
import typingsJapgolly.playable.distSrcModulesRootContainerTypesMod.IRootContainer
import typingsJapgolly.playable.distSrcModulesUiInteractionIndicatorTypesMod.IInteractionIndicator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionIndicator extends StObject {
  
  var config: IPlayerConfig
  
  var engine: IPlaybackEngine
  
  var eventEmitter: IEventEmitter
  
  var fullScreenManager: IFullScreenManager
  
  var interactionIndicator: IInteractionIndicator
  
  var rootContainer: IRootContainer
}
object InteractionIndicator {
  
  inline def apply(
    config: IPlayerConfig,
    engine: IPlaybackEngine,
    eventEmitter: IEventEmitter,
    fullScreenManager: IFullScreenManager,
    interactionIndicator: IInteractionIndicator,
    rootContainer: IRootContainer
  ): InteractionIndicator = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], fullScreenManager = fullScreenManager.asInstanceOf[js.Any], interactionIndicator = interactionIndicator.asInstanceOf[js.Any], rootContainer = rootContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionIndicator]
  }
  
  extension [Self <: InteractionIndicator](x: Self) {
    
    inline def setConfig(value: IPlayerConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    inline def setFullScreenManager(value: IFullScreenManager): Self = StObject.set(x, "fullScreenManager", value.asInstanceOf[js.Any])
    
    inline def setInteractionIndicator(value: IInteractionIndicator): Self = StObject.set(x, "interactionIndicator", value.asInstanceOf[js.Any])
    
    inline def setRootContainer(value: IRootContainer): Self = StObject.set(x, "rootContainer", value.asInstanceOf[js.Any])
  }
}
