package typingsJapgolly.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VueServeOptions
  extends StObject
     with ServeOptions {
  
  var configuration: js.UndefOr[String] = js.undefined
  
  var sourcemaps: js.UndefOr[Boolean] = js.undefined
  
  var ssl: js.UndefOr[Boolean] = js.undefined
}
object VueServeOptions {
  
  inline def apply(
    `--`: js.Array[String],
    address: String,
    devapp: Boolean,
    engine: String,
    lab: Boolean,
    labHost: String,
    labPort: Double,
    livereload: Boolean,
    open: Boolean,
    port: Double,
    proxy: Boolean
  ): VueServeOptions = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], devapp = devapp.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], lab = lab.asInstanceOf[js.Any], labHost = labHost.asInstanceOf[js.Any], labPort = labPort.asInstanceOf[js.Any], livereload = livereload.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueServeOptions]
  }
  
  extension [Self <: VueServeOptions](x: Self) {
    
    inline def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setSourcemaps(value: Boolean): Self = StObject.set(x, "sourcemaps", value.asInstanceOf[js.Any])
    
    inline def setSourcemapsUndefined: Self = StObject.set(x, "sourcemaps", js.undefined)
    
    inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
  }
}
