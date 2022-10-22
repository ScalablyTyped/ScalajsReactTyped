package typingsJapgolly.grommet

import org.scalajs.dom.HTMLTableRowElement
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsTableRowMod {
  
  @JSImport("grommet/es6/components/TableRow", "TableRow")
  @js.native
  val TableRow: FC[TableRowExtendedProps] = js.native
  
  trait TableRowExtendedProps
    extends StObject
       with TableRowProps
       with ClassAttributes[HTMLTableRowElement]
       with HTMLAttributes[HTMLTableRowElement]
  object TableRowExtendedProps {
    
    inline def apply(): TableRowExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableRowExtendedProps]
    }
  }
  
  trait TableRowProps extends StObject
  
  type htmlTableRowProps = DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement]
}
