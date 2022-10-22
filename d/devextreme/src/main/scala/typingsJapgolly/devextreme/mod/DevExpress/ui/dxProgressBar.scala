package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.NativeEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.Editor.ValueChangedInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxProgressBar {
  
  type CompleteEvent = NativeEventInfo[dxProgressBar, Event]
  
  type ContentReadyEvent = EventInfo[dxProgressBar]
  
  type DisposingEvent = EventInfo[dxProgressBar]
  
  type InitializedEvent = InitializedEventInfo[dxProgressBar]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxProgressBar]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxProgressBar, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxProgressBarOptions
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxProgressBar, Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxProgressBar, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}
