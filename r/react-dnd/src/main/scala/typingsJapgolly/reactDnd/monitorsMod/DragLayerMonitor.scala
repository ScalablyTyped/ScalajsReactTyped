package typingsJapgolly.reactDnd.monitorsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragLayerMonitor extends js.Object {
  /**
    * Returns the last recorded { x, y } client offset of the pointer while a drag operation is in progress.
    * Returns null if no item is being dragged.
    */
  def getClientOffset(): XYCoord | Null
  /**
    * Returns the { x, y } difference between the last recorded client offset of the pointer and the client
    * offset when current the drag operation has started. Returns null if no item is being dragged.
    */
  def getDifferenceFromInitialOffset(): XYCoord | Null
  /**
    * Returns the { x, y } client offset of the pointer at the time when the current drag operation has started.
    * Returns null if no item is being dragged.
    */
  def getInitialClientOffset(): XYCoord | Null
  /**
    * Returns the { x, y } client offset of the drag source component's root DOM node at the time when the current
    * drag operation has started. Returns null if no item is being dragged.
    */
  def getInitialSourceClientOffset(): XYCoord | Null
  /**
    * Returns a plain object representing the currently dragged item.
    * Every drag source must specify it by returning an object from its beginDrag() method.
    * Returns null if no item is being dragged.
    */
  def getItem(): js.Any
  /**
    * Returns a string or an ES6 symbol identifying the type of the current dragged item.
    * Returns null if no item is being dragged.
    */
  def getItemType(): Identifier | Null
  /**
    * Returns the projected { x, y } client offset of the drag source component's root DOM node, based on its
    * position at the time when the current drag operation has started, and the movement difference.
    * Returns null if no item is being dragged.
    */
  def getSourceClientOffset(): XYCoord | Null
  /**
    * Returns true if a drag operation is in progress. Returns false otherwise.
    */
  def isDragging(): Boolean
}

object DragLayerMonitor {
  @scala.inline
  def apply(
    getClientOffset: CallbackTo[XYCoord | Null],
    getDifferenceFromInitialOffset: CallbackTo[XYCoord | Null],
    getInitialClientOffset: CallbackTo[XYCoord | Null],
    getInitialSourceClientOffset: CallbackTo[XYCoord | Null],
    getItem: CallbackTo[js.Any],
    getItemType: CallbackTo[Identifier | Null],
    getSourceClientOffset: CallbackTo[XYCoord | Null],
    isDragging: CallbackTo[Boolean]
  ): DragLayerMonitor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getClientOffset")(getClientOffset.toJsFn)
    __obj.updateDynamic("getDifferenceFromInitialOffset")(getDifferenceFromInitialOffset.toJsFn)
    __obj.updateDynamic("getInitialClientOffset")(getInitialClientOffset.toJsFn)
    __obj.updateDynamic("getInitialSourceClientOffset")(getInitialSourceClientOffset.toJsFn)
    __obj.updateDynamic("getItem")(getItem.toJsFn)
    __obj.updateDynamic("getItemType")(getItemType.toJsFn)
    __obj.updateDynamic("getSourceClientOffset")(getSourceClientOffset.toJsFn)
    __obj.updateDynamic("isDragging")(isDragging.toJsFn)
    __obj.asInstanceOf[DragLayerMonitor]
  }
}

