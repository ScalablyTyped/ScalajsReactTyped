package typingsJapgolly.plottable

import typingsJapgolly.plottable.interactionMod.Interaction
import typingsJapgolly.plottable.interfacesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/interactions/pointerInteraction", JSImport.Namespace)
@js.native
object pointerInteractionMod extends js.Object {
  @js.native
  class Pointer () extends Interaction {
    var _mouseDispatcher: js.Any = js.native
    var _mouseMoveCallback: js.Any = js.native
    var _overComponent: js.Any = js.native
    var _pointerEnterCallbacks: js.Any = js.native
    var _pointerExitCallbacks: js.Any = js.native
    var _pointerMoveCallbacks: js.Any = js.native
    var _touchDispatcher: js.Any = js.native
    var _touchStartCallback: js.Any = js.native
    /* private */ def _handleMouseEvent(p: js.Any, e: js.Any): js.Any = js.native
    /* private */ def _handlePointerEvent(p: js.Any, insideSVG: js.Any): js.Any = js.native
    /* private */ def _handleTouchEvent(p: js.Any, e: js.Any): js.Any = js.native
    /**
      * Removes a callback that would be called when the pointer enters the Component.
      *
      * @param {PointerCallback} callback
      * @return {Interactions.Pointer} The calling Pointer Interaction.
      */
    def offPointerEnter(callback: PointerCallback): this.type = js.native
    /**
      * Removes a callback that would be called when the pointer exits the Component.
      *
      * @param {PointerCallback} callback
      * @return {Interactions.Pointer} The calling Pointer Interaction.
      */
    def offPointerExit(callback: PointerCallback): this.type = js.native
    /**
      * Removes a callback that would be called when the pointer moves within the Component.
      *
      * @param {PointerCallback} callback
      * @return {Interactions.Pointer} The calling Pointer Interaction.
      */
    def offPointerMove(callback: PointerCallback): this.type = js.native
    /**
      * Adds a callback to be called when the pointer enters the Component.
      *
      * @param {PointerCallback} callback
      * @return {Interactions.Pointer} The calling Pointer Interaction.
      */
    def onPointerEnter(callback: PointerCallback): this.type = js.native
    /**
      * Adds a callback to be called when the pointer exits the Component.
      *
      * @param {PointerCallback} callback
      * @return {Interactions.Pointer} The calling Pointer Interaction.
      */
    def onPointerExit(callback: PointerCallback): this.type = js.native
    /**
      * Adds a callback to be called when the pointer moves within the Component.
      *
      * @param {PointerCallback} callback
      * @return {Interactions.Pointer} The calling Pointer Interaction.
      */
    def onPointerMove(callback: PointerCallback): this.type = js.native
  }
  
  type PointerCallback = js.Function1[/* point */ Point, Unit]
}

