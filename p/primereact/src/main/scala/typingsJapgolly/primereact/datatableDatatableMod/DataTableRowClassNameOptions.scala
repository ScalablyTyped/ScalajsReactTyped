package typingsJapgolly.primereact.datatableDatatableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTableRowClassNameOptions extends StObject {
  
  var props: DataTableProps
}
object DataTableRowClassNameOptions {
  
  inline def apply(props: DataTableProps): DataTableRowClassNameOptions = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableRowClassNameOptions]
  }
  
  extension [Self <: DataTableRowClassNameOptions](x: Self) {
    
    inline def setProps(value: DataTableProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
