package typingsJapgolly.grommet

import org.scalajs.dom.HTMLTableSectionElement
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsTableFooterMod {
  
  @JSImport("grommet/es6/components/TableFooter", "TableFooter")
  @js.native
  val TableFooter: FC[TableFooterExtendedProps] = js.native
  
  trait TableFooterExtendedProps
    extends StObject
       with TableFooterProps
       with ClassAttributes[HTMLTableSectionElement]
       with HTMLAttributes[HTMLTableSectionElement]
  object TableFooterExtendedProps {
    
    inline def apply(): TableFooterExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableFooterExtendedProps]
    }
  }
  
  trait TableFooterProps extends StObject
  
  type htmlTableFooterProps = DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]
}
