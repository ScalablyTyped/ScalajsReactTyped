package typingsJapgolly.callsite.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallSite extends js.Object {
  def getColumnNumber(): Double
  def getEvalOrigin(): String
  def getFileName(): String
  def getFunction(): js.Function
  def getFunctionName(): String
  def getLineNumber(): Double
  def getMethodName(): String
  def getThis(): js.Any
  def getTypeName(): String
  def isConstructor(): Boolean
  def isEval(): Boolean
  def isNative(): Boolean
  def isToplevel(): Boolean
}

object CallSite {
  @scala.inline
  def apply(
    getColumnNumber: CallbackTo[Double],
    getEvalOrigin: CallbackTo[String],
    getFileName: CallbackTo[String],
    getFunction: CallbackTo[js.Function],
    getFunctionName: CallbackTo[String],
    getLineNumber: CallbackTo[Double],
    getMethodName: CallbackTo[String],
    getThis: CallbackTo[js.Any],
    getTypeName: CallbackTo[String],
    isConstructor: CallbackTo[Boolean],
    isEval: CallbackTo[Boolean],
    isNative: CallbackTo[Boolean],
    isToplevel: CallbackTo[Boolean]
  ): CallSite = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getColumnNumber")(getColumnNumber.toJsFn)
    __obj.updateDynamic("getEvalOrigin")(getEvalOrigin.toJsFn)
    __obj.updateDynamic("getFileName")(getFileName.toJsFn)
    __obj.updateDynamic("getFunction")(getFunction.toJsFn)
    __obj.updateDynamic("getFunctionName")(getFunctionName.toJsFn)
    __obj.updateDynamic("getLineNumber")(getLineNumber.toJsFn)
    __obj.updateDynamic("getMethodName")(getMethodName.toJsFn)
    __obj.updateDynamic("getThis")(getThis.toJsFn)
    __obj.updateDynamic("getTypeName")(getTypeName.toJsFn)
    __obj.updateDynamic("isConstructor")(isConstructor.toJsFn)
    __obj.updateDynamic("isEval")(isEval.toJsFn)
    __obj.updateDynamic("isNative")(isNative.toJsFn)
    __obj.updateDynamic("isToplevel")(isToplevel.toJsFn)
    __obj.asInstanceOf[CallSite]
  }
}

