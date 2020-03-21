package typingsJapgolly.phenomnomnominalTsquery

import typingsJapgolly.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.every
import typingsJapgolly.phenomnomnominalTsquery.phenomnomnominalTsqueryStrings.some
import typingsJapgolly.phenomnomnominalTsquery.tsqueryTypesMod.TSQuerySelectorNode
import typingsJapgolly.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phenomnomnominal/tsquery/dist/src/matchers/matches", JSImport.Namespace)
@js.native
object matchesMod extends js.Object {
  @JSName("matches")
  def matches_every(modifier: every): js.Function3[
    /* node */ Node, 
    /* selector */ TSQuerySelectorNode, 
    /* ancestry */ js.Array[Node], 
    Boolean
  ] = js.native
  @JSName("matches")
  def matches_some(modifier: some): js.Function3[
    /* node */ Node, 
    /* selector */ TSQuerySelectorNode, 
    /* ancestry */ js.Array[Node], 
    Boolean
  ] = js.native
}

