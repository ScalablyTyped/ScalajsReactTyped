package typingsJapgolly.openfin

import typingsJapgolly.openfin.openfinStrings.clean
import typingsJapgolly.openfin.openfinStrings.failed
import typingsJapgolly.openfin.openfinStrings.terminated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResult extends js.Object {
  var result: clean | terminated | failed
}

object AnonResult {
  @scala.inline
  def apply(result: clean | terminated | failed): AnonResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResult]
  }
}

