package typingsJapgolly.jupyterlabRendermime.mod

import typingsJapgolly.jupyterlabRendermime.registryMod.RenderMimeRegistry.IOptions
import typingsJapgolly.jupyterlabRendermime.registryMod.RenderMimeRegistry.IUrlResolverOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime", "RenderMimeRegistry")
@js.native
/**
  * Construct a new rendermime.
  *
  * @param options - The options for initializing the instance.
  */
class RenderMimeRegistry ()
  extends typingsJapgolly.jupyterlabRendermime.registryMod.RenderMimeRegistry {
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/rendermime", "RenderMimeRegistry")
@js.native
object RenderMimeRegistry extends js.Object {
  /**
    * A default resolver that uses a session and a contents manager.
    */
  @js.native
  class UrlResolver protected ()
    extends typingsJapgolly.jupyterlabRendermime.registryMod.RenderMimeRegistry.UrlResolver {
    /**
      * Create a new url resolver for a console.
      */
    def this(options: IUrlResolverOptions) = this()
  }
  
}

