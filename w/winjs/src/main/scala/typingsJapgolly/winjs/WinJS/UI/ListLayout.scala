package typingsJapgolly.winjs.WinJS.UI

import japgolly.scalajs.react.Callback
import typingsJapgolly.winjs.WinJS.Utilities.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a layout for the ListView in which items are arranged in a vertical list.
  **/
trait ListLayout extends StObject {
  
  //#endregion Methods
  //#region Properties
  /**
    * This property is no longer supported. Starting with Windows Library for JavaScript 2.0, use the .win-listview.win-container.win-backdrop CSS selector.
    **/
  var backdropColor: String
  
  /**
    * This property is no longer supported. Starting with Windows Library for JavaScript 2.0, use the .win-listview.win-container.win-backdrop CSS selector.
    **/
  var disableBackdrop: Boolean
  
  //#endregion Constructors
  //#region Methods
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def dragLeave(): Unit
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def dragOver(): Unit
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def executeAnimations(): Unit
  
  /**
    * Determines the next item to receive keyboard focus.
    * @param currentItem An object that describes the current item. It has these properties: index, type.
    * @param pressedKey The key that was pressed.
    * @returns An object that describes the next item that should receive focus. It has these properties: index, type.
    **/
  def getAdjacent(currentItem: Any, pressedKey: Key): Any
  
  /**
    * Gets or sets the position of group headers.
    **/
  var groupHeaderPosition: HeaderPosition
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param x The x-coordinate, or the horizontal position on the screen.
    * @param y The y-coordinate, or the vertical position on the screen.
    **/
  def hitTest(x: Double, y: Double): Unit
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def initialize(): Unit
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param firstPixel
    * @param lastPixel
    **/
  def itemsFromRange(firstPixel: Double, lastPixel: Double): Unit
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    * @param tree
    * @param changedRange
    * @param modifiedItems
    * @param modifiedGroups
    **/
  def layout(tree: Any, changedRange: Any, modifiedItems: Any, modifiedGroups: Any): Unit
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  var numberOfItemsPerItemsBlock: Any
  
  /**
    * Gets or sets the orientation of the GridLayout.
    **/
  var orientation: Orientation
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def setupAnimations(): Unit
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  def uninitialize(): Unit
}
object ListLayout {
  
  inline def apply(
    backdropColor: String,
    disableBackdrop: Boolean,
    dragLeave: Callback,
    dragOver: Callback,
    executeAnimations: Callback,
    getAdjacent: (Any, Key) => Any,
    groupHeaderPosition: HeaderPosition,
    hitTest: (Double, Double) => Callback,
    initialize: Callback,
    itemsFromRange: (Double, Double) => Callback,
    layout: (Any, Any, Any, Any) => Callback,
    numberOfItemsPerItemsBlock: Any,
    orientation: Orientation,
    setupAnimations: Callback,
    uninitialize: Callback
  ): ListLayout = {
    val __obj = js.Dynamic.literal(backdropColor = backdropColor.asInstanceOf[js.Any], disableBackdrop = disableBackdrop.asInstanceOf[js.Any], dragLeave = dragLeave.toJsFn, dragOver = dragOver.toJsFn, executeAnimations = executeAnimations.toJsFn, getAdjacent = js.Any.fromFunction2(getAdjacent), groupHeaderPosition = groupHeaderPosition.asInstanceOf[js.Any], hitTest = js.Any.fromFunction2((t0: Double, t1: Double) => (hitTest(t0, t1)).runNow()), initialize = initialize.toJsFn, itemsFromRange = js.Any.fromFunction2((t0: Double, t1: Double) => (itemsFromRange(t0, t1)).runNow()), layout = js.Any.fromFunction4((t0: Any, t1: Any, t2: Any, t3: Any) => (layout(t0, t1, t2, t3)).runNow()), numberOfItemsPerItemsBlock = numberOfItemsPerItemsBlock.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], setupAnimations = setupAnimations.toJsFn, uninitialize = uninitialize.toJsFn)
    __obj.asInstanceOf[ListLayout]
  }
  
  extension [Self <: ListLayout](x: Self) {
    
    inline def setBackdropColor(value: String): Self = StObject.set(x, "backdropColor", value.asInstanceOf[js.Any])
    
    inline def setDisableBackdrop(value: Boolean): Self = StObject.set(x, "disableBackdrop", value.asInstanceOf[js.Any])
    
    inline def setDragLeave(value: Callback): Self = StObject.set(x, "dragLeave", value.toJsFn)
    
    inline def setDragOver(value: Callback): Self = StObject.set(x, "dragOver", value.toJsFn)
    
    inline def setExecuteAnimations(value: Callback): Self = StObject.set(x, "executeAnimations", value.toJsFn)
    
    inline def setGetAdjacent(value: (Any, Key) => Any): Self = StObject.set(x, "getAdjacent", js.Any.fromFunction2(value))
    
    inline def setGroupHeaderPosition(value: HeaderPosition): Self = StObject.set(x, "groupHeaderPosition", value.asInstanceOf[js.Any])
    
    inline def setHitTest(value: (Double, Double) => Callback): Self = StObject.set(x, "hitTest", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setInitialize(value: Callback): Self = StObject.set(x, "initialize", value.toJsFn)
    
    inline def setItemsFromRange(value: (Double, Double) => Callback): Self = StObject.set(x, "itemsFromRange", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setLayout(value: (Any, Any, Any, Any) => Callback): Self = StObject.set(x, "layout", js.Any.fromFunction4((t0: Any, t1: Any, t2: Any, t3: Any) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setNumberOfItemsPerItemsBlock(value: Any): Self = StObject.set(x, "numberOfItemsPerItemsBlock", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setSetupAnimations(value: Callback): Self = StObject.set(x, "setupAnimations", value.toJsFn)
    
    inline def setUninitialize(value: Callback): Self = StObject.set(x, "uninitialize", value.toJsFn)
  }
}
