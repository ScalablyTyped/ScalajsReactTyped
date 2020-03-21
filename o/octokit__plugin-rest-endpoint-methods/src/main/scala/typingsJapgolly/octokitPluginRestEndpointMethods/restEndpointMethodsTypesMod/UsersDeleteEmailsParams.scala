package typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersDeleteEmailsParams extends js.Object {
  /**
    * Deletes one or more email addresses from your GitHub account. Must contain at least one email address. **Note:** Alternatively, you can pass a single email address or an `array` of emails addresses directly, but we recommend that you pass an object using the `emails` key.
    */
  var emails: js.Array[String]
}

object UsersDeleteEmailsParams {
  @scala.inline
  def apply(emails: js.Array[String]): UsersDeleteEmailsParams = {
    val __obj = js.Dynamic.literal(emails = emails.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UsersDeleteEmailsParams]
  }
}

