package typingsJapgolly.graphqlBinding.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.graphqlBinding.graphqlBindingStrings.query
  - typingsJapgolly.graphqlBinding.graphqlBindingStrings.mutation
*/
trait QueryOrMutation extends js.Object

object QueryOrMutation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mutation: typingsJapgolly.graphqlBinding.graphqlBindingStrings.mutation = this.cast("mutation")
  @scala.inline
  def query: typingsJapgolly.graphqlBinding.graphqlBindingStrings.query = this.cast("query")
}

