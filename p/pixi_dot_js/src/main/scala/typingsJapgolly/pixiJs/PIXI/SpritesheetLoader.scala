package typingsJapgolly.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link PIXI.Loader Loader} middleware for loading texture atlases that have been created with
  * TexturePacker or similar JSON-based spritesheet.
  *
  * This middleware automatically generates Texture resources.
  *
  * @class
  * @memberof PIXI
  * @implements PIXI.ILoaderPlugin
  */
@JSGlobal("PIXI.SpritesheetLoader")
@js.native
class SpritesheetLoader () extends ILoaderPlugin

/* static members */
@JSGlobal("PIXI.SpritesheetLoader")
@js.native
object SpritesheetLoader extends js.Object {
  /**
    * Get the spritesheets root path
    * @param {PIXI.LoaderResource} resource - Resource to check path
    * @param {string} baseUrl - Base root url
    */
  def getResourcePath(resource: LoaderResource, baseUrl: String): Unit = js.native
  /**
    * Called after a resource is loaded.
    * @see PIXI.Loader.loaderMiddleware
    * @param {PIXI.LoaderResource} resource
    * @param {function} next
    */
  def use(resource: LoaderResource, next: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
}

