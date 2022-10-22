package typingsJapgolly.pkijs.mod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters for schema generation
  */
trait SchemaParameters[N /* <: Record[String, Any] */] extends StObject {
  
  var names: js.UndefOr[SchemaNames & N] = js.undefined
}
object SchemaParameters {
  
  inline def apply[N /* <: Record[String, Any] */](): SchemaParameters[N] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParameters[N]]
  }
  
  extension [Self <: SchemaParameters[?], N /* <: Record[String, Any] */](x: Self & SchemaParameters[N]) {
    
    inline def setNames(value: SchemaNames & N): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
  }
}
