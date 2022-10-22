package typingsJapgolly.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Suggester extends StObject {
  
  var DocumentSuggesterOptions: typingsJapgolly.awsSdk.clientsCloudsearchMod.DocumentSuggesterOptions
  
  var SuggesterName: StandardName
}
object Suggester {
  
  inline def apply(DocumentSuggesterOptions: DocumentSuggesterOptions, SuggesterName: StandardName): Suggester = {
    val __obj = js.Dynamic.literal(DocumentSuggesterOptions = DocumentSuggesterOptions.asInstanceOf[js.Any], SuggesterName = SuggesterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suggester]
  }
  
  extension [Self <: Suggester](x: Self) {
    
    inline def setDocumentSuggesterOptions(value: DocumentSuggesterOptions): Self = StObject.set(x, "DocumentSuggesterOptions", value.asInstanceOf[js.Any])
    
    inline def setSuggesterName(value: StandardName): Self = StObject.set(x, "SuggesterName", value.asInstanceOf[js.Any])
  }
}
