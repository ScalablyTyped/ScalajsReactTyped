package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxSplitter object.
  */
trait ASPxClientSplitter
  extends StObject
     with ASPxClientControl {
  
  /**
    * Returns a string value that represents the client state of splitter panes.
    */
  def GetLayoutData(): String
  
  /**
    * Returns the splitter's root pane specified by its index within the ASPxSplitter.Panes collection. An ASPxClientSplitterPane object representing the root pane located at the specified index within the splitter's ASPxSplitter.Panes collection.
    * @param index An integer value specifying the zero-based index of the root pane to be retrieved.
    */
  def GetPane(index: Double): ASPxClientSplitterPane
  
  /**
    * Returns a pane specified by its name. An ASPxClientSplitterPane object that represents the pane with the specified name.
    * @param name A string value specifying the name of the pane.
    */
  def GetPaneByName(name: String): ASPxClientSplitterPane
  
  /**
    * Returns the number of panes at the root level of a splitter.
    */
  def GetPaneCount(): Double
  
  /**
    * Fires after a pane has been collapsed.
    */
  var PaneCollapsed: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]]
  
  /**
    * Fires before a pane is collapsed.
    */
  var PaneCollapsing: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]]
  
  /**
    * Fires after a specific web page has been loaded into a pane.
    */
  var PaneContentUrlLoaded: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]]
  
  /**
    * Fires after a pane has been expanded.
    */
  var PaneExpanded: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]]
  
  /**
    * Fires before a pane is expanded.
    */
  var PaneExpanding: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]]
  
  /**
    * Occurs when a pane resize operation has been completed.
    */
  var PaneResizeCompleted: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]]
  
  /**
    * Fires after a pane has been resized.
    */
  var PaneResized: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]]
  
  /**
    * Fires before a pane is resized.
    */
  var PaneResizing: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]]
  
  /**
    * Specifies whether the control's panes can be resized by end-users on the client side.
    * @param allowResize true if pane resizing is allowed; otherwise, false.
    */
  def SetAllowResize(allowResize: Boolean): Unit
}
object ASPxClientSplitter {
  
  inline def apply(
    AdjustControl: Callback,
    GetClientVisible: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetLayoutData: CallbackTo[String],
    GetMainElement: CallbackTo[Any],
    GetPane: Double => ASPxClientSplitterPane,
    GetPaneByName: String => ASPxClientSplitterPane,
    GetPaneCount: CallbackTo[Double],
    GetParentControl: CallbackTo[Any],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    PaneCollapsed: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]],
    PaneCollapsing: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]],
    PaneContentUrlLoaded: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]],
    PaneExpanded: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]],
    PaneExpanding: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]],
    PaneResizeCompleted: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]],
    PaneResized: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]],
    PaneResizing: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetAllowResize: Boolean => Callback,
    SetClientVisible: Boolean => Callback,
    SetHeight: Double => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    name: String
  ): ASPxClientSplitter = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, GetClientVisible = GetClientVisible.toJsFn, GetHeight = GetHeight.toJsFn, GetLayoutData = GetLayoutData.toJsFn, GetMainElement = GetMainElement.toJsFn, GetPane = js.Any.fromFunction1(GetPane), GetPaneByName = js.Any.fromFunction1(GetPaneByName), GetPaneCount = GetPaneCount.toJsFn, GetParentControl = GetParentControl.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], PaneCollapsed = PaneCollapsed.asInstanceOf[js.Any], PaneCollapsing = PaneCollapsing.asInstanceOf[js.Any], PaneContentUrlLoaded = PaneContentUrlLoaded.asInstanceOf[js.Any], PaneExpanded = PaneExpanded.asInstanceOf[js.Any], PaneExpanding = PaneExpanding.asInstanceOf[js.Any], PaneResizeCompleted = PaneResizeCompleted.asInstanceOf[js.Any], PaneResized = PaneResized.asInstanceOf[js.Any], PaneResizing = PaneResizing.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetAllowResize = js.Any.fromFunction1((t0: Boolean) => SetAllowResize(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSplitter]
  }
  
  extension [Self <: ASPxClientSplitter](x: Self) {
    
    inline def setGetLayoutData(value: CallbackTo[String]): Self = StObject.set(x, "GetLayoutData", value.toJsFn)
    
    inline def setGetPane(value: Double => ASPxClientSplitterPane): Self = StObject.set(x, "GetPane", js.Any.fromFunction1(value))
    
    inline def setGetPaneByName(value: String => ASPxClientSplitterPane): Self = StObject.set(x, "GetPaneByName", js.Any.fromFunction1(value))
    
    inline def setGetPaneCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetPaneCount", value.toJsFn)
    
    inline def setPaneCollapsed(value: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]]): Self = StObject.set(x, "PaneCollapsed", value.asInstanceOf[js.Any])
    
    inline def setPaneCollapsing(value: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]]): Self = StObject.set(x, "PaneCollapsing", value.asInstanceOf[js.Any])
    
    inline def setPaneContentUrlLoaded(value: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]]): Self = StObject.set(x, "PaneContentUrlLoaded", value.asInstanceOf[js.Any])
    
    inline def setPaneExpanded(value: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]]): Self = StObject.set(x, "PaneExpanded", value.asInstanceOf[js.Any])
    
    inline def setPaneExpanding(value: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]]): Self = StObject.set(x, "PaneExpanding", value.asInstanceOf[js.Any])
    
    inline def setPaneResizeCompleted(value: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]]): Self = StObject.set(x, "PaneResizeCompleted", value.asInstanceOf[js.Any])
    
    inline def setPaneResized(value: ASPxClientEvent[ASPxClientSplitterPaneEventHandler[ASPxClientSplitter]]): Self = StObject.set(x, "PaneResized", value.asInstanceOf[js.Any])
    
    inline def setPaneResizing(value: ASPxClientEvent[ASPxClientSplitterPaneCancelEventHandler[ASPxClientSplitter]]): Self = StObject.set(x, "PaneResizing", value.asInstanceOf[js.Any])
    
    inline def setSetAllowResize(value: Boolean => Callback): Self = StObject.set(x, "SetAllowResize", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
