package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateLabelParams extends js.Object {
  /**
    * The [hexadecimal color code](http://www.color-hex.com/) for the label, without the leading `#`.
    */
  var color: js.UndefOr[String] = js.undefined
  var current_name: String
  /**
    * A short description of the label.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The new name of the label. Emoji can be added to label names, using either native emoji or colon-style markup. For example, typing `:strawberry:` will render the emoji ![:strawberry:](https://github.githubassets.com/images/icons/emoji/unicode/1f353.png ":strawberry:"). For a full list of available emoji and codes, see [emoji-cheat-sheet.com](http://emoji-cheat-sheet.com/).
    */
  var name: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
}

object IssuesUpdateLabelParams {
  @scala.inline
  def apply(
    current_name: String,
    owner: String,
    repo: String,
    color: String = null,
    description: String = null,
    name: String = null
  ): IssuesUpdateLabelParams = {
    val __obj = js.Dynamic.literal(current_name = current_name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesUpdateLabelParams]
  }
}

