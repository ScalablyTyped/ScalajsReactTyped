package typingsJapgolly.winjs.WinJS.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winjs.WinJS.Promise
import typingsJapgolly.winjs.WinJS.Utilities.IPosition
import typingsJapgolly.winjs.anon.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Supports semantic zoom functionality by exposing a control as either the zoomed in or the zoomed out view of the SemanticZoom control.
  **/
trait IZoomableView[T] extends StObject {
  
  //#region Methods
  /**
    * Initiates semantic zoom on the custom control.
    **/
  def beginZoom(): Unit
  
  /**
    * Initializes the semantic zoom state for the custom control.
    * @param isZoomedOut True if this is the zoomed out view; otherwise false.
    * @param isCurrentView True if this is the current view; otherwise false.
    * @param triggerZoom The function that manages semantic zoom behavior. Triggers a zoom in or zoom out if the control is the visible control.
    * @param prefetchedPages The number of pages of content to pre-fetch for zooming. This value is dependent on the size of the semantic zoom container. More content can be displayed based on the zoom factor and the size of the container.
    **/
  def configureForZoom(isZoomedOut: Boolean, isCurrentView: Boolean, triggerZoom: js.Function, prefetchedPages: Double): Unit
  
  /**
    * Terminates semantic zoom on the zoomed in or zoomed out child of the custom control.
    * @param isCurrentView True if the control is the visible control; otherwise false.
    **/
  def endZoom(isCurrentView: Boolean): Unit
  
  /**
    * Retrieves the current item of the zoomed in or zoomed out child of the custom control.
    * @returns An object that represents the selected item. This return value must be a Promise for the following: item, position.
    **/
  def getCurrentItem(): Promise[Item[T]]
  
  /**
    * Retrieves the panning axis of the zoomed-in or zoomed-out child of the custom control.
    * @returns Identifies the panning axis of the child control. Implementation specific.
    **/
  def getPanAxis(): String
  
  /**
    * Manages pointer input for the custom control.
    * @param pointerId The ID of the pointer.
    **/
  def handlePointer(pointerId: String): Unit
  
  /**
    * Positions the specified item within the viewport of the child control when panning or zooming begins.
    * @param item The object to position within the viewport of the child control. item can be a number, a string, or an object with any number of properties.
    * @param position An object that contains the position data of the item relative to the child control. position must be an object with four number properties: left, top, width, and height. These values specify a rectangle that is typically the bounding box of the current item, though the details are up to the control. The units of the position must be in pixels. And the coordinates must be relative to the top-left of the control viewport (which should occupy the same area as the semantic zoom viewport), except when in RTL mode. In RTL mode, return coordinates relative to the top-right off the control viewport. The rectangle is transformed from the coordinate system of one control to that of the other.
    **/
  def positionItem(item: T, position: IPosition): Unit
  
  /**
    * Selects the item closest to the specified screen coordinates.
    * @param x The x-coordinate in DIPs relative to the upper-left corner of the SemanticZoom viewport.
    * @param y The y-coordinate in DIPs relative to the upper-left corner of the SemanticZoom viewport..
    **/
  def setCurrentItem(x: Double, y: Double): Unit
}
object IZoomableView {
  
  inline def apply[T](
    beginZoom: Callback,
    configureForZoom: (Boolean, Boolean, js.Function, Double) => Callback,
    endZoom: Boolean => Callback,
    getCurrentItem: CallbackTo[Promise[Item[T]]],
    getPanAxis: CallbackTo[String],
    handlePointer: String => Callback,
    positionItem: (T, IPosition) => Callback,
    setCurrentItem: (Double, Double) => Callback
  ): IZoomableView[T] = {
    val __obj = js.Dynamic.literal(beginZoom = beginZoom.toJsFn, configureForZoom = js.Any.fromFunction4((t0: Boolean, t1: Boolean, t2: js.Function, t3: Double) => (configureForZoom(t0, t1, t2, t3)).runNow()), endZoom = js.Any.fromFunction1((t0: Boolean) => endZoom(t0).runNow()), getCurrentItem = getCurrentItem.toJsFn, getPanAxis = getPanAxis.toJsFn, handlePointer = js.Any.fromFunction1((t0: String) => handlePointer(t0).runNow()), positionItem = js.Any.fromFunction2((t0: T, t1: IPosition) => (positionItem(t0, t1)).runNow()), setCurrentItem = js.Any.fromFunction2((t0: Double, t1: Double) => (setCurrentItem(t0, t1)).runNow()))
    __obj.asInstanceOf[IZoomableView[T]]
  }
  
  extension [Self <: IZoomableView[?], T](x: Self & IZoomableView[T]) {
    
    inline def setBeginZoom(value: Callback): Self = StObject.set(x, "beginZoom", value.toJsFn)
    
    inline def setConfigureForZoom(value: (Boolean, Boolean, js.Function, Double) => Callback): Self = StObject.set(x, "configureForZoom", js.Any.fromFunction4((t0: Boolean, t1: Boolean, t2: js.Function, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setEndZoom(value: Boolean => Callback): Self = StObject.set(x, "endZoom", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setGetCurrentItem(value: CallbackTo[Promise[Item[T]]]): Self = StObject.set(x, "getCurrentItem", value.toJsFn)
    
    inline def setGetPanAxis(value: CallbackTo[String]): Self = StObject.set(x, "getPanAxis", value.toJsFn)
    
    inline def setHandlePointer(value: String => Callback): Self = StObject.set(x, "handlePointer", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setPositionItem(value: (T, IPosition) => Callback): Self = StObject.set(x, "positionItem", js.Any.fromFunction2((t0: T, t1: IPosition) => (value(t0, t1)).runNow()))
    
    inline def setSetCurrentItem(value: (Double, Double) => Callback): Self = StObject.set(x, "setCurrentItem", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
  }
}
