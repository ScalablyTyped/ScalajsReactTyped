package typingsJapgolly.pulumiCloud.httpServerMod

import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud/httpServer", "HttpServer")
@js.native
class HttpServerCls protected () extends HttpServer {
  /**
    * @param createRequestListener Function that, when called, will produce the [[requestListener]]
    * function that will be called for each http request to the server.  The function will be
    * called once when the module is loaded.  As such, it is a suitable place for expensive
    * computation (like setting up a set of routes).  The function returned can then utilize the
    * results of that computation.
    */
  def this(name: String, createRequestListener: RequestListenerFactory) = this()
  def this(name: String, createRequestListener: RequestListenerFactory, opts: ResourceOptions) = this()
  /* CompleteClass */
  override val url: Output_[String] = js.native
}

