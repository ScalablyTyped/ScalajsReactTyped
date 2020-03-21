package typingsJapgolly.apolloServerExpress.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloServerExpress.apolloServerExpressStrings.Mutation
import typingsJapgolly.apolloServerExpress.apolloServerExpressStrings.Query
import typingsJapgolly.apolloServerExpress.apolloServerExpressStrings.Subscription
import typingsJapgolly.graphql.definitionMod.GraphQLField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "RenameRootFields")
@js.native
class RenameRootFields protected ()
  extends typingsJapgolly.graphqlTools.mod.RenameRootFields {
  def this(renamer: js.Function3[
        /* operation */ Query | Mutation | Subscription, 
        /* name */ String, 
        /* field */ GraphQLField[_, _, StringDictionary[_]], 
        String
      ]) = this()
}

