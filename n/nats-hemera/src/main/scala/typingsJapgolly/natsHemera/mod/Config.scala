package typingsJapgolly.natsHemera.mod

import typingsJapgolly.natsHemera.natsHemeraInts.`2000`
import typingsJapgolly.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var bloomrun: js.UndefOr[BloomrunConfig] = js.undefined
  
  var childLogger: js.UndefOr[Boolean] = js.undefined
  
  var errio: js.UndefOr[ErrioConfig] = js.undefined
  
  var load: js.UndefOr[LoadConfig] = js.undefined
  
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  
  var logger: js.UndefOr[Logger | Stream] = js.undefined
  
  var maxRecursion: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var pluginTimeout: js.UndefOr[Double] = js.undefined
  
  var prettyLog: js.UndefOr[Boolean] = js.undefined
  
  var tag: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[Double | `2000`] = js.undefined
  
  var traceLog: js.UndefOr[Boolean] = js.undefined
}
object Config {
  
  inline def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setBloomrun(value: BloomrunConfig): Self = StObject.set(x, "bloomrun", value.asInstanceOf[js.Any])
    
    inline def setBloomrunUndefined: Self = StObject.set(x, "bloomrun", js.undefined)
    
    inline def setChildLogger(value: Boolean): Self = StObject.set(x, "childLogger", value.asInstanceOf[js.Any])
    
    inline def setChildLoggerUndefined: Self = StObject.set(x, "childLogger", js.undefined)
    
    inline def setErrio(value: ErrioConfig): Self = StObject.set(x, "errio", value.asInstanceOf[js.Any])
    
    inline def setErrioUndefined: Self = StObject.set(x, "errio", js.undefined)
    
    inline def setLoad(value: LoadConfig): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setLogger(value: Logger | Stream): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setMaxRecursion(value: Double): Self = StObject.set(x, "maxRecursion", value.asInstanceOf[js.Any])
    
    inline def setMaxRecursionUndefined: Self = StObject.set(x, "maxRecursion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPluginTimeout(value: Double): Self = StObject.set(x, "pluginTimeout", value.asInstanceOf[js.Any])
    
    inline def setPluginTimeoutUndefined: Self = StObject.set(x, "pluginTimeout", js.undefined)
    
    inline def setPrettyLog(value: Boolean): Self = StObject.set(x, "prettyLog", value.asInstanceOf[js.Any])
    
    inline def setPrettyLogUndefined: Self = StObject.set(x, "prettyLog", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setTimeout(value: Double | `2000`): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTraceLog(value: Boolean): Self = StObject.set(x, "traceLog", value.asInstanceOf[js.Any])
    
    inline def setTraceLogUndefined: Self = StObject.set(x, "traceLog", js.undefined)
  }
}
