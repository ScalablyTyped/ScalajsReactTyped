package typingsJapgolly.reactMdTable

import org.scalajs.dom.HTMLTableRowElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdTable.typesConfigMod.TableRowConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTableRowMod {
  
  @JSImport("@react-md/table/types/TableRow", "TableRow")
  @js.native
  val TableRow: ForwardRefExoticComponent[TableRowProps & RefAttributes[HTMLTableRowElement]] = js.native
  
  trait TableRowProps
    extends StObject
       with HTMLAttributes[HTMLTableRowElement]
       with TableRowConfiguration {
    
    /**
      * Boolean if the row should be clickable and update the cursor while hovered
      * to be a pointer.
      */
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the current row has been selected and should apply the selected
      * background-color.
      */
    var selected: js.UndefOr[Boolean] = js.undefined
  }
  object TableRowProps {
    
    inline def apply(): TableRowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableRowProps]
    }
    
    extension [Self <: TableRowProps](x: Self) {
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
}
