package typingsJapgolly.jestTypes

import typingsJapgolly.jestTypes.circusMod.Event
import typingsJapgolly.jestTypes.circusMod.TestEntry
import typingsJapgolly.jestTypes.jestTypesStrings.test_done
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon2 extends Event {
  var name: test_done
  var test: TestEntry
}

object Anon2 {
  @scala.inline
  def apply(name: test_done, test: TestEntry): Anon2 = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon2]
  }
}

