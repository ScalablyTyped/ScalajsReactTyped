package typingsJapgolly.grpc.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallCredentials extends js.Object {
  /**
    * Creates a new CallCredentials object from properties of both this and
    * another CallCredentials object. This object's metadata generator will be
    * called first.
    * @param callCredentials The other CallCredentials object.
    */
  def compose(callCredentials: CallCredentials): CallCredentials
  /**
    * Asynchronously generates a new Metadata object.
    * @param options Options used in generating the Metadata object.
    */
  def generateMetadata(options: js.Object): js.Promise[Metadata]
}

object CallCredentials {
  @scala.inline
  def apply(
    compose: CallCredentials => CallbackTo[CallCredentials],
    generateMetadata: js.Object => CallbackTo[js.Promise[Metadata]]
  ): CallCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compose")(js.Any.fromFunction1((t0: typingsJapgolly.grpc.mod.CallCredentials) => compose(t0).runNow()))
    __obj.updateDynamic("generateMetadata")(js.Any.fromFunction1((t0: js.Object) => generateMetadata(t0).runNow()))
    __obj.asInstanceOf[CallCredentials]
  }
}

