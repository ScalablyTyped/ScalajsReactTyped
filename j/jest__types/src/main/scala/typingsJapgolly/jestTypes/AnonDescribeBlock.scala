package typingsJapgolly.jestTypes

import typingsJapgolly.jestTypes.circusMod.DescribeBlock
import typingsJapgolly.jestTypes.circusMod.Event
import typingsJapgolly.jestTypes.circusMod.Hook
import typingsJapgolly.jestTypes.circusMod.TestEntry
import typingsJapgolly.jestTypes.jestTypesStrings.hook_success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescribeBlock extends Event {
  var describeBlock: js.UndefOr[DescribeBlock] = js.undefined
  var hook: Hook
  var name: hook_success
  var test: js.UndefOr[TestEntry] = js.undefined
}

object AnonDescribeBlock {
  @scala.inline
  def apply(hook: Hook, name: hook_success, describeBlock: DescribeBlock = null, test: TestEntry = null): AnonDescribeBlock = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (describeBlock != null) __obj.updateDynamic("describeBlock")(describeBlock.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescribeBlock]
  }
}

