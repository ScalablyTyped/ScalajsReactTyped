package typingsJapgolly.hapi

import typingsJapgolly.boom.mod.^
import typingsJapgolly.hapi.mod.ApplicationState
import typingsJapgolly.hapi.mod.PluginsStates
import typingsJapgolly.hapi.mod.RequestAuth
import typingsJapgolly.hapi.mod.RequestEvents
import typingsJapgolly.hapi.mod.RequestInfo
import typingsJapgolly.hapi.mod.RequestLog
import typingsJapgolly.hapi.mod.RequestOrig
import typingsJapgolly.hapi.mod.RequestQuery
import typingsJapgolly.hapi.mod.RequestRoute
import typingsJapgolly.hapi.mod.ResponseObject
import typingsJapgolly.hapi.mod.Server
import typingsJapgolly.hapi.mod.Util.Dictionary
import typingsJapgolly.hapi.mod.Util.HTTP_METHODS_PARTIAL
import typingsJapgolly.hapi.mod.Util.HTTP_METHODS_PARTIAL_LOWERCASE
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.urlMod.URL_
import typingsJapgolly.podium.mod.Events
import typingsJapgolly.podium.mod.Listener
import typingsJapgolly.podium.mod.Podium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<hapi.hapi.Request> */
@js.native
trait ReadonlyRequest extends js.Object {
  val app: ApplicationState = js.native
  val auth: RequestAuth = js.native
  val events: RequestEvents = js.native
  val headers: Dictionary[String] = js.native
  val info: RequestInfo = js.native
  val logs: js.Array[RequestLog] = js.native
  val method: HTTP_METHODS_PARTIAL_LOWERCASE = js.native
  val mime: String = js.native
  val orig: RequestOrig = js.native
  val params: Dictionary[String] = js.native
  val paramsArray: js.Array[String] = js.native
  val path: String = js.native
  val payload: Readable | Buffer | String | js.Object = js.native
  val plugins: PluginsStates = js.native
  val pre: Dictionary[_] = js.native
  val preResponses: Dictionary[_] = js.native
  val query: RequestQuery = js.native
  val raw: AnonReq = js.native
  val response: ResponseObject | ^[_] = js.native
  val route: RequestRoute = js.native
  val server: Server = js.native
  val state: Dictionary[_] = js.native
  val url: URL_ = js.native
  def active(): Boolean = js.native
  def addListener(criteria: String, listener: Listener): Unit = js.native
  def emit(criteria: String, data: js.Any): Unit = js.native
  def generateResponse(): ResponseObject = js.native
  def generateResponse(source: String): ResponseObject = js.native
  def generateResponse(source: String, options: AnonClose): ResponseObject = js.native
  def generateResponse(source: js.Object): ResponseObject = js.native
  def generateResponse(source: js.Object, options: AnonClose): ResponseObject = js.native
  def generateResponse(source: Null, options: AnonClose): ResponseObject = js.native
  def hasListeners(name: String): Boolean = js.native
  def log(tags: String): Unit = js.native
  def log(tags: String, data: String): Unit = js.native
  def log(tags: String, data: js.Function0[String | js.Object]): Unit = js.native
  def log(tags: String, data: js.Object): Unit = js.native
  def log(tags: js.Array[String]): Unit = js.native
  def log(tags: js.Array[String], data: String): Unit = js.native
  def log(tags: js.Array[String], data: js.Function0[String | js.Object]): Unit = js.native
  def log(tags: js.Array[String], data: js.Object): Unit = js.native
  def on(criteria: String, listener: Listener): Unit = js.native
  def once(criteria: String, listener: Listener): Unit = js.native
  def registerEvent(events: js.Array[Events]): Unit = js.native
  def registerPodium(podiums: js.Array[Podium]): Unit = js.native
  def removeAllListeners(name: String): Podium = js.native
  def removeListener(name: String, listener: Listener): Podium = js.native
  def setMethod(method: HTTP_METHODS_PARTIAL): Unit = js.native
  def setUrl(url: String): Unit = js.native
  def setUrl(url: String, stripTrailingSlash: Boolean): Unit = js.native
  def setUrl(url: URL_): Unit = js.native
  def setUrl(url: URL_, stripTrailingSlash: Boolean): Unit = js.native
}

