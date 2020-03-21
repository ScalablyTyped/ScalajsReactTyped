package typingsJapgolly.httpProxyAgent.mod

import typingsJapgolly.node.httpMod.Agent
import typingsJapgolly.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpProxyAgent extends Agent {
  var proxy: Url = js.native
  var secureProxy: Boolean = js.native
}

