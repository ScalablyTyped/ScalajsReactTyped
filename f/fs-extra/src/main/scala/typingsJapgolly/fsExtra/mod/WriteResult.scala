package typingsJapgolly.fsExtra.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteResult extends js.Object {
  var buffer: Buffer
  var bytesWritten: Double
}

object WriteResult {
  @scala.inline
  def apply(buffer: Buffer, bytesWritten: Double): WriteResult = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WriteResult]
  }
}

