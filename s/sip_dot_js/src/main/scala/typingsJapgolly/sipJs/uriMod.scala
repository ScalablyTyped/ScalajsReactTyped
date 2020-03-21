package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.parametersMod.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/uri", JSImport.Namespace)
@js.native
object uriMod extends js.Object {
  @js.native
  class URI protected () extends Parameters {
    /**
      * Constructor
      * @param scheme -
      * @param user -
      * @param host -
      * @param port -
      * @param parameters -
      * @param headers -
      */
    def this(scheme: String, user: String, host: String) = this()
    def this(scheme: String, user: String, host: String, port: Double) = this()
    def this(scheme: String, user: String, host: String, port: Double, parameters: js.Any) = this()
    def this(scheme: String, user: String, host: String, port: Double, parameters: js.Any, headers: js.Any) = this()
    val _normal: js.Any = js.native
    val _raw: js.Any = js.native
    var _toString: js.Any = js.native
    val aor: String = js.native
    var escapeUser: js.Any = js.native
    var headerize: js.Any = js.native
    var headers: js.Any = js.native
    var host: String = js.native
    var normal: js.Any = js.native
    var port: js.UndefOr[Double] = js.native
    var raw: js.Any = js.native
    var scheme: String = js.native
    var user: js.UndefOr[String] = js.native
    def clearHeaders(): Unit = js.native
    def deleteHeader(header: String): js.Any = js.native
    def getHeader(name: String): js.UndefOr[String] = js.native
    def hasHeader(name: String): Boolean = js.native
    def setHeader(name: String, value: js.Any): Unit = js.native
    def toRaw(): String = js.native
  }
  
}

