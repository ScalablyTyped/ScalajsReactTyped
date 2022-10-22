package typingsJapgolly.parcelTypes.anon

import typingsJapgolly.parcelTypes.mod.ConfigResult
import typingsJapgolly.parcelTypes.mod.PluginLogger
import typingsJapgolly.parcelTypes.mod.PluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Asset extends StObject {
  
  var asset: typingsJapgolly.parcelTypes.mod.Asset
  
  var config: ConfigResult | Unit
  
  var logger: PluginLogger
  
  var options: PluginOptions
}
object Asset {
  
  inline def apply(
    asset: typingsJapgolly.parcelTypes.mod.Asset,
    config: ConfigResult | Unit,
    logger: PluginLogger,
    options: PluginOptions
  ): Asset = {
    val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asset]
  }
  
  extension [Self <: Asset](x: Self) {
    
    inline def setAsset(value: typingsJapgolly.parcelTypes.mod.Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: ConfigResult | Unit): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: PluginLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
