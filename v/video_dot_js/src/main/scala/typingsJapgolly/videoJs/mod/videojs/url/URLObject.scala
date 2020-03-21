package typingsJapgolly.videoJs.mod.videojs.url

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLObject extends js.Object {
  /**
    * The hash of the url that was parsed.
    */
  var hash: String
  /**
    * The host of the url that was parsed.
    */
  var host: String
  /**
    * The hostname of the url that was parsed.
    */
  var hostname: String
  /**
    * The pathname of the url that was parsed.
    */
  var pathname: String
  /**
    * The port of the url that was parsed.
    */
  var port: String
  /**
    * The protocol of the url that was parsed.
    */
  var protocol: String
  /**
    * The search query of the url that was parsed.
    */
  var search: String
}

object URLObject {
  @scala.inline
  def apply(
    hash: String,
    host: String,
    hostname: String,
    pathname: String,
    port: String,
    protocol: String,
    search: String
  ): URLObject = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[URLObject]
  }
}

