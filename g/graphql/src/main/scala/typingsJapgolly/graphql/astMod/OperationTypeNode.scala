package typingsJapgolly.graphql.astMod

import typingsJapgolly.graphql.graphqlStrings.mutation_
import typingsJapgolly.graphql.graphqlStrings.query_
import typingsJapgolly.graphql.graphqlStrings.subscription_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.graphql.graphqlStrings.query_
  - typingsJapgolly.graphql.graphqlStrings.mutation_
  - typingsJapgolly.graphql.graphqlStrings.subscription_
*/
trait OperationTypeNode extends js.Object

object OperationTypeNode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mutation: mutation_ = this.cast("mutation")
  @scala.inline
  def query: query_ = this.cast("query")
  @scala.inline
  def subscription: subscription_ = this.cast("subscription")
}

