package typingsJapgolly.phaser.mod

import typingsJapgolly.phaser.MatterJS.IMouseConstraintDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Matter.MouseConstraint` module contains methods for creating mouse constraints.
  * Mouse constraints are used for allowing user interaction, providing the ability to move bodies via the mouse or touch.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class MouseConstraint
  */
@JSImport("matter", "MouseConstraint")
@js.native
class MouseConstraint ()
  extends typingsJapgolly.phaser.MatterJS.MouseConstraint

/* static members */
@JSImport("matter", "MouseConstraint")
@js.native
object MouseConstraint extends js.Object {
  /**
    * Creates a new mouse constraint.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {engine} engine
    * @param {} options
    * @return {MouseConstraint} A new MouseConstraint
    */
  def create(engine: typingsJapgolly.phaser.MatterJS.Engine): typingsJapgolly.phaser.MatterJS.MouseConstraint = js.native
  def create(engine: typingsJapgolly.phaser.MatterJS.Engine, options: IMouseConstraintDefinition): typingsJapgolly.phaser.MatterJS.MouseConstraint = js.native
}

