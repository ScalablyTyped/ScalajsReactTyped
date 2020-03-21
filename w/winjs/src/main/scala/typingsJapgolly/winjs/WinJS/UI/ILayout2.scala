package typingsJapgolly.winjs.WinJS.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winjs.WinJS.Utilities.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a layout for the ListView.
  **/
trait ILayout2 extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the orientation of the layout.
    **/
  var orientation: js.Any
  //#region Methods
  /**
    * Called when the ListView finishes a drag operation.
    **/
  def dragLeave(): Unit
  /**
    * Called when the ListView initiates a drag operation.
    * @param x The x-coordinate of the drag.
    * @param y The y-coordinate of the drag.
    * @param dragInfo An object that indicates whether the item is selected.
    **/
  def dragOver(x: Double, y: Double, dragInfo: Double): Unit
  /**
    * Called when the ListView requests that the ILayout2 execute animations.
    **/
  def executeAnimations(): Unit
  /**
    * Determines the next item to receive keyboard focus.
    * @param currentItem An object that describes the current item. It has these properties: index, type.
    * @param pressedKey The key that was pressed.
    * @returns An object that describes the next item that should receive focus. It has these properties: index, type.
    **/
  def getAdjacent(currentItem: js.Any, pressedKey: Key): js.Any
  /**
    * Gets the item at the specified hit-test coordinates. These coordinates are absolute coordinates (they are not relative to the layout's content area).
    * @param x The x-coordinate to test for.
    * @param y The y-coordinate to test for.
    * @returns An object that describes the item at the hit test coordinates. It has these properties: type, index.
    **/
  def hitTest(x: Double, y: Double): js.Any
  /**
    * Sets the rendering site and specifies whether the layout supports groups. This method is called by the ListView to initialize the layout.
    * @param site The rendering site for the layout.
    * @param groupsEnabled Set to true if this layout supports groups; set to false if it does not.
    **/
  def initialize(site: ILayoutSite2, groupsEnabled: Boolean): Unit
  /**
    * Retrieves the indexes of the items in the specified pixel range.
    * @param firstPixel The first pixel the range of items falls between.
    * @param lastPixel The last pixel the range of items falls between.
    **/
  def itemsFromRange(firstPixel: Double, lastPixel: Double): Unit
  /**
    * Performs a layout pass.
    * @param tree A structure representing the layout tree that is returned from the ListView.
    * @param changedRange An object that lists the index of the first item in the changed item range. This object has these properties: startIndex.
    * @param modifiedItems An object that contains the old and new indexes of the items that have been modified in the tree.
    * @param modifiedGroups An object that contains the old and new indexes of the group elements that have been modified in the tree.
    * @returns A Promise that executes after layout is complete, or an object that contains two Promise objects: realizedRangeComplete, layoutComplete.
    **/
  def layout(tree: js.Any, changedRange: js.Any, modifiedItems: js.Any, modifiedGroups: js.Any): js.Any
  /**
    * Called when the ListView requests that the ILayout2 set up animations.
    **/
  def setupAnimations(): Unit
  /**
    * Releases resources that were obtained during the call to initialize.
    **/
  def uninitialize(): Unit
}

object ILayout2 {
  @scala.inline
  def apply(
    dragLeave: Callback,
    dragOver: (Double, Double, Double) => Callback,
    executeAnimations: Callback,
    getAdjacent: (js.Any, Key) => CallbackTo[js.Any],
    hitTest: (Double, Double) => CallbackTo[js.Any],
    initialize: (ILayoutSite2, Boolean) => Callback,
    itemsFromRange: (Double, Double) => Callback,
    layout: (js.Any, js.Any, js.Any, js.Any) => CallbackTo[js.Any],
    orientation: js.Any,
    setupAnimations: Callback,
    uninitialize: Callback
  ): ILayout2 = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
    __obj.updateDynamic("dragLeave")(dragLeave.toJsFn)
    __obj.updateDynamic("dragOver")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => dragOver(t0, t1, t2).runNow()))
    __obj.updateDynamic("executeAnimations")(executeAnimations.toJsFn)
    __obj.updateDynamic("getAdjacent")(js.Any.fromFunction2((t0: js.Any, t1: typingsJapgolly.winjs.WinJS.Utilities.Key) => getAdjacent(t0, t1).runNow()))
    __obj.updateDynamic("hitTest")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => hitTest(t0, t1).runNow()))
    __obj.updateDynamic("initialize")(js.Any.fromFunction2((t0: typingsJapgolly.winjs.WinJS.UI.ILayoutSite2, t1: scala.Boolean) => initialize(t0, t1).runNow()))
    __obj.updateDynamic("itemsFromRange")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => itemsFromRange(t0, t1).runNow()))
    __obj.updateDynamic("layout")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any) => layout(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("setupAnimations")(setupAnimations.toJsFn)
    __obj.updateDynamic("uninitialize")(uninitialize.toJsFn)
    __obj.asInstanceOf[ILayout2]
  }
}

