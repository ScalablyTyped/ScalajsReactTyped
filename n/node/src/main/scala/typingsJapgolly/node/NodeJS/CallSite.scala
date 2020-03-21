package typingsJapgolly.node.NodeJS

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallSite extends js.Object {
  /**
    * Current column number [if this function was defined in a script]
    */
  def getColumnNumber(): Double | Null
  /**
    * A call site object representing the location where eval was called
    * [if this function was created using a call to eval]
    */
  def getEvalOrigin(): js.UndefOr[String]
  /**
    * Name of the script [if this function was defined in a script]
    */
  def getFileName(): String | Null
  /**
    * Current function
    */
  def getFunction(): js.UndefOr[js.Function]
  /**
    * Name of the current function, typically its name property.
    * If a name property is not available an attempt will be made to try
    * to infer a name from the function's context.
    */
  def getFunctionName(): String | Null
  /**
    * Current line number [if this function was defined in a script]
    */
  def getLineNumber(): Double | Null
  /**
    * Name of the property [of "this" or one of its prototypes] that holds
    * the current function
    */
  def getMethodName(): String | Null
  /**
    * Value of "this"
    */
  def getThis(): js.Any
  /**
    * Type of "this" as a string.
    * This is the name of the function stored in the constructor field of
    * "this", if available.  Otherwise the object's [[Class]] internal
    * property.
    */
  def getTypeName(): String | Null
  /**
    * Is this a constructor call?
    */
  def isConstructor(): Boolean
  /**
    * Does this call take place in code defined by a call to eval?
    */
  def isEval(): Boolean
  /**
    * Is this call in native V8 code?
    */
  def isNative(): Boolean
  /**
    * Is this a toplevel invocation, that is, is "this" the global object?
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
    getMethodName: CallbackTo[String | Null],
    getThis: CallbackTo[js.Any],
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

