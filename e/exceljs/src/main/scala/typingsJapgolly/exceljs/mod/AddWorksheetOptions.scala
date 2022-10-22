package typingsJapgolly.exceljs.mod

import typingsJapgolly.exceljs.anon.PartialHeaderFooter
import typingsJapgolly.exceljs.anon.PartialPageSetup
import typingsJapgolly.exceljs.anon.PartialWorksheetPropertie
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddWorksheetOptions extends StObject {
  
  var headerFooter: PartialHeaderFooter
  
  var pageSetup: PartialPageSetup
  
  var properties: PartialWorksheetPropertie
  
  var state: WorksheetState
  
  var views: js.Array[Partial[WorksheetView]]
}
object AddWorksheetOptions {
  
  inline def apply(
    headerFooter: PartialHeaderFooter,
    pageSetup: PartialPageSetup,
    properties: PartialWorksheetPropertie,
    state: WorksheetState,
    views: js.Array[Partial[WorksheetView]]
  ): AddWorksheetOptions = {
    val __obj = js.Dynamic.literal(headerFooter = headerFooter.asInstanceOf[js.Any], pageSetup = pageSetup.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddWorksheetOptions]
  }
  
  extension [Self <: AddWorksheetOptions](x: Self) {
    
    inline def setHeaderFooter(value: PartialHeaderFooter): Self = StObject.set(x, "headerFooter", value.asInstanceOf[js.Any])
    
    inline def setPageSetup(value: PartialPageSetup): Self = StObject.set(x, "pageSetup", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: PartialWorksheetPropertie): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setState(value: WorksheetState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setViews(value: js.Array[Partial[WorksheetView]]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsVarargs(value: Partial[WorksheetView]*): Self = StObject.set(x, "views", js.Array(value*))
  }
}
