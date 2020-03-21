package typingsJapgolly.expressGraphql.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.astMod.DocumentNode
import typingsJapgolly.graphql.definitionMod.GraphQLAbstractType
import typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver
import typingsJapgolly.graphql.definitionMod.GraphQLObjectType
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphql.definitionMod.GraphQLTypeResolver
import typingsJapgolly.graphql.executeMod.ExecutionArgs
import typingsJapgolly.graphql.executeMod.ExecutionResult
import typingsJapgolly.graphql.executeMod.ExecutionResultDataDefault
import typingsJapgolly.graphql.maybeMod.Maybe
import typingsJapgolly.graphql.mod.GraphQLError
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.graphql.mod.Source
import typingsJapgolly.graphql.mod.ValidationContext
import typingsJapgolly.graphql.promiseOrValueMod.PromiseOrValue
import typingsJapgolly.graphql.validationContextMod.ValidationRule
import typingsJapgolly.graphql.visitorMod.ASTVisitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsData extends js.Object {
  /**
    * A value to pass as the context to the graphql() function.
    */
  var context: js.UndefOr[js.Any] = js.undefined
  /**
    * An optional function which will be used to execute instead of default `execute`
    * from `graphql-js`.
    */
  var customExecuteFn: js.UndefOr[
    (js.Function1[/* args */ ExecutionArgs, js.Promise[ExecutionResult[ExecutionResultDataDefault]]]) | Null
  ] = js.undefined
  /**
    * An optional function which will be used to format any errors produced by
    * fulfilling a GraphQL operation. If no function is provided, GraphQL's
    * default spec-compliant `formatError` function will be used.
    */
  var customFormatErrorFn: js.UndefOr[(js.Function1[/* error */ GraphQLError, _]) | Null] = js.undefined
  /**
    * An optional function which will be used to create a document instead of
    * the default `parse` from `graphql-js`.
    */
  var customParseFn: js.UndefOr[js.Function1[/* source */ Source, DocumentNode | Null]] = js.undefined
  /**
    * An optional function which will be used to validate instead of default `validate`
    * from `graphql-js`.
    */
  var customValidateFn: js.UndefOr[
    (js.Function3[
      /* schema */ GraphQLSchema, 
      /* documentAST */ DocumentNode, 
      /* rules */ js.Array[ValidationRule], 
      js.Array[GraphQLError]
    ]) | Null
  ] = js.undefined
  /**
    * An optional function for adding additional metadata to the GraphQL response
    * as a key-value object. The result will be added to "extensions" field in
    * the resulting JSON. This is often a useful place to add development time
    * info such as the runtime of a query or the amount of resources consumed.
    *
    * Information about the request is provided to be used.
    *
    * This function may be async.
    */
  var extensions: js.UndefOr[(js.Function1[/* info */ RequestInfo, StringDictionary[_]]) | Null] = js.undefined
  /**
    * A resolver function to use when one is not provided by the schema.
    * If not provided, the default field resolver is used (which looks for a
    * value or method on the source value with the field's name).
    */
  var fieldResolver: js.UndefOr[(GraphQLFieldResolver[_, _, StringDictionary[_]]) | Null] = js.undefined
  /**
    * `formatError` is deprecated and replaced by `customFormatErrorFn`. It will
    *  be removed in version 1.0.0.
    */
  var formatError: js.UndefOr[(js.Function1[/* error */ GraphQLError, _]) | Null] = js.undefined
  /**
    * A boolean to optionally enable GraphiQL mode.
    */
  var graphiql: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * A boolean to configure whether the output should be pretty-printed.
    */
  var pretty: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * An object to pass as the rootValue to the graphql() function.
    */
  var rootValue: js.UndefOr[js.Any] = js.undefined
  /**
    * A GraphQL schema from graphql-js.
    */
  var schema: GraphQLSchema
  /**
    * A type resolver function to use when none is provided by the schema.
    * If not provided, the default type resolver is used (which looks for a
    * `__typename` field or alternatively calls the `isTypeOf` method).
    */
  var typeResolver: js.UndefOr[(GraphQLTypeResolver[_, _, StringDictionary[_]]) | Null] = js.undefined
  /**
    * An optional array of validation rules that will be applied on the document
    * in additional to those defined by the GraphQL spec.
    */
  var validationRules: js.UndefOr[(js.Array[js.Function1[/* ctx */ ValidationContext, ASTVisitor]]) | Null] = js.undefined
}

