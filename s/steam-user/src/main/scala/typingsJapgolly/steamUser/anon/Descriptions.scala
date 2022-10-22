package typingsJapgolly.steamUser.anon

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Descriptions extends StObject {
  
  var descriptions: js.Array[Record[String, Any]]
}
object Descriptions {
  
  inline def apply(descriptions: js.Array[Record[String, Any]]): Descriptions = {
    val __obj = js.Dynamic.literal(descriptions = descriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descriptions]
  }
  
  extension [Self <: Descriptions](x: Self) {
    
    inline def setDescriptions(value: js.Array[Record[String, Any]]): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
    
    inline def setDescriptionsVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "descriptions", js.Array(value*))
  }
}
