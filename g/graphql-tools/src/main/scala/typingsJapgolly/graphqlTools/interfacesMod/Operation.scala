package typingsJapgolly.graphqlTools.interfacesMod

import typingsJapgolly.graphqlTools.graphqlToolsStrings.mutation_
import typingsJapgolly.graphqlTools.graphqlToolsStrings.query_
import typingsJapgolly.graphqlTools.graphqlToolsStrings.subscription_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.graphqlTools.graphqlToolsStrings.query_
  - typingsJapgolly.graphqlTools.graphqlToolsStrings.mutation_
  - typingsJapgolly.graphqlTools.graphqlToolsStrings.subscription_
*/
trait Operation extends js.Object

object Operation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mutation: mutation_ = this.cast("mutation")
  @scala.inline
  def query: query_ = this.cast("query")
  @scala.inline
  def subscription: subscription_ = this.cast("subscription")
}

