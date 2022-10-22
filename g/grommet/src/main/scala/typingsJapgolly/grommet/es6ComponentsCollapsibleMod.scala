package typingsJapgolly.grommet

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.grommet.grommetStrings.horizontal
import typingsJapgolly.grommet.grommetStrings.vertical
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsCollapsibleMod {
  
  @JSImport("grommet/es6/components/Collapsible", "Collapsible")
  @js.native
  val Collapsible: FC[CollapsibleExtendedProps] = js.native
  
  trait CollapsibleExtendedProps
    extends StObject
       with CollapsibleProps
       with ClassAttributes[HTMLDivElement]
       with HTMLAttributes[HTMLDivElement]
  object CollapsibleExtendedProps {
    
    inline def apply(): CollapsibleExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapsibleExtendedProps]
    }
  }
  
  trait CollapsibleProps extends StObject {
    
    var direction: js.UndefOr[horizontal | vertical] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
  }
  object CollapsibleProps {
    
    inline def apply(): CollapsibleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapsibleProps]
    }
    
    extension [Self <: CollapsibleProps](x: Self) {
      
      inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    }
  }
  
  type divProps = DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]
}
