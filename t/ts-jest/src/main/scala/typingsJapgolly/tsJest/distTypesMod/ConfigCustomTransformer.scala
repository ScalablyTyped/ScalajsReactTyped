package typingsJapgolly.tsJest.distTypesMod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigCustomTransformer extends StObject {
  
  var after: js.UndefOr[js.Array[String | (AstTransformer[Record[String, Any]])]] = js.undefined
  
  var afterDeclarations: js.UndefOr[js.Array[String | (AstTransformer[Record[String, Any]])]] = js.undefined
  
  var before: js.UndefOr[js.Array[String | (AstTransformer[Record[String, Any]])]] = js.undefined
}
object ConfigCustomTransformer {
  
  inline def apply(): ConfigCustomTransformer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigCustomTransformer]
  }
  
  extension [Self <: ConfigCustomTransformer](x: Self) {
    
    inline def setAfter(value: js.Array[String | (AstTransformer[Record[String, Any]])]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterDeclarations(value: js.Array[String | (AstTransformer[Record[String, Any]])]): Self = StObject.set(x, "afterDeclarations", value.asInstanceOf[js.Any])
    
    inline def setAfterDeclarationsUndefined: Self = StObject.set(x, "afterDeclarations", js.undefined)
    
    inline def setAfterDeclarationsVarargs(value: (String | (AstTransformer[Record[String, Any]]))*): Self = StObject.set(x, "afterDeclarations", js.Array(value*))
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setAfterVarargs(value: (String | (AstTransformer[Record[String, Any]]))*): Self = StObject.set(x, "after", js.Array(value*))
    
    inline def setBefore(value: js.Array[String | (AstTransformer[Record[String, Any]])]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setBeforeVarargs(value: (String | (AstTransformer[Record[String, Any]]))*): Self = StObject.set(x, "before", js.Array(value*))
  }
}
