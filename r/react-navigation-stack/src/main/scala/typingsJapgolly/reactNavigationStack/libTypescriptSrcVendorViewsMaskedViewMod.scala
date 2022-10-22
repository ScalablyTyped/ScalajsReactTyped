package typingsJapgolly.reactNavigationStack

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcVendorViewsMaskedViewMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/MaskedView", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasChildren: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var children: Element
    
    var maskElement: Element
  }
  object Props {
    
    inline def apply(children: VdomElement, maskElement: VdomElement): Props = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], maskElement = maskElement.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMaskElement(value: VdomElement): Self = StObject.set(x, "maskElement", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
