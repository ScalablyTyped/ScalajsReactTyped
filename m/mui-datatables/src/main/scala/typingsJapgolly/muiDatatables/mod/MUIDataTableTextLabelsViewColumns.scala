package typingsJapgolly.muiDatatables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableTextLabelsViewColumns extends StObject {
  
  var title: String
  
  var titleAria: String
}
object MUIDataTableTextLabelsViewColumns {
  
  inline def apply(title: String, titleAria: String): MUIDataTableTextLabelsViewColumns = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], titleAria = titleAria.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableTextLabelsViewColumns]
  }
  
  extension [Self <: MUIDataTableTextLabelsViewColumns](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleAria(value: String): Self = StObject.set(x, "titleAria", value.asInstanceOf[js.Any])
  }
}
