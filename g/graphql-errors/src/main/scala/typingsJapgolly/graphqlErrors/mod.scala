package typingsJapgolly.graphqlErrors

import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-errors", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class UserError protected () extends Error {
    def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  def maskErrors(schema: GraphQLSchema): Unit = js.native
  def maskErrors(schema: GraphQLSchema, fn: HandlerFunction): Unit = js.native
  def setDefaultHandler(fn: HandlerFunction): Unit = js.native
  type HandlerFunction = js.Function1[/* err */ js.Error, js.Error]
}

