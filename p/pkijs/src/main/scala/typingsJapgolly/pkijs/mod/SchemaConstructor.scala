package typingsJapgolly.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConstructor extends StObject {
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object SchemaConstructor {
  
  inline def apply(): SchemaConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConstructor]
  }
  
  extension [Self <: SchemaConstructor](x: Self) {
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
