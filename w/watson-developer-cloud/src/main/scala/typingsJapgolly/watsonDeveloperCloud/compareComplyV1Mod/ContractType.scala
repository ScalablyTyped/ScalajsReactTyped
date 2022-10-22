package typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The contract type identified in the input document. */
trait ContractType extends StObject {
  
  /** The confidence level in the identification of the termination date. */
  var confidence_level: js.UndefOr[String] = js.undefined
  
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.undefined
  
  /** The contract type. */
  var text: js.UndefOr[String] = js.undefined
}
object ContractType {
  
  inline def apply(): ContractType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractType]
  }
  
  extension [Self <: ContractType](x: Self) {
    
    inline def setConfidence_level(value: String): Self = StObject.set(x, "confidence_level", value.asInstanceOf[js.Any])
    
    inline def setConfidence_levelUndefined: Self = StObject.set(x, "confidence_level", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
