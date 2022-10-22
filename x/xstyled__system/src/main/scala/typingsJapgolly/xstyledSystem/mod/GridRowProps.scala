package typingsJapgolly.xstyledSystem.mod

import typingsJapgolly.csstype.mod.Property.GridRow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridRowProps extends StObject {
  
  val gridRow: js.UndefOr[ResponsiveValue[GridRow]] = js.undefined
}
object GridRowProps {
  
  inline def apply(): GridRowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridRowProps]
  }
  
  extension [Self <: GridRowProps](x: Self) {
    
    inline def setGridRow(value: ResponsiveValue[GridRow]): Self = StObject.set(x, "gridRow", value.asInstanceOf[js.Any])
    
    inline def setGridRowUndefined: Self = StObject.set(x, "gridRow", js.undefined)
    
    inline def setGridRowVarargs(value: GridRow*): Self = StObject.set(x, "gridRow", js.Array(value*))
  }
}
