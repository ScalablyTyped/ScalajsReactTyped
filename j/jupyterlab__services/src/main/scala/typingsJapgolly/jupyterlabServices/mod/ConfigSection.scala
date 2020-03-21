package typingsJapgolly.jupyterlabServices.mod

import typingsJapgolly.jupyterlabServices.configMod.ConfigSection.IOptions
import typingsJapgolly.jupyterlabServices.configMod.IConfigSection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services", "ConfigSection")
@js.native
object ConfigSection extends js.Object {
  /**
    * Create a config section.
    *
    * @returns A Promise that is fulfilled with the config section is loaded.
    */
  def create(options: IOptions): js.Promise[IConfigSection] = js.native
}

