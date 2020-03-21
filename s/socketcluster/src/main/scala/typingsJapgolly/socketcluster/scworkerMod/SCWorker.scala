package typingsJapgolly.socketcluster.scworkerMod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.scAuth.mod.SCAuthEngine
import typingsJapgolly.scBrokerCluster.mod.SCExchange
import typingsJapgolly.socketcluster.AnonClientCount
import typingsJapgolly.socketcluster.socketclusterStrings.connection
import typingsJapgolly.socketcluster.socketclusterStrings.error
import typingsJapgolly.socketcluster.socketclusterStrings.exit
import typingsJapgolly.socketcluster.socketclusterStrings.masterMessage
import typingsJapgolly.socketcluster.socketclusterStrings.ready
import typingsJapgolly.socketcluster.socketclusterStrings.start
import typingsJapgolly.socketcluster.socketclusterStrings.warning
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCWorker extends EventEmitter {
  val EVENT_CONNECTION: connection = js.native
  val EVENT_ERROR: error = js.native
  val EVENT_EXIT: exit = js.native
  val EVENT_READY: ready = js.native
  val EVENT_WARNING: warning = js.native
  val MIDDLEWARE_START: start = js.native
  var auth: SCAuthEngine = js.native
  var exchange: SCExchange = js.native
  var httpServer: Server | typingsJapgolly.node.httpsMod.Server = js.native
  var id: Double = js.native
  var isLeader: Boolean = js.native
  var options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCServer.SCServerOptions */ js.Any = js.native
  var scServer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCServer */ js.Any = js.native
  @JSName("addMiddleware")
  def addMiddleware_start(`type`: start, middlewareFn: middlewareFunction): Unit = js.native
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  def getHTTPServer(): Server | typingsJapgolly.node.httpsMod.Server = js.native
  def getSCServer(): js.Any = js.native
  def getSocketPath(): String = js.native
  def getStatus(): AnonClientCount = js.native
  @JSName("on")
  def on_connection(
    event: connection,
    listener: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCServerSocket */ /* scSocket */ js.Any, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_masterMessage(
    event: masterMessage,
    listener: js.Function2[
      /* data */ js.Any, 
      /* respond */ js.Function2[/* err */ js.Error | Null, /* responseData */ js.Any, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_warning(event: warning, listener: js.Function1[/* warning */ js.Error, Unit]): this.type = js.native
  def open(): Unit = js.native
  @JSName("removeMiddleware")
  def removeMiddleware_start(`type`: start, middlewareFn: middlewareFunction): Unit = js.native
  def respondToMaster(err: Null, data: js.Any, rid: Double): Unit = js.native
  def respondToMaster(err: Error, data: js.Any, rid: Double): Unit = js.native
  def run(): Unit = js.native
  def sendToMaster(data: js.Any, callback: js.Function2[/* err */ js.Error | Null, /* data */ js.Any, Unit]): Unit = js.native
  def setAuthEngine(authEngine: SCAuthEngine): Unit = js.native
  def setCodecEngine(
    codecEngine: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SCServer.SCCodecEngine */ js.Any
  ): Unit = js.native
  def start(): js.Promise[Unit] = js.native
  def startHTTPServer(): Unit = js.native
}

