package typingsJapgolly.grunt.grunt.util

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link https://github.com/snbartell/node-spawn}
  */
trait ISpawnedChild extends js.Object {
  /**
    * Convenience function. Overrides options.restarts to -1.
    * Runs command indefinitely no matter the options passed into the constructor.
    */
  def forever(): Unit
  /**
    * Shut down the child and don't let it restart.
    */
  def kill(): Unit
  /**
    * Convenience function. Overrides options. restarts to 0.
    * Runs command exactly once no matter the options passed into the constructor.
    */
  def once(): Unit
  /**
    * Start the cmd with the options provided.
    */
  def start(): Unit
}

object ISpawnedChild {
  @scala.inline
  def apply(forever: Callback, kill: Callback, once: Callback, start: Callback): ISpawnedChild = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forever")(forever.toJsFn)
    __obj.updateDynamic("kill")(kill.toJsFn)
    __obj.updateDynamic("once")(once.toJsFn)
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.asInstanceOf[ISpawnedChild]
  }
}

