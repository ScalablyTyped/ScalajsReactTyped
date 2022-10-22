package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.HTMLElement
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.events.Cancelable
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxToast {
  
  type ContentReadyEvent = EventInfo[dxToast]
  
  type DisposingEvent = EventInfo[dxToast]
  
  type HiddenEvent = EventInfo[dxToast]
  
  trait HidingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxToast]
  object HidingEvent {
    
    inline def apply(component: dxToast, element: DxElement_[HTMLElement]): HidingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[HidingEvent]
    }
  }
  
  type InitializedEvent = InitializedEventInfo[dxToast]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxToast]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxToast, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxToastOptions
  
  trait ShowingEvent
    extends StObject
       with Cancelable
       with EventInfo[dxToast]
  object ShowingEvent {
    
    inline def apply(component: dxToast, element: DxElement_[HTMLElement]): ShowingEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShowingEvent]
    }
  }
  
  type ShownEvent = EventInfo[dxToast]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.custom
    - typingsJapgolly.devextreme.devextremeStrings.error
    - typingsJapgolly.devextreme.devextremeStrings.info
    - typingsJapgolly.devextreme.devextremeStrings.success
    - typingsJapgolly.devextreme.devextremeStrings.warning
  */
  trait ToastType extends StObject
  object ToastType {
    
    inline def custom: typingsJapgolly.devextreme.devextremeStrings.custom = "custom".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.custom]
    
    inline def error: typingsJapgolly.devextreme.devextremeStrings.error = "error".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.error]
    
    inline def info: typingsJapgolly.devextreme.devextremeStrings.info = "info".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.info]
    
    inline def success: typingsJapgolly.devextreme.devextremeStrings.success = "success".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.success]
    
    inline def warning: typingsJapgolly.devextreme.devextremeStrings.warning = "warning".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.warning]
  }
}
