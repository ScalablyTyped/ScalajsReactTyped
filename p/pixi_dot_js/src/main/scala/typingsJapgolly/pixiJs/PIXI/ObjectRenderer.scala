package typingsJapgolly.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base for a common object renderer that can be used as a
  * system renderer plugin.
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI
  */
@JSGlobal("PIXI.ObjectRenderer")
@js.native
class ObjectRenderer protected () extends System {
  def this(renderer: Renderer) = this()
  /**
    * Stub method that should be used to empty the current
    * batch by rendering objects now.
    */
  def flush(): Unit = js.native
  /**
    * Keeps the object to render. It doesn't have to be
    * rendered immediately.
    *
    * @param {PIXI.DisplayObject} object - The object to render.
    */
  def render(`object`: DisplayObject): Unit = js.native
  /**
    * Stub method that initializes any state required before
    * rendering starts. It is different from the `prerender`
    * signal, which occurs every frame, in that it is called
    * whenever an object requests _this_ renderer specifically.
    */
  def start(): Unit = js.native
  /**
    * Stops the renderer. It should free up any state and
    * become dormant.
    */
  def stop(): Unit = js.native
}

