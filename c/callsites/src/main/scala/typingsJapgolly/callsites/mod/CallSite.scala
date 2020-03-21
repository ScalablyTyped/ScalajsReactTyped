package typingsJapgolly.callsites.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallSite extends js.Object {
  /**
  		Returns the current column number if this function was defined in a script.
  		*/
  def getColumnNumber(): Double | Null
  /**
  		Returns a string representing the location where `eval` was called if this function was created using a call to `eval`.
  		*/
  def getEvalOrigin(): js.UndefOr[String]
  /**
  		Returns the name of the script if this function was defined in a script.
  		*/
  def getFileName(): String | Null
  /**
  		Returns the current function.
  		*/
  def getFunction(): js.UndefOr[js.Function]
  /**
  		Returns the name of the current function, typically its `name` property. If a name property is not available an attempt will be made to try to infer a name from the function's context.
  		*/
  def getFunctionName(): String | Null
  /**
  		Returns the current line number if this function was defined in a script.
  		*/
  def getLineNumber(): Double | Null
  /**
  		Returns the name of the property of `this` or one of its prototypes that holds the current function.
  		*/
  def getMethodName(): js.UndefOr[String]
  /**
  		Returns the value of `this`.
  		*/
  def getThis(): js.UndefOr[js.Any]
  /**
  		Returns the type of `this` as a string. This is the name of the function stored in the constructor field of `this`, if available, otherwise the object's `[[Class]]` internal property.
  		*/
  def getTypeName(): String | Null
  /**
  		Returns `true` if this is a constructor call.
  		*/
  def isConstructor(): Boolean
  /**
  		Returns `true` if this call takes place in code defined by a call to `eval`.
  		*/
  def isEval(): Boolean
  /**
  		Returns `true` if this call is in native V8 code.
  		*/
  def isNative(): Boolean
  /**
  		Returns `true` if this is a top-level invocation, that is, if it's a global object.
  		*/
  def isToplevel(): Boolean
}

object CallSite {
  @scala.inline
  def apply(
    getColumnNumber: CallbackTo[Double | Null],
    getEvalOrigin: CallbackTo[js.UndefOr[String]],
    getFileName: CallbackTo[String | Null],
    getFunction: CallbackTo[js.UndefOr[js.Function]],
    getFunctionName: CallbackTo[String | Null],
    getLineNumber: CallbackTo[Double | Null],
    getMethodName: CallbackTo[js.UndefOr[String]],
    getThis: CallbackTo[js.UndefOr[js.Any]],
    getTypeName: CallbackTo[String | Null],
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

