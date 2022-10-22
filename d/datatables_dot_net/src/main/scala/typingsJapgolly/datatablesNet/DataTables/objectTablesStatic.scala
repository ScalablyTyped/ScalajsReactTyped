package typingsJapgolly.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait objectTablesStatic extends StObject {
  
  /**
    * Return a DataTables API instance for the selected tables (true) or an array (false).
    */
  var api: Boolean
  
  /**
    * Get only visible tables (true) or all tables regardless of visibility (false).
    */
  var visible: Boolean
}
object objectTablesStatic {
  
  inline def apply(api: Boolean, visible: Boolean): objectTablesStatic = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[objectTablesStatic]
  }
  
  extension [Self <: objectTablesStatic](x: Self) {
    
    inline def setApi(value: Boolean): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
