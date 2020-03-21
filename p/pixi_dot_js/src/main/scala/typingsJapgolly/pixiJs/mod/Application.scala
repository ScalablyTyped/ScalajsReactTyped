package typingsJapgolly.pixiJs.mod

import typingsJapgolly.pixiJs.AnonAntialias
import typingsJapgolly.pixiJs.PIXI.Application.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Convenience class to create a new PIXI application.
  *
  * This class automatically creates the renderer, ticker and root container.
  *
  * @example
  * // Create the application
  * const app = new PIXI.Application();
  *
  * // Add the view to the DOM
  * document.body.appendChild(app.view);
  *
  * // ex, add display objects
  * app.stage.addChild(PIXI.Sprite.from('something.png'));
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "Application")
@js.native
class Application ()
  extends typingsJapgolly.pixiJs.PIXI.Application {
  def this(options: AnonAntialias) = this()
}

/* static members */
@JSImport("pixi.js", "Application")
@js.native
object Application extends js.Object {
  /**
    * Register a middleware plugin for the application
    * @static
    * @param {PIXI.Application.Plugin} plugin - Plugin being installed
    */
  def registerPlugin(plugin: Plugin): Unit = js.native
}

