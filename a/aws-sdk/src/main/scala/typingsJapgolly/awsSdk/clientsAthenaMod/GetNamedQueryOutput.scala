package typingsJapgolly.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNamedQueryOutput extends StObject {
  
  /**
    * Information about the query.
    */
  var NamedQuery: js.UndefOr[typingsJapgolly.awsSdk.clientsAthenaMod.NamedQuery] = js.undefined
}
object GetNamedQueryOutput {
  
  inline def apply(): GetNamedQueryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNamedQueryOutput]
  }
  
  extension [Self <: GetNamedQueryOutput](x: Self) {
    
    inline def setNamedQuery(value: NamedQuery): Self = StObject.set(x, "NamedQuery", value.asInstanceOf[js.Any])
    
    inline def setNamedQueryUndefined: Self = StObject.set(x, "NamedQuery", js.undefined)
  }
}
