package typingsJapgolly.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestCaseReference extends js.Object {
  /** The name of the class. */
  var className: js.UndefOr[String] = js.undefined
  /**
    * The name of the test case.
    *
    * Required.
    */
  var name: js.UndefOr[String] = js.undefined
  /** The name of the test suite to which this test case belongs. */
  var testSuiteName: js.UndefOr[String] = js.undefined
}

object TestCaseReference {
  @scala.inline
  def apply(className: String = null, name: String = null, testSuiteName: String = null): TestCaseReference = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (testSuiteName != null) __obj.updateDynamic("testSuiteName")(testSuiteName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestCaseReference]
  }
}

