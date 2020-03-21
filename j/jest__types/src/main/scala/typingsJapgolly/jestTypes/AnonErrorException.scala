package typingsJapgolly.jestTypes

import typingsJapgolly.jestTypes.circusMod.Event
import typingsJapgolly.jestTypes.circusMod.Exception
import typingsJapgolly.jestTypes.jestTypesStrings.error_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorException extends Event {
  var error: Exception
  var name: error_
}

object AnonErrorException {
  @scala.inline
  def apply(error: Exception, name: error_): AnonErrorException = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrorException]
  }
}

