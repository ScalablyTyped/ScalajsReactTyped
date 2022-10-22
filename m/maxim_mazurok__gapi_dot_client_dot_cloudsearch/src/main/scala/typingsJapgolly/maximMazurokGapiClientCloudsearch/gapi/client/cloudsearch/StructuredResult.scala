package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructuredResult extends StObject {
  
  /** Representation of a person */
  var person: js.UndefOr[Person] = js.undefined
}
object StructuredResult {
  
  inline def apply(): StructuredResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructuredResult]
  }
  
  extension [Self <: StructuredResult](x: Self) {
    
    inline def setPerson(value: Person): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    inline def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
  }
}
