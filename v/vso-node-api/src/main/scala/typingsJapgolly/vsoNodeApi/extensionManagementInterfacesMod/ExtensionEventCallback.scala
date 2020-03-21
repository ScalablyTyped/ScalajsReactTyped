package typingsJapgolly.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionEventCallback extends js.Object {
  /**
    * The uri of the endpoint that is hit when an event occurs
    */
  var uri: String
}

object ExtensionEventCallback {
  @scala.inline
  def apply(uri: String): ExtensionEventCallback = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionEventCallback]
  }
}

