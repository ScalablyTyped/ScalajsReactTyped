package typingsJapgolly.phaser.mod

import typingsJapgolly.phaser.MatterJS.BodyType
import typingsJapgolly.phaser.MatterJS.ICollisionData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Matter.SAT` module contains methods for detecting collisions using the Separating Axis Theorem.
  *
  * @class SAT
  */
@JSImport("matter", "SAT")
@js.native
class SAT ()
  extends typingsJapgolly.phaser.MatterJS.SAT

/* static members */
@JSImport("matter", "SAT")
@js.native
object SAT extends js.Object {
  /**
    * Detect collision between two bodies using the Separating Axis Theorem.
    * @method collides
    * @param {body} bodyA
    * @param {body} bodyB
    * @param {ICollisionData} previousCollision
    * @return {ICollisionData} collision
    */
  def collides(bodyA: BodyType, bodyB: BodyType, previousCollision: ICollisionData): ICollisionData = js.native
}

