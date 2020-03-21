package typingsJapgolly.phaser.mod

import typingsJapgolly.phaser.MatterJS.BodyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Matter.Sleeping` module contains methods to manage the sleeping state of bodies.
  *
  * @class Sleeping
  */
@JSImport("matter", "Sleeping")
@js.native
class Sleeping ()
  extends typingsJapgolly.phaser.MatterJS.Sleeping

/* static members */
@JSImport("matter", "Sleeping")
@js.native
object Sleeping extends js.Object {
  def set(body: BodyType, isSleeping: Boolean): Unit = js.native
}

