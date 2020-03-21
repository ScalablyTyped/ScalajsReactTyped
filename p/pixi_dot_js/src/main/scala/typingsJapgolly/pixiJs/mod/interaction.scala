package typingsJapgolly.pixiJs.mod

import typingsJapgolly.pixiJs.AnonAutoPreventDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This namespace contains a renderer plugin for handling mouse, pointer, and touch events.
  *
  * Do not instantiate this plugin directly. It is available from the `renderer.plugins` property.
  * See {@link PIXI.CanvasRenderer#plugins} or {@link PIXI.Renderer#plugins}.
  * @namespace PIXI.interaction
  */
@JSImport("pixi.js", "interaction")
@js.native
object interaction extends js.Object {
  /**
    * Holds all information related to an Interaction event
    *
    * @class
    * @memberof PIXI.interaction
    */
  @js.native
  class InteractionData ()
    extends typingsJapgolly.pixiJs.PIXI.interaction.InteractionData
  
  /**
    * Event class that mimics native DOM events.
    *
    * @class
    * @memberof PIXI.interaction
    */
  @js.native
  class InteractionEvent ()
    extends typingsJapgolly.pixiJs.PIXI.interaction.InteractionEvent
  
  /**
    * The interaction manager deals with mouse, touch and pointer events.
    *
    * Any DisplayObject can be interactive if its `interactive` property is set to true.
    *
    * This manager also supports multitouch.
    *
    * An instance of this class is automatically created by default, and can be found at `renderer.plugins.interaction`
    *
    * @class
    * @extends PIXI.utils.EventEmitter
    * @memberof PIXI.interaction
    */
  @js.native
  class InteractionManager protected ()
    extends typingsJapgolly.pixiJs.PIXI.interaction.InteractionManager {
    def this(renderer: typingsJapgolly.pixiJs.PIXI.Renderer) = this()
    def this(renderer: typingsJapgolly.pixiJs.PIXI.Renderer, options: AnonAutoPreventDefault) = this()
  }
  
}

