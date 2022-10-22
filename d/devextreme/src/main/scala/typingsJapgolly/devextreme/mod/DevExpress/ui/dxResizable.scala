package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.NativeEventInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxResizable {
  
  type DisposingEvent = EventInfo[dxResizable]
  
  type InitializedEvent = InitializedEventInfo[dxResizable]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxResizable]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxResizable, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxResizableOptions
  
  trait ResizeEndEvent
    extends StObject
       with NativeEventInfo[dxResizable, MouseEvent | TouchEvent]
       with ResizeInfo
  object ResizeEndEvent {
    
    inline def apply(component: dxResizable, element: DxElement_[HTMLElement], height: Double, width: Double): ResizeEndEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeEndEvent]
    }
  }
  
  trait ResizeEvent
    extends StObject
       with NativeEventInfo[dxResizable, MouseEvent | TouchEvent]
       with ResizeInfo
  object ResizeEvent {
    
    inline def apply(component: dxResizable, element: DxElement_[HTMLElement], height: Double, width: Double): ResizeEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeEvent]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.bottom
    - typingsJapgolly.devextreme.devextremeStrings.left
    - typingsJapgolly.devextreme.devextremeStrings.right
    - typingsJapgolly.devextreme.devextremeStrings.top
    - typingsJapgolly.devextreme.devextremeStrings.all
  */
  trait ResizeHandle extends StObject
  object ResizeHandle {
    
    inline def all: typingsJapgolly.devextreme.devextremeStrings.all = "all".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.all]
    
    inline def bottom: typingsJapgolly.devextreme.devextremeStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.bottom]
    
    inline def left: typingsJapgolly.devextreme.devextremeStrings.left = "left".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.left]
    
    inline def right: typingsJapgolly.devextreme.devextremeStrings.right = "right".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.right]
    
    inline def top: typingsJapgolly.devextreme.devextremeStrings.top = "top".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.top]
  }
  
  trait ResizeInfo extends StObject {
    
    val height: Double
    
    val width: Double
  }
  object ResizeInfo {
    
    inline def apply(height: Double, width: Double): ResizeInfo = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeInfo]
    }
    
    extension [Self <: ResizeInfo](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResizeStartEvent
    extends StObject
       with NativeEventInfo[dxResizable, MouseEvent | TouchEvent]
       with ResizeInfo
  object ResizeStartEvent {
    
    inline def apply(component: dxResizable, element: DxElement_[HTMLElement], height: Double, width: Double): ResizeStartEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeStartEvent]
    }
  }
}
