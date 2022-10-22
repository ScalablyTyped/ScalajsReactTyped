package typingsJapgolly.ionicCore.distTypesComponentsMod.Components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ionicCore.mod.ComponentRef
import typingsJapgolly.ionicCore.mod.FrameworkDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonTab extends StObject {
  
  var active: Boolean
  
  /**
    * The component to display inside of the tab.
    */
  var component: js.UndefOr[ComponentRef] = js.undefined
  
  var delegate: js.UndefOr[FrameworkDelegate] = js.undefined
  
  /**
    * Set the active component for the tab
    */
  def setActive(): js.Promise[Unit]
  
  /**
    * A tab id must be provided for each `ion-tab`. It's used internally to reference the selected tab or by the router to switch between them.
    */
  var tab: String
}
object IonTab {
  
  inline def apply(active: Boolean, setActive: CallbackTo[js.Promise[Unit]], tab: String): IonTab = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], setActive = setActive.toJsFn, tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonTab]
  }
  
  extension [Self <: IonTab](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setComponent(value: ComponentRef): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentNull: Self = StObject.set(x, "component", null)
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setDelegate(value: FrameworkDelegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    
    inline def setSetActive(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "setActive", value.toJsFn)
    
    inline def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
