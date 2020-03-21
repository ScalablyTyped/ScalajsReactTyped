package typingsJapgolly.jupyterlabApputils.clientsessionMod.ClientSession

import typingsJapgolly.jupyterlabApputils.clientsessionMod.IClientSession.IKernelPreference
import typingsJapgolly.jupyterlabServices.kernelKernelMod.Kernel.ISpecModels
import typingsJapgolly.jupyterlabServices.sessionSessionMod.Session.IModel
import typingsJapgolly.phosphorAlgorithm.iterMod.IterableOrArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for populating a kernel selector.
  */
trait IKernelSearch extends js.Object {
  /**
    * The kernel preference.
    */
  var preference: IKernelPreference
  /**
    * The current running sessions.
    */
  var sessions: js.UndefOr[IterableOrArrayLike[IModel]] = js.undefined
  /**
    * The Kernel specs.
    */
  var specs: ISpecModels | Null
}

object IKernelSearch {
  @scala.inline
  def apply(
    preference: IKernelPreference,
    sessions: IterableOrArrayLike[IModel] = null,
    specs: ISpecModels = null
  ): IKernelSearch = {
    val __obj = js.Dynamic.literal(preference = preference.asInstanceOf[js.Any])
    if (sessions != null) __obj.updateDynamic("sessions")(sessions.asInstanceOf[js.Any])
    if (specs != null) __obj.updateDynamic("specs")(specs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKernelSearch]
  }
}

