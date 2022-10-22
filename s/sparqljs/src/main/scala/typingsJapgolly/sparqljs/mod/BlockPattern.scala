package typingsJapgolly.sparqljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sparqljs.mod.OptionalPattern
  - typingsJapgolly.sparqljs.mod.UnionPattern
  - typingsJapgolly.sparqljs.mod.GroupPattern
  - typingsJapgolly.sparqljs.mod.GraphPattern
  - typingsJapgolly.sparqljs.mod.MinusPattern
  - typingsJapgolly.sparqljs.mod.ServicePattern
*/
trait BlockPattern
  extends StObject
     with Pattern
object BlockPattern {
  
  inline def GraphPattern(name: IriTerm, patterns: js.Array[Pattern]): typingsJapgolly.sparqljs.mod.GraphPattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("graph")
    __obj.asInstanceOf[typingsJapgolly.sparqljs.mod.GraphPattern]
  }
  
  inline def GroupPattern(patterns: js.Array[Pattern]): typingsJapgolly.sparqljs.mod.GroupPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("group")
    __obj.asInstanceOf[typingsJapgolly.sparqljs.mod.GroupPattern]
  }
  
  inline def MinusPattern(patterns: js.Array[Pattern]): typingsJapgolly.sparqljs.mod.MinusPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("minus")
    __obj.asInstanceOf[typingsJapgolly.sparqljs.mod.MinusPattern]
  }
  
  inline def OptionalPattern(patterns: js.Array[Pattern]): typingsJapgolly.sparqljs.mod.OptionalPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("optional")
    __obj.asInstanceOf[typingsJapgolly.sparqljs.mod.OptionalPattern]
  }
  
  inline def ServicePattern(name: IriTerm, patterns: js.Array[Pattern], silent: Boolean): typingsJapgolly.sparqljs.mod.ServicePattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("service")
    __obj.asInstanceOf[typingsJapgolly.sparqljs.mod.ServicePattern]
  }
  
  inline def UnionPattern(patterns: js.Array[Pattern]): typingsJapgolly.sparqljs.mod.UnionPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("union")
    __obj.asInstanceOf[typingsJapgolly.sparqljs.mod.UnionPattern]
  }
}
