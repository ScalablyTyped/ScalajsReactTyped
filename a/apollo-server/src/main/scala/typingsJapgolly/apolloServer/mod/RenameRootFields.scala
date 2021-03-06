package typingsJapgolly.apolloServer.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloServer.apolloServerStrings.Mutation
import typingsJapgolly.apolloServer.apolloServerStrings.Query
import typingsJapgolly.apolloServer.apolloServerStrings.Subscription
import typingsJapgolly.graphql.definitionMod.GraphQLField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "RenameRootFields")
@js.native
class RenameRootFields protected ()
  extends typingsJapgolly.apolloServer.exportsMod.RenameRootFields {
  def this(renamer: js.Function3[
        /* operation */ Query | Mutation | Subscription, 
        /* name */ String, 
        /* field */ GraphQLField[_, _, StringDictionary[_]], 
        String
      ]) = this()
}

