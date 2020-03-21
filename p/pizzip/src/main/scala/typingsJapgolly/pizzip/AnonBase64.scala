package typingsJapgolly.pizzip

import typingsJapgolly.pizzip.mod.Compression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBase64 extends js.Object {
  /**
    * @deprecated
    */
  var base64: Boolean
  /**
    * @deprecated
    */
  var binary: Boolean
  var compression: Compression
  /**
    * @deprecated use File.date
    */
  var date: js.Date
  /**
    * @deprecated use File.dir
    */
  var dir: Boolean
}

object AnonBase64 {
  @scala.inline
  def apply(base64: Boolean, binary: Boolean, compression: Compression, date: js.Date, dir: Boolean): AnonBase64 = {
    val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBase64]
  }
}

