package typingsJapgolly.ecmarkup.anon

import typingsJapgolly.ecmarkup.ecmarkupStrings.record
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fields
  extends StObject
     with typingsJapgolly.ecmarkup.libBiblioMod.Type {
  
  var fields: Record[String, typingsJapgolly.ecmarkup.libBiblioMod.Type | Null]
  
  var kind: record
}
object Fields {
  
  inline def apply(fields: Record[String, typingsJapgolly.ecmarkup.libBiblioMod.Type | Null]): Fields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = "record")
    __obj.asInstanceOf[Fields]
  }
  
  extension [Self <: Fields](x: Self) {
    
    inline def setFields(value: Record[String, typingsJapgolly.ecmarkup.libBiblioMod.Type | Null]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setKind(value: record): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
