package typingsJapgolly.nivoTooltip

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTooltipProviderMod {
  
  @JSImport("@nivo/tooltip/dist/types/TooltipProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TooltipProvider(hasContainerChildren: PropsWithChildren[TooltipProviderProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TooltipProvider")(hasContainerChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait TooltipProviderProps extends StObject {
    
    var container: MutableRefObject[HTMLDivElement]
  }
  object TooltipProviderProps {
    
    inline def apply(container: MutableRefObject[HTMLDivElement]): TooltipProviderProps = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipProviderProps]
    }
    
    extension [Self <: TooltipProviderProps](x: Self) {
      
      inline def setContainer(value: MutableRefObject[HTMLDivElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    }
  }
}
