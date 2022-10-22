package typingsJapgolly.matrixAppserviceBridge

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.matrixAppserviceBridge.libComponentsMembershipQueueMod.ThinRequest
import typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.delete_
import typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.get_
import typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.post_
import typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.provisioner
import typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.put_
import typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.widget
import typingsJapgolly.matrixAppserviceBridge.mod.Logger
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProvisioningRequestMod {
  
  @JSImport("matrix-appservice-bridge/lib/provisioning/request", "ProvisioningRequest")
  @js.native
  open class ProvisioningRequest[Params, ResBody, ReqBody, ReqQuery] protected ()
    extends StObject
       with ThinRequest {
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: String,
      requestSource: widget | provisioner
    ) = this()
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: Null,
      requestSource: widget | provisioner
    ) = this()
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: String,
      requestSource: widget | provisioner,
      widgetToken: String
    ) = this()
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: Null,
      requestSource: widget | provisioner,
      widgetToken: String
    ) = this()
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: String,
      requestSource: widget | provisioner,
      widgetToken: String,
      fnName: String
    ) = this()
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: String,
      requestSource: widget | provisioner,
      widgetToken: Unit,
      fnName: String
    ) = this()
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: Null,
      requestSource: widget | provisioner,
      widgetToken: String,
      fnName: String
    ) = this()
    def this(
      expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]],
      userId: Null,
      requestSource: widget | provisioner,
      widgetToken: Unit,
      fnName: String
    ) = this()
    
    def body: ReqBody = js.native
    
    val expressReq: Request_[Params, ResBody, ReqBody, ReqQuery, Record[String, Any]] = js.native
    
    val fnName: js.UndefOr[String] = js.native
    
    /* CompleteClass */
    override def getId(): String = js.native
    
    val id: String = js.native
    
    val log: Logger = js.native
    
    def params: Params = js.native
    
    def query: ReqQuery = js.native
    
    val requestSource: widget | provisioner = js.native
    
    val userId: String | Null = js.native
    
    val widgetToken: js.UndefOr[String] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.all
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.get_
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.post_
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.put_
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.delete_
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.patch
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.options
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.head
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.checkout
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.connect
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.copy
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.lock
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.merge
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mkactivity
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mkcol
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.move
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.`m-search`
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.notify
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.propfind
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.proppatch
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.purge
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.report
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.search
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.subscribe
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.trace
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.unlock
    - typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.unsubscribe
  */
  trait Methods extends StObject
  object Methods {
    
    inline def all: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.all = "all".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.all]
    
    inline def checkout: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.checkout = "checkout".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.checkout]
    
    inline def connect: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.connect = "connect".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.connect]
    
    inline def copy: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.copy = "copy".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.copy]
    
    inline def delete: delete_ = "delete".asInstanceOf[delete_]
    
    inline def get: get_ = "get".asInstanceOf[get_]
    
    inline def head: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.head = "head".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.head]
    
    inline def lock: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.lock = "lock".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.lock]
    
    inline def `m-search`: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.`m-search` = "m-search".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.`m-search`]
    
    inline def merge: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.merge = "merge".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.merge]
    
    inline def mkactivity: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mkactivity = "mkactivity".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mkactivity]
    
    inline def mkcol: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mkcol = "mkcol".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.mkcol]
    
    inline def move: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.move = "move".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.move]
    
    inline def options: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.options = "options".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.options]
    
    inline def patch: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.patch = "patch".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.patch]
    
    inline def post: post_ = "post".asInstanceOf[post_]
    
    inline def propfind: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.propfind = "propfind".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.propfind]
    
    inline def proppatch: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.proppatch = "proppatch".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.proppatch]
    
    inline def purge: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.purge = "purge".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.purge]
    
    inline def put: put_ = "put".asInstanceOf[put_]
    
    inline def report: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.report = "report".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.report]
    
    inline def search: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.search = "search".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.search]
    
    inline def subscribe: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.subscribe = "subscribe".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.subscribe]
    
    inline def trace: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.trace = "trace".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.trace]
    
    inline def unlock: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.unlock = "unlock".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.unlock]
    
    inline def unsubscribe: typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.unsubscribe = "unsubscribe".asInstanceOf[typingsJapgolly.matrixAppserviceBridge.matrixAppserviceBridgeStrings.unsubscribe]
  }
}
