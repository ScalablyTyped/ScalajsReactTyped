package typingsJapgolly.nodegit

import typingsJapgolly.nodegit.proxyOptionsMod.ProxyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/proxy", JSImport.Namespace)
@js.native
object proxyMod extends js.Object {
  @js.native
  class Proxy () extends js.Object
  
  /* static members */
  @js.native
  object Proxy extends js.Object {
    def initOptions(opts: ProxyOptions, version: Double): Double = js.native
  }
  
}

