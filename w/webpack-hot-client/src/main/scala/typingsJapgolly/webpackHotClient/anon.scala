package typingsJapgolly.webpackHotClient

import typingsJapgolly.node.netMod.Server
import typingsJapgolly.webpackHotClient.mod.WebpackHotHost
import typingsJapgolly.webpackHotClient.webpackHotClientStrings.debug
import typingsJapgolly.webpackHotClient.webpackHotClientStrings.error
import typingsJapgolly.webpackHotClient.webpackHotClientStrings.info
import typingsJapgolly.webpackHotClient.webpackHotClientStrings.silent
import typingsJapgolly.webpackHotClient.webpackHotClientStrings.trace
import typingsJapgolly.webpackHotClient.webpackHotClientStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<webpack-hot-client.webpack-hot-client.Options> */
  trait ReadonlyOptions extends StObject {
    
    val allEntries: js.UndefOr[Boolean] = js.undefined
    
    val autoConfigure: js.UndefOr[Boolean] = js.undefined
    
    val hmr: js.UndefOr[Boolean] = js.undefined
    
    val host: js.UndefOr[WebpackHotHost | String] = js.undefined
    
    val https: js.UndefOr[Boolean] = js.undefined
    
    val logLevel: js.UndefOr[trace | debug | info | warn | error | silent] = js.undefined
    
    val logTime: js.UndefOr[Boolean] = js.undefined
    
    val port: js.UndefOr[Double] = js.undefined
    
    val reload: js.UndefOr[Boolean] = js.undefined
    
    val server: js.UndefOr[Server] = js.undefined
    
    val stats: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.Stats */ Any
      ] = js.undefined
    
    val validTargets: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ReadonlyOptions {
    
    inline def apply(): ReadonlyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyOptions]
    }
    
    extension [Self <: ReadonlyOptions](x: Self) {
      
      inline def setAllEntries(value: Boolean): Self = StObject.set(x, "allEntries", value.asInstanceOf[js.Any])
      
      inline def setAllEntriesUndefined: Self = StObject.set(x, "allEntries", js.undefined)
      
      inline def setAutoConfigure(value: Boolean): Self = StObject.set(x, "autoConfigure", value.asInstanceOf[js.Any])
      
      inline def setAutoConfigureUndefined: Self = StObject.set(x, "autoConfigure", js.undefined)
      
      inline def setHmr(value: Boolean): Self = StObject.set(x, "hmr", value.asInstanceOf[js.Any])
      
      inline def setHmrUndefined: Self = StObject.set(x, "hmr", js.undefined)
      
      inline def setHost(value: WebpackHotHost | String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      inline def setLogLevel(value: trace | debug | info | warn | error | silent): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setLogTime(value: Boolean): Self = StObject.set(x, "logTime", value.asInstanceOf[js.Any])
      
      inline def setLogTimeUndefined: Self = StObject.set(x, "logTime", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setReload(value: Boolean): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
      
      inline def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
      
      inline def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      inline def setStats(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Options.Stats */ Any
      ): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setValidTargets(value: js.Array[String]): Self = StObject.set(x, "validTargets", value.asInstanceOf[js.Any])
      
      inline def setValidTargetsUndefined: Self = StObject.set(x, "validTargets", js.undefined)
      
      inline def setValidTargetsVarargs(value: String*): Self = StObject.set(x, "validTargets", js.Array(value*))
    }
  }
}
