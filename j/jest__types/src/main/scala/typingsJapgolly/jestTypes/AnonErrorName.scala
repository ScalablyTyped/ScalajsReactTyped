package typingsJapgolly.jestTypes

import typingsJapgolly.jestTypes.circusMod.Event
import typingsJapgolly.jestTypes.circusMod.Exception
import typingsJapgolly.jestTypes.circusMod.TestEntry
import typingsJapgolly.jestTypes.jestTypesStrings.test_fn_failure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorName extends Event {
  var error: Exception
  var name: test_fn_failure
  var test: TestEntry
}

object AnonErrorName {
  @scala.inline
  def apply(error: Exception, name: test_fn_failure, test: TestEntry): AnonErrorName = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrorName]
  }
}

