package typingsJapgolly.graphqlRelay.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.graphql.definitionMod.GraphQLInputType
import typingsJapgolly.graphql.definitionMod.GraphQLOutputType
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralIdentifyingRootFieldConfig extends js.Object {
  var argName: String
  var description: js.UndefOr[String] = js.undefined
  var inputType: GraphQLInputType
  var outputType: GraphQLOutputType
  def resolveSingleInput(input: js.Any, context: js.Any, info: GraphQLResolveInfo): js.Any
}

object PluralIdentifyingRootFieldConfig {
  @scala.inline
  def apply(
    argName: String,
    inputType: GraphQLInputType,
    outputType: GraphQLOutputType,
    resolveSingleInput: (js.Any, js.Any, GraphQLResolveInfo) => CallbackTo[js.Any],
    description: String = null
  ): PluralIdentifyingRootFieldConfig = {
    val __obj = js.Dynamic.literal(argName = argName.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], outputType = outputType.asInstanceOf[js.Any])
    __obj.updateDynamic("resolveSingleInput")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo) => resolveSingleInput(t0, t1, t2).runNow()))
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralIdentifyingRootFieldConfig]
  }
}

