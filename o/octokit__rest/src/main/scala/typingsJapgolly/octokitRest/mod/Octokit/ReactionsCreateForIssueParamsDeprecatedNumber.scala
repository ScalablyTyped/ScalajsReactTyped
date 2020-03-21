package typingsJapgolly.octokitRest.mod.Octokit

import typingsJapgolly.octokitRest.octokitRestStrings.Plussign1
import typingsJapgolly.octokitRest.octokitRestStrings.`-1`
import typingsJapgolly.octokitRest.octokitRestStrings.confused
import typingsJapgolly.octokitRest.octokitRestStrings.eyes
import typingsJapgolly.octokitRest.octokitRestStrings.heart
import typingsJapgolly.octokitRest.octokitRestStrings.hooray
import typingsJapgolly.octokitRest.octokitRestStrings.laugh
import typingsJapgolly.octokitRest.octokitRestStrings.rocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForIssueParamsDeprecatedNumber extends js.Object {
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the issue.
    */
  var content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes
  /**
    * @deprecated "number" parameter renamed to "issue_number"
    */
  var number: Double
  var owner: String
  var repo: String
}

object ReactionsCreateForIssueParamsDeprecatedNumber {
  @scala.inline
  def apply(
    content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes,
    number: Double,
    owner: String,
    repo: String
  ): ReactionsCreateForIssueParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReactionsCreateForIssueParamsDeprecatedNumber]
  }
}

