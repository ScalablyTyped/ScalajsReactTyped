package typingsJapgolly.phaser.mod

import typingsJapgolly.phaser.MatterJS.ICollisionData
import typingsJapgolly.phaser.MatterJS.ICollisionFilter
import typingsJapgolly.phaser.MatterJS.IPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Matter.Detector` module contains methods for detecting collisions given a set of pairs.
  *
  * @class Detector
  */
@JSImport("matter", "Detector")
@js.native
class Detector ()
  extends typingsJapgolly.phaser.MatterJS.Detector

/* static members */
@JSImport("matter", "Detector")
@js.native
object Detector extends js.Object {
  /**
    * Returns `true` if both supplied collision filters will allow a collision to occur.
    * See `body.collisionFilter` for more information.
    * @method canCollide
    * @param {} filterA
    * @param {} filterB
    * @return {bool} `true` if collision can occur
    */
  def canCollide(filterA: ICollisionFilter, filterB: ICollisionFilter): Boolean = js.native
  /**
    * Finds all collisions given a list of pairs.
    * @method collisions
    * @param {pair[]} broadphasePairs
    * @param {engine} engine
    * @return {ICollisionData[]} collisions
    */
  def collisions(broadphasePairs: js.Array[IPair], engine: typingsJapgolly.phaser.MatterJS.Engine): js.Array[ICollisionData] = js.native
}

