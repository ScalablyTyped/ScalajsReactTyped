package typingsJapgolly.nextEnv

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nextEnv.anon.CombinedEnv
import typingsJapgolly.nextEnv.anon.Contents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@next/env", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadEnvConfig(dir: String): CombinedEnv = ^.asInstanceOf[js.Dynamic].applyDynamic("loadEnvConfig")(dir.asInstanceOf[js.Any]).asInstanceOf[CombinedEnv]
  inline def loadEnvConfig(dir: String, dev: Boolean): CombinedEnv = (^.asInstanceOf[js.Dynamic].applyDynamic("loadEnvConfig")(dir.asInstanceOf[js.Any], dev.asInstanceOf[js.Any])).asInstanceOf[CombinedEnv]
  inline def loadEnvConfig(dir: String, dev: Boolean, log: Unit, forceReload: Boolean): CombinedEnv = (^.asInstanceOf[js.Dynamic].applyDynamic("loadEnvConfig")(dir.asInstanceOf[js.Any], dev.asInstanceOf[js.Any], log.asInstanceOf[js.Any], forceReload.asInstanceOf[js.Any])).asInstanceOf[CombinedEnv]
  inline def loadEnvConfig(dir: String, dev: Boolean, log: Log): CombinedEnv = (^.asInstanceOf[js.Dynamic].applyDynamic("loadEnvConfig")(dir.asInstanceOf[js.Any], dev.asInstanceOf[js.Any], log.asInstanceOf[js.Any])).asInstanceOf[CombinedEnv]
  inline def loadEnvConfig(dir: String, dev: Boolean, log: Log, forceReload: Boolean): CombinedEnv = (^.asInstanceOf[js.Dynamic].applyDynamic("loadEnvConfig")(dir.asInstanceOf[js.Any], dev.asInstanceOf[js.Any], log.asInstanceOf[js.Any], forceReload.asInstanceOf[js.Any])).asInstanceOf[CombinedEnv]
  inline def loadEnvConfig(dir: String, dev: Unit, log: Unit, forceReload: Boolean): CombinedEnv = (^.asInstanceOf[js.Dynamic].applyDynamic("loadEnvConfig")(dir.asInstanceOf[js.Any], dev.asInstanceOf[js.Any], log.asInstanceOf[js.Any], forceReload.asInstanceOf[js.Any])).asInstanceOf[CombinedEnv]
  inline def loadEnvConfig(dir: String, dev: Unit, log: Log): CombinedEnv = (^.asInstanceOf[js.Dynamic].applyDynamic("loadEnvConfig")(dir.asInstanceOf[js.Any], dev.asInstanceOf[js.Any], log.asInstanceOf[js.Any])).asInstanceOf[CombinedEnv]
  inline def loadEnvConfig(dir: String, dev: Unit, log: Log, forceReload: Boolean): CombinedEnv = (^.asInstanceOf[js.Dynamic].applyDynamic("loadEnvConfig")(dir.asInstanceOf[js.Any], dev.asInstanceOf[js.Any], log.asInstanceOf[js.Any], forceReload.asInstanceOf[js.Any])).asInstanceOf[CombinedEnv]
  
  inline def processEnv(loadedEnvFiles: LoadedEnvFiles): Env = ^.asInstanceOf[js.Dynamic].applyDynamic("processEnv")(loadedEnvFiles.asInstanceOf[js.Any]).asInstanceOf[Env]
  inline def processEnv(loadedEnvFiles: LoadedEnvFiles, dir: String): Env = (^.asInstanceOf[js.Dynamic].applyDynamic("processEnv")(loadedEnvFiles.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[Env]
  inline def processEnv(loadedEnvFiles: LoadedEnvFiles, dir: String, log: Unit, forceReload: Boolean): Env = (^.asInstanceOf[js.Dynamic].applyDynamic("processEnv")(loadedEnvFiles.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], log.asInstanceOf[js.Any], forceReload.asInstanceOf[js.Any])).asInstanceOf[Env]
  inline def processEnv(loadedEnvFiles: LoadedEnvFiles, dir: String, log: Log): Env = (^.asInstanceOf[js.Dynamic].applyDynamic("processEnv")(loadedEnvFiles.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], log.asInstanceOf[js.Any])).asInstanceOf[Env]
  inline def processEnv(loadedEnvFiles: LoadedEnvFiles, dir: String, log: Log, forceReload: Boolean): Env = (^.asInstanceOf[js.Dynamic].applyDynamic("processEnv")(loadedEnvFiles.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], log.asInstanceOf[js.Any], forceReload.asInstanceOf[js.Any])).asInstanceOf[Env]
  inline def processEnv(loadedEnvFiles: LoadedEnvFiles, dir: Unit, log: Unit, forceReload: Boolean): Env = (^.asInstanceOf[js.Dynamic].applyDynamic("processEnv")(loadedEnvFiles.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], log.asInstanceOf[js.Any], forceReload.asInstanceOf[js.Any])).asInstanceOf[Env]
  inline def processEnv(loadedEnvFiles: LoadedEnvFiles, dir: Unit, log: Log): Env = (^.asInstanceOf[js.Dynamic].applyDynamic("processEnv")(loadedEnvFiles.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], log.asInstanceOf[js.Any])).asInstanceOf[Env]
  inline def processEnv(loadedEnvFiles: LoadedEnvFiles, dir: Unit, log: Log, forceReload: Boolean): Env = (^.asInstanceOf[js.Dynamic].applyDynamic("processEnv")(loadedEnvFiles.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], log.asInstanceOf[js.Any], forceReload.asInstanceOf[js.Any])).asInstanceOf[Env]
  
  type Env = StringDictionary[js.UndefOr[String]]
  
  type LoadedEnvFiles = js.Array[Contents]
  
  trait Log extends StObject {
    
    def error(args: Any*): Unit
    
    def info(args: Any*): Unit
  }
  object Log {
    
    inline def apply(error: /* repeated */ Any => Callback, info: /* repeated */ Any => Callback): Log = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: /* repeated */ Any) => error(t0).runNow()), info = js.Any.fromFunction1((t0: /* repeated */ Any) => info(t0).runNow()))
      __obj.asInstanceOf[Log]
    }
    
    extension [Self <: Log](x: Self) {
      
      inline def setError(value: /* repeated */ Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setInfo(value: /* repeated */ Any => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    }
  }
}
