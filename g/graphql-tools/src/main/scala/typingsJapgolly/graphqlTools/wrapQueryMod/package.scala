package typingsJapgolly.graphqlTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wrapQueryMod {
  type QueryWrapper = js.Function1[
    /* subtree */ typingsJapgolly.graphql.astMod.SelectionSetNode, 
    typingsJapgolly.graphql.astMod.SelectionNode | typingsJapgolly.graphql.astMod.SelectionSetNode
  ]
}
