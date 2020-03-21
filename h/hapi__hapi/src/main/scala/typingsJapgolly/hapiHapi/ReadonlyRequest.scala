package typingsJapgolly.hapiHapi

import typingsJapgolly.hapiBoom.mod.Boom
import typingsJapgolly.hapiHapi.mod.PluginsStates
import typingsJapgolly.hapiHapi.mod.RequestApplicationState
import typingsJapgolly.hapiHapi.mod.RequestAuth
import typingsJapgolly.hapiHapi.mod.RequestEvents
import typingsJapgolly.hapiHapi.mod.RequestInfo
import typingsJapgolly.hapiHapi.mod.RequestLog
import typingsJapgolly.hapiHapi.mod.RequestOrig
import typingsJapgolly.hapiHapi.mod.RequestQuery
import typingsJapgolly.hapiHapi.mod.RequestRoute
import typingsJapgolly.hapiHapi.mod.ResponseObject
import typingsJapgolly.hapiHapi.mod.Server
import typingsJapgolly.hapiHapi.mod.Util.Dictionary
import typingsJapgolly.hapiHapi.mod.Util.HTTP_METHODS_PARTIAL
import typingsJapgolly.hapiHapi.mod.Util.HTTP_METHODS_PARTIAL_LOWERCASE
import typingsJapgolly.hapiPodium.mod.Events
import typingsJapgolly.hapiPodium.mod.Listener
import typingsJapgolly.hapiPodium.mod.Podium
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@hapi/hapi.@hapi/hapi.Request> */
@js.native
trait ReadonlyRequest extends js.Object {
  val app: RequestApplicationState = js.native
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
  val response: ResponseObject | Boom[_] = js.native
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

