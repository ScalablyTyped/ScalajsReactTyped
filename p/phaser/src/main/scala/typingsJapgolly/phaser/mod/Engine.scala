package typingsJapgolly.phaser.mod

import typingsJapgolly.phaser.MatterJS.IEngineDefinition
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Matter.Engine` module contains methods for creating and manipulating engines.
  * An engine is a controller that manages updating the simulation of the world.
  * See `Matter.Runner` for an optional game loop utility.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class Engine
  */
@JSImport("matter", "Engine")
@js.native
class Engine ()
  extends typingsJapgolly.phaser.MatterJS.Engine

/* static members */
@JSImport("matter", "Engine")
@js.native
object Engine extends js.Object {
  /**
    * Clears the engine including the world, pairs and broadphase.
    * @method clear
    * @param {engine} engine
    */
  def clear(engine: typingsJapgolly.phaser.MatterJS.Engine): Unit = js.native
  /**
    * Creates a new engine. The options parameter is an object that specifies any properties you wish to override the defaults.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {HTMLElement} element
    * @param {object} [options]
    * @return {engine} engine
    * @deprecated
    */
  /**
    * Creates a new engine. The options parameter is an object that specifies any properties you wish to override the defaults.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {object} [options]
    * @return {engine} engine
    * @deprecated
    */
  def create(): typingsJapgolly.phaser.MatterJS.Engine = js.native
  def create(element: IEngineDefinition): typingsJapgolly.phaser.MatterJS.Engine = js.native
  def create(element: IEngineDefinition, options: IEngineDefinition): typingsJapgolly.phaser.MatterJS.Engine = js.native
  def create(element: HTMLElement): typingsJapgolly.phaser.MatterJS.Engine = js.native
  def create(element: HTMLElement, options: IEngineDefinition): typingsJapgolly.phaser.MatterJS.Engine = js.native
  /**
    * Merges two engines by keeping the configuration of `engineA` but replacing the world with the one from `engineB`.
    * @method merge
    * @param {engine} engineA
    * @param {engine} engineB
    */
  def merge(engineA: typingsJapgolly.phaser.MatterJS.Engine, engineB: typingsJapgolly.phaser.MatterJS.Engine): Unit = js.native
  /**
    * An alias for `Runner.run`, see `Matter.Runner` for more information.
    * @method run
    * @param {engine} engine
    */
  def run(engine: typingsJapgolly.phaser.MatterJS.Engine): Unit = js.native
  /**
    * Moves the simulation forward in time by `delta` ms.
    * The `correction` argument is an optional `Number` that specifies the time correction factor to apply to the update.
    * This can help improve the accuracy of the simulation in cases where `delta` is changing between updates.
    * The value of `correction` is defined as `delta / lastDelta`, i.e. the percentage change of `delta` over the last step.
    * Therefore the value is always `1` (no correction) when `delta` constant (or when no correction is desired, which is the default).
    * See the paper on <a href="http://lonesock.net/article/verlet.html">Time Corrected Verlet</a> for more information.
    *
    * Triggers `beforeUpdate` and `afterUpdate` events.
    * Triggers `collisionStart`, `collisionActive` and `collisionEnd` events.
    * @method update
    * @param {engine} engine
    * @param {number} [delta=16.666]
    * @param {number} [correction=1]
    */
  def update(engine: typingsJapgolly.phaser.MatterJS.Engine): typingsJapgolly.phaser.MatterJS.Engine = js.native
  def update(engine: typingsJapgolly.phaser.MatterJS.Engine, delta: Double): typingsJapgolly.phaser.MatterJS.Engine = js.native
  def update(engine: typingsJapgolly.phaser.MatterJS.Engine, delta: Double, correction: Double): typingsJapgolly.phaser.MatterJS.Engine = js.native
}

