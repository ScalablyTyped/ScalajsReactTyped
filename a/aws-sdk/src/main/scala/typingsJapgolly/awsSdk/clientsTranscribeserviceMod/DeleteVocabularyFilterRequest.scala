package typingsJapgolly.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVocabularyFilterRequest extends StObject {
  
  /**
    * The name of the custom vocabulary filter you want to delete. Vocabulary filter names are case sensitive.
    */
  var VocabularyFilterName: typingsJapgolly.awsSdk.clientsTranscribeserviceMod.VocabularyFilterName
}
object DeleteVocabularyFilterRequest {
  
  inline def apply(VocabularyFilterName: VocabularyFilterName): DeleteVocabularyFilterRequest = {
    val __obj = js.Dynamic.literal(VocabularyFilterName = VocabularyFilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVocabularyFilterRequest]
  }
  
  extension [Self <: DeleteVocabularyFilterRequest](x: Self) {
    
    inline def setVocabularyFilterName(value: VocabularyFilterName): Self = StObject.set(x, "VocabularyFilterName", value.asInstanceOf[js.Any])
  }
}
