package typingsJapgolly.meshblu

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.meshblu.Meshblu.Connection
import typingsJapgolly.meshblu.Meshblu.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshbluStatic extends js.Object {
  /**
  	 * Establish a secure socket.io connection to Meshblu.
  	 * @param opt
  	 * @returns A Meshblu Connection.
  	 */
  def createConnection(opt: ConnectionOptions): Connection
}

object MeshbluStatic {
  @scala.inline
  def apply(createConnection: ConnectionOptions => CallbackTo[Connection]): MeshbluStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createConnection")(js.Any.fromFunction1((t0: typingsJapgolly.meshblu.Meshblu.ConnectionOptions) => createConnection(t0).runNow()))
    __obj.asInstanceOf[MeshbluStatic]
  }
}

