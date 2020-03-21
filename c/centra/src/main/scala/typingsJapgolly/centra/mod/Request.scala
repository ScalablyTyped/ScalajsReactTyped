package typingsJapgolly.centra.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.centra.centraStrings._defaultAgent
import typingsJapgolly.centra.centraStrings.agent
import typingsJapgolly.centra.centraStrings.auth
import typingsJapgolly.centra.centraStrings.buffer
import typingsJapgolly.centra.centraStrings.defaultPort
import typingsJapgolly.centra.centraStrings.family
import typingsJapgolly.centra.centraStrings.form
import typingsJapgolly.centra.centraStrings.headers
import typingsJapgolly.centra.centraStrings.host
import typingsJapgolly.centra.centraStrings.hostname
import typingsJapgolly.centra.centraStrings.json
import typingsJapgolly.centra.centraStrings.localAddress
import typingsJapgolly.centra.centraStrings.maxHeaderSize
import typingsJapgolly.centra.centraStrings.method
import typingsJapgolly.centra.centraStrings.path
import typingsJapgolly.centra.centraStrings.port
import typingsJapgolly.centra.centraStrings.protocol
import typingsJapgolly.centra.centraStrings.setHost
import typingsJapgolly.centra.centraStrings.socketPath
import typingsJapgolly.centra.centraStrings.timeout
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.httpMod.Agent
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var compressionEnabled: Boolean = js.native
  var coreOptions: RequestOptions = js.native
  var data: String | Buffer | Null = js.native
  var method: String = js.native
  var reqHeaders: StringDictionary[String] = js.native
  var sendDataAs: form | json | buffer | Null = js.native
  var streamEnabled: Boolean = js.native
  var timeoutTime: Double | Null = js.native
  var url: URL_ = js.native
  def body(data: js.Any): this.type = js.native
  @JSName("body")
  def body_buffer(data: js.Any, sendAs: buffer): this.type = js.native
  @JSName("body")
  def body_form(data: js.Any, sendAs: form): this.type = js.native
  @JSName("body")
  def body_json(data: js.Any, sendAs: json): this.type = js.native
  def compress(): this.type = js.native
  def header(headers: StringDictionary[String]): this.type = js.native
  def header(key: String, value: String): this.type = js.native
  @JSName("option")
  def option_agent(key: agent, value: Boolean): this.type = js.native
  @JSName("option")
  def option_agent(key: agent, value: Agent): this.type = js.native
  @JSName("option")
  def option_auth(key: auth): this.type = js.native
  @JSName("option")
  def option_auth(key: auth, value: String): this.type = js.native
  @JSName("option")
  def option_defaultAgent(key: _defaultAgent, value: Agent): this.type = js.native
  @JSName("option")
  def option_defaultPort(key: defaultPort, value: String): this.type = js.native
  @JSName("option")
  def option_defaultPort(key: defaultPort, value: Double): this.type = js.native
  @JSName("option")
  def option_family(key: family, value: Double): this.type = js.native
  @JSName("option")
  def option_headers(key: headers, value: OutgoingHttpHeaders): this.type = js.native
  @JSName("option")
  def option_host(key: host): this.type = js.native
  @JSName("option")
  def option_host(key: host, value: String): this.type = js.native
  @JSName("option")
  def option_hostname(key: hostname): this.type = js.native
  @JSName("option")
  def option_hostname(key: hostname, value: String): this.type = js.native
  @JSName("option")
  def option_localAddress(key: localAddress, value: String): this.type = js.native
  @JSName("option")
  def option_maxHeaderSize(key: maxHeaderSize, value: Double): this.type = js.native
  @JSName("option")
  def option_method(key: method, value: String): this.type = js.native
  @JSName("option")
  def option_path(key: path): this.type = js.native
  @JSName("option")
  def option_path(key: path, value: String): this.type = js.native
  @JSName("option")
  def option_port(key: port): this.type = js.native
  @JSName("option")
  def option_port(key: port, value: String): this.type = js.native
  @JSName("option")
  def option_port(key: port, value: Double): this.type = js.native
  @JSName("option")
  def option_protocol(key: protocol): this.type = js.native
  @JSName("option")
  def option_protocol(key: protocol, value: String): this.type = js.native
  @JSName("option")
  def option_setHost(key: setHost, value: Boolean): this.type = js.native
  @JSName("option")
  def option_socketPath(key: socketPath, value: String): this.type = js.native
  @JSName("option")
  def option_timeout(key: timeout, value: Double): this.type = js.native
  def path(relativePath: String): this.type = js.native
  def query(key: String, value: js.Any): this.type = js.native
  def query(params: StringDictionary[js.Any]): this.type = js.native
  def send(): js.Promise[Response] = js.native
  def stream(): this.type = js.native
  def timeout(timeMs: Double): this.type = js.native
}

