package typingsJapgolly.readableStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChunk extends js.Object {
  var chunk: js.Any
  var encoding: String
}

object AnonChunk {
  @scala.inline
  def apply(chunk: js.Any, encoding: String): AnonChunk = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChunk]
  }
}

