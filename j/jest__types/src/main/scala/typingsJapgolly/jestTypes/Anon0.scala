package typingsJapgolly.jestTypes

import typingsJapgolly.jestTypes.circusMod.Event
import typingsJapgolly.jestTypes.circusMod.TestEntry
import typingsJapgolly.jestTypes.jestTypesStrings.test_skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends Event {
  var name: test_skip
  var test: TestEntry
}

object Anon0 {
  @scala.inline
  def apply(name: test_skip, test: TestEntry): Anon0 = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon0]
  }
}

