package typingsJapgolly.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DataTableEx...
  */
trait IDataTableEx extends StObject {
  
  /**
    * List of the fields in the table.
    */
  var qFields: js.Array[IDataField]
  
  /**
    * List of format specification items, within brackets.
    * Examples of specification items:
    *
    *    - file type
    *    - embedded labels, no labels
    *    - table is <table name>
    */
  var qFormatSpec: String
  
  /**
    * Name of the table.
    */
  var qName: String
}
object IDataTableEx {
  
  inline def apply(qFields: js.Array[IDataField], qFormatSpec: String, qName: String): IDataTableEx = {
    val __obj = js.Dynamic.literal(qFields = qFields.asInstanceOf[js.Any], qFormatSpec = qFormatSpec.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataTableEx]
  }
  
  extension [Self <: IDataTableEx](x: Self) {
    
    inline def setQFields(value: js.Array[IDataField]): Self = StObject.set(x, "qFields", value.asInstanceOf[js.Any])
    
    inline def setQFieldsVarargs(value: IDataField*): Self = StObject.set(x, "qFields", js.Array(value*))
    
    inline def setQFormatSpec(value: String): Self = StObject.set(x, "qFormatSpec", value.asInstanceOf[js.Any])
    
    inline def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
  }
}
