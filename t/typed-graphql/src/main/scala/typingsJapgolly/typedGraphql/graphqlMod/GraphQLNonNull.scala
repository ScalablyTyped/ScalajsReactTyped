package typingsJapgolly.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql", "GraphQLNonNull")
@js.native
open class GraphQLNonNull protected ()
  extends StObject
     with GraphQLInputType
     with GraphQLOutputType
     with GraphQLType {
  def this(`type`: GraphQLNullableType) = this()
  
  var ofType: GraphQLNullableType = js.native
}
