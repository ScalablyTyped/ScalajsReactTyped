package typingsJapgolly.stacktraceJs.StackTrace

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.undefined
  var columnNumber: js.UndefOr[Double] = js.undefined
  var evalOrigin: js.UndefOr[StackFrame] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var functionName: js.UndefOr[String] = js.undefined
  var isConstructor: js.UndefOr[Boolean] = js.undefined
  var isEval: js.UndefOr[Boolean] = js.undefined
  var isNative: js.UndefOr[Boolean] = js.undefined
  var isTopLevel: js.UndefOr[Boolean] = js.undefined
  var lineNumber: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  def getArgs(): js.Array[_]
  def getColumnNumber(): Double
  def getEvalOrigin(): StackFrame
  def getFileName(): String
  def getFunctionName(): String
  def getIsConstructor(): Boolean
  def getIsEval(): Boolean
  def getIsNative(): Boolean
  def getIsTopLevel(): Boolean
  def getLineNumber(): Double
  def getSource(): String
  def setArgs(): Unit
  def setColumnNumber(): Unit
  def setEvalOrigin(): Unit
  def setFileName(): Unit
  def setFunctionName(): Unit
  def setIsConstructor(): Unit
  def setIsEval(): Unit
  def setIsNative(): Unit
  def setIsTopLevel(): Unit
  def setLineNumber(): Unit
  def setSource(): Unit
}

object StackFrame {
  @scala.inline
  def apply(
    getArgs: CallbackTo[js.Array[js.Any]],
    getColumnNumber: CallbackTo[Double],
    getEvalOrigin: CallbackTo[StackFrame],
    getFileName: CallbackTo[String],
    getFunctionName: CallbackTo[String],
    getIsConstructor: CallbackTo[Boolean],
    getIsEval: CallbackTo[Boolean],
    getIsNative: CallbackTo[Boolean],
    getIsTopLevel: CallbackTo[Boolean],
    getLineNumber: CallbackTo[Double],
    getSource: CallbackTo[String],
    setArgs: Callback,
    setColumnNumber: Callback,
    setEvalOrigin: Callback,
    setFileName: Callback,
    setFunctionName: Callback,
    setIsConstructor: Callback,
    setIsEval: Callback,
    setIsNative: Callback,
    setIsTopLevel: Callback,
    setLineNumber: Callback,
    setSource: Callback,
    args: js.Array[_] = null,
    columnNumber: Int | Double = null,
    evalOrigin: StackFrame = null,
    fileName: String = null,
    functionName: String = null,
    isConstructor: js.UndefOr[Boolean] = js.undefined,
    isEval: js.UndefOr[Boolean] = js.undefined,
    isNative: js.UndefOr[Boolean] = js.undefined,
    isTopLevel: js.UndefOr[Boolean] = js.undefined,
    lineNumber: Int | Double = null,
    source: String = null
  ): StackFrame = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getArgs")(getArgs.toJsFn)
    __obj.updateDynamic("getColumnNumber")(getColumnNumber.toJsFn)
    __obj.updateDynamic("getEvalOrigin")(getEvalOrigin.toJsFn)
    __obj.updateDynamic("getFileName")(getFileName.toJsFn)
    __obj.updateDynamic("getFunctionName")(getFunctionName.toJsFn)
    __obj.updateDynamic("getIsConstructor")(getIsConstructor.toJsFn)
    __obj.updateDynamic("getIsEval")(getIsEval.toJsFn)
    __obj.updateDynamic("getIsNative")(getIsNative.toJsFn)
    __obj.updateDynamic("getIsTopLevel")(getIsTopLevel.toJsFn)
    __obj.updateDynamic("getLineNumber")(getLineNumber.toJsFn)
    __obj.updateDynamic("getSource")(getSource.toJsFn)
    __obj.updateDynamic("setArgs")(setArgs.toJsFn)
    __obj.updateDynamic("setColumnNumber")(setColumnNumber.toJsFn)
    __obj.updateDynamic("setEvalOrigin")(setEvalOrigin.toJsFn)
    __obj.updateDynamic("setFileName")(setFileName.toJsFn)
    __obj.updateDynamic("setFunctionName")(setFunctionName.toJsFn)
    __obj.updateDynamic("setIsConstructor")(setIsConstructor.toJsFn)
    __obj.updateDynamic("setIsEval")(setIsEval.toJsFn)
    __obj.updateDynamic("setIsNative")(setIsNative.toJsFn)
    __obj.updateDynamic("setIsTopLevel")(setIsTopLevel.toJsFn)
    __obj.updateDynamic("setLineNumber")(setLineNumber.toJsFn)
    __obj.updateDynamic("setSource")(setSource.toJsFn)
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (evalOrigin != null) __obj.updateDynamic("evalOrigin")(evalOrigin.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (functionName != null) __obj.updateDynamic("functionName")(functionName.asInstanceOf[js.Any])
    if (!js.isUndefined(isConstructor)) __obj.updateDynamic("isConstructor")(isConstructor.asInstanceOf[js.Any])
    if (!js.isUndefined(isEval)) __obj.updateDynamic("isEval")(isEval.asInstanceOf[js.Any])
    if (!js.isUndefined(isNative)) __obj.updateDynamic("isNative")(isNative.asInstanceOf[js.Any])
    if (!js.isUndefined(isTopLevel)) __obj.updateDynamic("isTopLevel")(isTopLevel.asInstanceOf[js.Any])
    if (lineNumber != null) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackFrame]
  }
}

