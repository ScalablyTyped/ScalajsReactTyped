package typingsJapgolly.playcanvas.mod

import typingsJapgolly.playcanvas.AnonApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ScriptType
  * @augments pc.EventHandler
  * @classdesc Represents the type of a script. It is returned by {@link pc.createScript}.
  * Also referred to as Script Type.
  *
  * The type is to be extended using its JavaScript prototype. There is a **list of methods**
  * that will be executed by the engine on instances of this type, such as:
  *
  * * initialize
  * * postInitialize
  * * update
  * * postUpdate
  * * swap
  *
  * **initialize** and **postInitialize** - are called if defined when script is about to run
  * for the first time - postInitialize will run after all initialize methods are executed in
  * the same tick or enabling chain of actions.
  *
  * **update** and **postUpdate** - methods are called if defined for enabled (running state)
  * scripts on each tick.
  *
  * **swap** - This method will be called when a {@link pc.ScriptType} that already exists in
  * the registry gets redefined. If the new {@link pc.ScriptType} has a `swap` method in its
  * prototype, then it will be executed to perform hot-reload at runtime.
  * @property {pc.Application} app The {@link pc.Application} that the instance of this type
  * belongs to.
  * @property {pc.Entity} entity The {@link pc.Entity} that the instance of this type belongs to.
  * @property {boolean} enabled True if the instance of this type is in running state. False
  * when script is not running, because the Entity or any of its parents are disabled or the
  * Script Component is disabled or the Script Instance is disabled. When disabled no update
  * methods will be called on each tick. initialize and postInitialize methods will run once
  * when the script instance is in `enabled` state during app tick.
  * @param {object} args - The input arguments object
  * @param {pc.Application} args.app - The {@link pc.Application} that is running the script
  * @param {pc.Entity} args.entity - The {@link pc.Entity} that the script is attached to
  *
  */
@JSImport("playcanvas", "ScriptType")
@js.native
class ScriptType protected ()
  extends typingsJapgolly.playcanvas.pc.ScriptType {
  def this(args: AnonApp) = this()
}

/* static members */
@JSImport("playcanvas", "ScriptType")
@js.native
object ScriptType extends js.Object {
  /**
    * @readonly
    * @static
    * @function
    * @name pc.ScriptType.extend
    * @param {object} methods - Object with methods, where key - is name of method, and value - is function.
    * @description Shorthand function to extend Script Type prototype with list of methods.
    * @example
    * var PlayerController = pc.createScript('playerController');
    *
    * PlayerController.extend({
    *     initialize: function () {
    *         // called once on initialize
    *     },
    *     update: function (dt) {
    *         // called each tick
    *     }
    * });
    */
  def extend(methods: js.Any): Unit = js.native
}

