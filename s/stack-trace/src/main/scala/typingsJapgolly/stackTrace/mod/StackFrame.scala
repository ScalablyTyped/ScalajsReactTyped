package typingsJapgolly.stackTrace.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  def getColumnNumber(): Double
  def getFileName(): String
  def getFunctionName(): String
  def getLineNumber(): Double
  def getMethodName(): String
  def getTypeName(): String
  def isNative(): Boolean
}

object StackFrame {
  @scala.inline
  def apply(
    getColumnNumber: CallbackTo[Double],
    getFileName: CallbackTo[String],
    getFunctionName: CallbackTo[String],
    getLineNumber: CallbackTo[Double],
    getMethodName: CallbackTo[String],
    getTypeName: CallbackTo[String],
    isNative: CallbackTo[Boolean]
  ): StackFrame = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getColumnNumber")(getColumnNumber.toJsFn)
    __obj.updateDynamic("getFileName")(getFileName.toJsFn)
    __obj.updateDynamic("getFunctionName")(getFunctionName.toJsFn)
    __obj.updateDynamic("getLineNumber")(getLineNumber.toJsFn)
    __obj.updateDynamic("getMethodName")(getMethodName.toJsFn)
    __obj.updateDynamic("getTypeName")(getTypeName.toJsFn)
    __obj.updateDynamic("isNative")(isNative.toJsFn)
    __obj.asInstanceOf[StackFrame]
  }
}

