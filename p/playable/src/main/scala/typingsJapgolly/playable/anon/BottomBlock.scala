package typingsJapgolly.playable.anon

import typingsJapgolly.playable.distSrcModulesChromecastManagerTypesMod.IChromecastManager
import typingsJapgolly.playable.distSrcModulesEventEmitterTypesMod.IEventEmitter
import typingsJapgolly.playable.distSrcModulesTextMapTypesMod.ITextMap
import typingsJapgolly.playable.distSrcModulesUiBottomBlockTypesMod.IBottomBlock
import typingsJapgolly.playable.distSrcModulesUiCoreThemeTypesMod.IThemeService
import typingsJapgolly.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomBlock extends StObject {
  
  var bottomBlock: IBottomBlock
  
  var chromecastManager: IChromecastManager
  
  var eventEmitter: IEventEmitter
  
  var textMap: ITextMap
  
  var theme: IThemeService
  
  var tooltipService: ITooltipService
}
object BottomBlock {
  
  inline def apply(
    bottomBlock: IBottomBlock,
    chromecastManager: IChromecastManager,
    eventEmitter: IEventEmitter,
    textMap: ITextMap,
    theme: IThemeService,
    tooltipService: ITooltipService
  ): BottomBlock = {
    val __obj = js.Dynamic.literal(bottomBlock = bottomBlock.asInstanceOf[js.Any], chromecastManager = chromecastManager.asInstanceOf[js.Any], eventEmitter = eventEmitter.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomBlock]
  }
  
  extension [Self <: BottomBlock](x: Self) {
    
    inline def setBottomBlock(value: IBottomBlock): Self = StObject.set(x, "bottomBlock", value.asInstanceOf[js.Any])
    
    inline def setChromecastManager(value: IChromecastManager): Self = StObject.set(x, "chromecastManager", value.asInstanceOf[js.Any])
    
    inline def setEventEmitter(value: IEventEmitter): Self = StObject.set(x, "eventEmitter", value.asInstanceOf[js.Any])
    
    inline def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
  }
}
