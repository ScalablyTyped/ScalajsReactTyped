package typingsJapgolly.enigmaJs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.enigmaJs.enigmaJS.IConfig
import typingsJapgolly.enigmaJs.enigmaJS.ISession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// declare const enigmaJS: IEnigmaClass;
// export = enigmaJS;
// export as namespace enigmaJS;
trait IEnigmaClass extends js.Object {
  /**
    * Create a session object.
    * @returns - Returns a session.
    * Note: See Configuration for the configuration options.
    */
  def create(config: IConfig): ISession
}

object IEnigmaClass {
  @scala.inline
  def apply(create: IConfig => CallbackTo[ISession]): IEnigmaClass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.enigmaJs.enigmaJS.IConfig) => create(t0).runNow()))
    __obj.asInstanceOf[IEnigmaClass]
  }
}

