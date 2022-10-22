package typingsJapgolly.grommet

import org.scalajs.dom.HTMLTableSectionElement
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsTableBodyMod {
  
  @JSImport("grommet/es6/components/TableBody", "TableBody")
  @js.native
  val TableBody: FC[TableBodyExtendedProps] = js.native
  
  trait TableBodyExtendedProps
    extends StObject
       with TableBodyProps
       with ClassAttributes[HTMLTableSectionElement]
       with HTMLAttributes[HTMLTableSectionElement]
  object TableBodyExtendedProps {
    
    inline def apply(): TableBodyExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableBodyExtendedProps]
    }
  }
  
  trait TableBodyProps extends StObject
  
  type htmlTableBodyProps = DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]
}
