package typingsJapgolly.awsSdk.clientsKeyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticColumn extends StObject {
  
  /**
    * The name of the static column.
    */
  var name: GenericString
}
object StaticColumn {
  
  inline def apply(name: GenericString): StaticColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticColumn]
  }
  
  extension [Self <: StaticColumn](x: Self) {
    
    inline def setName(value: GenericString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
