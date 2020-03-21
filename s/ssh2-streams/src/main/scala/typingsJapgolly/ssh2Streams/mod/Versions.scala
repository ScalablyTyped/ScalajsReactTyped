package typingsJapgolly.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Versions extends js.Object {
  /**
    * The SSH protocol version supported by the remote party.
    */
  var protocol: String
  /**
    * The software name and version used by the remote party.
    */
  var software: String
}

object Versions {
  @scala.inline
  def apply(protocol: String, software: String): Versions = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any], software = software.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Versions]
  }
}

