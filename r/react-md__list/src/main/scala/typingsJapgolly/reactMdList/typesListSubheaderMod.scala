package typingsJapgolly.reactMdList

import org.scalajs.dom.HTMLLIElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListSubheaderMod {
  
  @JSImport("@react-md/list/types/ListSubheader", "ListSubheader")
  @js.native
  val ListSubheader: ForwardRefExoticComponent[ListSubheaderProps & RefAttributes[HTMLLIElement]] = js.native
  
  trait ListSubheaderProps
    extends StObject
       with HTMLAttributes[HTMLLIElement] {
    
    /**
      * Boolean if the subheader should be inset to match the `ListItem` text
      * keyline.
      */
    var inset: js.UndefOr[Boolean] = js.undefined
  }
  object ListSubheaderProps {
    
    inline def apply(): ListSubheaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListSubheaderProps]
    }
    
    extension [Self <: ListSubheaderProps](x: Self) {
      
      inline def setInset(value: Boolean): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
      
      inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    }
  }
}
