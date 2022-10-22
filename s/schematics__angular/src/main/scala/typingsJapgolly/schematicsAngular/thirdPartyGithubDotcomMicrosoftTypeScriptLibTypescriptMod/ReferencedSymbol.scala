package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferencedSymbol extends StObject {
  
  var definition: ReferencedSymbolDefinitionInfo
  
  var references: js.Array[ReferencedSymbolEntry]
}
object ReferencedSymbol {
  
  inline def apply(definition: ReferencedSymbolDefinitionInfo, references: js.Array[ReferencedSymbolEntry]): ReferencedSymbol = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferencedSymbol]
  }
  
  extension [Self <: ReferencedSymbol](x: Self) {
    
    inline def setDefinition(value: ReferencedSymbolDefinitionInfo): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setReferences(value: js.Array[ReferencedSymbolEntry]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesVarargs(value: ReferencedSymbolEntry*): Self = StObject.set(x, "references", js.Array(value*))
  }
}
