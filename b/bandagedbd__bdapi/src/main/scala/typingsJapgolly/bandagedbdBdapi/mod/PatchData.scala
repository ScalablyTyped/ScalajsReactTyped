package typingsJapgolly.bandagedbdBdapi.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchData extends js.Object {
  var CancelPatch: typingsJapgolly.bandagedbdBdapi.mod.CancelPatch
  var methodArguments: js.Array[_]
  var returnValue: js.Any
  var thisObject: js.Object
  def callOriginalMethod(): Unit
  def originalMethod(): Unit
}

object PatchData {
  @scala.inline
  def apply(
    CancelPatch: Callback,
    callOriginalMethod: Callback,
    methodArguments: js.Array[_],
    originalMethod: Callback,
    returnValue: js.Any,
    thisObject: js.Object
  ): PatchData = {
    val __obj = js.Dynamic.literal(methodArguments = methodArguments.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], thisObject = thisObject.asInstanceOf[js.Any])
    __obj.updateDynamic("CancelPatch")(CancelPatch.toJsFn)
    __obj.updateDynamic("callOriginalMethod")(callOriginalMethod.toJsFn)
    __obj.updateDynamic("originalMethod")(originalMethod.toJsFn)
    __obj.asInstanceOf[PatchData]
  }
}

