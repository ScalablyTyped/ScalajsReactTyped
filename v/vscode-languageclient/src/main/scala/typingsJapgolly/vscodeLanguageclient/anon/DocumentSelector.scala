package typingsJapgolly.vscodeLanguageclient.anon

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentSelector extends StObject {
  
  var documentSelector: typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSelector
}
object DocumentSelector {
  
  inline def apply(
    documentSelector: typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSelector
  ): DocumentSelector = {
    val __obj = js.Dynamic.literal(documentSelector = documentSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSelector]
  }
  
  extension [Self <: DocumentSelector](x: Self) {
    
    inline def setDocumentSelector(value: typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSelector): Self = StObject.set(x, "documentSelector", value.asInstanceOf[js.Any])
    
    inline def setDocumentSelectorVarargs(value: (String | DocumentFilter)*): Self = StObject.set(x, "documentSelector", js.Array(value*))
  }
}
