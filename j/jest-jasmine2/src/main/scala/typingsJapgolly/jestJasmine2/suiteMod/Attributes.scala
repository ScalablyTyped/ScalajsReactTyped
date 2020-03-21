package typingsJapgolly.jestJasmine2.suiteMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var description: String
  var id: String
  var parentSuite: js.UndefOr[Suite] = js.undefined
  var throwOnExpectationFailure: js.UndefOr[Boolean] = js.undefined
  def getTestPath(): Path
}

object Attributes {
  @scala.inline
  def apply(
    description: String,
    getTestPath: CallbackTo[Path],
    id: String,
    parentSuite: Suite = null,
    throwOnExpectationFailure: js.UndefOr[Boolean] = js.undefined
  ): Attributes = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("getTestPath")(getTestPath.toJsFn)
    if (parentSuite != null) __obj.updateDynamic("parentSuite")(parentSuite.asInstanceOf[js.Any])
    if (!js.isUndefined(throwOnExpectationFailure)) __obj.updateDynamic("throwOnExpectationFailure")(throwOnExpectationFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
}

