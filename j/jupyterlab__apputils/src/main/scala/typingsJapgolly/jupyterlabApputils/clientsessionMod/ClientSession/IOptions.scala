package typingsJapgolly.jupyterlabApputils.clientsessionMod.ClientSession

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabApputils.clientsessionMod.IClientSession.IKernelPreference
import typingsJapgolly.jupyterlabServices.sessionSessionMod.Session.IManager
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a context.
  */
trait IOptions extends js.Object {
  /**
    * A kernel preference.
    */
  var kernelPreference: js.UndefOr[IKernelPreference] = js.undefined
  /**
    * A session manager instance.
    */
  var manager: IManager
  /**
    * The name of the session.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The initial path of the file.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * A function to call when the session becomes busy.
    */
  var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.undefined
  /**
    * The type of the session.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    manager: IManager,
    kernelPreference: IKernelPreference = null,
    name: String = null,
    path: String = null,
    setBusy: js.UndefOr[CallbackTo[IDisposable]] = js.undefined,
    `type`: String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
    if (kernelPreference != null) __obj.updateDynamic("kernelPreference")(kernelPreference.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    setBusy.foreach(p => __obj.updateDynamic("setBusy")(p.toJsFn))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

