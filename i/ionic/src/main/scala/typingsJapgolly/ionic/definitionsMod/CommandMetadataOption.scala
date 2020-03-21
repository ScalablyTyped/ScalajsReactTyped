package typingsJapgolly.ionic.definitionsMod

import typingsJapgolly.ionicCliFramework.AnonValue
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandOptionType
import typingsJapgolly.ionicCliFramework.definitionsMod.Footnote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandMetadataOption
  extends typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataOption {
  var hint: js.UndefOr[String] = js.undefined
  var `private`: js.UndefOr[Boolean] = js.undefined
}

object CommandMetadataOption {
  @scala.inline
  def apply(
    name: String,
    summary: String,
    aliases: js.Array[String] = null,
    default: String | Boolean = null,
    description: String = null,
    footnotes: js.Array[Footnote] = null,
    groups: js.Array[String] = null,
    hint: String = null,
    `private`: js.UndefOr[Boolean] = js.undefined,
    spec: AnonValue = null,
    `type`: CommandOptionType = null
  ): CommandMetadataOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (footnotes != null) __obj.updateDynamic("footnotes")(footnotes.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandMetadataOption]
  }
}

