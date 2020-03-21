package typingsJapgolly.cordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// cordova/argscheck module
@js.native
trait ArgsCheck extends js.Object {
  var enableChecks: Boolean = js.native
  def checkArgs(argsSpec: String, functionName: String, args: js.Array[_]): Unit = js.native
  def checkArgs(argsSpec: String, functionName: String, args: js.Array[_], callee: js.Any): Unit = js.native
  def getValue(): js.Any = js.native
  def getValue(value: js.Any): js.Any = js.native
  def getValue(value: js.Any, defaultValue: js.Any): js.Any = js.native
}

