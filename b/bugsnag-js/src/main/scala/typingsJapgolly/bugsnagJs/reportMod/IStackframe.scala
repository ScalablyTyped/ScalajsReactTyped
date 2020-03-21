package typingsJapgolly.bugsnagJs.reportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStackframe extends js.Object {
  var code: js.UndefOr[js.Object] = js.undefined
  var columnNumber: js.UndefOr[Double] = js.undefined
  var file: String
  var inProject: js.UndefOr[Boolean] = js.undefined
  var lineNumber: js.UndefOr[Double] = js.undefined
  var method: js.UndefOr[String] = js.undefined
}

object IStackframe {
  @scala.inline
  def apply(
    file: String,
    code: js.Object = null,
    columnNumber: Int | Double = null,
    inProject: js.UndefOr[Boolean] = js.undefined,
    lineNumber: Int | Double = null,
    method: String = null
  ): IStackframe = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(inProject)) __obj.updateDynamic("inProject")(inProject.asInstanceOf[js.Any])
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStackframe]
  }
}

