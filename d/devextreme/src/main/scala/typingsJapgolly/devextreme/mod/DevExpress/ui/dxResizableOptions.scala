package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import typingsJapgolly.devextreme.mod.DevExpress.DOMComponentOptions
import typingsJapgolly.devextreme.mod.DevExpress.core.UserDefinedElement
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxResizable.ResizeEndEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxResizable.ResizeEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxResizable.ResizeHandle
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxResizable.ResizeStartEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxResizableOptions
  extends StObject
     with DOMComponentOptions[dxResizable] {
  
  /**
    * 
    */
  var area: js.UndefOr[String | UserDefinedElement[Element]] = js.undefined
  
  /**
    * Specifies which borders of the UI component element are used as a handle.
    */
  var handles: js.UndefOr[ResizeHandle | String] = js.undefined
  
  /**
    * 
    */
  var keepAspectRatio: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the upper height boundary for resizing.
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the upper width boundary for resizing.
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the lower height boundary for resizing.
    */
  var minHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the lower width boundary for resizing.
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * A function that is executed each time the UI component is resized by one pixel.
    */
  var onResize: js.UndefOr[js.Function1[/* e */ ResizeEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when resizing ends.
    */
  var onResizeEnd: js.UndefOr[js.Function1[/* e */ ResizeEndEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when resizing starts.
    */
  var onResizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEvent, Unit]] = js.undefined
}
object dxResizableOptions {
  
  inline def apply(): dxResizableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxResizableOptions]
  }
  
  extension [Self <: dxResizableOptions](x: Self) {
    
    inline def setArea(value: String | UserDefinedElement[Element]): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    inline def setHandles(value: ResizeHandle | String): Self = StObject.set(x, "handles", value.asInstanceOf[js.Any])
    
    inline def setHandlesUndefined: Self = StObject.set(x, "handles", js.undefined)
    
    inline def setKeepAspectRatio(value: Boolean): Self = StObject.set(x, "keepAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setKeepAspectRatioUndefined: Self = StObject.set(x, "keepAspectRatio", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setOnResize(value: /* e */ ResizeEvent => Callback): Self = StObject.set(x, "onResize", js.Any.fromFunction1((t0: /* e */ ResizeEvent) => value(t0).runNow()))
    
    inline def setOnResizeEnd(value: /* e */ ResizeEndEvent => Callback): Self = StObject.set(x, "onResizeEnd", js.Any.fromFunction1((t0: /* e */ ResizeEndEvent) => value(t0).runNow()))
    
    inline def setOnResizeEndUndefined: Self = StObject.set(x, "onResizeEnd", js.undefined)
    
    inline def setOnResizeStart(value: /* e */ ResizeStartEvent => Callback): Self = StObject.set(x, "onResizeStart", js.Any.fromFunction1((t0: /* e */ ResizeStartEvent) => value(t0).runNow()))
    
    inline def setOnResizeStartUndefined: Self = StObject.set(x, "onResizeStart", js.undefined)
    
    inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
  }
}
