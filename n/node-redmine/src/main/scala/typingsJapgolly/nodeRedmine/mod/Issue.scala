package typingsJapgolly.nodeRedmine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issue extends js.Object {
  var issue: IssueRecord
}

object Issue {
  @scala.inline
  def apply(issue: IssueRecord): Issue = {
    val __obj = js.Dynamic.literal(issue = issue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Issue]
  }
}

