package typingsJapgolly.soap

import typingsJapgolly.soap.typesMod.IHeaders
import typingsJapgolly.soap.typesMod.ISecurity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("soap/lib/security/BasicAuthSecurity", JSImport.Namespace)
@js.native
object basicAuthSecurityMod extends js.Object {
  @js.native
  class BasicAuthSecurity protected () extends ISecurity {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, defaults: js.Any) = this()
    var _password: js.Any = js.native
    var _username: js.Any = js.native
    var defaults: js.Any = js.native
    @JSName("addHeaders")
    def addHeaders_MBasicAuthSecurity(headers: IHeaders): Unit = js.native
    @JSName("addOptions")
    def addOptions_MBasicAuthSecurity(options: js.Any): Unit = js.native
    @JSName("toXML")
    def toXML_MBasicAuthSecurity(): String = js.native
  }
  
}

