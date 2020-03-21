package typingsJapgolly.tern.ternMod

import typingsJapgolly.tern.AnonQueryCompletionsQuery
import typingsJapgolly.tern.AnonQueryDefinitionQuery
import typingsJapgolly.tern.AnonQueryDocumentationQuery
import typingsJapgolly.tern.AnonQueryPropertiesQuery
import typingsJapgolly.tern.AnonQueryRefsQuery
import typingsJapgolly.tern.AnonQueryRenameQuery
import typingsJapgolly.tern.AnonQueryResult
import typingsJapgolly.tern.AnonResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRegistry extends js.Object {
  var completions: AnonQueryCompletionsQuery
  var definition: AnonQueryDefinitionQuery
  var documentation: AnonQueryDocumentationQuery
  var files: AnonQueryResult
  var properties: AnonQueryPropertiesQuery
  var refs: AnonQueryRefsQuery
  var rename: AnonQueryRenameQuery
  var `type`: AnonResult
}

object QueryRegistry {
  @scala.inline
  def apply(
    completions: AnonQueryCompletionsQuery,
    definition: AnonQueryDefinitionQuery,
    documentation: AnonQueryDocumentationQuery,
    files: AnonQueryResult,
    properties: AnonQueryPropertiesQuery,
    refs: AnonQueryRefsQuery,
    rename: AnonQueryRenameQuery,
    `type`: AnonResult
  ): QueryRegistry = {
    val __obj = js.Dynamic.literal(completions = completions.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRegistry]
  }
}

