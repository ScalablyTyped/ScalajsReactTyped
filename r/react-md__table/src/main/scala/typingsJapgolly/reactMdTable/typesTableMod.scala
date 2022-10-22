package typingsJapgolly.reactMdTable

import org.scalajs.dom.HTMLTableElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.TableHTMLAttributes
import typingsJapgolly.reactMdTable.typesConfigMod.TableConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTableMod {
  
  @JSImport("@react-md/table/types/Table", "Table")
  @js.native
  val Table: ForwardRefExoticComponent[TableProps & RefAttributes[HTMLTableElement]] = js.native
  
  trait TableProps
    extends StObject
       with TableHTMLAttributes[HTMLTableElement]
       with TableConfiguration
  object TableProps {
    
    inline def apply(): TableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableProps]
    }
  }
}
