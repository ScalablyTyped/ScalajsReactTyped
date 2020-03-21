package typingsJapgolly.graphqlCompose.enumTypeComposerMod

import typingsJapgolly.graphqlCompose.definitionsMod.Extensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeEnumTypeConfig extends _EnumTypeComposeDefinition {
  var description: js.UndefOr[String | Null] = js.undefined
  var extensions: js.UndefOr[Extensions] = js.undefined
  var name: String
  var values: js.UndefOr[ComposeEnumValueConfigMap] = js.undefined
}

object ComposeEnumTypeConfig {
  @scala.inline
  def apply(
    name: String,
    description: String = null,
    extensions: Extensions = null,
    values: ComposeEnumValueConfigMap = null
  ): ComposeEnumTypeConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeEnumTypeConfig]
  }
}

