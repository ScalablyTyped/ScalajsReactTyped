package typingsJapgolly.webpackDevServer.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.bonjourService.mod.Service
import typingsJapgolly.connectHistoryApiFallback.mod.Options
import typingsJapgolly.express.mod.ErrorRequestHandler
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.httpProxyMiddleware.distTypesMod.Filter
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.std.Record
import typingsJapgolly.webpackDevMiddleware.mod.Context
import typingsJapgolly.webpackDevServer.anon.ConnectionsendWebSocketse
import typingsJapgolly.webpackDevServer.anon.IsAlive
import typingsJapgolly.webpackDevServer.anon.Key
import typingsJapgolly.webpackDevServer.anon.ServercloseWebSocketServe
import typingsJapgolly.webpackDevServer.webpackDevServerStrings.auto
import typingsJapgolly.webpackDevServer.webpackDevServerStrings.v4
import typingsJapgolly.webpackDevServer.webpackDevServerStrings.v6
import typingsJapgolly.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * @returns {string}
  */
/* static member */
inline def findCacheDir(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("findCacheDir")().asInstanceOf[String]

/**
  * @param {string} gateway
  * @returns {string | undefined}
  */
/* static member */
inline def findIp(gateway: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findIp")(gateway.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]

/**
  * @param {Port} port
  * @param {string} host
  * @returns {Promise<number | string>}
  */
/* static member */
inline def getFreePort(port: Port, host: String): js.Promise[Double | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFreePort")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double | String]]

/**
  * @param {Host} hostname
  * @returns {Promise<string>}
  */
/* static member */
inline def getHostname(hostname: Host): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostname")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]

/**
  * @param {"v4" | "v6"} family
  * @returns {Promise<string | undefined>}
  */
/* static member */
inline def internalIP(family: v4 | v6): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("internalIP")(family.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]

/**
  * @param {"v4" | "v6"} family
  * @returns {string | undefined}
  */
/* static member */
inline def internalIPSync(family: v4 | v6): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("internalIPSync")(family.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]

/**
  * @param {string} URL
  * @returns {boolean}
  */
/* static member */
inline def isAbsoluteURL(URL: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAbsoluteURL")(URL.asInstanceOf[js.Any]).asInstanceOf[Boolean]

type Bonjour = typingsJapgolly.bonjourService.mod.Bonjour

type BonjourOptions = Service

type ByPass = js.Function3[
/* req */ org.scalajs.dom.Request, 
/* res */ org.scalajs.dom.Response, 
/* proxyConfig */ ProxyConfigArrayItem, 
Any]

type ClientConnection = (WebSocket & IsAlive) | ConnectionsendWebSocketse

type Compiler = typingsJapgolly.webpack.mod.Compiler

type ConnectHistoryApiFallbackOptions = Options

type DevMiddlewareContext[Request_1, Response_1] = Context[org.scalajs.dom.Request, org.scalajs.dom.Response]

type DevMiddlewareOptions[Request_1, Response_1] = typingsJapgolly.webpackDevMiddleware.mod.Options[org.scalajs.dom.Request, org.scalajs.dom.Response]

// DO NOT REMOVE THIS!
type DevServerConfiguration = Configuration

type ExpressErrorRequestHandler = ErrorRequestHandler[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]]

type ExpressRequestHandler = typingsJapgolly.express.mod.RequestHandler[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]]

type FSWatcher = typingsJapgolly.chokidar.mod.FSWatcher

type Headers = js.Array[Key] | (Record[String, String | js.Array[String]])

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webpackDevServer.webpackDevServerStrings.`local-ip`
  - typingsJapgolly.webpackDevServer.webpackDevServerStrings.`local-ipv4`
  - typingsJapgolly.webpackDevServer.webpackDevServerStrings.`local-ipv6`
  - java.lang.String
*/
type Host = _Host | String

type HttpProxyMiddlewareOptions = typingsJapgolly.httpProxyMiddleware.distTypesMod.Options

type HttpProxyMiddlewareOptionsFilter = Filter

type IPv4 = typingsJapgolly.ipaddrJs.mod.IPv4

type IPv6 = typingsJapgolly.ipaddrJs.mod.IPv6

type IncomingMessage = typingsJapgolly.node.httpMod.IncomingMessage

type Middleware = typingsJapgolly.webpackDevServer.anon.Middleware | ExpressRequestHandler | ExpressErrorRequestHandler

type MultiCompiler = typingsJapgolly.webpack.mod.MultiCompiler

type MultiStats = typingsJapgolly.webpack.mod.MultiStats

type NetworkInterfaceInfo = typingsJapgolly.node.osMod.NetworkInterfaceInfo

type NextFunction = typingsJapgolly.express.mod.NextFunction

type OpenOptions = typingsJapgolly.open.mod.Options

type Port = Double | String | auto

type ProxyConfigArray = js.Array[
ProxyConfigArrayItem | (js.Function3[
  /* req */ js.UndefOr[org.scalajs.dom.Request], 
  /* res */ js.UndefOr[org.scalajs.dom.Response], 
  /* next */ js.UndefOr[NextFunction], 
  ProxyConfigArrayItem
])]

type ProxyConfigMap = StringDictionary[String | ProxyConfigArrayItem]

type Request = Request_[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
Any, 
Any, 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
Record[String, Any]]

type RequestHandler = typingsJapgolly.httpProxyMiddleware.distTypesMod.RequestHandler

type Response = Response_[Any, Record[String, Any]]

type Schema = typingsJapgolly.schemaUtils.declarationsValidateMod.Schema

type ServeIndexOptions = typingsJapgolly.serveIndex.mod.Options

type ServeStaticOptions = typingsJapgolly.serveStatic.mod.ServeStaticOptions[ServerResponse[typingsJapgolly.node.httpMod.IncomingMessage]]

type Socket = typingsJapgolly.node.netMod.Socket

type Stats = typingsJapgolly.webpack.mod.Stats

type StatsCompilation = typingsJapgolly.webpack.mod.StatsCompilation

type StatsOptions = typingsJapgolly.webpack.mod.StatsOptions

type WatchOptions = typingsJapgolly.chokidar.mod.WatchOptions

type WebSocketServer = typingsJapgolly.ws.mod.WebSocketServer | ServercloseWebSocketServe

type WebpackConfiguration = typingsJapgolly.webpack.mod.Configuration
