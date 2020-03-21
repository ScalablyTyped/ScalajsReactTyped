package typingsJapgolly.oauth2Server.mod

import typingsJapgolly.oauth2Server.TypeofOAuth2Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an OAuth2 server instance.
  */
@JSImport("oauth2-server", JSImport.Namespace)
@js.native
class ^ protected () extends OAuth2Server {
  /**
    * Instantiates OAuth2Server using the supplied model
    */
  def this(options: ServerOptions) = this()
}

@JSImport("oauth2-server", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var OAuth2Server: TypeofOAuth2Server = js.native
}

