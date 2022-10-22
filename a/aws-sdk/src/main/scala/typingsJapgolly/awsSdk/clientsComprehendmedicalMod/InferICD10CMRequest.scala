package typingsJapgolly.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferICD10CMRequest extends StObject {
  
  /**
    * The input text used for analysis. The input for InferICD10CM is a string from 1 to 10000 characters.
    */
  var Text: OntologyLinkingBoundedLengthString
}
object InferICD10CMRequest {
  
  inline def apply(Text: OntologyLinkingBoundedLengthString): InferICD10CMRequest = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferICD10CMRequest]
  }
  
  extension [Self <: InferICD10CMRequest](x: Self) {
    
    inline def setText(value: OntologyLinkingBoundedLengthString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
