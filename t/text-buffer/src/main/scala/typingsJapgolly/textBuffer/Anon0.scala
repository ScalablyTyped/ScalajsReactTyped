package typingsJapgolly.textBuffer

import typingsJapgolly.textBuffer.textBufferStrings.backward
import typingsJapgolly.textBuffer.textBufferStrings.closest
import typingsJapgolly.textBuffer.textBufferStrings.forward
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  var clipDirection: backward | forward | closest
}

object Anon0 {
  @scala.inline
  def apply(clipDirection: backward | forward | closest): Anon0 = {
    val __obj = js.Dynamic.literal(clipDirection = clipDirection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon0]
  }
}

