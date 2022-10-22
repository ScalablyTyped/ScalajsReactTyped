package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client column.
  */
trait ASPxClientCardViewColumn
  extends StObject
     with ASPxClientGridColumnBase {
  
  /**
    * Gets the name of the database field assigned to the current column.
    */
  var fieldName: String
  
  /**
    * Gets the column's position within the collection.
    */
  var index: Double
  
  /**
    * Gets the name that uniquely identifies the column.
    */
  var name: String
  
  /**
    * Gets whether the column is visible.
    */
  var visible: Boolean
}
object ASPxClientCardViewColumn {
  
  inline def apply(fieldName: String, index: Double, name: String, visible: Boolean): ASPxClientCardViewColumn = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewColumn]
  }
  
  extension [Self <: ASPxClientCardViewColumn](x: Self) {
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
