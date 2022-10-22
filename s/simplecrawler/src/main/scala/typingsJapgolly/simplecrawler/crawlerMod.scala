package typingsJapgolly.simplecrawler

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.httpMod.Agent
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.simplecrawler.anon.Dictkey
import typingsJapgolly.simplecrawler.cacheMod.default
import typingsJapgolly.simplecrawler.queueMod.QueueItem
import typingsJapgolly.simplecrawler.simplecrawlerStrings.complete
import typingsJapgolly.simplecrawler.simplecrawlerStrings.cookieerror
import typingsJapgolly.simplecrawler.simplecrawlerStrings.crawlstart
import typingsJapgolly.simplecrawler.simplecrawlerStrings.discoverycomplete
import typingsJapgolly.simplecrawler.simplecrawlerStrings.downloadconditionerror
import typingsJapgolly.simplecrawler.simplecrawlerStrings.downloadprevented
import typingsJapgolly.simplecrawler.simplecrawlerStrings.fetch404
import typingsJapgolly.simplecrawler.simplecrawlerStrings.fetch410
import typingsJapgolly.simplecrawler.simplecrawlerStrings.fetchclienterror
import typingsJapgolly.simplecrawler.simplecrawlerStrings.fetchcomplete
import typingsJapgolly.simplecrawler.simplecrawlerStrings.fetchconditionerror
import typingsJapgolly.simplecrawler.simplecrawlerStrings.fetchdataerror
import typingsJapgolly.simplecrawler.simplecrawlerStrings.fetchdisallowed
import typingsJapgolly.simplecrawler.simplecrawlerStrings.fetcherror
import typingsJapgolly.simplecrawler.simplecrawlerStrings.fetchheaders
import typingsJapgolly.simplecrawler.simplecrawlerStrings.fetchprevented
import typingsJapgolly.simplecrawler.simplecrawlerStrings.fetchredirect
import typingsJapgolly.simplecrawler.simplecrawlerStrings.fetchstart
import typingsJapgolly.simplecrawler.simplecrawlerStrings.fetchtimeout
import typingsJapgolly.simplecrawler.simplecrawlerStrings.gziperror
import typingsJapgolly.simplecrawler.simplecrawlerStrings.invaliddomain
import typingsJapgolly.simplecrawler.simplecrawlerStrings.notmodified
import typingsJapgolly.simplecrawler.simplecrawlerStrings.queueadd
import typingsJapgolly.simplecrawler.simplecrawlerStrings.queueduplicate
import typingsJapgolly.simplecrawler.simplecrawlerStrings.queueerror
import typingsJapgolly.simplecrawler.simplecrawlerStrings.robotstxterror
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crawlerMod {
  
  @JSImport("simplecrawler/crawler", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Crawler {
    def this(initialURL: String) = this()
  }
  
  @js.native
  trait Crawler extends EventEmitter {
    
    var acceptCookies: Boolean = js.native
    
    def addDownloadCondition(callback: js.Function2[/* queueItem */ QueueItem, /* response */ IncomingMessage, Unit]): Double = js.native
    
    def addFetchCondition(callback: js.Function2[/* queueItem */ QueueItem, /* referrerQueueItem */ QueueItem, Unit]): Double = js.native
    
    var allowInitialDomainChange: Boolean = js.native
    
    var allowedProtocols: js.Array[js.RegExp] = js.native
    
    var authPass: js.UndefOr[String] = js.native
    
    var authUser: js.UndefOr[String] = js.native
    
    var cache: js.UndefOr[default] = js.native
    
    def cleanExpandResources(urlMatch: js.Array[String], queueItem: QueueItem): js.Array[String] = js.native
    
    def cleanURL(url: String, queueItem: QueueItem): String = js.native
    
    var cookies: typingsJapgolly.simplecrawler.cookiesMod.default = js.native
    
    /**
      * @deprecated
      */
    def crawl(): scala.Nothing = js.native
    
    var customHeaders: js.Object = js.native
    
    def decodeBuffer(buffer: Buffer): String = js.native
    def decodeBuffer(buffer: Buffer, contentTypeHeader: String): String = js.native
    
    var decodeResponses: Boolean = js.native
    
    var decompressResponses: Boolean = js.native
    
    var discoverRegex: js.Array[js.Function0[Unit] | js.RegExp] = js.native
    
    def discoverResources(resourceText: String): js.Array[String] = js.native
    
    def domainValid(host: String): Boolean = js.native
    
    var domainWhitelist: js.Array[String] = js.native
    
    var downloadUnsupported: Boolean = js.native
    
    def fetchQueueItem(queueItem: QueueItem): this.type = js.native
    
    var filterByDomain: Boolean = js.native
    
    def getRequestOptions(queueItem: QueueItem): RequestOptions = js.native
    
    def getRobotsTxt(
      url: String,
      callback: js.Function3[
          /* error */ js.UndefOr[js.Error], 
          /* href */ js.UndefOr[String], 
          /* responseBody */ js.UndefOr[String], 
          Unit
        ]
    ): this.type = js.native
    
    def handleResponse(queueItem: QueueItem, response: IncomingMessage): String = js.native
    def handleResponse(queueItem: QueueItem, response: IncomingMessage, timeCommenced: js.Date): String = js.native
    
    var host: String = js.native
    
    var httpAgent: Agent = js.native
    
    var httpsAgent: typingsJapgolly.node.httpsMod.Agent = js.native
    
    var ignoreInvalidSSL: Boolean = js.native
    
    var ignoreWWWDomain: Boolean = js.native
    
    var initialURL: String = js.native
    
    var interval: Double = js.native
    
    var listenerTTL: Double = js.native
    
    var maxConcurrency: Double = js.native
    
    var maxDepth: Double = js.native
    
    var maxResourceSize: Double = js.native
    
    def mimeTypeSupported(mimetype: String): Boolean = js.native
    
    var needsAuth: Boolean = js.native
    
    def on(event: crawlstart | complete, listener: js.Function0[Unit]): this.type = js.native
    def on(
      event: invaliddomain | fetchdisallowed | queueduplicate,
      listener: js.Function1[/* queueItem */ QueueItem, Unit]
    ): this.type = js.native
    def on(
      event: downloadconditionerror | downloadprevented | fetch404 | fetch410 | fetchconditionerror | fetchdataerror | fetcherror | fetchheaders,
      listener: js.Function2[
          /* queueItem */ QueueItem, 
          (/* error */ Any) | (/* response */ IncomingMessage), 
          Unit
        ]
    ): this.type = js.native
    def on(
      event: fetchcomplete | gziperror,
      listener: js.Function3[
          /* queueItem */ QueueItem, 
          /* responseBody */ String | Buffer, 
          /* response */ IncomingMessage, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_cookieerror(
      event: cookieerror,
      listener: js.Function3[/* queueItem */ QueueItem, /* error */ js.Error, /* cookie */ String, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_discoverycomplete(
      event: discoverycomplete,
      listener: js.Function2[/* queueItem */ QueueItem, /* resources */ js.Array[String], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetchclienterror(
      event: fetchclienterror,
      listener: js.Function2[/* queueItem */ QueueItem, /* error */ js.UndefOr[js.Object], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetchprevented(
      event: fetchprevented,
      listener: js.Function2[/* queueItem */ QueueItem, /* fetchCondition */ js.Function0[Boolean], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetchredirect(
      event: fetchredirect,
      listener: js.Function3[
          /* queueItem */ QueueItem, 
          /* redirectQueueItem */ QueueItem, 
          /* response */ IncomingMessage, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_fetchstart(
      event: fetchstart,
      listener: js.Function2[/* queueItem */ QueueItem, /* requestOptions */ RequestOptions, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetchtimeout(event: fetchtimeout, listener: js.Function2[/* queueItem */ QueueItem, /* timeout */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_notmodified(
      event: notmodified,
      listener: js.Function3[
          /* queueItem */ QueueItem, 
          /* response */ IncomingMessage, 
          /* cacheObject */ default, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_queueadd(
      event: queueadd,
      listener: js.Function2[/* queueItem */ js.UndefOr[QueueItem], /* referrer */ js.UndefOr[QueueItem], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_queueerror(
      event: queueerror,
      listener: js.Function2[/* error */ js.UndefOr[QueueItem], /* queueItem */ js.UndefOr[QueueItem], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_robotstxterror(event: robotstxterror, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    
    var parseHTMLComments: Boolean = js.native
    
    var parseScriptTags: Boolean = js.native
    
    def processURL(url: String): QueueItem = js.native
    def processURL(url: String, referer: QueueItem): QueueItem = js.native
    
    def protocolSupported(url: String): Boolean = js.native
    
    var proxyHostname: String = js.native
    
    var proxyPass: js.UndefOr[String] = js.native
    
    var proxyPort: Double = js.native
    
    var proxyUser: js.UndefOr[String] = js.native
    
    var queue: typingsJapgolly.simplecrawler.queueMod.default = js.native
    
    def queueLinkedItems(resourceData: String, queueItem: QueueItem): this.type = js.native
    def queueLinkedItems(resourceData: Buffer, queueItem: QueueItem): this.type = js.native
    
    def queueURL(url: String): Boolean = js.native
    def queueURL(url: String, referrer: Unit, force: Boolean): Boolean = js.native
    def queueURL(url: String, referrer: QueueItem): Boolean = js.native
    def queueURL(url: String, referrer: QueueItem, force: Boolean): Boolean = js.native
    
    def removeDownloadCondition(id: js.Function0[Unit]): Boolean = js.native
    def removeDownloadCondition(id: Double): Boolean = js.native
    
    def removeFetchCondition(id: js.Function0[Unit]): Boolean = js.native
    def removeFetchCondition(id: Double): Boolean = js.native
    
    var respectRobotsTxt: Boolean = js.native
    
    var scanSubdomains: Boolean = js.native
    
    var sortQueryParameters: Boolean = js.native
    
    def start(): this.type = js.native
    
    def stop(): this.type = js.native
    def stop(abortRequestsInFlight: Boolean): this.type = js.native
    
    var stripQuerystring: Boolean = js.native
    
    var stripWWWDomain: Boolean = js.native
    
    var supportedMimeTypes: js.Array[String | js.RegExp] = js.native
    
    var timeout: Double = js.native
    
    var urlEncoding: String = js.native
    
    def urlIsAllowed(url: String): Boolean = js.native
    
    var useProxy: Boolean = js.native
    
    var userAgent: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.simplecrawler.simplecrawlerStrings.GET
    - typingsJapgolly.simplecrawler.simplecrawlerStrings.POST
    - typingsJapgolly.simplecrawler.simplecrawlerStrings.HEAD
    - typingsJapgolly.simplecrawler.simplecrawlerStrings.PUT
    - typingsJapgolly.simplecrawler.simplecrawlerStrings.DELETE
    - typingsJapgolly.simplecrawler.simplecrawlerStrings.CONNECT
    - typingsJapgolly.simplecrawler.simplecrawlerStrings.OPTIONS
    - typingsJapgolly.simplecrawler.simplecrawlerStrings.TRACE
    - typingsJapgolly.simplecrawler.simplecrawlerStrings.PATCH
  */
  trait HTTPMethods extends StObject
  object HTTPMethods {
    
    inline def CONNECT: typingsJapgolly.simplecrawler.simplecrawlerStrings.CONNECT = "CONNECT".asInstanceOf[typingsJapgolly.simplecrawler.simplecrawlerStrings.CONNECT]
    
    inline def DELETE: typingsJapgolly.simplecrawler.simplecrawlerStrings.DELETE = "DELETE".asInstanceOf[typingsJapgolly.simplecrawler.simplecrawlerStrings.DELETE]
    
    inline def GET: typingsJapgolly.simplecrawler.simplecrawlerStrings.GET = "GET".asInstanceOf[typingsJapgolly.simplecrawler.simplecrawlerStrings.GET]
    
    inline def HEAD: typingsJapgolly.simplecrawler.simplecrawlerStrings.HEAD = "HEAD".asInstanceOf[typingsJapgolly.simplecrawler.simplecrawlerStrings.HEAD]
    
    inline def OPTIONS: typingsJapgolly.simplecrawler.simplecrawlerStrings.OPTIONS = "OPTIONS".asInstanceOf[typingsJapgolly.simplecrawler.simplecrawlerStrings.OPTIONS]
    
    inline def PATCH: typingsJapgolly.simplecrawler.simplecrawlerStrings.PATCH = "PATCH".asInstanceOf[typingsJapgolly.simplecrawler.simplecrawlerStrings.PATCH]
    
    inline def POST: typingsJapgolly.simplecrawler.simplecrawlerStrings.POST = "POST".asInstanceOf[typingsJapgolly.simplecrawler.simplecrawlerStrings.POST]
    
    inline def PUT: typingsJapgolly.simplecrawler.simplecrawlerStrings.PUT = "PUT".asInstanceOf[typingsJapgolly.simplecrawler.simplecrawlerStrings.PUT]
    
    inline def TRACE: typingsJapgolly.simplecrawler.simplecrawlerStrings.TRACE = "TRACE".asInstanceOf[typingsJapgolly.simplecrawler.simplecrawlerStrings.TRACE]
  }
  
  trait RequestOptions extends StObject {
    
    var agent: Agent | typingsJapgolly.node.httpsMod.Agent
    
    var headers: Dictkey
    
    var host: String
    
    var method: HTTPMethods
    
    var port: js.UndefOr[Double] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(
      agent: Agent | typingsJapgolly.node.httpsMod.Agent,
      headers: Dictkey,
      host: String,
      method: HTTPMethods
    ): RequestOptions = {
      val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions]
    }
    
    extension [Self <: RequestOptions](x: Self) {
      
      inline def setAgent(value: Agent | typingsJapgolly.node.httpsMod.Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Dictkey): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: HTTPMethods): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
}
