package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.HTMLElement
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dxDeferRendering {
  
  type ContentReadyEvent = EventInfo[dxDeferRendering]
  
  type DisposingEvent = EventInfo[dxDeferRendering]
  
  type InitializedEvent = InitializedEventInfo[dxDeferRendering]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxDeferRendering]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxDeferRendering, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxDeferRenderingOptions
  
  type RenderedEvent = EventInfo[dxDeferRendering]
  
  type ShownEvent = EventInfo[dxDeferRendering]
}
