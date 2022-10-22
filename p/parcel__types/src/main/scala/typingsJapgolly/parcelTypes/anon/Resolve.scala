package typingsJapgolly.parcelTypes.anon

import typingsJapgolly.parcelTypes.mod.FilePath
import typingsJapgolly.parcelTypes.mod.PluginLogger
import typingsJapgolly.parcelTypes.mod.PluginOptions
import typingsJapgolly.parcelTypes.mod.ResolveFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resolve[ConfigType] extends StObject {
  
  var asset: typingsJapgolly.parcelTypes.mod.Asset
  
  var config: ConfigType
  
  var logger: PluginLogger
  
  var options: PluginOptions
  
  def resolve(from: FilePath, to: String): js.Promise[FilePath]
  @JSName("resolve")
  var resolve_Original: ResolveFn
}
object Resolve {
  
  inline def apply[ConfigType](
    asset: typingsJapgolly.parcelTypes.mod.Asset,
    config: ConfigType,
    logger: PluginLogger,
    options: PluginOptions,
    resolve: (/* from */ FilePath, /* to */ String) => js.Promise[FilePath]
  ): Resolve[ConfigType] = {
    val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], resolve = js.Any.fromFunction2(resolve))
    __obj.asInstanceOf[Resolve[ConfigType]]
  }
  
  extension [Self <: Resolve[?], ConfigType](x: Self & Resolve[ConfigType]) {
    
    inline def setAsset(value: typingsJapgolly.parcelTypes.mod.Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: ConfigType): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: PluginLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setResolve(value: (/* from */ FilePath, /* to */ String) => js.Promise[FilePath]): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
  }
}
