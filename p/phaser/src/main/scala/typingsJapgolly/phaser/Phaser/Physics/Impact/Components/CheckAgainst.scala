package typingsJapgolly.phaser.Phaser.Physics.Impact.Components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Check Against component.
  * Should be applied as a mixin.
  */
trait CheckAgainst extends js.Object {
  /**
    * [description]
    */
  var checkAgainst: Double
  /**
    * [description]
    */
  def setAvsB(): GameObject
  /**
    * [description]
    */
  def setBvsA(): GameObject
  /**
    * [description]
    */
  def setCheckAgainstA(): GameObject
  /**
    * [description]
    */
  def setCheckAgainstB(): GameObject
  /**
    * [description]
    */
  def setCheckAgainstNone(): GameObject
}

object CheckAgainst {
  @scala.inline
  def apply(
    checkAgainst: Double,
    setAvsB: CallbackTo[GameObject],
    setBvsA: CallbackTo[GameObject],
    setCheckAgainstA: CallbackTo[GameObject],
    setCheckAgainstB: CallbackTo[GameObject],
    setCheckAgainstNone: CallbackTo[GameObject]
  ): CheckAgainst = {
    val __obj = js.Dynamic.literal(checkAgainst = checkAgainst.asInstanceOf[js.Any])
    __obj.updateDynamic("setAvsB")(setAvsB.toJsFn)
    __obj.updateDynamic("setBvsA")(setBvsA.toJsFn)
    __obj.updateDynamic("setCheckAgainstA")(setCheckAgainstA.toJsFn)
    __obj.updateDynamic("setCheckAgainstB")(setCheckAgainstB.toJsFn)
    __obj.updateDynamic("setCheckAgainstNone")(setCheckAgainstNone.toJsFn)
    __obj.asInstanceOf[CheckAgainst]
  }
}

