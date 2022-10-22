package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactBootstrap.mod.SelectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTabsMod {
  
  @JSImport("react-bootstrap/lib/Tabs", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[TabsProps, js.Object, Any]
  
  type Tabs = japgolly.scalajs.react.facade.React.Component[TabsProps & js.Object, js.Object]
  
  trait TabsProps
    extends StObject
       with HTMLProps[japgolly.scalajs.react.facade.React.Component[TabsProps & js.Object, js.Object]] {
    
    var activeKey: js.UndefOr[Any] = js.undefined
    
    var animation: js.UndefOr[Boolean] = js.undefined
    
    var bsStyle: js.UndefOr[String] = js.undefined
    
    var defaultActiveKey: js.UndefOr[Any] = js.undefined
    
    var justified: js.UndefOr[Boolean] = js.undefined
    
    // TODO: Add more specific type
    var mountOnEnter: js.UndefOr[Boolean] = js.undefined
    
    @JSName("onSelect")
    var onSelect_TabsProps: js.UndefOr[SelectCallback] = js.undefined
    
    var paneWidth: js.UndefOr[Any] = js.undefined
    
    // TODO: Add more specific type
    var position: js.UndefOr[String] = js.undefined
    
    var tabWidth: js.UndefOr[Any] = js.undefined
    
    var unmountOnExit: js.UndefOr[Boolean] = js.undefined
  }
  object TabsProps {
    
    inline def apply(): TabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsProps]
    }
    
    extension [Self <: TabsProps](x: Self) {
      
      inline def setActiveKey(value: Any): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      inline def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      inline def setDefaultActiveKey(value: Any): Self = StObject.set(x, "defaultActiveKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultActiveKeyUndefined: Self = StObject.set(x, "defaultActiveKey", js.undefined)
      
      inline def setJustified(value: Boolean): Self = StObject.set(x, "justified", value.asInstanceOf[js.Any])
      
      inline def setJustifiedUndefined: Self = StObject.set(x, "justified", js.undefined)
      
      inline def setMountOnEnter(value: Boolean): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
      
      inline def setMountOnEnterUndefined: Self = StObject.set(x, "mountOnEnter", js.undefined)
      
      inline def setOnSelect(value: SelectCallback): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setPaneWidth(value: Any): Self = StObject.set(x, "paneWidth", value.asInstanceOf[js.Any])
      
      inline def setPaneWidthUndefined: Self = StObject.set(x, "paneWidth", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTabWidth(value: Any): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
      
      inline def setTabWidthUndefined: Self = StObject.set(x, "tabWidth", js.undefined)
      
      inline def setUnmountOnExit(value: Boolean): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
      
      inline def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
    }
  }
}
