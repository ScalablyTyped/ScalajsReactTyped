package typingsJapgolly.phaser.Phaser.Physics.Impact.Components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Body Type component.
  * Should be applied as a mixin.
  */
trait BodyType extends js.Object {
  /**
    * [description]
    */
  def getBodyType(): Double
  /**
    * [description]
    */
  def setTypeA(): GameObject
  /**
    * [description]
    */
  def setTypeB(): GameObject
  /**
    * [description]
    */
  def setTypeNone(): GameObject
}

object BodyType {
  @scala.inline
  def apply(
    getBodyType: CallbackTo[Double],
    setTypeA: CallbackTo[GameObject],
    setTypeB: CallbackTo[GameObject],
    setTypeNone: CallbackTo[GameObject]
  ): BodyType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBodyType")(getBodyType.toJsFn)
    __obj.updateDynamic("setTypeA")(setTypeA.toJsFn)
    __obj.updateDynamic("setTypeB")(setTypeB.toJsFn)
    __obj.updateDynamic("setTypeNone")(setTypeNone.toJsFn)
    __obj.asInstanceOf[BodyType]
  }
}

