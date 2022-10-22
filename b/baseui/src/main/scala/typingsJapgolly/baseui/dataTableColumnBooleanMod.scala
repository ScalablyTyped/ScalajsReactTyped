package typingsJapgolly.baseui

import typingsJapgolly.baseui.dataTableTypesMod.ColumnOptions
import typingsJapgolly.baseui.dataTableTypesMod.SharedColumnOptions
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableColumnBooleanMod {
  
  @JSImport("baseui/data-table/column-boolean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Options): BooleanColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[BooleanColumn]
  
  type BooleanColumn = ColumnOptions[Boolean, FilterParameters]
  
  trait FilterParameters extends StObject {
    
    var description: String
    
    var exclude: Boolean
    
    var selection: Set[Boolean]
  }
  object FilterParameters {
    
    inline def apply(description: String, exclude: Boolean, selection: Set[Boolean]): FilterParameters = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterParameters]
    }
    
    extension [Self <: FilterParameters](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setExclude(value: Boolean): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setSelection(value: Set[Boolean]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    }
  }
  
  type Options = SharedColumnOptions[Boolean]
}
