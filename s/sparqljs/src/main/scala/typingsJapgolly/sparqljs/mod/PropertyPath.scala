package typingsJapgolly.sparqljs.mod

import typingsJapgolly.sparqljs.sparqljsStrings.Asterisk
import typingsJapgolly.sparqljs.sparqljsStrings.Exclamationmark
import typingsJapgolly.sparqljs.sparqljsStrings.Plussign
import typingsJapgolly.sparqljs.sparqljsStrings.Slash
import typingsJapgolly.sparqljs.sparqljsStrings.Verticalline
import typingsJapgolly.sparqljs.sparqljsStrings.^
import typingsJapgolly.sparqljs.sparqljsStrings.path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyPath extends StObject {
  
  var items: js.Array[IriTerm | PropertyPath]
  
  var pathType: Verticalline | Slash | ^ | Plussign | Asterisk | Exclamationmark
  
  var `type`: path
}
object PropertyPath {
  
  inline def apply(
    items: js.Array[IriTerm | PropertyPath],
    pathType: Verticalline | Slash | ^ | Plussign | Asterisk | Exclamationmark
  ): PropertyPath = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], pathType = pathType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("path")
    __obj.asInstanceOf[PropertyPath]
  }
  
  extension [Self <: PropertyPath](x: Self) {
    
    inline def setItems(value: js.Array[IriTerm | PropertyPath]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: (IriTerm | PropertyPath)*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setPathType(value: Verticalline | Slash | ^ | Plussign | Asterisk | Exclamationmark): Self = StObject.set(x, "pathType", value.asInstanceOf[js.Any])
    
    inline def setType(value: path): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
