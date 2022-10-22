package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.baseui.helpersOverridesMod.Override
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerNavigationTypesMod {
  
  trait HeaderNavigationOverrides extends StObject {
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
  }
  object HeaderNavigationOverrides {
    
    inline def apply(): HeaderNavigationOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderNavigationOverrides]
    }
    
    extension [Self <: HeaderNavigationOverrides](x: Self) {
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  /* Inlined react.react.PropsWithChildren<{  overrides :baseui.baseui/header-navigation/types.HeaderNavigationOverrides}> */
  trait HeaderNavigationProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var overrides: HeaderNavigationOverrides
  }
  object HeaderNavigationProps {
    
    inline def apply(overrides: HeaderNavigationOverrides): HeaderNavigationProps = {
      val __obj = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderNavigationProps]
    }
    
    extension [Self <: HeaderNavigationProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOverrides(value: HeaderNavigationOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    }
  }
}
