package typingsJapgolly.openfin.environmentMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.openfin.frameFrameMod.EntityType
import typingsJapgolly.openfin.identityMod.Identity
import typingsJapgolly.openfin.wireMod.NewConnectConfig
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  def createChildWindow(options: js.Any): js.Promise[_]
  def getCurrentEntityIdentity(): Identity
  def getCurrentEntityType(): EntityType
  def getNextMessageId(): js.Any
  def getRandomId(): String
  def getWebWindow(identity: Identity): Window_
  def isWindowExists(uuid: String, name: String): Boolean
  def retrievePort(config: NewConnectConfig): js.Promise[Double]
  def writeToken(path: String, token: String): js.Promise[String]
}

object Environment {
  @scala.inline
  def apply(
    createChildWindow: js.Any => CallbackTo[js.Promise[js.Any]],
    getCurrentEntityIdentity: CallbackTo[Identity],
    getCurrentEntityType: CallbackTo[EntityType],
    getNextMessageId: CallbackTo[js.Any],
    getRandomId: CallbackTo[String],
    getWebWindow: Identity => CallbackTo[Window_],
    isWindowExists: (String, String) => CallbackTo[Boolean],
    retrievePort: NewConnectConfig => CallbackTo[js.Promise[Double]],
    writeToken: (String, String) => CallbackTo[js.Promise[String]]
  ): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createChildWindow")(js.Any.fromFunction1((t0: js.Any) => createChildWindow(t0).runNow()))
    __obj.updateDynamic("getCurrentEntityIdentity")(getCurrentEntityIdentity.toJsFn)
    __obj.updateDynamic("getCurrentEntityType")(getCurrentEntityType.toJsFn)
    __obj.updateDynamic("getNextMessageId")(getNextMessageId.toJsFn)
    __obj.updateDynamic("getRandomId")(getRandomId.toJsFn)
    __obj.updateDynamic("getWebWindow")(js.Any.fromFunction1((t0: typingsJapgolly.openfin.identityMod.Identity) => getWebWindow(t0).runNow()))
    __obj.updateDynamic("isWindowExists")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => isWindowExists(t0, t1).runNow()))
    __obj.updateDynamic("retrievePort")(js.Any.fromFunction1((t0: typingsJapgolly.openfin.wireMod.NewConnectConfig) => retrievePort(t0).runNow()))
    __obj.updateDynamic("writeToken")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => writeToken(t0, t1).runNow()))
    __obj.asInstanceOf[Environment]
  }
}

