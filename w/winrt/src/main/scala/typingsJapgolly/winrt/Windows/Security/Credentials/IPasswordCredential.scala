package typingsJapgolly.winrt.Windows.Security.Credentials

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPasswordCredential extends js.Object {
  var password: String
  var properties: IPropertySet
  var resource: String
  var userName: String
  def retrievePassword(): Unit
}

object IPasswordCredential {
  @scala.inline
  def apply(
    password: String,
    properties: IPropertySet,
    resource: String,
    retrievePassword: Callback,
    userName: String
  ): IPasswordCredential = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
    __obj.updateDynamic("retrievePassword")(retrievePassword.toJsFn)
    __obj.asInstanceOf[IPasswordCredential]
  }
}

