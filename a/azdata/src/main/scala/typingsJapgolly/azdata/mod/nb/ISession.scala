package typingsJapgolly.azdata.mod.nb

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.azdata.mod.IConnectionProfile
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISession extends js.Object {
  /**
  			 * Is change of kernels supported for this session?
  			 */
  var canChangeKernels: Boolean
  /**
  			 * Tracks whether the default kernel failed to load
  			 * This could be for a reason such as the kernel name not being recognized as a valid kernel;
  			 */
  var defaultKernelLoaded: js.UndefOr[Boolean] = js.undefined
  /*
  			 * Unique id of the session.
  			 */
  val id: String
  /**
  			 * The kernel.
  			 *
  			 * #### Notes
  			 * This is a read-only property, and can be altered by [changeKernel].
  			 */
  val kernel: IKernel
  /**
  			 * The current name associated with the session.
  			 */
  val name: String
  /**
  			 * The current path associated with the session.
  			 */
  val path: String
  /**
  			 * The status indicates if the kernel is healthy, dead, starting, etc.
  			 */
  val status: KernelStatus
  /**
  			 * The type of the session.
  			 */
  val `type`: String
  def changeKernel(kernelInfo: IKernelSpec): Thenable[IKernel]
  def configureConnection(connection: IConnectionProfile): Thenable[Unit]
  def configureKernel(kernelInfo: IKernelSpec): Thenable[Unit]
}

object ISession {
  @scala.inline
  def apply(
    canChangeKernels: Boolean,
    changeKernel: IKernelSpec => CallbackTo[Thenable[IKernel]],
    configureConnection: IConnectionProfile => CallbackTo[Thenable[Unit]],
    configureKernel: IKernelSpec => CallbackTo[Thenable[Unit]],
    id: String,
    kernel: IKernel,
    name: String,
    path: String,
    status: KernelStatus,
    `type`: String,
    defaultKernelLoaded: js.UndefOr[Boolean] = js.undefined
  ): ISession = {
    val __obj = js.Dynamic.literal(canChangeKernels = canChangeKernels.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("changeKernel")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.nb.IKernelSpec) => changeKernel(t0).runNow()))
    __obj.updateDynamic("configureConnection")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.IConnectionProfile) => configureConnection(t0).runNow()))
    __obj.updateDynamic("configureKernel")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.nb.IKernelSpec) => configureKernel(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultKernelLoaded)) __obj.updateDynamic("defaultKernelLoaded")(defaultKernelLoaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISession]
  }
}

