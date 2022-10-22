package typingsJapgolly.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticTokens extends StObject {
  
  val data: js.typedarray.Uint32Array
  
  val resultId: js.UndefOr[String] = js.undefined
}
object SemanticTokens {
  
  inline def apply(data: js.typedarray.Uint32Array): SemanticTokens = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SemanticTokens]
  }
  
  extension [Self <: SemanticTokens](x: Self) {
    
    inline def setData(value: js.typedarray.Uint32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setResultId(value: String): Self = StObject.set(x, "resultId", value.asInstanceOf[js.Any])
    
    inline def setResultIdUndefined: Self = StObject.set(x, "resultId", js.undefined)
  }
}
