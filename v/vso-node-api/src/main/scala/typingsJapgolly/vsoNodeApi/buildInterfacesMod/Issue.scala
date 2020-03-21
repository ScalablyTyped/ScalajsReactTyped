package typingsJapgolly.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issue extends js.Object {
  /**
    * The category.
    */
  var category: String
  var data: StringDictionary[String]
  /**
    * A description of the issue.
    */
  var message: String
  /**
    * The type (error, warning) of the issue.
    */
  var `type`: IssueType
}

object Issue {
  @scala.inline
  def apply(category: String, data: StringDictionary[String], message: String, `type`: IssueType): Issue = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issue]
  }
}

