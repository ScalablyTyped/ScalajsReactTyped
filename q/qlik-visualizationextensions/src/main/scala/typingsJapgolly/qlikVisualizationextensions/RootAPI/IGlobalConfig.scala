package typingsJapgolly.qlikVisualizationextensions.RootAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGlobalConfig extends js.Object {
  /**
    * Qlik Sense host
    */
  var host: String
  /**
    * Unique identity for the session. If omitted, the session will be shared.
    */
  var identity: String
  /**
    * Use SSL
    */
  var isSecure: Boolean
  /**
    * Port number
    */
  var port: String
  /**
    * Qlik Sense virtual proxy. / if no virtual proxy
    */
  var prefix: String
}

object IGlobalConfig {
  @scala.inline
  def apply(host: String, identity: String, isSecure: Boolean, port: String, prefix: String): IGlobalConfig = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], isSecure = isSecure.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGlobalConfig]
  }
}

