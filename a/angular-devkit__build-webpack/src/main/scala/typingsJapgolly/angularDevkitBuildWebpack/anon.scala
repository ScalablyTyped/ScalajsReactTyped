package typingsJapgolly.angularDevkitBuildWebpack

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.v4
import typingsJapgolly.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.v6
import typingsJapgolly.angularDevkitBuildWebpack.srcWebpackDevServerMod.WebpackDevServerFactory
import typingsJapgolly.angularDevkitBuildWebpack.srcWebpackMod.WebpackFactory
import typingsJapgolly.angularDevkitBuildWebpack.srcWebpackMod.WebpackLoggingCallback
import typingsJapgolly.rxjs.mod.Observable_
import typingsJapgolly.webpack.mod.Compiler
import typingsJapgolly.webpack.mod.Stats
import typingsJapgolly.webpackDevServer.mod.Configuration
import typingsJapgolly.webpackDevServer.mod.DEFAULT_STATS
import typingsJapgolly.webpackDevServer.mod.Host
import typingsJapgolly.webpackDevServer.mod.Port
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DevServerConfig extends StObject {
    
    var devServerConfig: js.UndefOr[Configuration] = js.undefined
    
    var logging: js.UndefOr[WebpackLoggingCallback] = js.undefined
    
    var webpackDevServerFactory: js.UndefOr[WebpackDevServerFactory] = js.undefined
    
    var webpackFactory: js.UndefOr[WebpackFactory] = js.undefined
  }
  object DevServerConfig {
    
    inline def apply(): DevServerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DevServerConfig]
    }
    
    extension [Self <: DevServerConfig](x: Self) {
      
      inline def setDevServerConfig(value: Configuration): Self = StObject.set(x, "devServerConfig", value.asInstanceOf[js.Any])
      
      inline def setDevServerConfigUndefined: Self = StObject.set(x, "devServerConfig", js.undefined)
      
      inline def setLogging(value: (/* stats */ Stats, /* config */ typingsJapgolly.webpack.mod.Configuration) => Callback): Self = StObject.set(x, "logging", js.Any.fromFunction2((t0: /* stats */ Stats, t1: /* config */ typingsJapgolly.webpack.mod.Configuration) => (value(t0, t1)).runNow()))
      
      inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      inline def setWebpackDevServerFactory(value: WebpackDevServerFactory): Self = StObject.set(x, "webpackDevServerFactory", value.asInstanceOf[js.Any])
      
      inline def setWebpackDevServerFactoryUndefined: Self = StObject.set(x, "webpackDevServerFactory", js.undefined)
      
      inline def setWebpackFactory(value: /* config */ typingsJapgolly.webpack.mod.Configuration => Observable_[Compiler] | Compiler): Self = StObject.set(x, "webpackFactory", js.Any.fromFunction1(value))
      
      inline def setWebpackFactoryUndefined: Self = StObject.set(x, "webpackFactory", js.undefined)
    }
  }
  
  trait Logging extends StObject {
    
    var logging: js.UndefOr[WebpackLoggingCallback] = js.undefined
    
    var shouldProvideStats: js.UndefOr[Boolean] = js.undefined
    
    var webpackFactory: js.UndefOr[WebpackFactory] = js.undefined
  }
  object Logging {
    
    inline def apply(): Logging = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Logging]
    }
    
    extension [Self <: Logging](x: Self) {
      
      inline def setLogging(value: (/* stats */ Stats, /* config */ typingsJapgolly.webpack.mod.Configuration) => Callback): Self = StObject.set(x, "logging", js.Any.fromFunction2((t0: /* stats */ Stats, t1: /* config */ typingsJapgolly.webpack.mod.Configuration) => (value(t0, t1)).runNow()))
      
      inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      inline def setShouldProvideStats(value: Boolean): Self = StObject.set(x, "shouldProvideStats", value.asInstanceOf[js.Any])
      
      inline def setShouldProvideStatsUndefined: Self = StObject.set(x, "shouldProvideStats", js.undefined)
      
      inline def setWebpackFactory(value: /* config */ typingsJapgolly.webpack.mod.Configuration => Observable_[Compiler] | Compiler): Self = StObject.set(x, "webpackFactory", js.Any.fromFunction1(value))
      
      inline def setWebpackFactoryUndefined: Self = StObject.set(x, "webpackFactory", js.undefined)
    }
  }
  
  trait TypeofWebpackDevServer extends StObject {
    
    var DEFAULT_STATS: Instantiable0[typingsJapgolly.webpackDevServer.mod.DEFAULT_STATS]
    
    /**
      * @returns {string}
      */
    /* static member */
    def findCacheDir(): String
    
    /**
      * @param {string} gateway
      * @returns {string | undefined}
      */
    /* static member */
    def findIp(gateway: String): js.UndefOr[String]
    
    /**
      * @param {Port} port
      * @param {string} host
      * @returns {Promise<number | string>}
      */
    /* static member */
    def getFreePort(port: Port, host: String): js.Promise[Double | String]
    
    /**
      * @param {Host} hostname
      * @returns {Promise<string>}
      */
    /* static member */
    def getHostname(hostname: Host): js.Promise[String]
    
    /**
      * @param {"v4" | "v6"} family
      * @returns {Promise<string | undefined>}
      */
    /* static member */
    def internalIP(family: v4 | v6): js.Promise[js.UndefOr[String]]
    
    /**
      * @param {"v4" | "v6"} family
      * @returns {string | undefined}
      */
    /* static member */
    def internalIPSync(family: v4 | v6): js.UndefOr[String]
    
    /**
      * @param {string} URL
      * @returns {boolean}
      */
    /* static member */
    def isAbsoluteURL(URL: String): Boolean
  }
  object TypeofWebpackDevServer {
    
    inline def apply(
      DEFAULT_STATS: Instantiable0[DEFAULT_STATS],
      findCacheDir: CallbackTo[String],
      findIp: String => js.UndefOr[String],
      getFreePort: (Port, String) => js.Promise[Double | String],
      getHostname: Host => js.Promise[String],
      internalIP: v4 | v6 => js.Promise[js.UndefOr[String]],
      internalIPSync: v4 | v6 => js.UndefOr[String],
      isAbsoluteURL: String => Boolean
    ): TypeofWebpackDevServer = {
      val __obj = js.Dynamic.literal(DEFAULT_STATS = DEFAULT_STATS.asInstanceOf[js.Any], findCacheDir = findCacheDir.toJsFn, findIp = js.Any.fromFunction1(findIp), getFreePort = js.Any.fromFunction2(getFreePort), getHostname = js.Any.fromFunction1(getHostname), internalIP = js.Any.fromFunction1(internalIP), internalIPSync = js.Any.fromFunction1(internalIPSync), isAbsoluteURL = js.Any.fromFunction1(isAbsoluteURL))
      __obj.asInstanceOf[TypeofWebpackDevServer]
    }
    
    extension [Self <: TypeofWebpackDevServer](x: Self) {
      
      inline def setDEFAULT_STATS(value: Instantiable0[DEFAULT_STATS]): Self = StObject.set(x, "DEFAULT_STATS", value.asInstanceOf[js.Any])
      
      inline def setFindCacheDir(value: CallbackTo[String]): Self = StObject.set(x, "findCacheDir", value.toJsFn)
      
      inline def setFindIp(value: String => js.UndefOr[String]): Self = StObject.set(x, "findIp", js.Any.fromFunction1(value))
      
      inline def setGetFreePort(value: (Port, String) => js.Promise[Double | String]): Self = StObject.set(x, "getFreePort", js.Any.fromFunction2(value))
      
      inline def setGetHostname(value: Host => js.Promise[String]): Self = StObject.set(x, "getHostname", js.Any.fromFunction1(value))
      
      inline def setInternalIP(value: v4 | v6 => js.Promise[js.UndefOr[String]]): Self = StObject.set(x, "internalIP", js.Any.fromFunction1(value))
      
      inline def setInternalIPSync(value: v4 | v6 => js.UndefOr[String]): Self = StObject.set(x, "internalIPSync", js.Any.fromFunction1(value))
      
      inline def setIsAbsoluteURL(value: String => Boolean): Self = StObject.set(x, "isAbsoluteURL", js.Any.fromFunction1(value))
    }
  }
}
