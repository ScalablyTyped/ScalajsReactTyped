package typingsJapgolly.awsSdk.clientsRedshiftdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableMember extends StObject {
  
  /**
    * The name of the table. 
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The schema containing the table. 
    */
  var schema: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the table. Possible values include TABLE, VIEW, SYSTEM TABLE, GLOBAL TEMPORARY, LOCAL TEMPORARY, ALIAS, and SYNONYM. 
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object TableMember {
  
  inline def apply(): TableMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableMember]
  }
  
  extension [Self <: TableMember](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