object OptionsData {
  @scala.inline
  def apply(
    schema: GraphQLSchema,
    context: js.Any = null,
    customExecuteFn: /* args */ ExecutionArgs => CallbackTo[js.Promise[ExecutionResult[ExecutionResultDataDefault]]] = null,
    customFormatErrorFn: /* error */ GraphQLError => CallbackTo[js.Any] = null,
    customParseFn: /* source */ Source => CallbackTo[DocumentNode | Null] = null,
    customValidateFn: (/* schema */ GraphQLSchema, /* documentAST */ DocumentNode, /* rules */ js.Array[ValidationRule]) => CallbackTo[js.Array[GraphQLError]] = null,
    extensions: /* info */ RequestInfo => CallbackTo[StringDictionary[js.Any]] = null,
    fieldResolver: (js.Any, StringDictionary[js.Any], js.Any, /* info */ GraphQLResolveInfo) => CallbackTo[js.Any] = null,
    formatError: /* error */ GraphQLError => CallbackTo[js.Any] = null,
    graphiql: js.UndefOr[Boolean] = js.undefined,
    pretty: js.UndefOr[Boolean] = js.undefined,
    rootValue: js.Any = null,
    typeResolver: (js.Any, js.Any, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => CallbackTo[
      PromiseOrValue[Maybe[(GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]) | String]]
    ] = null,
    validationRules: js.Array[js.Function1[/* ctx */ ValidationContext, ASTVisitor]] = null
  ): OptionsData = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (customExecuteFn != null) __obj.updateDynamic("customExecuteFn")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.graphql.executeMod.ExecutionArgs) => customExecuteFn(t0).runNow()))
    if (customFormatErrorFn != null) __obj.updateDynamic("customFormatErrorFn")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.graphql.mod.GraphQLError) => customFormatErrorFn(t0).runNow()))
    if (customParseFn != null) __obj.updateDynamic("customParseFn")(js.Any.fromFunction1((t0: /* source */ typingsJapgolly.graphql.mod.Source) => customParseFn(t0).runNow()))
    if (customValidateFn != null) __obj.updateDynamic("customValidateFn")(js.Any.fromFunction3((t0: /* schema */ typingsJapgolly.graphql.mod.GraphQLSchema, t1: /* documentAST */ typingsJapgolly.graphql.astMod.DocumentNode, t2: /* rules */ js.Array[typingsJapgolly.graphql.validationContextMod.ValidationRule]) => customValidateFn(t0, t1, t2).runNow()))
    if (extensions != null) __obj.updateDynamic("extensions")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.expressGraphql.mod.RequestInfo) => extensions(t0).runNow()))
    if (fieldResolver != null) __obj.updateDynamic("fieldResolver")(js.Any.fromFunction4((t0: js.Any, t1: org.scalablytyped.runtime.StringDictionary[js.Any], t2: js.Any, t3: /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo) => fieldResolver(t0, t1, t2, t3).runNow()))
    if (formatError != null) __obj.updateDynamic("formatError")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.graphql.mod.GraphQLError) => formatError(t0).runNow()))
    if (!js.isUndefined(graphiql)) __obj.updateDynamic("graphiql")(graphiql.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue.asInstanceOf[js.Any])
    if (typeResolver != null) __obj.updateDynamic("typeResolver")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: /* info */ typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo, t3: /* abstractType */ typingsJapgolly.graphql.definitionMod.GraphQLAbstractType) => typeResolver(t0, t1, t2, t3).runNow()))
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsData]
  }
}

