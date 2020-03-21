package typingsJapgolly.node.httpsMod

import typingsJapgolly.node.httpMod.HttpBase
import typingsJapgolly.node.httpMod.RequestListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("https", "Server")
@js.native
class Server ()
  extends typingsJapgolly.node.tlsMod.Server
     with HttpBase {
  def this(options: ServerOptions) = this()
  def this(requestListener: RequestListener) = this()
  def this(options: ServerOptions, requestListener: RequestListener) = this()
}

