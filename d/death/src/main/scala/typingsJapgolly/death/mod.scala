package typingsJapgolly.death

import typingsJapgolly.death.deathStrings.SIGHUP
import typingsJapgolly.death.deathStrings.SIGINT
import typingsJapgolly.death.deathStrings.SIGQUIT
import typingsJapgolly.death.deathStrings.SIGTERM
import typingsJapgolly.death.deathStrings.uncaughtException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("death", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(callback: js.Function1[/* signal */ SIGINT | SIGTERM | SIGQUIT, Unit]): js.Function0[Unit] = js.native
  /**
    * Invokes a callback when a SIGINT, SIGTERM, or SIGQUIT is detected
    * on the current node process. Configurable by the provided options.
    *
    * @param options
    * @returns A function to subscribe to the configured death detection
    * @example
    *  ON_DEATH({
    *    debug: true,
    *    uncaughtException: true,
    *  })((signal) => {
    *    console.log('Oh no!');
    *  });
    * @example
    *  const OFF_DEATH = ON_DEATH({
    *    debug: true,
    *    uncaughtException: true,
    *  })((signal) => {
    *    console.log('Oh no!');
    *  });
    *  // later
    *  OFF_DEATH();
    */
  def apply(options: AnonDebug): js.Function1[
    /* callback */ js.Function1[/* signal */ SIGINT | SIGTERM | SIGQUIT | SIGHUP | uncaughtException, Unit], 
    js.Function0[Unit]
  ] = js.native
}

