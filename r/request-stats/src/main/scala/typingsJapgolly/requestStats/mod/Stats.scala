package typingsJapgolly.requestStats.mod

import typingsJapgolly.requestStats.AnonBytes
import typingsJapgolly.requestStats.AnonHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  /**
    * `true` if the connection was closed correctly and `false` otherwise
    */
  var ok: Boolean
  var req: AnonBytes
  var res: AnonHeaders
  /**
    * The milliseconds it took to serve the request
    */
  var time: Double
}

object Stats {
  @scala.inline
  def apply(ok: Boolean, req: AnonBytes, res: AnonHeaders, time: Double): Stats = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Stats]
  }
}

