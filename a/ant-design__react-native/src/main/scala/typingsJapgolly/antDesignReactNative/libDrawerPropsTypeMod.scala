package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.left
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDrawerPropsTypeMod {
  
  trait DrawerProps extends StObject {
    
    var onOpenChange: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[left | right] = js.undefined
    
    var sidebar: js.UndefOr[Node] = js.undefined
  }
  object DrawerProps {
    
    inline def apply(): DrawerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerProps]
    }
    
    extension [Self <: DrawerProps](x: Self) {
      
      inline def setOnOpenChange(value: /* isOpen */ Boolean => Callback): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1((t0: /* isOpen */ Boolean) => value(t0).runNow()))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPosition(value: left | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSidebar(value: VdomNode): Self = StObject.set(x, "sidebar", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSidebarNull: Self = StObject.set(x, "sidebar", null)
      
      inline def setSidebarUndefined: Self = StObject.set(x, "sidebar", js.undefined)
      
      inline def setSidebarVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "sidebar", js.Array(value*))
      
      inline def setSidebarVdomElement(value: VdomElement): Self = StObject.set(x, "sidebar", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
