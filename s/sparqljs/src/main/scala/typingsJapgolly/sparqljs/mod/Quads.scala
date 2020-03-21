package typingsJapgolly.sparqljs.mod

import typingsJapgolly.sparqljs.sparqljsStrings.bgp
import typingsJapgolly.sparqljs.sparqljsStrings.graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sparqljs.mod.BgpPattern
  - typingsJapgolly.sparqljs.mod.GraphQuads
*/
trait Quads extends js.Object

object Quads {
  @scala.inline
  def BgpPattern(triples: js.Array[Triple], `type`: bgp): Quads = {
    val __obj = js.Dynamic.literal(triples = triples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quads]
  }
  @scala.inline
  def GraphQuads(name: Term, triples: js.Array[Triple], `type`: graph): Quads = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], triples = triples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quads]
  }
}

