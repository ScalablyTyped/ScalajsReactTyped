package typingsJapgolly.jasmine.jasmine

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XSuite extends js.Object {
  def execute(): Unit
}

object XSuite {
  @scala.inline
  def apply(execute: Callback): XSuite = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute.toJsFn)
    __obj.asInstanceOf[XSuite]
  }
}

