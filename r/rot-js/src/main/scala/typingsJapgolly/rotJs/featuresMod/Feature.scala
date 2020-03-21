package typingsJapgolly.rotJs.featuresMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class Dungeon feature; has own .create() method
  */
trait Feature extends js.Object {
  def create(digCallback: DigCallback): Unit
  def debug(): Unit
  def isValid(isWallCallback: TestPositionCallback, canBeDugCallback: TestPositionCallback): Boolean
}

object Feature {
  @scala.inline
  def apply(
    create: DigCallback => Callback,
    debug: Callback,
    isValid: (TestPositionCallback, TestPositionCallback) => CallbackTo[Boolean]
  ): Feature = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.rotJs.featuresMod.DigCallback) => create(t0).runNow()))
    __obj.updateDynamic("debug")(debug.toJsFn)
    __obj.updateDynamic("isValid")(js.Any.fromFunction2((t0: typingsJapgolly.rotJs.featuresMod.TestPositionCallback, t1: typingsJapgolly.rotJs.featuresMod.TestPositionCallback) => isValid(t0, t1).runNow()))
    __obj.asInstanceOf[Feature]
  }
}

