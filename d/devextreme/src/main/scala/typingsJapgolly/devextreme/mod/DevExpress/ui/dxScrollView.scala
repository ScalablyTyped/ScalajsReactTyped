package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.HTMLElement
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.core.utils.DxPromise
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxScrollable.ScrollEventInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxScrollView
  extends StObject
     with dxScrollable[dxScrollViewOptions] {
  
  /**
    * Locks the UI component until the release(preventScrollBottom) method is called and executes the function passed to the onPullDown property and the handler assigned to the pullDown event.
    */
  def refresh(): Unit = js.native
  
  /**
    * Notifies the ScrollView that data loading is finished.
    */
  def release(preventScrollBottom: Boolean): DxPromise[Unit] = js.native
}
object dxScrollView {
  
  type DisposingEvent = EventInfo[dxScrollView]
  
  type InitializedEvent = InitializedEventInfo[dxScrollView]
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxScrollView]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxScrollView, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxScrollViewOptions
  
  type PullDownEvent = EventInfo[dxScrollView]
  
  type ReachBottomEvent = EventInfo[dxScrollView]
  
  type ScrollEvent = ScrollEventInfo[dxScrollView]
  
  type UpdatedEvent = ScrollEventInfo[dxScrollView]
}
