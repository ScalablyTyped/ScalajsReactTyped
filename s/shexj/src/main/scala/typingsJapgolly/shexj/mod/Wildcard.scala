package typingsJapgolly.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Wildcard extends StObject {
  
  /**
    * Mandatory type "Wildcard".
    */
  var `type`: typingsJapgolly.shexj.shexjStrings.Wildcard
}
object Wildcard {
  
  inline def apply(): Wildcard = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Wildcard")
    __obj.asInstanceOf[Wildcard]
  }
  
  extension [Self <: Wildcard](x: Self) {
    
    inline def setType(value: typingsJapgolly.shexj.shexjStrings.Wildcard): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
