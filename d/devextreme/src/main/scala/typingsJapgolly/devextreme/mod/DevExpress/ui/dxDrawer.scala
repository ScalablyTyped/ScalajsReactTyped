package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.HTMLElement
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.core.utils.DxPromise
import typingsJapgolly.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDrawer
  extends StObject
     with Widget[dxDrawerOptions] {
  
  /**
    * Gets the drawer&apos;s content.
    */
  def content(): DxElement_[HTMLElement] = js.native
  
  /**
    * Closes the drawer.
    */
  def hide(): DxPromise[Unit] = js.native
  
  /**
    * Opens the drawer.
    */
  def show(): DxPromise[Unit] = js.native
  
  /**
    * Opens or closes the drawer, reversing the current state.
    */
  def toggle(): DxPromise[Unit] = js.native
}
object dxDrawer {
  
  type DisposingEvent = EventInfo[dxDrawer]
  
  type InitializedEvent = InitializedEventInfo[dxDrawer]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.overlap
    - typingsJapgolly.devextreme.devextremeStrings.shrink
    - typingsJapgolly.devextreme.devextremeStrings.push
  */
  trait OpenedStateMode extends StObject
  object OpenedStateMode {
    
    inline def overlap: typingsJapgolly.devextreme.devextremeStrings.overlap = "overlap".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.overlap]
    
    inline def push: typingsJapgolly.devextreme.devextremeStrings.push = "push".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.push]
    
    inline def shrink: typingsJapgolly.devextreme.devextremeStrings.shrink = "shrink".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.shrink]
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxDrawer]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxDrawer, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.left
    - typingsJapgolly.devextreme.devextremeStrings.right
    - typingsJapgolly.devextreme.devextremeStrings.top
    - typingsJapgolly.devextreme.devextremeStrings.bottom
    - typingsJapgolly.devextreme.devextremeStrings.before
    - typingsJapgolly.devextreme.devextremeStrings.after
  */
  trait PanelLocation extends StObject
  object PanelLocation {
    
    inline def after: typingsJapgolly.devextreme.devextremeStrings.after = "after".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.after]
    
    inline def before: typingsJapgolly.devextreme.devextremeStrings.before = "before".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.before]
    
    inline def bottom: typingsJapgolly.devextreme.devextremeStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.bottom]
    
    inline def left: typingsJapgolly.devextreme.devextremeStrings.left = "left".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.left]
    
    inline def right: typingsJapgolly.devextreme.devextremeStrings.right = "right".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.right]
    
    inline def top: typingsJapgolly.devextreme.devextremeStrings.top = "top".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.top]
  }
  
  type Properties = dxDrawerOptions
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.devextremeStrings.slide
    - typingsJapgolly.devextreme.devextremeStrings.expand
  */
  trait RevealMode extends StObject
  object RevealMode {
    
    inline def expand: typingsJapgolly.devextreme.devextremeStrings.expand = "expand".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.expand]
    
    inline def slide: typingsJapgolly.devextreme.devextremeStrings.slide = "slide".asInstanceOf[typingsJapgolly.devextreme.devextremeStrings.slide]
  }
}
