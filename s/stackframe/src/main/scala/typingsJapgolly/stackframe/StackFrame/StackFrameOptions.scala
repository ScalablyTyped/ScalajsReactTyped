package typingsJapgolly.stackframe.StackFrame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrameOptions extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.undefined
  var columnNumber: js.UndefOr[Double] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var functionName: js.UndefOr[String] = js.undefined
  var isConstructor: js.UndefOr[Boolean] = js.undefined
  var isEval: js.UndefOr[Boolean] = js.undefined
  var isNative: js.UndefOr[Boolean] = js.undefined
  var isToplevel: js.UndefOr[Boolean] = js.undefined
  var lineNumber: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[String] = js.undefined
}

object StackFrameOptions {
  @scala.inline
  def apply(
    args: js.Array[_] = null,
    columnNumber: Int | Double = null,
    fileName: String = null,
    functionName: String = null,
    isConstructor: js.UndefOr[Boolean] = js.undefined,
    isEval: js.UndefOr[Boolean] = js.undefined,
    isNative: js.UndefOr[Boolean] = js.undefined,
    isToplevel: js.UndefOr[Boolean] = js.undefined,
    lineNumber: Int | Double = null,
    source: String = null
  ): StackFrameOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (functionName != null) __obj.updateDynamic("functionName")(functionName.asInstanceOf[js.Any])
    if (!js.isUndefined(isConstructor)) __obj.updateDynamic("isConstructor")(isConstructor.asInstanceOf[js.Any])
    if (!js.isUndefined(isEval)) __obj.updateDynamic("isEval")(isEval.asInstanceOf[js.Any])
    if (!js.isUndefined(isNative)) __obj.updateDynamic("isNative")(isNative.asInstanceOf[js.Any])
    if (!js.isUndefined(isToplevel)) __obj.updateDynamic("isToplevel")(isToplevel.asInstanceOf[js.Any])
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackFrameOptions]
  }
}

