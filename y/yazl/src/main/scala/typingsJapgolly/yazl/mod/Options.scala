package typingsJapgolly.yazl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var compress: Boolean
  var forceZip64Format: Boolean
  var mode: Double
  var mtime: js.Date
}

object Options {
  @scala.inline
  def apply(compress: Boolean, forceZip64Format: Boolean, mode: Double, mtime: js.Date): Options = {
    val __obj = js.Dynamic.literal(compress = compress.asInstanceOf[js.Any], forceZip64Format = forceZip64Format.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

