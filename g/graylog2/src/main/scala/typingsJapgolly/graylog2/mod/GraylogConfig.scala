package typingsJapgolly.graylog2.mod

import typingsJapgolly.graylog2.Readonlyhoststringportnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraylogConfig extends js.Object {
  /**
    * The max UDP packet size. Should never exceed the MTU of your system.
    * The default value is 1400
    */
  var bufferSize: js.UndefOr[Double] = js.undefined
  /**
    * The strategy for a message compression:
    *  "always"  -  every message will be compressed with zlib.deflate
    *  "never"   -  no compression
    *  "optimal" -  messages bigger than GraylogConfig.bufferSize will be compressed
    *
    *  The default value is "optimal"
    */
  var deflate: js.UndefOr[GraylogDeflate] = js.undefined
  /**
    * The facility - log's field type in Graylog.
    * The default value is "Node.js"
    */
  var facility: js.UndefOr[String] = js.undefined
  /**
    * The name of a host.
    * The default value is "os.hostname()"
    */
  var hostname: js.UndefOr[String] = js.undefined
  /**
    * The list of graylog servers
    */
  var servers: js.Array[Readonlyhoststringportnum]
}

object GraylogConfig {
  @scala.inline
  def apply(
    servers: js.Array[Readonlyhoststringportnum],
    bufferSize: Int | Double = null,
    deflate: GraylogDeflate = null,
    facility: String = null,
    hostname: String = null
  ): GraylogConfig = {
    val __obj = js.Dynamic.literal(servers = servers.asInstanceOf[js.Any])
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (deflate != null) __obj.updateDynamic("deflate")(deflate.asInstanceOf[js.Any])
    if (facility != null) __obj.updateDynamic("facility")(facility.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraylogConfig]
  }
}

