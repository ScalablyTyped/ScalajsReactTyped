package typingsJapgolly.wixDesignSystemsProviders

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWixDesignSystemsMaskingProviderWixDesignSystemsMaskingProviderDottypesMod {
  
  trait WixDesignSystemsMaskingContextProps extends StObject {
    
    var maskingClassNames: String
  }
  object WixDesignSystemsMaskingContextProps {
    
    inline def apply(maskingClassNames: String): WixDesignSystemsMaskingContextProps = {
      val __obj = js.Dynamic.literal(maskingClassNames = maskingClassNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[WixDesignSystemsMaskingContextProps]
    }
    
    extension [Self <: WixDesignSystemsMaskingContextProps](x: Self) {
      
      inline def setMaskingClassNames(value: String): Self = StObject.set(x, "maskingClassNames", value.asInstanceOf[js.Any])
    }
  }
  
  trait WixDesignSystemsMaskingProviderProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
  }
  object WixDesignSystemsMaskingProviderProps {
    
    inline def apply(): WixDesignSystemsMaskingProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixDesignSystemsMaskingProviderProps]
    }
    
    extension [Self <: WixDesignSystemsMaskingProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
