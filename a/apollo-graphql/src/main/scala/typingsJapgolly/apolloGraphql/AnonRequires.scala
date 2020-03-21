package typingsJapgolly.apolloGraphql

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRequires[TContext] extends js.Object {
  var requires: js.UndefOr[String] = js.native
  @JSName("resolve")
  var resolve_Original: GraphQLFieldResolver[_, TContext, StringDictionary[_]] = js.native
  def resolve(source: js.Any, args: StringDictionary[js.Any], context: TContext, info: GraphQLResolveInfo): js.Any = js.native
}

