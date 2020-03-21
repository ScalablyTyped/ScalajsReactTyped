package typingsJapgolly.phaser.Phaser.Physics.Impact.Components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phaser.CollideCallback
import typingsJapgolly.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Collides component.
  * Should be applied as a mixin.
  */
trait Collides extends js.Object {
  /**
    * [description]
    */
  var collides: Double
  /**
    * [description]
    */
  def setActiveCollision(): GameObject
  /**
    * [description]
    * @param callback [description]
    * @param scope [description]
    */
  def setCollideCallback(callback: CollideCallback, scope: js.Any): GameObject
  /**
    * [description]
    */
  def setCollidesNever(): GameObject
  /**
    * [description]
    */
  def setFixedCollision(): GameObject
  /**
    * [description]
    */
  def setLiteCollision(): GameObject
  /**
    * [description]
    */
  def setPassiveCollision(): GameObject
}

object Collides {
  @scala.inline
  def apply(
    collides: Double,
    setActiveCollision: CallbackTo[GameObject],
    setCollideCallback: (CollideCallback, js.Any) => CallbackTo[GameObject],
    setCollidesNever: CallbackTo[GameObject],
    setFixedCollision: CallbackTo[GameObject],
    setLiteCollision: CallbackTo[GameObject],
    setPassiveCollision: CallbackTo[GameObject]
  ): Collides = {
    val __obj = js.Dynamic.literal(collides = collides.asInstanceOf[js.Any])
    __obj.updateDynamic("setActiveCollision")(setActiveCollision.toJsFn)
    __obj.updateDynamic("setCollideCallback")(js.Any.fromFunction2((t0: typingsJapgolly.phaser.CollideCallback, t1: js.Any) => setCollideCallback(t0, t1).runNow()))
    __obj.updateDynamic("setCollidesNever")(setCollidesNever.toJsFn)
    __obj.updateDynamic("setFixedCollision")(setFixedCollision.toJsFn)
    __obj.updateDynamic("setLiteCollision")(setLiteCollision.toJsFn)
    __obj.updateDynamic("setPassiveCollision")(setPassiveCollision.toJsFn)
    __obj.asInstanceOf[Collides]
  }
}

