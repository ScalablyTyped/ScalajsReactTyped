package typingsJapgolly.graphqlBinding

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphqlBinding.distTypesMod.BindingOptions
import typingsJapgolly.graphqlBinding.distTypesMod.Options
import typingsJapgolly.graphqlBinding.distTypesMod.QueryOrMutation
import typingsJapgolly.graphqlTools.interfacesMod.IResolvers
import typingsJapgolly.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding/dist/Delegate", JSImport.Namespace)
@js.native
object delegateMod extends js.Object {
  @js.native
  class Delegate protected () extends js.Object {
    def this(hasSchemaFragmentReplacementsBeforeDisableCache: BindingOptions) = this()
    var delegateToSchema: js.Any = js.native
    var disableCache: Boolean = js.native
    var fragmentReplacements: js.Any = js.native
    var schema: GraphQLSchema = js.native
    def before(): Unit = js.native
    def delegate(operation: QueryOrMutation, fieldName: String, args: StringDictionary[js.Any]): js.Promise[_] = js.native
    def delegate(operation: QueryOrMutation, fieldName: String, args: StringDictionary[js.Any], infoOrQuery: String): js.Promise[_] = js.native
    def delegate(
      operation: QueryOrMutation,
      fieldName: String,
      args: StringDictionary[js.Any],
      infoOrQuery: String,
      options: Options
    ): js.Promise[_] = js.native
    def delegate(
      operation: QueryOrMutation,
      fieldName: String,
      args: StringDictionary[js.Any],
      infoOrQuery: GraphQLResolveInfo
    ): js.Promise[_] = js.native
    def delegate(
      operation: QueryOrMutation,
      fieldName: String,
      args: StringDictionary[js.Any],
      infoOrQuery: GraphQLResolveInfo,
      options: Options
    ): js.Promise[_] = js.native
    def delegateSubscription(fieldName: String): js.Promise[AsyncIterator[_, _, js.UndefOr[scala.Nothing]]] = js.native
    def delegateSubscription(fieldName: String, args: StringDictionary[js.Any]): js.Promise[AsyncIterator[_, _, js.UndefOr[scala.Nothing]]] = js.native
    def delegateSubscription(fieldName: String, args: StringDictionary[js.Any], infoOrQuery: String): js.Promise[AsyncIterator[_, _, js.UndefOr[scala.Nothing]]] = js.native
    def delegateSubscription(fieldName: String, args: StringDictionary[js.Any], infoOrQuery: String, options: Options): js.Promise[AsyncIterator[_, _, js.UndefOr[scala.Nothing]]] = js.native
    def delegateSubscription(fieldName: String, args: StringDictionary[js.Any], infoOrQuery: GraphQLResolveInfo): js.Promise[AsyncIterator[_, _, js.UndefOr[scala.Nothing]]] = js.native
    def delegateSubscription(
      fieldName: String,
      args: StringDictionary[js.Any],
      infoOrQuery: GraphQLResolveInfo,
      options: Options
    ): js.Promise[AsyncIterator[_, _, js.UndefOr[scala.Nothing]]] = js.native
    def getAbstractResolvers(): IResolvers[_, _] = js.native
    def getAbstractResolvers(filterSchema: String): IResolvers[_, _] = js.native
    def getAbstractResolvers(filterSchema: GraphQLSchema): IResolvers[_, _] = js.native
    def request[T](query: String): js.Promise[T] = js.native
    def request[T](query: String, variables: StringDictionary[js.Any]): js.Promise[T] = js.native
  }
  
}

