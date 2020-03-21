package typingsJapgolly.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitUserDate extends js.Object {
  /**
    * Date of the Git operation.
    */
  var date: js.Date
  /**
    * Email address of the user performing the Git operation.
    */
  var email: String
  /**
    * Name of the user performing the Git operation.
    */
  var name: String
}

object GitUserDate {
  @scala.inline
  def apply(date: js.Date, email: String, name: String): GitUserDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitUserDate]
  }
}

