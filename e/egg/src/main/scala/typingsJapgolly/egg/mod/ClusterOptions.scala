package typingsJapgolly.egg.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterOptions
  extends StObject
     with /* prop */ StringDictionary[Any] {
  
  /** directory of application, default to `process.cwd()` */
  var baseDir: js.UndefOr[String] = js.undefined
  
  /** ssl cert */
  var cert: js.UndefOr[String] = js.undefined
  
  /** specify framework that can be absolute path or npm package */
  var framework: js.UndefOr[String] = js.undefined
  
  /** https or not */
  var https: js.UndefOr[Boolean] = js.undefined
  
  /** ssl key */
  var key: js.UndefOr[String] = js.undefined
  
  /** customized plugins, for unittest */
  var plugins: js.UndefOr[js.Object | Null] = js.undefined
  
  /** listening port, default to 7001(http) or 8443(https) */
  var port: js.UndefOr[Double] = js.undefined
  
  /** numbers of app workers, default to `os.cpus().length` */
  var workers: js.UndefOr[Double] = js.undefined
}
object ClusterOptions {
  
  inline def apply(): ClusterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOptions]
  }
  
  extension [Self <: ClusterOptions](x: Self) {
    
    inline def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
    
    inline def setBaseDirUndefined: Self = StObject.set(x, "baseDir", js.undefined)
    
    inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    inline def setFramework(value: String): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    inline def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
    
    inline def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setPlugins(value: js.Object): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsNull: Self = StObject.set(x, "plugins", null)
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setWorkers(value: Double): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
    
    inline def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
  }
}
