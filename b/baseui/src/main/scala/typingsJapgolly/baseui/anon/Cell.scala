package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.cell
import typingsJapgolly.baseui.baseuiStrings.module
import typingsJapgolly.baseui.baseuiStrings.section
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cell extends StObject {
  
  val cell: typingsJapgolly.baseui.baseuiStrings.cell
  
  val module: typingsJapgolly.baseui.baseuiStrings.module
  
  val section: typingsJapgolly.baseui.baseuiStrings.section
}
object Cell {
  
  inline def apply(): Cell = {
    val __obj = js.Dynamic.literal(cell = "cell", module = "module", section = "section")
    __obj.asInstanceOf[Cell]
  }
  
  extension [Self <: Cell](x: Self) {
    
    inline def setCell(value: cell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setModule(value: module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setSection(value: section): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
  }
}
