package typingsJapgolly.botvs.mod._Global_.botvs

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  def init(): Unit
  def main(): Unit
}

object Context {
  @scala.inline
  def apply(init: Callback, main: Callback): Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("main")(main.toJsFn)
    __obj.asInstanceOf[Context]
  }
}

