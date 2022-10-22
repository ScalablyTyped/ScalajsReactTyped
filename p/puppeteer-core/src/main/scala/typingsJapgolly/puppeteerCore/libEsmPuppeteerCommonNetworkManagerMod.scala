package typingsJapgolly.puppeteerCore

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.UserAgentMetadata
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonConnectionMod.CDPSession
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonEventEmitterMod.EventEmitter
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonFrameMod.Frame
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerCommonNetworkManagerMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/NetworkManager", "NetworkManager")
  @js.native
  open class NetworkManager protected () extends EventEmitter {
    def this(client: CDPSession, ignoreHTTPSErrors: Boolean, frameManager: FrameManager) = this()
    
    def authenticate(): js.Promise[Unit] = js.native
    def authenticate(credentials: Credentials): js.Promise[Unit] = js.native
    
    def emulateNetworkConditions(): js.Promise[Unit] = js.native
    def emulateNetworkConditions(networkConditions: NetworkConditions): js.Promise[Unit] = js.native
    
    def extraHTTPHeaders(): Record[String, String] = js.native
    
    /**
      * Initialize calls should avoid async dependencies between CDP calls as those
      * might not resolve until after the target is resumed causing a deadlock.
      */
    def initialize(): js.Promise[Unit] = js.native
    
    def numRequestsInProgress(): Double = js.native
    
    /* private */ var `private`: Any = js.native
    
    def setCacheEnabled(enabled: Boolean): js.Promise[Unit] = js.native
    
    def setExtraHTTPHeaders(extraHTTPHeaders: Record[String, String]): js.Promise[Unit] = js.native
    
    def setOfflineMode(value: Boolean): js.Promise[Unit] = js.native
    
    def setRequestInterception(value: Boolean): js.Promise[Unit] = js.native
    
    def setUserAgent(userAgent: String): js.Promise[Unit] = js.native
    def setUserAgent(userAgent: String, userAgentMetadata: UserAgentMetadata): js.Promise[Unit] = js.native
  }
  
  object NetworkManagerEmittedEvents {
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/NetworkManager", "NetworkManagerEmittedEvents.Request")
    @js.native
    val Request: js.Symbol = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/NetworkManager", "NetworkManagerEmittedEvents.RequestFailed")
    @js.native
    val RequestFailed: js.Symbol = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/NetworkManager", "NetworkManagerEmittedEvents.RequestFinished")
    @js.native
    val RequestFinished: js.Symbol = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/NetworkManager", "NetworkManagerEmittedEvents.RequestServedFromCache")
    @js.native
    val RequestServedFromCache: js.Symbol = js.native
    
    @JSImport("puppeteer-core/lib/esm/puppeteer/common/NetworkManager", "NetworkManagerEmittedEvents.Response")
    @js.native
    val Response: js.Symbol = js.native
  }
  
  trait Credentials extends StObject {
    
    var password: String
    
    var username: String
  }
  object Credentials {
    
    inline def apply(password: String, username: String): Credentials = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    extension [Self <: Credentials](x: Self) {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait FrameManager extends StObject {
    
    def frame(frameId: String): Frame | Null
  }
  object FrameManager {
    
    inline def apply(frame: String => Frame | Null): FrameManager = {
      val __obj = js.Dynamic.literal(frame = js.Any.fromFunction1(frame))
      __obj.asInstanceOf[FrameManager]
    }
    
    extension [Self <: FrameManager](x: Self) {
      
      inline def setFrame(value: String => Frame | Null): Self = StObject.set(x, "frame", js.Any.fromFunction1(value))
    }
  }
  
  trait InternalNetworkConditions
    extends StObject
       with NetworkConditions {
    
    var offline: Boolean
  }
  object InternalNetworkConditions {
    
    inline def apply(download: Double, latency: Double, offline: Boolean, upload: Double): InternalNetworkConditions = {
      val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalNetworkConditions]
    }
    
    extension [Self <: InternalNetworkConditions](x: Self) {
      
      inline def setOffline(value: Boolean): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
    }
  }
  
  trait NetworkConditions extends StObject {
    
    var download: Double
    
    var latency: Double
    
    var upload: Double
  }
  object NetworkConditions {
    
    inline def apply(download: Double, latency: Double, upload: Double): NetworkConditions = {
      val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkConditions]
    }
    
    extension [Self <: NetworkConditions](x: Self) {
      
      inline def setDownload(value: Double): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
      
      inline def setUpload(value: Double): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    }
  }
}
