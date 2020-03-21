package typingsJapgolly.graphqlCompose.resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.graphqlCompose.graphqlComposeStrings.query
  - typingsJapgolly.graphqlCompose.graphqlComposeStrings.mutation
  - typingsJapgolly.graphqlCompose.graphqlComposeStrings.subscription
*/
trait ResolverKinds extends js.Object

object ResolverKinds {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mutation: typingsJapgolly.graphqlCompose.graphqlComposeStrings.mutation = this.cast("mutation")
  @scala.inline
  def query: typingsJapgolly.graphqlCompose.graphqlComposeStrings.query = this.cast("query")
  @scala.inline
  def subscription: typingsJapgolly.graphqlCompose.graphqlComposeStrings.subscription = this.cast("subscription")
}

