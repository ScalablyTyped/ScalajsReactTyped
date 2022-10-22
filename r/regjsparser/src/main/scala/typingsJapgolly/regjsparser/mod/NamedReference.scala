package typingsJapgolly.regjsparser.mod

import typingsJapgolly.regjsparser.regjsparserStrings.reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedReference
  extends StObject
     with Base[reference] {
  
  var matchIndex: Unit
  
  var name: Identifier
}
object NamedReference {
  
  inline def apply(matchIndex: Unit, name: Identifier, range: js.Tuple2[Double, Double], raw: String): NamedReference = {
    val __obj = js.Dynamic.literal(matchIndex = matchIndex.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reference")
    __obj.asInstanceOf[NamedReference]
  }
  
  extension [Self <: NamedReference](x: Self) {
    
    inline def setMatchIndex(value: Unit): Self = StObject.set(x, "matchIndex", value.asInstanceOf[js.Any])
    
    inline def setName(value: Identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
