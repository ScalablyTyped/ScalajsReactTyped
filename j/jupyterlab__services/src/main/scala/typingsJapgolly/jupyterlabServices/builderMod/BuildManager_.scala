package typingsJapgolly.jupyterlabServices.builderMod

import typingsJapgolly.jupyterlabServices.builderMod.BuildManager.IOptions
import typingsJapgolly.jupyterlabServices.builderMod.BuildManager.IStatus
import typingsJapgolly.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/builder", "BuildManager")
@js.native
/**
  * Create a new setting manager.
  */
class BuildManager_ () extends js.Object {
  def this(options: IOptions) = this()
  var _url: js.Any = js.native
  /**
    * Test whether the build service is available.
    */
  val isAvailable: Boolean = js.native
  /**
    * The server settings used to make API requests.
    */
  val serverSettings: ISettings = js.native
  /**
    * Test whether to check build status automatically.
    */
  val shouldCheck: Boolean = js.native
  /**
    * Build the application.
    */
  def build(): js.Promise[Unit] = js.native
  /**
    * Cancel an active build.
    */
  def cancel(): js.Promise[Unit] = js.native
  /**
    * Get whether the application should be built.
    */
  def getStatus(): js.Promise[IStatus] = js.native
}

