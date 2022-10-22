package typingsJapgolly.xstyledSystem.mod

import typingsJapgolly.csstype.mod.Property.GridTemplateColumns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridTemplateColumnsProps[TLength] extends StObject {
  
  val gridTemplateColumns: js.UndefOr[ResponsiveValue[GridTemplateColumns[TLength]]] = js.undefined
}
object GridTemplateColumnsProps {
  
  inline def apply[TLength](): GridTemplateColumnsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTemplateColumnsProps[TLength]]
  }
  
  extension [Self <: GridTemplateColumnsProps[?], TLength](x: Self & GridTemplateColumnsProps[TLength]) {
    
    inline def setGridTemplateColumns(value: ResponsiveValue[GridTemplateColumns[TLength]]): Self = StObject.set(x, "gridTemplateColumns", value.asInstanceOf[js.Any])
    
    inline def setGridTemplateColumnsUndefined: Self = StObject.set(x, "gridTemplateColumns", js.undefined)
    
    inline def setGridTemplateColumnsVarargs(value: GridTemplateColumns[TLength]*): Self = StObject.set(x, "gridTemplateColumns", js.Array(value*))
  }
}
