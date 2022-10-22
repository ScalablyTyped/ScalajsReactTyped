package typingsJapgolly.sparqljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sparqljs.mod.BgpPattern
  - typingsJapgolly.sparqljs.mod.GraphQuads
*/
trait Quads extends StObject
object Quads {
  
  inline def BgpPattern(triples: js.Array[Triple]): typingsJapgolly.sparqljs.mod.BgpPattern = {
    val __obj = js.Dynamic.literal(triples = triples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bgp")
    __obj.asInstanceOf[typingsJapgolly.sparqljs.mod.BgpPattern]
  }
  
  inline def GraphQuads(name: IriTerm, triples: js.Array[Triple]): typingsJapgolly.sparqljs.mod.GraphQuads = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], triples = triples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("graph")
    __obj.asInstanceOf[typingsJapgolly.sparqljs.mod.GraphQuads]
  }
}
