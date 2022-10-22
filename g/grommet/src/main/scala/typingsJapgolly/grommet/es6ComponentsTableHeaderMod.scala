package typingsJapgolly.grommet

import org.scalajs.dom.HTMLTableSectionElement
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsTableHeaderMod {
  
  @JSImport("grommet/es6/components/TableHeader", "TableHeader")
  @js.native
  val TableHeader: FC[TableHeaderExtendedProps] = js.native
  
  trait TableHeaderExtendedProps
    extends StObject
       with TableHeaderProps
       with ClassAttributes[HTMLTableSectionElement]
       with HTMLAttributes[HTMLTableSectionElement]
  object TableHeaderExtendedProps {
    
    inline def apply(): TableHeaderExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableHeaderExtendedProps]
    }
  }
  
  trait TableHeaderProps extends StObject
  
  type htmlTableHeaderProps = DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]
}
